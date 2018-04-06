package StacksCafe;
import java.text.NumberFormat;

public class DrinkItem extends LunchItem{
  private int size;
  
  public DrinkItem(String name, double cost, int calories, int size) {
      super(name, cost, calories);
      this.size = size;
  }
  
  public int getSize() {
      return size;
  }
@Override
  public String toString() {
      NumberFormat formatter = NumberFormat.getCurrencyInstance();
      return size + " ounces of " + getName() + " (" + getCalories() + " calories) - "
                  + formatter.format(getCost());
    }
}
