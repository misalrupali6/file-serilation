package Q4_Day_Month_Exception;

//UNCHECKED EXCEPTIOn
public class WrongDayException extends RuntimeException {
	WrongDayException(){
		System.out.println("enter days beteen 1-30");
	}

}
