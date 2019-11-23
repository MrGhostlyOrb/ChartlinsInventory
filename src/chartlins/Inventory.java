package chartlins;

import java.util.*;
import java.util.stream.Collectors;

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
    public Map<String, Integer> sortPriceHigh(){

        //Method for sorting the prices of the inventory by the highest price

        Map<String, Integer> happy = new HashMap();

        System.out.println(invStock.size());

        for(int i = 0; i < invStock.size(); i++){
            StockItem item = invStock.get(i);

            //Turn price into int

            String strItem = item.getPrice();

            String trimStrItem = strItem.substring(1);

            int intItem = Integer.parseInt(trimStrItem);

            System.out.println(item.getCode());

            System.out.println(intItem);

            //Added product name and price to hashmap to be sorted

            happy.put(item.getCode(),intItem);

            System.out.println(happy);

        }

        Map<String, Integer> sorted = happy.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

        System.out.println(sorted);

        return sorted;

        //happy.put(invStock.get(StockItem.getProduct()), invStock.get(2));

        //ArrayList<StockItem> stock = invStock;

        //ArrayList<StockItem> sortedStock = stock.sort();

    }

}
