package com.epam.training.zaryna;
import java.util.Comparator;
public class ProductWeightComparator implements Comparator<ClassProduct> {
    @Override
    public int compare(ClassProduct o1, ClassProduct o2) {
        if(o1.getWeight()>o2.getWeight()){
            return 1;
        }

        if (o1.getWeight()<o2.getWeight()){
            return -1;
        }
        return 0;
    }
}
