
import java.util.Scanner;
class HPat9{
	public static void main(String [] args){
		int count =2;
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter the  number of lines:");
		int n = Sc.nextInt();
		for(int i = 1; i<=n;i++){ //no of lines 
			for(int j = 1 ; j<=n;j++){ //no of stars
					if(i%2 == 0){
						if(j%2 == 1){
							System.out.print("0");	
						}
						else{
							System.out.print("1");
						}
					}
					else{
						if(j%2 == 1){
							System.out.print("1");	
						}
						else{
							System.out.print("0");
						}
					}
				
			}
			System.out.println();
		}
	}
}