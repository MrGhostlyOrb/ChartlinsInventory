package chartlins;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StockProgram {
    public static void main(String[] args) throws Exception {
        System.out.println("This is the beginning of the program");

        System.out.println("Will now parse inventory.txt to update stock list and store items in array");

        String[] itemArray;

        itemArray = Inventory.parseFile();

        System.out.println(Arrays.toString(itemArray));

        System.out.println("Will now send array to StockItem.java to be sorted by price");


        StockItem.sortPriceHigh(itemArray);


        //Question 1

        // Print a list of the inventory, sorted in order of increasing price.

        //Question 2

        // What is the component with the largest number of components in stock

        //Question 3

        // How many NPN transistors does Chartlins have in stock?

        //Question 4

        // What is the total resistance of all the resistors in stock?

        //Question 5

        // How many stock items have unit prices above 10p?
    }
}
