package chartlins;

import java.util.ArrayList;
import java.util.HashMap;

public class Inventory {

    //ArrayList for storing the entire inventory

    private ArrayList<StockItem> invStock;

    public Inventory(){
        invStock = new ArrayList<StockItem>();

    }

    public void addItem(StockItem newItem){

        //Method for adding an Item to the inventory

        System.out.println("Adding New Item");

        invStock.add(newItem);

        //Collections.sort()

    }

    public void setInvStock(ArrayList<StockItem> invStock) {
        this.invStock = invStock;
    }

    public int numberOfItems(){

        //Example method for checking the number of items currently in the inventory

        System.out.println("Checking Size of Inventory");

        int stockSize = invStock.size();

        return stockSize;

    }
    public void sortPriceHigh(){

        //Method for sorting the prices of the inventory by the highest price

        System.out.println(invStock.get(1));

        for(int i = 0; i < invStock.size(); i++){
            StockItem item = invStock.get(i);

            HashMap happy = new HashMap();

            happy.put(item.getProduct(),item.getPrice());

            System.out.println(happy);
        }



        //happy.put(invStock.get(StockItem.getProduct()), invStock.get(2));

        //ArrayList<StockItem> stock = invStock;

        //ArrayList<StockItem> sortedStock = stock.sort();

    }

}
