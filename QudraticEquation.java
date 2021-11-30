import java.util.*;
import java.math.*;
public class QudraticEquation {
	double a,b,c;
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter value of a");
		double a=sc.nextDouble();
		System.out.println("enter value of b");
		double b=sc.nextDouble();
		System.out.println("enter value of c");
		double c=sc.nextDouble();
		
		double d1=(-b+Math.sqrt((b*b)-(4*a*c)))/2*a;
		System.out.println("postive"+d1);
		double d2=(-b-Math.sqrt((b*b)-(4*a*c)))/2*a;
		System.out.println("negative" +d2);
		
		
		
		
		
		
	

		
		
		
		
	}

}
