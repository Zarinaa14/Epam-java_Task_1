package com.epam.training.zaryna;
import java.util.Comparator;
public class ProductPriceComparator implements Comparator<Product>  {

    @Override
    public int compare(Product o1, Product o2) {
        if(o1.getPrice()>o2.getPrice()){
            return 1;
        }

        if (o1.getPrice()<o2.getPrice()){
            return -1;
        }
        return 0;
    }
}
