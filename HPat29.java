import java.util.Scanner;
class HPat29{
	public static void main(String [] args){
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter the no of lines:");
		int n = Sc.nextInt();
		int c = 1;
		for(int i = 1; i<=n;i++){ //no of lines 
			for(int j = 1 ; j<=n-i;j++){ //no of space
				System.out.print(" ");
			}
			for(int j =  1; j<=2*i-1; j++){ //no of stars
				if(i%2 == 1){
					if(j%2 == 0){
						System.out.print("0");
					}
					else{
						System.out.print("1");
					}
				}
				else{
					if(j%2 == 0){
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