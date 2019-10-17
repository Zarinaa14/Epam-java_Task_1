package com.company.com.company.epam.training;
//3. Создать объект класса Государство, используя классы:
// Область, Район, Город.
// Методы: вывести на консоль столицу, количество областей, площадь, областные центры.
public class City {

    private String cityName;
    private String region;
    private int citySquare;
    private String district;
    int id=0;
    public City(){
        cityName="";
        citySquare =0;
        id=0;
    }
    public City(String cityName, String region, String district,int regionSquare) {
        setCityName(cityName);
        setRegion(region);
        setDistrict(district);
        setCitySquare(regionSquare);
        id++;
    }
    public void setCityName(String cityName){
        if(cityName!=null && !cityName.isEmpty()) {
            this.cityName = cityName;
        }
    }
    public String getCityName() {
        return cityName;
    }
    public void setDistrict(String district){
            this.district = district;

    }
    public String getDistrict() {
        return district;
    }

    public void setRegion(String region){
            this.region = region;
    }


    public String getRegionName() {
        return region;
    }
    public void setCitySquare(int citySquare){
        this.citySquare = citySquare;
    }

    public double returnSquare() {
        return citySquare;
    }
    public void print(){
        System.out.println(toString());
    }
    @Override
    public String toString() {
        return "Name of the city: " + cityName
                + ", region " + region
                + ", Square city " + citySquare
                + ", district: " + district;
    }

    @Override
    public boolean equals(Object obj){
        if(obj == this){
            return true;
        }

        if(obj==null || obj.getClass() != this.getClass()){
            return false;
        }

        City other=(City) obj;
        return cityName.equals(other.cityName) && region.toString().equals(other.region.toString())
                && district.toString().equals(other.district.toString());
    }

    @Override
    public int hashCode(){
        int number=10;
        int result=1;

        result=number+((cityName==null)?0:cityName.hashCode());
        result=number+((district==null)?0:getDistrict().hashCode());
        result=number+((region==null)?0: getRegionName().hashCode());

        return result;
    }
}


