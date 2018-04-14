package StacksCafe;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StacksCafe {
private Stack<LunchItem> meats, vegetables, dessets, drinks;
private Queue<Order> orders;
public Stack<LunchItem> getMeats() {
if(meats == null) {
meats = new Stack<>();
meats.add(new FoodItem("Meat1", 3.4, 30, "Plate"));
meats.add(new FoodItem("Meat2", 6.4, 130, "Piece"));
meats.add(new FoodItem("Meat3", 6.4, 70, "Slice"));
meats.add(new FoodItem("Meat4", 3.4, 30, "Piece"));
meats.add(new FoodItem("Meat5", 1.4, 80, "Plate"));
meats.add(new FoodItem("Meat6", 2.4, 25, "Piece"));
meats.add(new FoodItem("Meat7", 5, 30, "Plate"));
meats.add(new FoodItem("Meat8", 3.4, 24, "Slice"));
meats.add(new FoodItem("Meat9", 5.1, 34, "Piece"));
meats.add(new FoodItem("Meat10", 8.1, 30, "Plate"));
}
return meats;
}
public Stack<LunchItem> getVegetables() {
if(vegetables == null) {
vegetables = new Stack<>();
vegetables.add(new FoodItem("Salad1", 3.4, 30, "Plate"));
vegetables.add(new FoodItem("Salad2", 6.4, 130, "Piece"));
vegetables.add(new FoodItem("Salad3", 6.4, 70, "Slice"));
vegetables.add(new FoodItem("Broccoli", 3.4, 30, "Piece"));
vegetables.add(new FoodItem("Broccoli1", 1.4, 80, "Plate"));
vegetables.add(new FoodItem("Broccoli2", 2.4, 25, "Piece"));
}
return vegetables;
}
public Stack<LunchItem> getDessets() {
if(dessets == null) {
dessets = new Stack<>();
dessets.add(new FoodItem("Cake", 3.4, 30, "Plate"));
dessets.add(new FoodItem("Pastrie", 6.4, 130, "Piece"));
dessets.add(new FoodItem("Donut", 6.4, 70, "Slice"));
dessets.add(new FoodItem("Ice Cream", 3.4, 30, "Piece"));
dessets.add(new FoodItem("Pie", 1.4, 80, "Piece"));
}
return dessets;
}
public Stack<LunchItem> getDrinks() {
if(drinks == null) {
drinks = new Stack<>();
drinks.add(new DrinkItem("Coke", 3.4, 30, 4));
drinks.add(new DrinkItem("Pepsi", 6.4, 130, 6));
drinks.add(new DrinkItem("Diet Coke", 6.4, 70, 7));
drinks.add(new DrinkItem("Diet Coke1", 3.4, 30, 8));
drinks.add(new DrinkItem("Diet Coke2", 3, 80, 5));
drinks.add(new DrinkItem("Diet Coke3", 1.1, 30, 5));
drinks.add(new DrinkItem("Diet Coke4", 6.4, 20, 5));
drinks.add(new DrinkItem("Diet Coke5", 4, 40, 5));
drinks.add(new DrinkItem("Diet Coke6", 5.4, 80, 5));
drinks.add(new DrinkItem("Diet Coke7", 1.4, 80, 5));
}
return drinks;
}
public Queue<Order> getOrders() {
if(orders == null) {
orders = new LinkedList<>();
for(int i=1; i<10; i++) {
orders.add(new Order(i));
}
}
return orders;
}
public void fillOrders() {
for(Order o: getOrders()) {
if(!getMeats().isEmpty()) {
o.add(meats.pop());
}
if(!getVegetables().isEmpty()) {
o.add(vegetables.pop());
}
if(!getDessets().isEmpty()) {
o.add(dessets.pop());
}
if(!getDrinks().isEmpty()) {
o.add(drinks.pop());
}
}
}
public void checkOutOrders() {
for(Order o: getOrders()) {
System.out.println(o + "\n");
}
}
public static void main(String args[]) {
StacksCafe cafe = new StacksCafe();
cafe.fillOrders();
cafe.checkOutOrders();
}
}
