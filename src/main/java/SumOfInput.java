import java.util.Scanner;

public class SumOfInput{
	public static void main(String[] args){
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please enter a number: ");
		
		int num = Integer.parseInt(scanner.nextLine());

		System.out.println("Sum of all numbers between 1 and " + num + " is: " + sumNumbers(num));
	}
		
		
	public static  int sumNumbers(int n){
			
			int sum = 0;
			
			for (int i = 1; i <= n; i++){
				sum = sum + i;
			}
			
			return sum;
		}

}
