import java.util.Scanner;
public class HPat20{
	public static void main(String [] args){
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter the lines");
		int n = Sc.nextInt();
		for(int i = 1; i <= n; i++){
			int count = i;
			for(int j = 1; j <= i; j++){
				System.out.print(count);
				count++;
			}
			System.out.println();
		}
	}
}