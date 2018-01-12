import java.util.*;

class Fibo{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number of terms:");
		int n = scan.nextInt();

		System.out.println("-----------------");
		
		int first = 0;
		int second = 1;
		int temp;
		if(n == 0){
			System.out.println("No Terms!");
		
		}else if(n == 1){

			System.out.println(first);

		}else if(n == 2){

			System.out.println(first + "\t" + second);

		}else if(n > 2){

			System.out.print(first + "\t" + second); 
			for(int i=3;i<=n;i++){
				temp = first + second;
				first = second;
				second = temp;
				System.out.print("\t" + temp);
			}
		}
 }
}