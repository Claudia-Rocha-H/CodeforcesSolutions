import java.util.Scanner;
public class BearAndBigBrother {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(), b = sc.nextInt(),years = 0; 
		while(a <= b) {
			a *=3;
			b*=2;
			years++;
		}
		System.out.println(years);
	}

}
