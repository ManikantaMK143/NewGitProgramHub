import java.util.Scanner;
public class LeapYear {
	public static void main(String[] args) {
		Scanner xy = new Scanner(System.in); 
			System.out.println("enter a year");
			
			int x= xy.nextInt();
			if(((x%4==0) &&( x%100!=0))|| (x%400==0))
				System.out.println("its leap year");
			else 
				System.out.println("not leap year");
		
		
		
	}
	

}
