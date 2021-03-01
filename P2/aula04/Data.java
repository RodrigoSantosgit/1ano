import static java.lang.System.*;
import java.util.Calendar;

public class Data {
  private int dia, mes, ano;

  /** Inicia esta data com o dia de hoje. */
  public Data() {
    Calendar today = Calendar.getInstance();

    dia = today.get(Calendar.DAY_OF_MONTH);
    mes = today.get(Calendar.MONTH) + 1;
    ano = today.get(Calendar.YEAR);
  }

  /** Inicia a data a partir do dia, mes e ano dados. */
  public Data(int dia, int mes, int ano) {
    //...
    assert dataValida(dia, mes, ano);
    this.dia = dia;
    this.mes = mes;
    this.ano = ano;
  }

  /** Devolve esta data segundo a norma ISO 8601. */
  public String toString() {
    return String.format("%04d-%02d-%02d", ano, mes, dia);
  }

  /** Indica se ano é bissexto. */
  public static boolean bissexto(int ano) {
    return ano%4 == 0 && ano%100 != 0 || ano%400 == 0;
  }

  // Crie métodos para obter o dia, mes e ano da data.
  //...
  public int ano(){
	return ano;
  }
  public int mes(){
	return mes;
  }
  public int dia(){
	return dia;
  }
  /** Dimensões dos meses num ano comum. */
  private static final
  int[] diasMesComum = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

  /** Devolve o número de dias do mês dado. */
  public static  int diasDoMes(int mes, int ano) {
    //...
    assert dataValida(10, mes, ano);
    if(!bissexto(ano))
		return diasMesComum[mes-1];
	else if(mes==2)
			return 29;
		else
			return diasMesComum[mes-1];
		
  }

  /** Devolve o mes da data por extenso. */
  public String mesExtenso() {
    //...
    switch(this.mes) {
		case 1:
			return "Janeiro";
			
		case 2:
			return "Fevereiro";
			
		case 3:
			return "Marco";
		
		case 4:
			return "Abril";
		
		case 5:
			return "Maio";
		
		case 6:
			return "Junho";
		
		case 7:
			return "Julho";
		
		case 8:
			return "Agosto";
		
		case 9:
			return "Setembro";
	
		case 10:
			return "Outubro";
		
		case 11:
			return "Novembro";
		
		case 12:
			return "Dezembro";
		default:
			return "ERRO";

	}
  }


  /** Devolve esta data por extenso. */
  public String extenso() {
    //...
    return this.dia + " de " + mesExtenso() + " de " + this.ano;
    
  }

  /** Indica se um terno (dia, mes, ano) forma uma data válida. */
  public static boolean dataValida(int dia, int mes, int ano) {
    //...
	if(ano<0)
		return false;
	else if(mes<=0 || mes >12)
			return false;
		 else if(dia<=0 || dia>31)
				return false;
			  else if(diasMesComum[mes-1]==30 && dia>30)
					  return false;
					else if(mes==2 && bissexto(ano) && dia>29)
							return false;
						 else if(mes==2 && !bissexto(ano) && dia>28)
								 return false;
							 else
								 return true;
  }


  public void seguinte() {
    //...
	if(dia==28 && mes== 2 && bissexto(ano))
		dia++;
	else if(dia==28 && mes== 2 && !bissexto(ano)){
			dia=1;
			mes++;
		}
		else if(dia==29 && mes == 2 && bissexto(ano)){
				dia=1;
				mes++;
			}
			else if(dia== 30 && diasMesComum[mes-1]== 30){
					dia=1;
					mes++;
				 }
				 else if(dia== 30 && diasMesComum[mes-1]== 31)
						 dia++;
					 else if(dia== 31 && diasMesComum[mes-1]== 31 && mes != 12) {
							 dia=1;
							 mes++;
						  }
						 else if(dia== 31 && mes == 12){
								dia=1;
								mes=1;
						   	    ano++;
							  }
							 else
								dia++;
	assert dataValida(dia, mes, ano);
  }
  public int compareTo(Data d2){
	  if(d2.ano()<this.ano())
		 return -1;
	  else if(d2.ano()>this.ano())
			  return 1;
		   else if(d2.ano() == this.ano() && d2.mes() < this.mes())
					return -1;
				else if(d2.ano() == this.ano() && d2.mes() > this.mes())
						return 1;
					else if(d2.ano() == this.ano() && d2.mes() == this.mes() && d2.dia() < this.dia())
							return -1;
						else if(d2.ano() == this.ano() && d2.mes() == this.mes() && d2.dia() > this.dia())
								return 1;
							else
								return 0;
								
  }
  public Data(String data){
	 String[] datas = data.split("-");
	 this.ano = Integer.parseInt(datas[0]);
	 this.mes = Integer.parseInt(datas[1]);
	 this.dia = Integer.parseInt(datas[2]);
	 
	 if(!dataValida(this.dia, this.mes, this.ano)){
		System.out.print("ERRO: data invalida");
		System.exit(0);
	 }
  }
}
