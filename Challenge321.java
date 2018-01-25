//Unfinished Code
import java.util.Scanner;
public class Challenge321 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input;
		String yesorno;
		boolean stop = false;
		while(stop==false) {
		System.out.println("Enter a time in the format hh:mm where hh is the hour between 00-23 and mm is the minutes between 00-59");
		System.out.print("Enter time: ");
		input = scan.next();
		char[] time = input.toCharArray();
		if(time.length!=5) {
			System.out.println("Enter in the proper format.");
		}
		else {
		String hour = new StringBuilder().append(time[0]).append(time[1]).toString();
		String minute = new StringBuilder().append(time[3]).append(time[4]).toString();
		if(hour.equals("00")||hour.equals("12"))
			System.out.print("It's Twelve ");
		if(hour.equals("01")||hour.equals("13"))
			System.out.print("It's One ");
		if(hour.equals("02")||hour.equals("14"))
			System.out.print("It's Two ");
		if(hour.equals("03")||hour.equals("15"))
			System.out.print("It's Three ");
		if(hour.equals("04")||hour.equals("16"))
			System.out.print("It's Four ");
		if(hour.equals("05")||hour.equals("17"))
			System.out.print("It's Five ");
		if(hour.equals("06")||hour.equals("18"))
			System.out.print("It's Six ");
		if(hour.equals("07")||hour.equals("19"))
			System.out.print("It's Seven ");
		if(hour.equals("08")||hour.equals("20"))
			System.out.print("It's Eight ");
		if(hour.equals("09")||hour.equals("21"))
			System.out.print("It's Nine ");
		if(hour.equals("10")||hour.equals("22"))
			System.out.print("It's Ten ");
		if(hour.equals("11")||hour.equals("23"))
			System.out.print("It is Eleven ");
		int minute1=0;
		int minute2=0;
	    minute1 = Character.getNumericValue(minute.charAt(0));
	    minute2 = Character.getNumericValue(minute.charAt(1));
	    if(minute1==1)
	    {
	    	String[] list3 = {"Ten", "Eleven", "Twelve", "Thirteen", "Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Ninteen"};
	    	System.out.print(list3[minute2]);
	    }
	    else if(minute1==0 && minute2==0){
	    	System.out.print("O'clock");
	    	
	    }else {
	    String[] list1 = {"Oh ","ten", "Twenty ", "Thirty ", "Forty ", "Fifty "};
	    String[] list2 = {"","One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
	    System.out.print(list1[minute1]);
	    System.out.print(list2[minute2]);
	    }
	    int ampm = 0;
	    ampm = Integer.valueOf(hour);
	    if(ampm >=12)
	    	System.out.println(" PM");
	    else
	    	System.out.println(" AM");
	}
		System.out.println("Continue? (yes or no): ");
		yesorno = scan.next();
		if(yesorno.equals("yes")||yesorno.equals("Yes")) {
			continue;
		}
		else{
			break;
		}
}
}
}
