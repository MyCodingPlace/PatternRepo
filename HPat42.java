import java.util.Scanner;
class HPat42{
	public static void main(String [] args){
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter the  number of lines:");
		int n = Sc.nextInt();
		for(int i = 1; i<=n;i++){ 
			for(int j = 1 ; j<=n;j++){
				if(i+j == n/2+2 || i+j == 3*(n/2)+2 ){
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}