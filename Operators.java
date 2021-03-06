Objective 
In this challenge, you'll work with arithmetic operators. Check out the Tutorial tab for learning materials and an instructional video!

Task 
Given the meal price (base cost of a meal), tip percent (the percentage of the meal price being added as tip), and tax percent (the percentage of the meal price being added as tax) for a meal, find and print the meal's total cost.

Note: Be sure to use precise values for your calculations, or you may end up with an incorrectly rounded result!

Input Format

There are  lines of numeric input: 
The first line has a double,  (the cost of the meal before tax and tip). 
The second line has an integer,  (the percentage of  being added as tip). 
The third line has an integer,  (the percentage of  being added as tax).

Output Format

Print The total meal cost is totalCost dollars., where  is the rounded integer result of the entire bill ( with added tax and tip).

Sample Input

12.00
20
8
Sample Output

The total meal cost is 15 dollars.
Explanation

Given: 
, , 

Calculations: 
 
 
 

We round  to the nearest dollar (integer) and then print our result:

The total meal cost is 15 dollars.


import java.util.*;
import java.math.*;

public class Arithmetic {

    int tipPercent;
    int taxPercent;
    double mealCost;
    double total;
    double tip;
    double tax;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double mealCost = scan.nextDouble(); // original meal price
        int tipPercent = scan.nextInt(); // tip percentage
        int taxPercent = scan.nextInt(); // tax percentage
        scan.close();

        public Arithmetic() {
        this.tip = mealCost * (tipPercent/100);
        this.tax = mealCost * (taxPercent/100);
        //total = mealCost + tip + tax;
    }
        public double total() {
            return mealCost + tip + tax;
        }
        // Write your calculation code here.
        //public double void total() {
       // return mealCost + tip + tax;
    //}
    }

         // cast the result of the rounding operation to an int and save it as totalCost
    int totalCost = (int) Math.round(total);

    // Print your result
        System.out.printf("The total meal cost is &s  dollars", totalCost);
}
