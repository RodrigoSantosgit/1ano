function desenhoG() {
	$("#grafico-colun").highcharts({
		chart: {
			type: "column"
		},
		title: {
			text: "Profundidade das cores",
		},
		xAxis: {
			categories: ["1", "2", "4", "8"]
		},
		series: [{
			name: "Profundidade de cor(nº de bits)",
			data: [2,4,16,256]
			}
		]
	});
};
