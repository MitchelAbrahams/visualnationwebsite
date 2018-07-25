let UiController = (function() {

    let toggleButton = function () {
        let toggle = document.getElementById('container');
        let toggleContainer = document.getElementById('toggle-container');
        let toggleNumber;

        let reg = document.getElementById('reg');
        let log = document.getElementById('log');


        //Event listener that with slider function
        toggle.addEventListener('click', function () {
            toggleNumber = !toggleNumber;
            if (toggleNumber) {
                toggleContainer.style.clipPath = 'inset(0 0 0 50%)';
                toggleContainer.style.backgroundColor = '#D74046';

                // changes from login tot register and vise versa
                reg.style.display = 'none';
                log.style.display = 'block';

            } else {
                toggleContainer.style.clipPath = 'inset(0 50% 0 0)';
                toggleContainer.style.backgroundColor = 'dodgerblue';

                // changes from login tot register and vise versa
                reg.style.display = 'block';
                log.style.display = 'none';
            }
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