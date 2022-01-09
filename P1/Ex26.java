import java.util.Scanner;
	public class Ex26 {
		
	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	double p1x, p1y, p2x, p2y, p3x, p3y, p4x, p4y, dist1, dist2, dist3, dist4, diag1,diag2;
	
	System.out.print("Introduza as coordenadas do ponto 1:");
	System.out.print("x = ");
	p1x = sc.nextDouble();
	System.out.print("y = ");
	p1y = sc.nextDouble();
	
	System.out.print("Introduza as coordenadas do ponto 2:");
	System.out.print("x = ");
	p2x = sc.nextDouble();
	System.out.print("y = ");
	p2y = sc.nextDouble();
	
	System.out.print("Introduza as coordenadas do ponto 3:");
	System.out.print("x = ");
	p3x = sc.nextDouble();
	System.out.print("y = ");
	p3y = sc.nextDouble();
	
	System.out.print("Introduza as coordenadas do ponto 4:");
	System.out.print("x = ");
	p4x = sc.nextDouble();
	System.out.print("y = ");
	p4y = sc.nextDouble();
	
	dist1 = Math.sqrt((p2x - p1x)*(p2x - p1x) + (p2y - p1y)*(p2y - p1y));
	dist2 = Math.sqrt((p3x - p2x)*(p3x - p2x) + (p3y - p2y)*(p3y - p2y));
	dist3 = Math.sqrt((p4x - p3x)*(p4x - p3x) + (p4y - p3y)*(p4y - p3y));
	dist4 = Math.sqrt((p1x - p4x)*(p1x - p4x) + (p1y - p4y)*(p1y - p4y));
	
	diag1 = Math.sqrt((p3x - p1x)*(p3x - p1x) + (p3y - p1y)*(p3y - p1y));
	diag2 = Math.sqrt((p2x - p4x)*(p2x - p4x) + (p2y - p4y)*(p2y - p4y));
	
	if ( dist1 == dist2 && dist2 == dist3 && dist3 == dist4 && diag1 == diag2 ){
		System.out.print("A figura é um quadrado.");
	}
	else {
		System.out.print("A figura não é um quadrado.");
	}
}
}
	
	
