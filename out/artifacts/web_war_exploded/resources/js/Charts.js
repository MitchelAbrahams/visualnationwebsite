let chartSetup = (function () {

    return {
        canvasSetup: function (element, canvasSize) {
            let myCanvas = document.getElementById(element);
            myCanvas.width = canvasSize;
            myCanvas.height = canvasSize;
        },

        drawLine: function (ctx, startX, startY, endX, endY) {
            ctx.beginPath();
            ctx.moveTo(startX, startY);
            ctx.lineTo(endX, endY);
            ctx.stroke();
        },

        drawArc: function (ctx, centerX, centerY, radius, startAngle, endAngle) {
            ctx.beginPath();
            ctx.arc(centerX, centerY, radius, startAngle, endAngle);
            ctx.stroke();
        },

        drawPieSlice: function (ctx, centerX, centerY, radius, startAngle, endAngle, color) {
            ctx.fillStyle = color;
            ctx.beginPath();
            ctx.moveTo(centerX, centerY);
            ctx.arc(centerX, centerY, radius, startAngle, endAngle);
            ctx.closePath();
            ctx.fill();
        }
    }
})();


let charts = (function (setup) {

    return {

        pieChart: function (options) {

            let color = options.color;
            let customCanvas = options.canvas;
            let ctx = customCanvas.getContext("2d");

            this.draw = function () {
                let totalValue = 0;
                let colorIndex = 0;
                let startAngle = 0;

                for (categ in options.data) {
                    let val = options.data[categ];
                    totalValue += val;

                    let sliceAngle = 2 * Math.PI * val / totalValue;
                    chartSetup.drawPieSlice(ctx, 150, 150, 100, startAngle, startAngle + sliceAngle, color[colorIndex]);

                    startAngle += sliceAngle;
                    colorIndex++;
                }
            };
        }
    }
})(chartSetup);


let myCanvas = chartSetup.canvasSetup('chart', 300);


let dataSet = {
    'one': 10,
    'two': 20,
    'three': 30,
    'four': 40
};




let myPieChart = charts.pieChart({
    canvas: myCanvas,
    data:dataSet,
    color:["#fde23e","#f16e23", "#57d9ff","#937e88"]
});

myPieChart.draw();



// drawPieSlice(ctx, 150,150,100, 0, 1, '#ff0000');
// drawPieSlice(ctx, 150,150,100, 1, 2, '#6699ff');