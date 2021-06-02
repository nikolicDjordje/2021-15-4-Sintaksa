package prvi;

import java.util.Scanner;

public class Sintaksa1 {

	public static void main(String[] args) {
		Scanner p = new Scanner(System.in);
		System.out.println("Unesite prvu stranicu prostorije: ");
    
    double a;
    a = p.nextDouble();
    System.out.println("Unesite drugu stranicu prostorije: ");
    double b;
    b = p.nextDouble();
    
    System.out.println("Unesite trecu stranicu prostorije: ");
    double c;
    c = p.nextDouble();
    
    double povrsina;
    povrsina = 2 * ((a * b) + (a * c) + (b * c));
    
    System.out.println("Povrsina celokupne prostorije iznosi: " + povrsina);
    
    double okreceno;
    okreceno = povrsina - a * b;
    
    System.out.println("Povrsina okrecenog dela iznosi: " + okreceno);

	}

}
