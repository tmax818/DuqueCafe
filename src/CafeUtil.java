import java.util.ArrayList;
import java.util.Scanner;

public class CafeUtil {

    /**
     * sums together every consecutive integer from 1 to 10 and returns the sum
     * @return sum
     */
    public int getStreakGoal(){
        int sum = 0;
        for(int i = 0; i < 11; i++){
            sum += i;
        }
        return sum;
    }

    // double[] lineItems = {3.5, 1.5, 4.0, 4.5};
    public double getOrderTotal(double[] prices) {
        double total = 0.0;
        for (int i = 0; i < prices.length; i++) {
            total += prices[i];

        }
        return total;
    }

    /**
     * Given an ArrayList of menu items (strings), print out each index and menu item.
     * @param menuItems
     */
    public
    void displayMenu(ArrayList<String> menuItems){
        for(int i = 0; i < menuItems.size(); i++){
            System.out.format("%d --- %s\n",i, menuItems.get(i));
        }
    }

    public void addCustomer(ArrayList<String> customers){
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter your name:");
        String userName = s.nextLine();
        System.out.format("Hello, %s ", userName);
        System.out.format("There are %d people in front of you\n", customers.size());
        customers.add(userName);
        System.out.println(customers);
    }
}
