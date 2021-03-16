function desenhaG() {
	$("#grafico-colunas").highcharts({
		chart: {
			type: "column"
		},
		title: {
			text: "Padrões de exebição mais utilizados",
		},
		xAxis: {
			categories: ["HD", "FHD", "WXGA+", "HD+", "WXGA"]
		},
		series: [{
			name: "Percentagens (%)",
			data: [29.94, 16.02, 6.70, 5.89, 5.52]
			}
		]
	});
};
