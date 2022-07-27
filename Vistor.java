import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

//volunteer or donor class that will inherit from user info
//this class has methods that add in functions for donations and volunteering
public class Vistor extends UserInfo implements Info { 
	//declartion of variables
	private double donationAmount;
	private int amountofEquipment;
	private String EquipmentDonated[];
	private int numVolDays;
	private String daysToVol[];
	private int volHours;
	
	//constructor used when the object is created
	public Vistor() {
		email = "";
		phone = "";
		name  = "";
		donationAmount = 0;
		amountofEquipment = 0;
		EquipmentDonated = new String[] {"","",""};	
		numVolDays = 0;
		daysToVol = new String [] {"","",""};	
		volHours = 0;
		}
//====================================================================================================
//the getDonation method takes in a double variable as the amount of money donated
//====================================================================================================
	public void getDonation() {
		System.out.println();
		System.out.println("Thank you for donating Enter info below:");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the donation amout: ");
		donationAmount = sc.nextDouble();
	}
	
//====================================================================================================
//the getSupplies method ask the user how many items they want to donate then based on that in value a 
// for loop is used to save that to a string array
//====================================================================================================
	public void getSupplies() {
		System.out.println();
		Scanner sc = new Scanner(System.in);
		System.out.println("Thank You for donating enter the information below: ");
		System.out.println("Enter amount of supplies you want to donate: ");
		amountofEquipment = sc.nextInt();
		
		System.out.println("Enter the supplies you want to donate: ");
		for(int i = 0; i < amountofEquipment; i++) {
			EquipmentDonated[i] = sc.next();
		}
		
	}
	
//====================================================================================================	
//the volunteer method gathers the days a user wants to volunteer through a for loop 
// that saves all the days into an array then ask the user for the amount of hours they want to help
//====================================================================================================
	public void volunteer() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Thank You for Volunteering enter information below: ");
		System.out.println("How many days are you available to volunteer?");
		numVolDays = sc.nextInt();
		System.out.println("Enter the days you are available to help: ");
		for(int i = 0; i < numVolDays; i++)
		{
			daysToVol[i] = sc.next();
		}
		System.out.println("Enter the number of hours you are willing to help: ");
		volHours = sc.nextInt();
		System.out.println("Thank You for showing interest in volunteering we will contact you shortly"
				+ " for further instruction.");
	}
	
//====================================================================================================
// the write summary method gets the all the previous inputs from the class and then writes them into the 
// summary.txt file
//====================================================================================================
	public void WriteSummary() {
		try {
		      BufferedWriter writer = new BufferedWriter(new FileWriter("Summary.txt"));
		      writer.write(name);
		      writer.write("\n"+ email);
		      writer.write("\n"+ phone);
		      writer.write("\n"+ day);
		      writer.write("/" + month);
		      writer.write("/" + year);
		      writer.write("\n"+ donationAmount);
		      
		      for (String EquipmentDonated : EquipmentDonated) {
		        writer.write("\n" + EquipmentDonated);
		      }
		      
		      
		      for (String daysToVol : daysToVol) {
			        writer.write("\n" + daysToVol);
			      }
		      
		      
		      writer.close();
		    } catch (IOException e) {
		      e.printStackTrace();
		    }
	}
//====================================================================================================
// the ReadSummary method reads out the file line by line in a format easy to understand for the user
//====================================================================================================

public void ReadSummary() {
	System.out.println();
	System.out.println();
	System.out.println("**********************************************");
	System.out.println("Here is your summary: ");
	 try {
	      BufferedReader reader = new BufferedReader(new FileReader("Summary.txt"));
	      String line;
	      //
	      System.out.println("User's Name:");
	      line = reader.readLine(); 
	        System.out.println(line);
	        System.out.println("User's Email: ");
	        line = reader.readLine(); 
	        System.out.println(line);
	        System.out.println("User's Phone: ");
	        line = reader.readLine(); 
	        System.out.println(line);
	        System.out.println("User's Date for Vist: ");
	        line = reader.readLine(); 
	        System.out.println(line);
	        System.out.print("Amount Donated: $");
	        line = reader.readLine(); 
	        System.out.println();
	        System.out.println(line);
	        System.out.println("Equipment Donated: ");
	        for(int i = 0; i <amountofEquipment; i++ )
	        {
	        line = reader.readLine(); 
	        System.out.println(line);
	        }
	        System.out.println("Days willing to Volunteer: ");
	        for(int i = 0; i <numVolDays; i++ )
	        {
	        line = reader.readLine(); 
	        System.out.println(line);
	        }
	        
	      reader.close();
	    } catch (IOException e) {
	      e.printStackTrace();
	    }
	 System.out.println("**********************************************");
	}
}
