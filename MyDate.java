/*
    Write the MyDate class in study.exception.MyDate2 
	Property --- day, month,year
		2 constructors, getter setter toString
 */
package Q4_Day_Month_Exception;

public class MyDate {
	private int day;
	private int month;
	private int year;



	public MyDate() {
		super();
	}

	public void setDay(int day) {
		this.day = day;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public void setYear(int year) {
		this.year = year;
	}


	public void getDay() 
	{
		try {
				if((day > 1)&&(day <=31))
				{
					this.day=day;
					System.out.println(" you entered correct  day"+day);
				}else
				{
					this.day=day;
					System.out.println("you enterd incorrect enter day"+day);
				}
				throw new WrongDayException();
		}
		catch (WrongDayException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
		
	}

	public void getMonth(int month) 
	{  try {
		if((month > 1)&&(month <=12))
		{
		this.month=month;
			System.out.println(" you entered correct  month"+month);
		}else
		{
			this.month=month;
			System.out.println("you enterd incorrect entermonth"+month);
		}
				throw new WrongMonthException();
			} catch (WrongMonthException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	public int getYear() {
		return year;
	}

	public MyDate(int day, int month) {
		super();
		this.day = day;
		this.month = month;
	}


	public MyDate(int day, int month, int year) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
	}
	@Override
	public String toString() {
		return "MyDate [day=" + day + ", month=" + month + ", year=" + year + "]";
	}

}
