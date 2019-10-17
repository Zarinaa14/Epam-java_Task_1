package com.company.com.company.epam.training;
//3. Создать объект класса Государство, используя классы Область,
//Район, Город. Методы: вывести на консоль столицу, количество областей, площадь, областные центры.
public class District {
    private String district;
    public District()
    {
        district="";
    }
    public District(String district)
    {
        setDistrict(district);
    }

    public String getDistrict() {
        return district;
    }

    public String setDistrict(String district) {
        this.district = district;
        return district;
    }
}
