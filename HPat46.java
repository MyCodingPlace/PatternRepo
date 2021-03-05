import java.util.Scanner;
class HPat46{
	public static void main(String [] args){
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter the  number of lines:");
		int n = Sc.nextInt();
		int sp = n/2,st = 1;
		for(int i = 1; i<=n;i++){ //no of lines 
			for(int j = 1 ; j<=sp;j++){ //no of space
				System.out.print(" ");
			}
			int k = 1;
			for(int j = 1 ; j<=st;j++){ //no of stars
				System.out.print((char)(k+64));
 				if(j<=st/2){
					k++;
				}
				else{
					k--;
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