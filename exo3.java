import java.util.Scanner;

public class exo3 {

	public static void main(String[] args) {
		final float TVA = 0.2f; 
		float HT,TTC;
		Scanner scan = new Scanner(System.in);
		System.out.print("Donnez le prix HT : ");
		HT = scan.nextFloat();
		TTC = HT + (HT*TVA);
		System.out.println("Le prix TTC est : "+TTC+" DA");
	}

}
