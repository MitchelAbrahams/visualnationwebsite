let UiController = (function() {

    // TOGGLE BUTTON CODE

    let toggleButton = function () {
        let toggle = document.getElementById('container');
        let toggleContainer = document.getElementById('toggle-container');
        let toggleNumber;

        let reg = document.getElementById('reg');
        let log = document.getElementById('log');

        toggle.addEventListener('click', function () {
            toggleNumber = !toggleNumber;
            if (toggleNumber) {
                toggleContainer.style.clipPath = 'inset(0 0 0 50%)';
                toggleContainer.style.backgroundColor = '#D74046';
                console.log("login screen now");
                reg.style.display = 'none';
                log.style.display = 'block';

            } else {
                toggleContainer.style.clipPath = 'inset(0 50% 0 0)';
                toggleContainer.style.backgroundColor = 'dodgerblue';
                console.log("register screen now");
                reg.style.display = 'block';
                log.style.display = 'none';
            }

            console.log(toggleNumber)
        });
    };

    return{
        init : function(){
            console.log('Account app has started');
            toggleButton();
        }
    }
})();

UiController.init();