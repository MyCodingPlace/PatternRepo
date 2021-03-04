import java.util.Scanner;
public class HPat11{
	public static void main(String [] args){
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter the lines");
		int n = Sc.nextInt();
		for(int i = n; i > 0; i--){
			for(int j = i; j > 0; j--){
				System.out.print(i);
			}
			System.out.println();
		}
	}
}