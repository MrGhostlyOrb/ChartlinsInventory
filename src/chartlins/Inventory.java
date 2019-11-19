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

            ArrayList lineInfo = new ArrayList(Arrays.asList(line.split(",")))

            System.out.println(lineInfo);

            if(lineInfo.size() < 5){
                System.out.println("Hey");



            }

            //Convert Strings to ints for constructor and remove space

            String newLineInfo2 = (String) lineInfo.get(2);

            String newLineInfo2Sub = newLineInfo2.substring(1);

            int newLineInfo2Int = Integer.parseInt(newLineInfo2Sub);

            String newLineInfo3 = (String) lineInfo.get(3);

            String newLineInfo3Sub = newLineInfo3.substring(1);

            int newLineInfo3Int = Integer.parseInt(newLineInfo3Sub);

            //Construct new object

            StockItem stockItem = new StockItem(Arrays.toString(lineInfo.get(0)), lineInfo.get(1), newLineInfo2Int, newLineInfo3Int, lineInfo.get(4));
        }
    }

    public int numberOfItems(){

        int stockSize = invStock.size();

        return stockSize;

    }

}
