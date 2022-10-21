import java.util.Scanner;
public class WordCapitalization {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();
		word = Character.toUpperCase(word.charAt(0)) + word.substring(1);
		System.out.println(word);
		
	}

}
