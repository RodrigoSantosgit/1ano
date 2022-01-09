import java.util.*;

public class Ex82 {
	static final Scanner sc = new Scanner(System.in);
	public static void main (String[] args) {
		Ponto p, p1;
		p1 = new Ponto();
		p1.x=0;
		p1.y=0;
		double d, soma=0,max=0;
		int cont=0;
		do{
			cont++;
			System.out.println("Introduza um ponto:");
			p = lerponto();
			d = calculardist(p);
			if(d>max) {
				max=d;
				p1 = p;
			}
			soma += d;
		}while(p.x!=0 || p.y!=0);	
		System.out.printf("A soma das distancias dos %d pontos a origem e %.2f\n", cont-1, soma);
		System.out.printf("O ponto mais afastado da origem foi: (%d,%d).", p1.x, p1.y);
		
	}
	public static Ponto lerponto(){
		Ponto p = new Ponto();
		System.out.print("Coordenada x: ");
		p.x = sc.nextInt();
		System.out.print("Coordenada y: ");
		p.y = sc.nextInt();
		return p;
	}
	public static double calculardist(Ponto p){
		return Math.sqrt(Math.pow(p.x, 2) + Math.pow(p.y, 2));
	}
}
class Ponto {
	int x, y;
}
