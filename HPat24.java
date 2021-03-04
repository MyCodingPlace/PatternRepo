

import java.util.Scanner;
class HPat24{
	public static void main(String [] args){
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter the  number of lines:");
		int n = Sc.nextInt();
		for(int i = n; i>0;i--){ //no of lines 
			for(int j = n-i ; j>0;j--){ //no of space
				System.out.print(" ");
			}
			for(int j = i ; j>0;j--){ //no of stars
				System.out.print("*");
			}
			System.out.println();
		}
	}
}	