package chartlins;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Inventory {

    //ArrayList for storing the entire inventory

    private static ArrayList<StockItem> invStock;

    public Inventory(){

        ArrayList<StockItem> invStock = new ArrayList<StockItem>();

    }

    public static void addItem(StockItem newItem){

        //Method for adding an Item to the inventory

        System.out.println("Adding New Item");

        System.out.println(newItem);

        //TODO fix this

        invStock.add(newItem);

        //Collections.sort()

    }

    public int numberOfItems(){

        //Example method for checking the number of items currently in the inventory

        System.out.println("Checking Size of Inventory");

        int stockSize = invStock.size();

        return stockSize;

    }
    public ArrayList<StockItem> sortPriceHigh(){

        //Method for sorting the prices of the inventory by the highest price

        ArrayList<StockItem> stock = Inventory.invStock;

        //TODO Google how to sort this

        sortedStock = stock.sort();

        return sortedStock;

    }

}
