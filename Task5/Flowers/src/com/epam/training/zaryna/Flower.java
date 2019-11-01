package com.epam.training.zaryna;

public class Flower {
    private String name;
    private Color color;
    private int priceForOne;

    public Flower(String name, int priceForOne,Color color) {
        setName(name);
        setPriceForOne(priceForOne);
        setColor(color);
    }
    public void setName(String name){
        if(isValidString(name)) {
            this.name = name;
        }
    }
    public void setColor(Color color){
            this.color = color;
    }
    public void setPriceForOne(int priceForOne){
        if(priceForOne>0) {
            this.priceForOne = priceForOne;
        }
    }
    public String getName() {
        return name;
    }

    public int getPriceForOne() {
        return priceForOne;
    }
    public Color getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Name : " + name
                + ", priceForOne " + priceForOne+", color "+color;
    }

    @Override
    public boolean equals(Object obj){
        if(obj == this){
            return true;
        }

        if(obj==null || obj.getClass() != this.getClass()){
            return false;
        }

        Flower other=(Flower) obj;

        return name.equals(other.name)  && priceForOne==other.priceForOne;
    }

    @Override
    public int hashCode(){
        final int prime=31;
        int result=1;

        result=prime*result+((name==null)?0:name.hashCode());
        result=prime*result+Double.hashCode(priceForOne);

        return result;
    }

    protected boolean isValidString(String string){
        return string!=null && !string.isEmpty();
    }


}
