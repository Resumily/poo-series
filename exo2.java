import java.util.Scanner;

public class exo2 {

	public static void main(String[] args) {
		int C,F;
		Scanner scan = new Scanner(System.in);
		System.out.print("Donnez la temperature en C° : ");
		C = scan.nextInt();
		F = (C*9/5)+32;
		System.out.println(C+" C° = "+F+" F°");
	}

}
