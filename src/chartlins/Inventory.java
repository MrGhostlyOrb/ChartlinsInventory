package chartlins;

import java.util.*;

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

            Map<Integer, String> happy = new HashMap();

            //Turn price into int

            String strItem = item.getPrice();

            String trimStrItem = strItem.substring(1);

            int intItem = Integer.parseInt(trimStrItem);

            happy.put(intItem,item.getProduct());

            List<Integer> list = new ArrayList(happy.keySet());

            Collections.sort(list, new Comparator<Integer>(){

                @Override

                public int compare(Integer o1, Integer o2){
                    return o2 - o1;
                }


            });

            Map<Integer, String> sortedMap = new LinkedHashMap<>();
            for(Integer keys : list){
                sortedMap.put(keys, (String) happy.get(keys));
            }

            System.out.println(sortedMap);

        }



        //happy.put(invStock.get(StockItem.getProduct()), invStock.get(2));

        //ArrayList<StockItem> stock = invStock;

        //ArrayList<StockItem> sortedStock = stock.sort();

    }

}
