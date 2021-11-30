import java.util.*;

public class Calci {

	public static void main(String[] args) {
		char operator;
		double num1,num2,result,cost;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter 1st number");
		num1=sc.nextDouble();
		System.out.println("choose an operator");
		operator= sc.next().charAt(0);
		System.out.println("Enter 2nd num");
		num2=sc.nextDouble();
		switch (operator) {
		case '+':result=num1+num2;
		System.out.println("total"+" "+result);
		break;
		case '-':result=num1-num2;
		System.out.println("total"+" "+result);
		break;
		case'*':result=num1*num2;
		System.out.println("total"+" "+result);
		break;
		case'/':result=num1/num2;
		System.out.println("total"+" "+result);
		break;
		case 'g':
			System.out.println("Enter cost");
			cost=sc.nextInt();
			result=cost* 18/100;
			cost=cost+result;
			System.out.println("GST="+ " "+cost);
			
			
		}
		
		
		
		
		
	 

	}

}
