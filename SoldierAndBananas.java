import java.util.Scanner;
public class SoldierAndBananas {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt(), n = sc.nextInt(),w = sc.nextInt(), acum = 0; 
		for (int i = 1; i <=w; i++) {
			acum += i*k;
		}
		if((acum - n) >= 0) {
			System.out.println(acum-n);
		}else {
			System.out.println("0");
		}
	}

}
