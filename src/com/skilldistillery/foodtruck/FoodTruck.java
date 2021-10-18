package com.skilldistillery.foodtruck;

//this class has data including the ID, which will be generated contructor from a static filed that is incremented as each truck is created.//
public class FoodTruck {

	String truckName;
	String foodType;
	int rating;
	int id;
	int count = 0;

	public FoodTruck(String truckName, String foodType, int rating) {
		super();
		this.truckName = truckName;
		this.foodType = foodType;
		this.rating = rating;
		this.id = count;
		count = count + 1;

	}

	@Override
	public String toString() {
		return "FoodTruck [truckName=" + truckName + ", foodType=" + foodType + ", rating=" + rating + ", id=" + id
				+ "]";
	}

	public String getTruckName() {
		return truckName;
	}

	public void setTruckName(String truckName) {
		this.truckName = truckName;
	}

	public String getFoodType() {
		return foodType;
	}

	public void setFoodType(String foodType) {
		this.foodType = foodType;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		FoodTruck.count = count;
	}
	
	
}