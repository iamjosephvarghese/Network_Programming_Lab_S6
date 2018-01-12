import java.util.*;

class Fact{
	public static void main(String args[]){
		
		int factorial = 1;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter any number:");
		int n = scan.nextInt();

		if(n == 1 || n == 0)
		{
			System.out.println("Factorial = 1");
		}else{
			while(n>0){
				factorial*=n;
				n--;	
			}
			System.out.println("Factorial = " + factorial);
		}
   }
}	