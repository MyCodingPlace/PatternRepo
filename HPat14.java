import java.util.Scanner;
public class HPat14{
	public static void main(String [] args){
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter the lines");
		int n = Sc.nextInt();
		for(int i = 1; i <= n; i++){
			for(int j = 1; j <= i; j++){
				System.out.print((char)(64+j));
			}
			System.out.println();
		}
	}
}