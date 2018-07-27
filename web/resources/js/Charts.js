let chartSetup = (function () {

    return {

        // Lets the user setup their canvas (element = the id taken from your html)
        canvasSetup: function (element, canvasSize) {
            let myCanvas = document.getElementById(element);
            myCanvas.width = canvasSize;
            myCanvas.height = canvasSize;

            return myCanvas;
        },


        // Draws a line in the canvas (ctx is your canvas)
        drawLine: function (ctx, startX, startY, endX, endY) {
            ctx.beginPath();
            ctx.moveTo(startX, startY);
            ctx.lineTo(endX, endY);
            ctx.stroke();
        },


        // Draws an arc
        drawArc: function (ctx, centerX, centerY, radius, startAngle, endAngle) {
            ctx.beginPath();
            ctx.arc(centerX, centerY, radius, startAngle, endAngle);
            ctx.stroke();
        },

        // Draw a pie slice
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

        // Create pie chart function
        pieChart: function (options) {
            let color = options.color;
            let customCanvas = options.canvas;
            let ctx = customCanvas.getContext("2d");

            // Draws the chart
            this.draw = function () {
                let totalValue = 0;
                let colorIndex = 0;
                let startAngle = 0;

                // Loops trough data array given by user
                for (categ in options.data) {
                    // Takes value from index and puts in variable
                    let val = options.data[categ];
                    // Adds value to total value
                    totalValue += val;
                    // Calculates the angle(size) of a slice
                    let sliceAngle = 2 * Math.PI * val / totalValue;
                    // Draws the slice
                    setup.drawPieSlice(ctx, 150, 150, 100, startAngle, startAngle + sliceAngle, color[colorIndex]);
                    // Adds sliceAngle to startAngle to get next slice to start where the other one stopped
                    startAngle += sliceAngle;
                    // Ups the color index to pick new color from color array
                    colorIndex++;
                }

                // If doughnut hole size is being passed bij user, the pie chart becomes a doughnut chart
                if (options.doughnutHoleSize){
                    setup.drawPieSlice(
                        ctx, 150, 150, options.doughnutHoleSize * Math.min( 150, 150), 0, 2 * Math.PI, "#ffffff"
                    );
                }
            };
        }
    }
})(chartSetup);


let myCanvas = chartSetup.canvasSetup('chart', 300);


let dataSet = {
    'one': 120,
    'two': 450,
    'three': 56,
    'four': 267
};


let myPieChart = new charts.pieChart({
    canvas: myCanvas,
    data:dataSet,
    color:["#fde23e","#f16e23", "#57d9ff","#937e88"],
    doughnutHoleSize:0.4
});

myPieChart.draw();
