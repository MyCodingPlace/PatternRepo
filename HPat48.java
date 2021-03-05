import java.util.Scanner;
public class HPat48{
	public static void main(String [] args){
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter the lines");
		int n = Sc.nextInt();
		for(int i = 1; i <= n; i++){
			int k=i;
			for(int j = 1; j <= i; j++){
				System.out.print(k+" ");
				k=k+(n-j);
			}
			System.out.println();
		}
	}
}
/* 
1
2 6
3 7 10
4 8 11 13
5 9 12 14 15
 */