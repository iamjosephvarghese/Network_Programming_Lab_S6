import java.util.*;

class Palindrome{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter any string:");
		String text = scan.next();

		String arr[] = text.split("");
	
		
		int flag = 0;

		int length = arr.length-1;
		int i = 1,j = length;


	while(i<length)
	{


		if(arr[i].equals(arr[j]))
		{
			flag = 0;
		}else{
			flag = 1;
			break;
		}
	
		i++;
		j--;
	}



	if(flag == 0){
		System.out.println("Palindrome!");
	}else{
		System.out.println("Not a palindrome!");
	}
 }
} 