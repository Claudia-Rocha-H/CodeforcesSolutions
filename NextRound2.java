import java.util.Scanner;
public class NextRound2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int a[] = new int[n];
		for(int i=0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		int j = k-1;
		boolean sw = true;
		while(sw){
			if(j>=0) {
				if(a[j] == 0) {
					j--;
					k--;
				}else {
					if(j == n-1) {
						System.out.println(k);
						sw = false;
					}else {
						if(a[j] == a[j+1]){
						j++;
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
