let splitText = function() {
    let finalText = '', htmlArray = [];

    // Gets everything that is to be found in div's with the news-text class
    let html = document.querySelectorAll('.news-text');

    // Takes the text out of the node and puts it in an array
    for(let i = 0; i < html.length;i++){
        htmlArray.push(html[i].textContent);
    }

    // Loops trough each index in array
    for(let j = 0; j < htmlArray.length;j++) {

        // Splits each word in index up into seperate words and puts it an a new array
        let wordsArray = htmlArray[j].split(' ');

        // Loops trough wordsArray and stitches them back together, first 20 indexes are whitespace????
        // after that each news-item will be no longer that 40 words.
        for (let k = 20; k < 60; k++) {
            finalText += (wordsArray[k] + ' ');
        }

        // injects the new text back into DOM
        document.querySelector('#news-item-' + (j + 1)).textContent = finalText + '...';

        // clear the finalText before the loop starts again.
        finalText = '';
    }
};

splitText();


