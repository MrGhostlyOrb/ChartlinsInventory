package chartlins;

import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Collectors;

public class Inventory {

    //ArrayList for storing the entire inventory

    private ArrayList<StockItem> invStock;

    Inventory(){
        invStock = new ArrayList<StockItem>();

    }

    void addItem(StockItem newItem){

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

        return invStock.size();

    }
    Map<String, Integer> sortPriceHigh(){

        //Method for sorting the prices of the inventory by the highest price

        Map<String, Integer> happy = new HashMap();

        System.out.println(invStock.size() + " Items to sort by Price");

        for (StockItem item : invStock) {
            //Turn price into int

            String strItem = item.getPrice();

            String trimStrItem = strItem.substring(1);

            int intItem = Integer.parseInt(trimStrItem);

            //Added product name and price to hashmap to be sorted

            happy.put(item.getCode(), intItem);

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

    String[] largestNum(String selection){

        Map<String, Integer> unSorted = new HashMap();
        String[] returnArray = new String[2];

        for (StockItem item : invStock) {
            //This if statement could be expanded to include other selections

            if (selection.equals("quantity")) {
                String strQty = item.getQty();

                String trimStrItem = strQty.substring(1);

                int intItem = Integer.parseInt(trimStrItem);

                //Added product name and price to hashmap to be sorted

                unSorted.put(item.getCode(), intItem);

            }

            Map<String, Integer> sorted = unSorted.entrySet()
                    .stream()
                    .sorted(Map.Entry.comparingByValue())
                    .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

            boolean count = false;
            String returnKey = "";
            int returnValue = 0;


            while (!count) {

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

    int specialQty(){

        ArrayList<String> NPNArray = new ArrayList<String>();
        int NPNtotal = 0;


        for (StockItem item : invStock) {
            String strSp = item.getSpecial();

            if (strSp.length() < 1) {
                continue;
            }

            String trimStrItem = strSp.substring(1);

            if (trimStrItem.equals("NPN")) {

                String multi = item.getQty();

                String multiTrim = multi.substring(1);

                int multiInt = Integer.parseInt(multiTrim);

                NPNtotal = NPNtotal + multiInt;

            }

        }
        return NPNtotal;
    }

    BigDecimal totalRes(){

        double returnRes = 0;

        for (StockItem item : invStock) {
            String strName = item.getProduct();

            if (strName.equals("resistor")) {

                String multi = item.getQty();

                String multiTrim = multi.substring(1);

                int multiInt = Integer.parseInt(multiTrim);

                String currItem = item.getSpecial();
                String trimCurrItem = currItem.substring(1);

                BigDecimal bd = new BigDecimal(trimCurrItem);
                double val = bd.doubleValue();

                double multiVal = val * multiInt;


                returnRes = returnRes + multiVal;

            }

        }

        return new BigDecimal(returnRes);
    }
    ArrayList<String> sortPrice(int price){

        ArrayList<String> returnList = new ArrayList<String>();

        for (StockItem item : invStock) {
            String itemPrice = item.getPrice();

            String itemPriceSub = itemPrice.substring(1);

            int itemPriceInt = Integer.parseInt(itemPriceSub);

            if (itemPriceInt > price) {

                String itemName = item.getCode();

                returnList.add(itemName);

            }
        }

        return returnList;

    }

}
