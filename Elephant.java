import java.util.Scanner;
public class Elephant {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int step = 5;
		int c = 0;
		while(x>0){
			if((x-step)>=0) {
				x = x-step;
				c++;
			}else {
				step--;
			}
		}
		System.out.println(c);
	}

}

