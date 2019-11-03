package chartlins;

import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

class Inventory {
    static void parseFile() throws Exception{

        //This method will be used to parse inventory.txt

        //Create a new file to reference inventory.txt

        File file = new File("/home/ben/Desktop/Projects/ChartlinsInventory/inventory.txt");

        //Create a new scanner to parse the file

        Scanner scanner = new Scanner(file);

        //Loop through every line of the file to extract the information

        int arrayCount = 0;

        while(scanner.hasNextLine()){
            String line = scanner.nextLine();
            System.out.println(line);

            arrayCount = arrayCount + 1;
            System.out.println(arrayCount);

            //Run split method to start processing the data
            //TODO Put this in StockProgram.java and create a return method for this
            Inventory.split(line);
        }

        //arrayCount is now = to the amount of elements in the file


    }
    private static void split(String textLine){

        //This method is used to split up each line that is currently a string and cast each piece of information to an array

        System.out.println(textLine);
        String[] array;
        array = textLine.split(",");

        //array[0] is the name of the product
        //array[1] is the product code
        //array[2] is the quantity of product in stock
        //array[3] is price of the product in pence
        //array[4] is extra information

        //TODO create methods for each of these to extract a list of just that data which can then be sorted
        //Data will then be sent to StockItem.java to be sorted
        System.out.println(Arrays.toString(array));
    }
}
