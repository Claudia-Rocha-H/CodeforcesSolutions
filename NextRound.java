import java.util.Scanner;
public class NextRound {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
	    String[] nk = line.split(" ");
		String scores = sc.nextLine();
		String[] a = scores.split(" ");
		int n = Integer.valueOf(nk[0]);
		int k = Integer.valueOf(nk[1]);
		int i = k-1;
		boolean sw = true;
		while(sw){
			if(i>=0) {
				if(a[i].equals("0")) {
					i--;
					k--;
				}else {
					if(i == n-1) {
						System.out.println(k);
						sw = false;
					}else {
						if(a[i].equals(a[i+1])){
						i++;
						k++;
					    }else {
						sw = false;
						System.out.println(k);
						}
					}
				
				}
			}else {
				sw = false;
				System.out.println(k);
			}
		}
	}

}
