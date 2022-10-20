import java.util.Scanner;
import java.util.Arrays;
public class HelpfulMaths {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		
		if(line.length() == 1) {
			System.out.println(line);
		}else {
			String arr[] = line.split("\\+");
			line = "";
			Arrays.sort(arr);
			for(int i = 0; i < arr.length; i++) {
				if(i < arr.length-1) {
					line += arr[i]+"+";
				}else {
					line += arr[i];
				}
				
			}
			System.out.println(line);
		}
	
	

	}

}
