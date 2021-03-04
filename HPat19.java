import java.util.Scanner;
public class HPat19{
	public static void main(String [] args){
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter the lines");
		int n = Sc.nextInt();
		int c = 1;
		for(int i = n; i > 0; i--){
			for(int j = n; j > 0; j--){
				System.out.print(j);
			}
			System.out.println();
		}
	}
}