var myCanvas = document.getElementById("chart");
myCanvas.width = 300;
myCanvas.height = 300;


function drawLine(ctx, startX, startY, endX, endY){
    ctx.beginPath();
    ctx.moveTo(startX,startY);
    ctx.lineTo(endX,endY);
    ctx.stroke();
}

function drawArc(ctx, centerX, centerY, radius, startAngle, endAngle){
    ctx.beginPath();
    ctx.arc(centerX, centerY, radius, startAngle, endAngle);
    ctx.stroke();
}

function drawPieSlice(ctx,centerX, centerY, radius, startAngle, endAngle, color ){
    ctx.fillStyle = color;
    ctx.beginPath();
    ctx.moveTo(centerX,centerY);
    ctx.arc(centerX, centerY, radius, startAngle, endAngle);
    ctx.closePath();
    ctx.fill();
}

let dataSet = {
    'one': 10,
    'two': 20,
    'three': 30,
    'four': 40
};


let pieChart = function(options){

    let color = options.color;
    let customCanvas = options.canvas;
    let ctx = customCanvas.getContext("2d");

    this.draw = function(){
        let totalValue = 0;
        let colorIndex = 0;
        let startAngle = 0;

        for(categ in options.data){
            let val = options.data[categ];
            totalValue += val;

            let sliceAngle = 2 * Math.PI * val / totalValue;
            drawPieSlice(ctx, 150, 150, 100, startAngle, startAngle + sliceAngle, color[colorIndex]);

            startAngle += sliceAngle;
            colorIndex++;
        }
    };
};

let myPieChart = new pieChart({
    canvas: myCanvas,
    data:dataSet,
    color:["#fde23e","#f16e23", "#57d9ff","#937e88"]
});

myPieChart.draw();



// drawPieSlice(ctx, 150,150,100, 0, 1, '#ff0000');
// drawPieSlice(ctx, 150,150,100, 1, 2, '#6699ff');