package chartlins;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

class Inventory {
    static String[] parseFile() throws Exception{

        //This method will be used to parse inventory.txt

        //Create a new file to reference inventory.txt

        File file = new File("/home/ben/Desktop/Projects/ChartlinsInventory/inventory.txt");

        //Create a new scanner to parse the file

        Scanner scanner = new Scanner(file);

        //Loop through every line of the file to extract the information


        int count = 0;
        while(scanner.hasNextLine()){
            String line = scanner.nextLine();
            //System.out.println(line);
            count = count + 1;

        }
        int count2 = 0;
        String[] lineArray = new String[count + 1];
        String[] lineInfo = new String[1];
        Scanner scanner2 = new Scanner(file);
        while(scanner2.hasNextLine()){
            String line = scanner2.nextLine();
            count2 = count2 + 1;
            lineInfo[0] = line;
            String lineInfos;
            lineInfos = Arrays.toString(lineInfo);
            lineArray[count2] = lineInfos;

        }
        return(lineArray);
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
