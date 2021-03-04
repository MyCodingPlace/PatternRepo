

import java.util.Scanner;
class HPat5{
	public static void main(String [] args){
		//int count =1;
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter the  number of lines:");
		int n = Sc.nextInt();
		for(int i = 1; i<=n;i++){ //no of lines 
			for(int j = 1 ; j<=n;j++){ //no of stars
				System.out.print((char)(64+j));
			}
			System.out.println();
		}
	}
}