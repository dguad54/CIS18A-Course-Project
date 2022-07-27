import java.util.Scanner;

public class GardenInfo {

	public static void main(String[] args) throws InterruptedException {
		
		Scanner sc = new Scanner(System.in);
			int option;
			// Vistor is the class used for the program this is the class inheriting from UserInfo class
			Vistor user = new Vistor();
			//Welcome screen and options
			System.out.println("Welcome to the Moreno Valley College Community Garden"
					+ " please select a option from below:");
			System.out.println("1.Set up Appointment");
			System.out.println("2.Set up Appointment and Donate");
			System.out.println("3.Set up Appointment and Donate Supplies");
			System.out.println("4.Set up Appointment and Volunteer");
			System.out.println("5.Set up Appointment and Volunteer plus Donate Items");
			System.out.println("6.Set up Appointment and Volunteer plus Donate Items and money");
			System.out.println("7.Quit Program");
			option = sc.nextInt();
			//switch statement that uses the int variable option 
			switch (option) {
			case 1:
				user.getInfo();
				user.getDate();
				user.WriteSummary();
				user.ReadSummary();
				break;
			case 2:
				user.getInfo();
				user.getDate();
				user.getDonation();
				user.WriteSummary();
				user.ReadSummary();
				break;
			case 3:
				user.getInfo();
				user.getDate();
				user.getSupplies();
				user.WriteSummary();
				user.ReadSummary();
				break;
			case 4:
				user.getInfo();
				user.getDate();
				user.volunteer();
				user.WriteSummary();
				user.ReadSummary();
				break;
			case 5:
				user.getInfo();
				user.getDate();
				user.volunteer();
				user.getSupplies();
				user.WriteSummary();
				user.ReadSummary();
				break;
			case 6:
				user.getInfo();
				user.getDate();
				user.volunteer();
				user.getSupplies();
				user.getDonation();
				user.WriteSummary();
				user.ReadSummary();
				break;
		case 7:
				break;
			}
		
		System.out.print("Thank You for using the program.");
		
	
	}
}