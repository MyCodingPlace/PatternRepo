import java.util.Scanner;
class HPat28{
	public static void main(String [] args){
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter the no of lines:");
		int n = Sc.nextInt();
		int c = 1;
		for(int i = n; i>=1;i--){ //no of lines 
			for(int j = n-i ; j>=1;j--){ //no of space
				System.out.print(" ");
			}
			for(int j = 2*i-1 ; j>=1; j--){ //no of stars
				System.out.print("*");
			}
			System.out.println();
		}
	}
}