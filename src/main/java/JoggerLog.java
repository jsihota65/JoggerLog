import java.util.Scanner;

public class JoggerLog {
	
	static String name;
	static int noOfDays;
	static int hours = 0;
	
	public static void greetTheUser(){
		Scanner myscanner = new Scanner(System.in);
		
		
				
		System.out.println("Welcome to Jogger log");
		System.out.println("Please enter the Jogger's name: ");
		name = myscanner.nextLine();
		System.out.println("Please tell me how many days the jogger has jogged this week: ");
		String input = myscanner.nextLine();
		noOfDays = Integer.parseInt(input);
		
		for (int i=1;i<noOfDays+1;i++){
			System.out.println("enter how many hours jogged for Day"+ i + ": ");
			String inputHours = myscanner.nextLine();
			int hoursPerDay = Integer.parseInt(inputHours);
			hours = hours + hoursPerDay;
		
		}
		
	}
	
	public static void calculateAverage(){
		
		float average = hours/noOfDays;
		if (hours<15){
			System.out.println(name + " is an amateur jogger");
		}else if (hours <40){
			System.out.println(name + " is an Efficient jogger");
		}else {
			System.out.println(name + " is an Exremist jogger");
		}
		System.out.println("The average number of hourse per day for " + name + " is: " + average);
			
	}
	
	public static void displayTotalHours(){
		System.out.println("\nTotal hours that " + name + " has jogged for the week is: " + hours);
		
	}
	
	public static void sayFarwell(){
		System.out.println("Thank you for using Jogger log. Have a good day!");
	}

	public static void main(String[] args) {
		greetTheUser();
		displayTotalHours();
		calculateAverage();
		sayFarwell();
	

	}
	
/*	Welcome the user to the application.
	Ask the user what the the registered jogger's name is.
	Ask the user how many days the person being logged or jogger has jogged this week (max 7).
	For each day accounted for, ask user how many hours the jogger has jogged.
	Calculate the total hours the jogger has jogged for the week.
	Let the user know how many hours are logged for the week for that jogger.
	Echo a farewell message to the user.
	Exit the application.*/


}
