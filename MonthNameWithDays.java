import java.util.Scanner;
public class MonthNameWithDays {

	public static void main(String[] args) {
		int Numberofdays=0;
		String MonthName="  ";
		Scanner xy=new Scanner(System.in);
		System.out.println("enter a month");
		System.out.println("enter the year");
		int mm=xy.nextInt();
		int yy=xy.nextInt();
		if(mm==1) {
			MonthName="January";
			Numberofdays=31;
		}
		if (mm==2) {
			MonthName="February";
			if(((yy%4==0)||(yy%100!=0))&&(yy%400==0)) {
				Numberofdays=29;
			}
			else
			Numberofdays=28;
			
		}
			
			
		
			
	    
		else if(mm==3) {
			MonthName="March";
			Numberofdays=31;
		}
		else if(mm==4) {
			MonthName="April";
			Numberofdays=30;
		}
		else if(mm==5) {
			MonthName="May";
			Numberofdays=31;
		}
		else if(mm==6) {
			MonthName="June";
			Numberofdays=30;
		}
		else if(mm==7) {
			MonthName="July";
			Numberofdays=31;
		}
		else if(mm==8) {
			MonthName="August";
			Numberofdays=31;
		}
		else if(mm==9) {
			MonthName="September";
			Numberofdays=30;
		}
		else if(mm==10) {
			MonthName="Octaber";
			Numberofdays=31;
		}
		else if(mm==11) {
			MonthName="November";
			Numberofdays=30;
		}
		else if(mm==12) {
			MonthName="December";
			Numberofdays=31;
		}
		else
			System.out.println("Invalid");
		System.out.println("the "+ " " +MonthName+ " having "+" " + Numberofdays + " days ");
		
			
		
		
			


			
		
		

	}

}
