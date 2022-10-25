import java.util.Scanner;
public class BoyOrGirl {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine(), res = "", subs = "";
		for(int i = 0; i < line.length(); i++) {
			subs = line.substring(i, i+1);
			if (!res.contains(subs)) {
				res+= subs;
			}
		}
		if(res.length()%2 == 0) {
			System.out.println("CHAT WITH HER!");
		}else {
			System.out.println("IGNORE HIM!");
		}
		

	}

}
