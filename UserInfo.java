import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

//base class has all the methods and variables for basic user information needed in the program
public class UserInfo implements Info {
	protected 
	String email;
	String phone;
	String name;
	int day;
	int month;
	int year;
	
	//this constructor is used when the object is created with input but since I am using user
	// input this constructor is not used
	public UserInfo(String e, String p, String n, int d, int m, int y) {
		email = e;
		phone = p;
		name = n;
		day = d;
		month = m;
		year = y;
	}
	//This is the constructor used in the program
	public UserInfo()
	{
		email = "";
		phone = "";
		name  = "";
		day = 0;
		month = 0;
		year = 0;
	}
	
//====================================================================================================
//getInfo method gets the name,number, and email from the user
//====================================================================================================
	public void getInfo(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name: ");
		name = sc.next();
		System.out.println("Enter your phone number: ");
		phone = sc.next();
		System.out.println("Enter your email: ");
		email = sc.next();
		
	}
	
//====================================================================================================
//getDate method gather the info for each part of a date (day,month, and year)
//====================================================================================================
	public void getDate() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the month you want to vist: ");
		month = sc.nextInt();
		while(month > 12 && month < 1) {
			System.out.println("Enter a valid month to vist");
			month = sc.nextInt();
		}//this while loop makes sure the input is valid 1-12
		
		System.out.println("Enter the day you want to vist: ");
		day = sc.nextInt();
		while(day > 31) {
			System.out.println("Enter a valid day to vist");
			day = sc.nextInt();
		}
		//this loop makes sure the day number is valid in a calendar
		System.out.println("Enter the year you want to vist: ");
		year = sc.nextInt();
		while(year > 2024 || year < 2022) {
			System.out.println("Enter a valid year to vist");
			year = sc.nextInt();
		}
		//NOTE: The input validations are not exactly for a year later I was not able to figure
		// out a way to make it a year limit since months overlap
	}
	
	
	@Override
	public void WriteSummary() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void ReadSummary() {
		// TODO Auto-generated method stub
		
	}
	
}
