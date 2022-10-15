import java.util.Scanner;
public class WayTooLongWords {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), length = 0;
		String word;
		sc.nextLine();// To reset the scanner and avoid the reading error 
		for(int i = 0; i < n; i++) {
			word = sc.nextLine();
			length = word.length();
			if(length <=10) {
				System.out.println(word);
			}else {
				System.out.println(word.charAt(0)+""+(length-2)+""+word.charAt(length-1));
			}
		}

	}

}
