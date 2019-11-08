package chartlins;

import java.util.*;
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

            Map m1 = new HashMap();


            m1.put(infoArray[1], infoArray[3]);
            System.out.println(m1);

            String[] priceArray;


            //TODO sort these items by highest price in this method
        }
        //TODO return string array of all of the items sorted by price
        return(itemArray);
    }
}

//TODO look further into this

/*StockItem[] stockArray = new StockItem[300]
for x < 300{}
StockItem item = new StockItem(itemArray[x]);

stockArray[x] = item

this.itemName = itemArray[1];
this.itemNumber = itemArray[2]


if item.itemNmae = resistor : itemList.append(item)*/
