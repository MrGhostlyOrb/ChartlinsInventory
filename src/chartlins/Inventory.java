package chartlins;

import java.io.File;
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

    public int numberOfItems(){

        int stockSize = invStock.size();

        return stockSize;

    }

}
