import static java.lang.System.*;

public class DatasPassadas {

  public static void main(String[] args) {
	  
    Data atual = new Data();

    Data d2 = new Data(25, 12, atual.ano()-1);
    
	do{
		System.out.printf("%s\n", d2.extenso());
		d2.seguinte();
	}while(d2.ano()!= atual.ano() || d2.mes() != atual.mes() || d2.dia() != atual.dia());
  }
}
