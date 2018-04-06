package StacksCafe;
import java.text.NumberFormat;

public class FoodItem extends LunchItem {
      private String unit;

      public FoodItem(String name, double cost, int calories, String unit) {
          super(name, cost, calories);
          this.unit = unit;
      }

      public String getUnit() {
          return unit;
      }
@Override

      public String toString() {
          NumberFormat formatter = NumberFormat.getCurrencyInstance();
          return unit + " of " + getName() + " (" + getCalories() + " calories) - "
          + formatter.format(getCost());
      }
}

