
//BUDGET CONTROLLER
var budgetController = (function(){

    var Expenses = function(id, description, value){
        this.id = id;
        this.description = description;
        this.value = value;
    };

    var Income = function(id, description, value){
        this.id = id;
        this.description = description;
        this.value = value;
    };

    var data = {
        allItems: {
            inc: [],
            exp:[]
        },
        totals: {
            inc: 0,
            exp: 0,
            total: 0
        }
    };

    return {
        addItem: function(type, des, val){
            var newItem, ID;

            // Create new id
            if(data.allItems[type].length > 0){
                ID = data.allItems[type].length + 1;
            } else {
                ID = 0;
            }

            // Create new item
            if(type === 'exp'){
                newItem = new Expenses(ID, des, val);
            } else if(type === 'inc'){
                newItem = new Income(ID,des,val);
            }
            // Push into data structure
            data.allItems[type].push(newItem);
            // Return the new element
            return newItem;
        },

        calcBudget : function(obj, type){

            data.totals[type] += parseInt(obj.value);

            data.totals["total"] = data.totals["inc"] - data.totals["exp"];

            return data;
        }
    };

})();

//UICONTROLLER
var UIController = (function(){

    var DOMStrings = {
        inputType: '.add-type',
        description: '.add-description',
        inputValue: '.add-value',
        addButton: '.add-btn',
        incomeContainer: '.income-list',
        expensesContainer: '.expenses-list'
    };

    return {
        getInput: function(){
            return{
                type: document.querySelector(DOMStrings.inputType).value,
                description: document.querySelector(DOMStrings.description).value,
                value: document.querySelector(DOMStrings.inputValue).value
            };
        },
        getDOMStrings: function(){
            return DOMStrings;
        },
        addListItem: function(obj,type){
            var html, newHtml, element;

            // Create HTML String with placeholder text
            if(type === 'inc') {
                element = DOMStrings.incomeContainer;
                html = '<div class="list-container" id="income-%id%"><div class="item-description">%description%</div><div class="item-value">%value%</div></div>';
            } else if(type === 'exp') {
                element = DOMStrings.expensesContainer;
                html = '<div class="list-container" id="expense-%id%"><div class="item-description">%description%</div><div class="item-value">%value%</div></div>';
            };

            // Replace the placholder text with actual data
            newHtml = html.replace('%id%', obj.id);
            newHtml = newHtml.replace('%description%', obj.description);
            newHtml = newHtml.replace('%value%', obj.value);

            // Insert the HTML into the DOM
            document.querySelector(element).insertAdjacentHTML('beforeend', newHtml);
        },

        clearFields: function(){
            var fields, fieldsArr;

            fields = document.querySelectorAll(DOMStrings.description + ',' + DOMStrings.inputValue);

            fieldsArr = Array.prototype.slice.call(fields);

            fieldsArr.forEach(function(current){
                current.value = "";
            });
        },

        updateBudget: function(budget){
            document.querySelector("#total-income").textContent = budget.totals["total"];
            document.querySelector("#income").textContent = budget.totals["inc"];
            document.querySelector("#expenses").textContent = budget.totals["exp"];
        }
    };
})();

//GLOBAL APP CONTROLLER
var controller = (function(budgetCtrl, UICtrl){

    var setupEventListeners = function() {
        var DOMStrings = UICtrl.getDOMStrings();

        // Event listener for button
        document.querySelector(DOMStrings.addButton).addEventListener('click', ctrlAddItem);

        // Event listener for return button
        document.addEventListener('keypress', function(event){

            if(event.keyCode === 13 || event.which === 13) {
                ctrlAddItem();
            }
        });
    };

    var ctrlAddItem = function(){
        var input, newItem, budget;

        //1. Get input data
        input = UICtrl.getInput();

        //2. Add item to budget controller
        newItem = budgetCtrl.addItem(input.type, input.description, input.value);

        //3. Add new item to user interface
        UICtrl.addListItem(newItem, input.type);
        UICtrl.clearFields();

        //4. Calc the budget
        budget = budgetCtrl.calcBudget(newItem, input.type);
        //5. Display the budget on the UI
        UICtrl.updateBudget(budget);
    };


    return{
        init: function(){
            console.log('budget app has started');
            setupEventListeners();
        }
    };

})(budgetController, UIController);

controller.init();