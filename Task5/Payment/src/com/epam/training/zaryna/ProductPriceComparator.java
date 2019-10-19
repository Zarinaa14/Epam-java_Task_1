package com.epam.training.zaryna;
import java.util.Comparator;
public class ProductPriceComparator implements Comparator<ClassProduct>  {

    @Override
    public int compare(ClassProduct o1, ClassProduct o2) {
        if(o1.getPrice()>o2.getPrice()){
            return 1;
        }

        if (o1.getPrice()<o2.getPrice()){
            return -1;
        }
        return 0;
    }
}
