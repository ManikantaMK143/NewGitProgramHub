import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("enter a value");
		int x=obj.nextInt();
		int count=0;
		for(int i=2;i<x;i++) {
			if(x%i==0) {
				count++;
				break;
			}
			
			
		}
		if(count==0) {
			System.out.println("it is prime number");
		}
		else {
			System.out.println("not a prime number");
		}

	}

}
