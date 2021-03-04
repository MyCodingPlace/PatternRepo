import java.util.Scanner;
class HPat32{
	public static void main(String [] args){
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter the no of lines:");
		int n = Sc.nextInt();
		for(int i = 1; i<=n;i++){ //no of lines 
			for(int j = 1 ; j<=n-i;j++){ //no of space
				System.out.print(" ");
			}
			int k =1;
				
			for(int j = 1 ; j<=2*i-1;j++){ //no of stars
				
				System.out.print(k);
				if(j<i){
					k++;
				}
				else{
					k--;
				}
			}
			System.out.println();
		}
	}
}