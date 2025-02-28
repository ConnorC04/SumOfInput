import java.util.Scanner;

public class SumOfInput{
	public static void main(String[] args){
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please enter a number: ");
		
		int num = Integer.parseInt(scanner.nextLine());

		System.out.println("Sum of all numbers between 1 and " + num + " is: " + sumNumbers(num));

		System.out.println("Using Gaussian Wizardry: " + gaussian(num));
	}

		
		
	public static  int gaussian(int n){
			
			int sum = 0;

			for (int i = 1; i <= n; i++){
			sum = (i * (i + 1)) / 2;
		}			
		return sum;
	}
	public static int sumNumbers(int j){
		int sumNum = 0;
		
		for (int k = 0; k <= j; k++){
			sumNum = sumNum + k;
		}
		return sumNum;
	}

}
