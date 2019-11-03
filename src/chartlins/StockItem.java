package chartlins;

import java.util.Arrays;

public class StockItem {
    //This class will be used to import the information from the inventory class and sort the information.

    static String[] sortPriceHigh(String[] itemArray){
        String[] splitArray;
        for(int i = 1; i < itemArray.length; i++){
            System.out.println(itemArray[i]);
            String item;
            item = itemArray[i];
            String[] infoArray;
            infoArray = item.split(",");
            System.out.println("The item is : ");
            System.out.println(infoArray[0]);
            System.out.println("ThePrice for this item is : ");
            System.out.println(infoArray[3]);
            //TODO sort these items by highest price in this method
        }
        //TODO return string array of all of the items sorted by price
        return(itemArray);
    }
}
