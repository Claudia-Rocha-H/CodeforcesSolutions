import java.util.Scanner;
public class Team {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), resultado = 0;
		String ln;
		sc.nextLine(); //I always reset the scanner after using nextInt() to avoid failures
		for(int i = 0; i < n; i++) {
			ln = sc.nextLine();
			ln = ln.replaceAll(" ","");
			ln = ln.replaceAll("0","");
			if (ln.length()>=2) {
				resultado++;
			}
		}
		System.out.println(resultado);
		
	}

}
