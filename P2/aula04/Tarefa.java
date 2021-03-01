import static java.lang.System.*;

public class Tarefa {
	Data inicio, fim;
	String texto;
	
	public Tarefa (Data inicio, Data fim, String texto) {
		assert tarefavalida(inicio, fim, texto): "Tarefa invalida";
		this.inicio = inicio;
		this.fim = fim;
		this.texto = texto;	
	}
	public String inicio(){
		return inicio.toString();
    }
	public String fim(){
		return fim.toString();
	}
	public String texto(){
		return texto;
	}
	
	public String toString() {
		return this.inicio.toString() + " --- " + this.fim.toString() + ": " + this.texto;	
	}
	public boolean intersecta(Data t1 ,Data t2){
		if(this.inicio.compareTo(t1)==-1 && this.inicio.compareTo(t2)==1)
			return true;
		else if(this.inicio.compareTo(t1)==1 && this.fim.compareTo(t2)==-1)
				return true;
			 else
				return false;
	}
	public boolean tarefavalida(Data inicio, Data fim, String texto) {
		if(inicio.compareTo(fim)==-1)
			return false;
		else if(texto.length()==0)
			return false;
			else
				return true;
				
		
	}
}

