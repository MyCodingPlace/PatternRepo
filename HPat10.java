import java.util.Scanner;
public class HPat10{
	public static void main(String [] args){
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter the lines");
		int n = Sc.nextInt();
		for(int i = 1; i <= n; i++){
			for(int j = i; j<= n; j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}