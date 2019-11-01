package com.epam.training.zaryna;
import java.util.Comparator;
public class ProductWeightComparator implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        if(o1.getWeight()>o2.getWeight()){
            return 1;
        }

        if (o1.getWeight()<o2.getWeight()){
            return -1;
        }
        return 0;
    }
}
