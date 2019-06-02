package foodForAll;

import java.util.Scanner;

public class FoodForAll {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);

		String eventType;
		int partySize;
		
		String result;
		String mealSugg = null;
		String prepSuggestion = null;

		System.out.println("What kind of event are you having?");
		eventType = scnr.nextLine().toString();

		System.out.println("How many people are in your party?");
		partySize = scnr.nextInt();

		if (eventType.contentEquals( "casual")) {
			mealSugg = " you should make sandwiches";
		} else if (eventType.contentEquals("semi-formal")) {
			mealSugg = " you should make fried chicken";
		} else if (eventType.contentEquals( "formal")) {
			mealSugg = " you should make chicken parmesan";
		} else {
			System.out.println("You haven't chosen one of the desired choices.");
		}
		
		if (partySize == 1) {
			prepSuggestion = " in the microwave.";
		} else if (partySize >= 2 && partySize <= 12) {
			prepSuggestion = " in your kitchen.";
		} else { 
			prepSuggestion = " by a caterer.";
		}
		
		result = ("Since you are having a " + eventType + " event with " + partySize + " participants, " + mealSugg
				+ prepSuggestion);

		System.out.println(result);
	}
}
