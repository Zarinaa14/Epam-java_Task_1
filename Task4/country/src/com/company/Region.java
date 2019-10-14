package com.company;

//3. Создать объект класса Государство, используя классы Область,
//Район, Город. Методы: вывести на консоль столицу, количество областей, площадь, областные центры.
public class Region {

    private String regionName;
    public Region()
    {
        regionName="";
    }
    public Region(String regionName)
    {
        setRegionName(regionName);
    }

    protected String getRegionName() {
        return regionName;
    }
    public static  int getRegionsAmount(City[] ob) {
        int countRegions = 0;
        for (City region : ob) {
            countRegions++;
        }
        return countRegions;
    }

    protected String setRegionName(String regionName) {
        this.regionName = regionName;
        return regionName;
    }



}
