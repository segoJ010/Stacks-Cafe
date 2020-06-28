package StacksCafe;
import java.text.NumberFormat;

public class DrinkItem extends LunchItem{ //b extends a = b made a bigger and fatter
  private int size; //private because we dont want the contents of the memory address fucked up
  
  public DrinkItem(String name, double cost, int calories, int size) { //method w/ 4 parameters
      super(name, cost, calories);
      this.size = size;
  }
  
  public int getSize() {
      return size;
  }
@Override
  public String toString() {
      NumberFormat formatter = NumberFormat.getCurrencyInstance();
      return size + " great ounces of " + getName() + " (" + getCalories() + " calories) - "
                  + formatter.format(getCost());
    }
}
