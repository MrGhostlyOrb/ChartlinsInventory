package chartlins;

import java.util.Arrays;

public class StockItem {
    //This class will be used to import the information from the inventory class and sort the information.

    //Fields

    private String product;
    private String code;
    private int qty;
    private int price;
    private String sp;

    //Constructor class to create item object

    public StockItem(String productName, String productCode, int quantity, int itemPrice, String special){

        product = productName;
        code = productCode;
        qty = quantity;
        price = itemPrice;
        sp = special;

    }

    //Methods to return object values

    public String getProduct(){
        return product;
    }
    public String getCode(){
        return code;
    }
    public int getQty(){
        return qty;
    }
    public int getPrice(){
        return price;
    }
    public String getSpecial(){
        return sp;
    }

}
