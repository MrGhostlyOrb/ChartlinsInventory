package chartlins;

import java.util.Arrays;

public class StockItem {
    //This class will be used to import the information from the inventory class and sort the information.

    //Fields

    private String product;
    private String code;
    private String qty;
    private String price;
    private String sp;

    //Constructor class to create item object

    public StockItem(String productName, String productCode, String quantity, String itemPrice, String special){

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
    public String getQty(){
        return qty;
    }
    public String getPrice(){
        return price;
    }
    public String getSpecial(){
        return sp;
    }

}
