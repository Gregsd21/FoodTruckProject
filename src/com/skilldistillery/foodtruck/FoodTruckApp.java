package com.skilldistillery.foodtruck;

import java.util.Scanner;

public class FoodTruckApp {

	public static void main(String[] args) {
		Scanner kB = new Scanner(System.in);
		int truckCount = 0;

		System.out.println("Hello! Welcome To Felp! Your Favorite Food Truck Creator App! Enter your name to Begin: ");
		String name = kB.nextLine();
		System.out.println("Hello, " + name + "!");

		FoodTruck truckArray[] = new FoodTruck[5];
		while (truckCount < truckArray.length) {
			// for (int count = 0; count < 5; count++) {

			System.out.println("Please Enter The Food Truck Name: ");
			String ftName = kB.nextLine();
			if (ftName.equalsIgnoreCase("quit")) {
				break;
			}
			System.out.println("You have entered " + ftName);

			System.out.println("Please Enter The Food Type: ");
			String foodType = kB.nextLine();
			System.out.println("You have entered " + foodType);

			System.out.println("Please Rate The Food Truck Experience: ");
			System.out.println(" ---------Rate Scale--------");
			System.out.println(" --------1.Terrible---------");
			System.out.println(" ----2.Not Enough Flavor----");
			System.out.println(" -------3.It Was Ok---------");
			System.out.println(" -------4.Good Meal---------");
			System.out.println(" ------5.Very Delicious-----");
			System.out.println(" ---------------------------");
			int rating = kB.nextInt();
			kB.nextLine();

			System.out.println("You have entered " + rating);
			FoodTruck foodTruck = new FoodTruck(ftName, foodType, rating);
			truckArray[truckCount] = foodTruck;
			truckCount++;
		}
		
			boolean menuSelect = true;
			while (menuSelect) {
				FoodTruck foodTruck = new FoodTruck(name, name, truckCount); 
				System.out.println("Your Trucks are built! What would you like to do next?");
				System.out.println(" --------------------------------");
				System.out.println(" ------1.View Highest Rated------");
				System.out.println(" -----2.List All Food Trucks-----");
				System.out.println(" ------3.See Average Ratings-----");
				System.out.println(" -------------4.Quit-------------");
				System.out.println(" --------------------------------");

				int menuItem = kB.nextInt();
				kB.nextLine();

				switch (menuItem) {
				case 1:

					for (int i = 0; i < truckArray.length; i++) {
						FoodTruck selectTruck = truckArray[i];
						if (foodTruck != null) {
							System.out.println(foodTruck);

						} else {
							continue;
						}
					}

					break;

				case 2:
					double sumRate = 0;
					int allTrucks = 0;
					double avgRating;
					 
					for (int i = 0; i < truckArray.length; i++) {
						FoodTruck selectTruck = truckArray[i];
						if (foodTruck != null) {
							sumRate += foodTruck.getRating();
							allTrucks++;
						}
					}
					avgRating = sumRate / allTrucks;
					System.out.println(" The average rating of the trucks " + avgRating + ".");
					break;
				case 3:
					String highestRated = "";
					double highestRating = 0;
					int highestRatedIndex = 0;
					for (int i = 0; i < truckArray.length; i++) {
						FoodTruck currentTruck = truckArray[i];
						if (currentTruck != null) {
							double currentRating = currentTruck.getRating();
							System.out.println("currentRating test: " + currentRating);
							if (currentRating > highestRating) {
								highestRated = currentTruck.getTruckName();
								highestRating = currentRating;
								highestRatedIndex = i;
							}
						}
					}

					System.out.println(" The highest rated food truck is " + highestRated);
					System.out.println(truckArray[highestRatedIndex].toString());
					break;

				case 4:
					menuSelect = false;
					System.out.println(" Exiting, Belly full. ^_^ ");

					break;
				default:
//				System.out.println("Invalid Entry.");

				}

			}
		
	}
}
