package com.company;
//3. Создать объект класса Государство, используя классы Область,
// Район, Город. Методы: вывести на консоль столицу, количество областей, площадь, областные центры.

import java.util.Random;

public class ArrayCity {
    private City[] arrayOfCity;
    private Region[] arrayOfRegion;
    private District[] arrayOfDistrict;

    protected ArrayCity(int size) {
        if (size > 0) {
            arrayOfCity = new City[size];
            for (int i = 0; i < size; i++) {
                arrayOfCity[i] = new City();
            }
        }
    }

    protected void ArrayRegion(int size) {
        if (size > 0) {
            arrayOfRegion = new Region[size];
            for (int i = 0; i < size; i++) {
                arrayOfRegion[i] = new Region();
            }
        }
    }

    protected void ArrayDistrict(int size) {
        if (size > 0) {
            arrayOfDistrict = new District[size];
            for (int i = 0; i < size; i++) {
                arrayOfDistrict[i] = new District();
            }
        }
    }


    public ArrayCity(City[] array) {
        setArrayOfAirlines(array);
    }

    public void setArrayOfAirlines(City[] array) {
        if (array != null) {
            arrayOfCity = new City[array.length];
            for (int i = 0; i < getSize(); i++) {
                arrayOfCity[i] = array[i];
            }
        }
    }

    public int getSize() {
        if (arrayOfCity != null) {
            return arrayOfCity.length;
        } else {
            return 0;
        }
    }

    public City[] getArrayOfCity() {
        return arrayOfCity;
    }

    protected void runCity(String[] arrayOfCityName, String[] arrayRegions, String[] arrayDistricts, int[] regionSquare) {
        Random random = new Random();
        Region regionObject = new Region();
        District districtObject = new District();
        for (int i = 0; i < 10; i++) {
            String region = regionObject.setRegionName(arrayRegions[random.nextInt(6)]);
            String district = districtObject.setDistrict(arrayDistricts[random.nextInt(6)]);
            arrayOfCity[i] = new City(arrayOfCityName[random.nextInt(6)], region, district, regionSquare[random.nextInt(6)]);

        }
       int regionCount = regionObject.getRegionsAmount(arrayOfCity);
        System.out.println(regionCount);
    }

    public void print() {
        System.out.println(toString());
    }

    public int getRegionsAmount(Region[] regions) {
        int countRegions = 0;
        for (Region region : regions) {
            countRegions++;
        }
        return countRegions;
    }

    @Override
    public String toString() {
        if (arrayOfCity != null) {
            String string = new String();

            for (City city : arrayOfCity) {
                string += city.toString() + "\n";
            }

            return string;

        } else {
            return "null";
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }

        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }

        ArrayCity other = (ArrayCity) obj;

        boolean isEqual = (other.getSize() == getSize());

        for (int i = 0; isEqual && i < getSize(); i++) {
            if (!arrayOfCity[i].equals(other.getArrayOfCity()[i])) {
                isEqual = false;
            }
        }

        return isEqual;
    }

    @Override
    public int hashCode() {
        final int prime = 10;
        int result = 1;

        for (int i = 0; i < getSize(); i++) {
            result = prime * result + arrayOfCity[i].hashCode();
        }

        return result;
    }

}

