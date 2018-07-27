
// USER INTERFACE CONTROLLER
let backendUIController = (function(){


    return {
        splitText: function () {
            console.log('inside the splitText function');

            let finalText = '', htmlArray = [];

            // Gets everything that is to be found in div's with the news-text class
            let html = document.querySelectorAll('.news-text');

            // Takes the text out of the node and puts it in an array
            for (let i = 0; i < html.length; i++) {
                htmlArray.push(html[i].textContent);
            }

            // Loops trough each index in array
            for (let j = 0; j < htmlArray.length; j++) {

                // Splits each word in index up into separate words and puts it an a new array
                let wordsArray = htmlArray[j].split(' ');

                // Loops trough wordsArray and stitches them back together,
                // after that each news-item will be no longer that 40 words.
                for (let k = 0; k < 40; k++) {
                    finalText += (wordsArray[k] + ' ');
                }

                // injects the new text back into DOM
                document.querySelector('#news-item-' + (j)).textContent = finalText + '...';

                // clear the finalText before the loop starts again.
                finalText = '';
            }
        }
};

})();


// GLOBAL APP CONTROLLER
let appController = (function(backendUICtrl){

    return{
        init: function(){
            console.log('backend app has started');
            backendUICtrl.splitText();
        }
    };
})(backendUIController);

appController.init();




