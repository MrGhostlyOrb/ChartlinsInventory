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

        System.out.println(invStock.size() + " Items to sort by Price");

        for(int i = 0; i < invStock.size(); i++){
            StockItem item = invStock.get(i);

            //Turn price into int

            String strItem = item.getPrice();

            String trimStrItem = strItem.substring(1);

            int intItem = Integer.parseInt(trimStrItem);

            //Added product name and price to hashmap to be sorted

            happy.put(item.getCode(),intItem);

        }

        Map<String, Integer> sorted = happy.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

        return sorted;

        //happy.put(invStock.get(StockItem.getProduct()), invStock.get(2));

        //ArrayList<StockItem> stock = invStock;

        //ArrayList<StockItem> sortedStock = stock.sort();

    }

    public String[] largestNum(String selection){

        Map<String, Integer> unSorted = new HashMap();
        String[] returnArray = new String[2];

        for(int i = 0; i < invStock.size(); i++){
            StockItem item = invStock.get(i);

            //This if statement could be expanded to include other selections

            if(selection == "Quantity"){
                String strQty = item.getQty();

                String trimStrItem = strQty.substring(1);

                int intItem = Integer.parseInt(trimStrItem);

                //Added product name and price to hashmap to be sorted

                unSorted.put(item.getCode(),intItem);

            }

            Map<String, Integer> sorted = unSorted.entrySet()
                    .stream()
                    .sorted(Map.Entry.comparingByValue())
                    .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

            boolean count = false;
            String returnKey = "";
            int returnValue = 0;


            while(count != true) {

                for (Map.Entry<String, Integer> entry : sorted.entrySet()) {
                    returnKey = entry.getKey();
                    returnValue = entry.getValue();

                    count = true;
                }
            }

            returnArray[0] = returnKey;
            returnArray[1] = Integer.toString(returnValue);

            }
        return returnArray;
    }

    public int specialQty(){

        ArrayList<String> NPNArray = new ArrayList<String>();
        int NPNtotal = 0;


        for(int i = 0; i < invStock.size(); i++){
            StockItem item = invStock.get(i);

                String strSp = item.getSpecial();

                if(strSp.length() < 1){
                    continue;
                }

                String trimStrItem = strSp.substring(1);

                if(trimStrItem.equals("NPN")){

                    String currItem = item.getQty();
                    String trimCurrItem = currItem.substring(1);
                    int currItemInt = Integer.parseInt(trimCurrItem);

                    NPNtotal = NPNtotal + currItemInt;

                }

        }
        return NPNtotal;
    }

    public int totalRes(){

        int returnRes = 0;

        for(int i = 0; i < invStock.size(); i++){
            StockItem item = invStock.get(i);

            String strName = item.getProduct();

            if(strName.equals("resistor")){

                String currItem = item.getSpecial();
                String trimCurrItem = currItem.substring(1);

                //TODO work out how maths numbers work in sci format

                int currItemInt = Integer.parseInt(trimCurrItem);

                returnRes = returnRes + currItemInt;

            }

        }

        return returnRes;
    }

}
