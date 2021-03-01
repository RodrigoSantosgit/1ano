import static java.lang.System.*;

public class Agenda {
	
	Tarefa[] tarefa;
	Data[] datas;
	int n=-1;
	
	public Agenda(){
		this.tarefa = new Tarefa[1000];
		this.datas = new Data[1000];
	}
	
	public void novaTarefa(Tarefa tarefa){ 
		this.n++;
		this.tarefa[n] = tarefa;
		this.datas[n]= this.tarefa[n].inicio;
		sort(datas);
	}
	
	public void escreve(){
		System.out.println("Agenda: ");
		for(int i=0; i<n+1; i++){
			System.out.println(tarefa[i].toString());
		}
	}
	
	public Agenda filtra(Data d1, Data d2){
		Agenda todo = new Agenda();
		for(int i=0; i<this.n+1; i++){
			if(this.tarefa[i].intersecta(d1, d2)){
				todo.n++;
				todo.tarefa[n] = this.tarefa[i];
			}
		}
		return todo;
	}
	
	public void sort(Data[] datas) {
    for (int i = 0; i < this.n; i++) {
      for (int j = i+1; j < this.n+1; j++) {
        if (datas[i].compareTo(datas[j])== -1) {
          Tarefa tmp = this.tarefa[j];
          this.tarefa[j] = this.tarefa[i];
          this.tarefa[i] = tmp;
        }
      }
    }
  }
}


