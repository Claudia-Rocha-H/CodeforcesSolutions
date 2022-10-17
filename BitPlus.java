import java.util.Scanner;
public class BitPlus {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), res = 0;
		sc.nextLine();
		String line;
		for(int i = 0; i < n; i++) {
			line = sc.nextLine();
			if(line.contains("+")) 
				res++;
			else 
				res--;
			
		}
		System.out.println(res);
	}

}
