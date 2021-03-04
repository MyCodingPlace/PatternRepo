
/* wajp to print the above pattern 
 */



import java.util.Scanner;
class Pat4{
	public static void main(String [] args){
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter the  number of lines:");
		int n = Sc.nextInt();
		for(int i = 1; i<=n;i++){ //no of lines 
			for(int j = 1 ; j<=n;j++){ //no of stars
				if(i==j || i+j ==n+1 || j == (n/2)+1 && i != n){
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