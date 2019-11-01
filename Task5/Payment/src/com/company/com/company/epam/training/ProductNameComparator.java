package com.company.com.company.epam.training;

import java.util.Comparator;

public class ProductNameComparator implements Comparator<ClassProduct> {

    @Override
    public int compare(ClassProduct o1, ClassProduct o2) {
       return o1.getName().compareTo(o2.getName());
    }
}
