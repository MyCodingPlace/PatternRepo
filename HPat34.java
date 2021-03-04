import java.util.Scanner;
public class HPat34{
	public static void main(String [] args){
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter the lines");
		int n = Sc.nextInt();
		int k = 1;
		for(int i = 1; i <= n; i++){
			for(int j = 1; j <= i; j++){
					System.out.print(k%2);
					k++;
			}
			System.out.println();
		}
	}
}