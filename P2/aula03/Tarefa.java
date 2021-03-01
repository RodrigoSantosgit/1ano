import static java.lang.System.*;

public class Tarefa {
	Data inicio, fim;
	String texto;
	
	public Tarefa (Data inicio, Data fim, String texto) {
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
}

