/*4. Write Custom Exceptions WrongDayException and WrongMonthException as discussed in class
  
    Write the MyDate class in study.exception.MyDate2 
	Property --- day, month,year
		2 constructors, getter setter toString
		
		In the parameter constructor
			If day is not in range throw new WrongDayException
			If month is not in range throw new WrongMonthException
			
		Same for setDay , setMonth   methods
		
	Write a user class in same package
			Main
				Create date object with correct values , incorrect values
						Set day and month with correct and incorrect values
						Observe exceptions
						Handle exceptions
*/
package Q4_Day_Month_Exception;

import java.util.Scanner;

public class Q4_day_month_Exception extends Exception {

	public static void main(String[] args)  {
		
Scanner in =new Scanner(System.in);
		
		// MyDate dt=new MyDate(2,12,2022);
		 MyDate obj=null;
		 
		 try { 
			 obj=new MyDate(25,200,2021);
			 //dt.setMonth(12);
			 //dt.setDay(55);
			 // MyDate dm=new MyDate(2,12);
			 }
		catch(WrongDayException d) {
			System.out.println("wrong day"+d);
		}
	   // catch(WrongMonthException m) {
	    	
	    //	System.out.println("wrong day"+m);
	    //}
		 catch (Exception e) 
		 {
	    	System.out.println(obj);
	    }
		 
		 System.out.println("welcome");
	}



	}


