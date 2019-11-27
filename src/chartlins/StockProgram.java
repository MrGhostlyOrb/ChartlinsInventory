package chartlins;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class StockProgram {
    public static void main(String[] args) throws Exception {

        System.out.println("Parsing inventory.txt to create Inventory");

        Inventory inv = new Inventory();

        parseFile(inv);

        //Question 1

        System.out.println("----------");
        System.out.println("Question 1");
        System.out.println("----------");

        // Print a list of the inventory, sorted in order of increasing price.

        Map<String, Integer> sortedMap = new HashMap();

        sortedMap = inv.sortPriceHigh();

        for(Map.Entry<String, Integer> entry : sortedMap.entrySet()){
            System.out.println("Product Code : " + entry.getKey() + ", Price in pence : " + entry.getValue());
        }

        //Question 2

        System.out.println("----------");
        System.out.println("Question 2");
        System.out.println("----------");

        // What is the component with the largest number of components in stock

        String selection = new String();

        selection = "quantity";

        String[] q2Arr = (inv.largestNum(selection));

        System.out.println("Product with the highest " + selection + " is : ");

        System.out.println("Product : " + q2Arr[0]);
        System.out.println(selection + " : " + q2Arr[1]);

        //Question 3

        System.out.println("----------");
        System.out.println("Question 3");
        System.out.println("----------");

        // How many NPN transistors does Chartlins have in stock?

        int q3Num = 0;

        q3Num = inv.specialQty();

        System.out.println("The number of NPN transistors in stock is : " + q3Num);

        //Question 4

        System.out.println("----------");
        System.out.println("Question 4");
        System.out.println("----------");

        // What is the total resistance of all the resistors in stock?

        long q4Num = 0;

        q4Num = inv.totalRes();

        System.out.println("The total resistance of all of the resistors in stock is : " + q4Num + " \u2126");

        //Question 5

        System.out.println("----------");
        System.out.println("Question 5");
        System.out.println("----------");

        // How many stock items have unit prices above 10p?

        ArrayList<String> q5List = new ArrayList<String>();

        int price = 10;

        q5List = inv.sortPrice(price);

        System.out.println(q5List.size() + " Items have a price above " + price + " pence");
    }

    public static void parseFile(Inventory inv) throws FileNotFoundException {

        //Method for parsing inventory.txt and retrieving the data in an and adding all items to the inventory

        File file = new File("inventory.txt");

        Scanner scanner = new Scanner(file);

        //Check for next line in inventory.txt

        while(scanner.hasNextLine()){
            String line = scanner.nextLine();

            ArrayList lineInfo = new ArrayList(Arrays.asList(line.split(",")));

            //Check to see if line has a minimum of 5 elements

            if(lineInfo.size() < 5){

                lineInfo.add(4, "");

            }


            //Assign elements of line to variables

            //Product Name [0]
            String name = (String) lineInfo.get(0);
            //Product Code [1]
            String code = (String) lineInfo.get(1);
            //Product Quantity [2]
            String qty = (String) lineInfo.get(2);
            //Product Price [3]
            String price = (String) lineInfo.get(3);
            //Product Special Value [4]
            String sp = (String) lineInfo.get(4);

            //Construct new object

            StockItem stockItem = new StockItem(name, code, qty, price, sp);

            //Add item to inventory

            inv.addItem(stockItem);
        }

        System.out.println("All Items imported from inventory.txt");

    }

}
