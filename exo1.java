import java.util.Scanner;

public class exo1 {

	public static void main(String[] args) {
		int a,b,s;
		Scanner scan = new Scanner(System.in);
		System.out.print("Donnez le nombre a : ");
		a = scan.nextInt();
		System.out.print("Donnez le nombre b : ");
		b = scan.nextInt();
		s = a+b;
		System.out.println("La somme de "+a+" et "+b+" est : "+s);
	}

}
