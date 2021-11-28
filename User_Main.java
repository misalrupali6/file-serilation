package Q4_Day_Month_Exception;

import java.util.Scanner;

public class User_Main {

	public static void main(String[] args)
	{
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

