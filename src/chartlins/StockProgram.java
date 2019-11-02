package chartlins;

public class StockProgram {
    public static void main(String[] args) throws Exception {
        System.out.println("This is the beginning of the program");

        Inventory.parseFile();

        //Question 1

        // Print a list of the inventory, sorted in order of increasing price.

        //Ideas

        //Inventory class will list all of inventory using a parsing method, StockItem class will include a sorting method for sorting by price either high or low

        //Question 2

        // What is the component with the largest number of components in stock

        //Ideas

        //Calls Stock item class and parses all items for largest number of components

        //Question 3

        // How many NPN transistors does Chartlins have in stock?

        //Ideas

        //Calls StockItem class and queries NPN transistors and how many

        //Question 4

        // What is the total resistance of all the resistors in stock?

        //Question 5

        // How many stock items have unit prices above 10p?
    }
}
