package math;

import math.add.Addition;
import math.div.Division;

public class MainApp {
    public static void main(String[] args) {
        Addition addObj = new Addition();
        Division divObj = new Division();

        int sum = addObj.add(10, 5);
        int result = divObj.divide(20, 4);

        System.out.println("Addition: " + sum);
        System.out.println("Division: " + result);
    }
}
