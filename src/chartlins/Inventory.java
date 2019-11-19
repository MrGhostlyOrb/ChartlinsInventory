package chartlins;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Inventory {

    private ArrayList<StockItem> invStock;

    public Inventory(){

        ArrayList<StockItem> invStock = new ArrayList<StockItem>();

    }

    public void addItem(StockItem newItem){

        invStock.add(newItem);

    }

    //Create methods to parse the Inventory of the items here

    public static void parseFile() throws FileNotFoundException {
        File file = new File("inventory.txt");

        Scanner scanner = new Scanner(file);

        while(scanner.hasNextLine()){
            String line = scanner.nextLine();

            String[] lineInfo = new String[5];

            lineInfo = line.split(",");

            System.out.println(Arrays.toString(lineInfo));


        }
    }

    public int numberOfItems(){

        int stockSize = invStock.size();

        return stockSize;

    }

}
