package chartlins;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Inventory {

    private static ArrayList<StockItem> invStock;

    public Inventory(){

        ArrayList<StockItem> invStock = new ArrayList<StockItem>();

    }

    public static void addItem(StockItem newItem){

        System.out.println("Adding New Item");

        System.out.println(newItem);

        invStock.add(newItem);

        //Collections.sort()

    }

    //Create methods to parse the Inventory of the items here



    public int numberOfItems(){

        System.out.println("Checking Size of Inventory");

        int stockSize = invStock.size();

        return stockSize;

    }
    public ArrayList<StockItem> sortPriceHigh(){

        ArrayList<StockItem> stock = Inventory.invStock;

        sortedStock = stock.sort();

        return sortedStock;

    }

}
