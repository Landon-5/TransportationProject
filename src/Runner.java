
import java.util.Scanner;

public class Runner
{
	public static void main(String[] args)
	{
		System.out.println("My Transportation Project");
		System.out.println("");
		
		System.out.println("The formula we are using to calculate costs is:");
		System.out.println("Price of gas per gallon * (Distance / MPG) + Expenses = Total Cost");
		System.out.println("");
		
		System.out.print("Plugging in my data into this formula, ");
		System.out.println("The values for our first trip are:");
		System.out.println("3.28 * (6 / 37) + 50");
		System.out.println("Which calculates out to:");
		System.out.println(3.28 * (6.0 / 37.0) + 50.0); // using literals in a mathematical expression
		System.out.println(""); //Make sure there is a double in the division so that it is arithmetically correct
		
		System.out.println("I start my first trip at my house.");
		System.out.println("From my house I go to Alta High School,");
		System.out.println("From Alta, I go to Costco where I will buy $50 worth of groceries,");
		System.out.println("After Costco, I go to the last place of my trip which is Lone Peak Park.");
		System.out.println("");
		
		System.out.println("The data from my trip plugged into the formula is:");
		System.out.println("3.28 * (6 / 37) + 50");
		System.out.println("");
		
		System.out.println("On my second trip, I started from my home once again,");
		System.out.println("and went to Lone Peak Park first.");
		System.out.println("Second, I went to Alta High School.");
		System.out.println("Last, I went to Costco and spent $50.");
		System.out.println("");
		
		System.out.println("The data from my 2nd trip plugged into the formula is:");
		System.out.println("3.28 * (7.2 / 37) + 50");
		System.out.println("Which equals:");
		System.out.println(3.28 * (7.2 / 37) + 50);
		System.out.println("");
		
		double priceOfGas; //local variable
		
		priceOfGas = 3.28;
		System.out.println(priceOfGas);
		
		int tripNumber;
		tripNumber = 3;
		
		double tripDistance;
		double mpg;
		int itemCost;
		
		tripDistance = 7.1;
		mpg = 37.0;
		itemCost = 50;
		
		double tripTotalCost = (priceOfGas * (tripDistance / mpg) + itemCost);
		
		System.out.println("The values for the third trip are:");
		System.out.println("Price of gas: " + priceOfGas);
		System.out.println("Trip Dostance: " + tripDistance);
		System.out.println("The value for mpg is: " + mpg);
		System.out.println("The cost of the items for this trip are: " + itemCost);
		System.out.println("The total cost for the " + tripNumber + "trip is: " + tripTotalCost);
		System.out.println("Going from: Home, Lone Peak Park, Alta, Costco");
		System.out.println("");
		
		//Increment operator
		tripNumber++;
		System.out.println("Go to the next trip " + tripNumber);
		tripNumber--;
		System.out.println("Just kidding back " + tripNumber);
		
		itemCost *= 3;
		/*  That is the same as:
		 *  itemCost = itemCost * 3
		 *  +=, -=, /=, *=, %=, are all compound operators
		 */
		System.out.println("I bought way too much " + itemCost);
		
		String costInfo = "The cost is now ";
		costInfo += itemCost;
		
		System.out.println(costInfo);
		
		//Using a Scanner
		
		Scanner textInput;
		//Initialize a Scanner
		textInput = new Scanner(System.in); // initialize and assign the results of the constructor call
		//textInput is an instance of a Scanner object
		
		System.out.println("Using a scanner instance to get your input");
		System.out.println("Type in a number");
		int number = textInput.nextInt();
		System.out.println("You typed: " + number);
		
		System.out.println("Type in a decimal value AKA floating point number");
		double someDecimal = textInput.nextDouble();
		System.out.println("You typed: " + someDecimal);
		
		//Now making info for trip 4 but asking the user for those values
		
		tripNumber++;//moving trip number up to 4
		System.out.println("What is the total distance for trip number " + tripNumber + "?");
		tripDistance = textInput.nextDouble();
		
		System.out.println("What is the price of gas per gallon?");
		priceOfGas = textInput.nextDouble();
		
		System.out.println("What is the mpg?");
		mpg = textInput.nextDouble();
		
		System.out.println("What are the total costs of purchases made on the trip?");
		itemCost = textInput.nextInt();
		
		//After collecting all values
		
		tripTotalCost = (priceOfGas * (tripDistance / mpg) + itemCost);
		
		double tripFourCost = priceOfGas * (tripDistance / mpg) + itemCost;
		
		System.out.println("The total cost for this trip is: " + tripFourCost);
		System.out.println("");
		
		System.out.println("Type the order of your destinations for trip four: ");
		String tripOrder = "";
		tripOrder = textInput.nextLine();
		System.out.println("The order is: " + tripOrder);
		System.out.println("");
		
		System.out.println("Calculating average information for trips");
		
		System.out.println("Please type in the cost of the first trip: ");
		double costOne = textInput.nextDouble();
		System.out.println("Please type in the cost of the second trip: ");
		double costTwo = textInput.nextDouble();
		System.out.println("Please type in the cost of the third trip: ");
		double costThree = textInput.nextDouble();
		System.out.println("Please type in the cost of the fourth trip: ");
		double costFour = textInput.nextDouble();
		
		double sum = costOne + costTwo + costThree + costFour;
		int mean = (int) (sum / 4 + 0.5);
		System.out.println("The mean value for our trip costs is " + mean);
		double average = sum / 4;
		System.out.println("The real average is: " + average);
		System.out.println("");
		
		System.out.println("Using Java to calculate the triangular distance between points");
		
		System.out.println("Please type the first leg distance");
		double firstLeg = textInput.nextDouble();
		System.out.println("Please type in the second leg distance");
		double secondLeg = textInput.nextDouble();
		
		double squaredSum = (Math.pow(firstLeg,  2) + Math.pow(secondLeg,  2));
		double triangularDistance = Math.sqrt(squaredSum);
		
		System.out.println("The distance calculated by Java and google maps is " + triangularDistance);
		System.out.println("");
		
		System.out.println("Modeling the real world with changing gas prices");
		
		System.out.println("Please type in the maximum percentage of change for gasoline prices");
		System.out.println("Up to ten percent max pls");
		
		int percentageChange = textInput.nextInt();
		percentageChange *= Math.random();
		
		System.out.println("The original price of gas was: " + priceOfGas);
//		priceOfGas += percentageChange * 0.01 * priceOfGas;
		//Price is the original price times .01 times the percentage change and then added back to the cost
		
		int positiveNegativeScalar = (int) (Math.random() * 3 ) - 1;
		priceOfGas += percentageChange * 0.01 * priceOfGas * positiveNegativeScalar;
		
		System.out.println("The new price is: " + priceOfGas);
		System.out.println("");
		
		System.out.println("Converting mathematical operations into boolean expressions");
		
		//The code from above about the first two trips using literals
		System.out.println("The values for our first trip are:");
		System.out.println("3.28 * (6 / 37) + 50");
		System.out.println("Which calculates out to:");
		System.out.println(3.28 * (6.0 / 37.0) + 50.0);
		System.out.println("");
		
		System.out.println("The data from my 2nd trip plugged into the formula is:");
		System.out.println("3.28 * (7.2 / 37) + 50");
		System.out.println("Which equals:");
		System.out.println(3.28 * (7.2 / 37) + 50);
		
		boolean isFirstCheaper = (3.28 * (6.0 / 37.0) + 50.0) < (3.28 * (7.2 / 37.0) + 50.0); //using variables is so much easier
		System.out.println("The first trip is cheaper than the second: " + isFirstCheaper);
		System.out.println("");

		double tripOneCost = (3.28 * (6.0 / 37.0) + 50.0);
		double tripTwoCost = (3.28 * (7.2 / 37.0) + 50.0);
		
		boolean isSecondCheaper = tripOneCost >= tripTwoCost; //like here we can see variables make it a lot simpler
		System.out.println("The second trip is cheaper than first: " + isSecondCheaper);
		System.out.println("");

		double tripThreeCost = tripTotalCost;
		
		boolean isThirdCheaperThanFirst = tripOneCost > tripThreeCost;
		System.out.println("The third trip is cheaper than the first: " + isThirdCheaperThanFirst);
		System.out.println("");
		
		boolean isFourthCheaperThanFirst = tripOneCost > tripFourCost;
		System.out.println("The fourth trip is cheaper than the first: " + isFourthCheaperThanFirst);
		System.out.println("");

		boolean isThirdCheaperThanFourth = tripThreeCost < tripFourCost;
		System.out.println("The third trip is cheaper than the fourth: " + isThirdCheaperThanFourth);
		System.out.println("");
		
	}

}
