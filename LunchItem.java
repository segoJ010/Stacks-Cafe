package StacksCafe;
public class LunchItem {
	private String name;
	private double cost;
	private int calories;
	public LunchItem(String name, double cost, int calories) {
	this.name = name;
	this.cost = cost;
	this.calories = calories;
	}
	public String getName() {
	return name;
	}
	public double getCost() {
	return cost;
	}
	public int getCalories() {
	return calories;
	}
