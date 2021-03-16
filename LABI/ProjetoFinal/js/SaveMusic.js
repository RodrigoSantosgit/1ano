function SaveMusic(name){
	var table = document.getElementById("tabela");
	var name[] = new Array(20);
	var i =1;
	for (i=1; i < 21; i++){
		name[i] = new Array(11);
		for (var j =1; j<12; j++){
			var id = str(i)+str(j);
			var chkBox = tabela.getElementById("id"); 
			if (chkBox.checked)
				name[i].push("id");
			else
				name[i].push("");
				
		}
	}
	
};
