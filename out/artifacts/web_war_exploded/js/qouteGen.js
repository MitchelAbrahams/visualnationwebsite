Instructions = (function(){

    let quotesList = [
        'Login to get access to more features!',
        'This is a personal project made bij Mitchel Abrahams, But geuss what.... You can change almost everything on this site, you just need to find where!',
        'More info quotes are on its way, but for now have fun'
    ];

    let randomNumber = function () {
        return Math.floor(Math.random() * quotesList.length);
    };


    let setupEventListeners = function(){
        document.querySelector('.button').addEventListener('click', function () {
            document.querySelector('#instructions').textContent = quotesList[randomNumber()];
        });
    };


    return{
      init: function(){
          console.log('instructions app has started');
          setupEventListeners();
      }
    }

})();

Instructions.init();






