
import java.util.Scanner;
class HPat41{
	public static void main(String [] args){
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter the  number of lines:");
		int n = Sc.nextInt();
		int sp = n/2,st = 1;
		for(int i = 1; i<=n;i++){ //no of lines 
			for(int j = 1 ; j<=sp;j++){ //no of space
				System.out.print(" ");
			}
			for(int j = 1 ; j<=st;j++){ //no of stars
				if(j==1 || j==st){
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
				
			}
			if(i<=n/2){
				sp--;
				st = st+2;
			}
			else{
				sp++;
				st = st-2;
			}		
			System.out.println();
		}
	}
}