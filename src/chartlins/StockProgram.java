package chartlins;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class StockProgram {
    public static void main(String[] args) throws Exception {

        System.out.println("Parsing inventory.txt to create Inventory");

        parseFile();

        //Use this class to retrieve the stock data from the inventory.txt file

        //Question 1

        // Print a list of the inventory, sorted in order of increasing price.

        Inventory.sortPriceHigh();

        //Question 2

        // What is the component with the largest number of components in stock

        ArrayList<StockItem> largestQty = Inventory.sortQty();

        itemQty = largetQty[0];

        //Question 3

        // How many NPN transistors does Chartlins have in stock?

        //Question 4

        // What is the total resistance of all the resistors in stock?

        //Question 5

        // How many stock items have unit prices above 10p?

        Inventory.sortPrice(10);
    }

    public static void parseFile() throws FileNotFoundException {
        File file = new File("inventory.txt");

        Scanner scanner = new Scanner(file);

        while(scanner.hasNextLine()){
            String line = scanner.nextLine();

            ArrayList lineInfo = new ArrayList(Arrays.asList(line.split(",")));

            System.out.println("Printing Price of current Item");

            System.out.println(lineInfo.get(3));

            if(lineInfo.size() < 5){


                lineInfo.add(4, "");

            }


            String name = (String) lineInfo.get(0);
            String code = (String) lineInfo.get(1);
            String qty = (String) lineInfo.get(2);
            String price = (String) lineInfo.get(3);
            String sp = (String) lineInfo.get(4);


            //Construct new object



            System.out.println("Creating new stockItem object");

            StockItem stockItem = new StockItem(name, code, qty, price, sp);

            System.out.println("Adding new Item to inventory");

            Inventory.addItem(stockItem);

            System.out.println("Item Added to inventory:");

            System.out.println(stockItem);
        }
    }

}
