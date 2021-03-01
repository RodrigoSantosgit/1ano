public class Pessoa implements Comparable<Pessoa>{
  // Complete a classe.
  //...
  private Data bDay;
  private String Name;
  
  public Pessoa(Data bd, String n){
	  this.bDay = bd;
	  this.Name = n;
  }
  public Data bDay(){
	  return this.bDay;
  }
  
  public String Name(){
	  return this.Name;
  }
  
  public String toString(){
	  return this.bDay.toString() + " " + this.Name;
  }
  
  public int compareTo(Pessoa p2) {
    if (this.bDay.mes() < p2.bDay.mes()){
		return -1;
	}
    else if (this.bDay.mes() == p2.bDay.mes()){
			if (this.bDay.dia()< p2.bDay.dia()){
				return -1;
			}
			else if (this.bDay.dia() == p2.bDay.dia()){
					 return 0;
				 }
				 else{
					 return 1;
				 }
		 }
		 else{
			return 1;
		}
  }
}
