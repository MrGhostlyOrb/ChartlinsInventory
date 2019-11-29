package chartlins;

import java.util.Arrays;

class StockItem {
    //This class will be used to import the information from the inventory class and sort the information.

    //Fields

    private String product;
    private String code;
    private String qty;
    private String price;
    private String sp;

    //Constructor class to create item object

    StockItem(String productName, String productCode, String quantity, String itemPrice, String special){

        product = productName;
        code = productCode;
        qty = quantity;
        price = itemPrice;
        sp = special;

    }

    //Methods to return object values

    String getProduct(){
        return product;
    }
    String getCode(){
        return code;
    }
    String getQty(){
        return qty;
    }
    String getPrice(){
        return price;
    }
    String getSpecial(){
        return sp;
    }

}
