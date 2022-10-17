import java.util.Scanner;
public class DominoPiling {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] mn = sc.nextLine().split(" ");
		int res = (Integer.valueOf(mn[0])*Integer.valueOf(mn[1]))/2;
		System.out.println(res);

	}

}
