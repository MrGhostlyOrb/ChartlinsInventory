package chartlins;

import java.io.File;
import java.util.Scanner;

class Inventory {
    static void parseFile() throws Exception{

        //This method will be used to parse inventory.txt

        File file = new File("/home/ben/Desktop/Projects/ChartlinsInventory/inventory.txt");

        Scanner scanner = new Scanner(file);

        while(scanner.hasNextLine()){
            System.out.println(scanner.nextLine());
        }

    }
    static void sortFile(){

    }
}
