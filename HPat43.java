import java.util.Scanner;
class HPat43{
	public static void main(String [] args){
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter the number of lines:");
		int n = Sc.nextInt();
		int st=1, sp=1;int k =1;
		for(int i = 1;i<=n;i++){
			for(int j=1;j<=n;j++){
				if(i == n-6 && (j==2 || j==n-1)){
					System.out.print("*");
				}
				else if( i==n-5 && (j%2 == 1)){
					System.out.print("*");
				}
				else if(i == n-4  && (j==1 || j==n || j==n/2+1)){
					System.out.print("*");
				}
				else if( i == n-3 && (j==1 || j==n)){
					System.out.print("*");
				}
				else if(i == n-2 && (j==2 || j==n-1)){
					System.out.print("*");
				}
				else if(i == n-1 && (j==3 || j==n-2)){
					System.out.print("*");
				}
				else if(i == n && j==n/2+1){
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
			k++;
			System.out.println();
		}
	}
}