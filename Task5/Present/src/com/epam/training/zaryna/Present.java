package com.epam.training.zaryna;


public class Present {
    private String name;
    private TypePresent typePresent;
    private int priceForOne;

    public Present(String name, int priceForOne, TypePresent typePresent) {
        setName(name);
        setPriceForOne(priceForOne);
        setTypePresent(typePresent);
    }

    public void setName(String name) {
        if (isValidString(name)) {
            this.name = name;
        }
    }

    public void setTypePresent(TypePresent typePresent) {
        this.typePresent = typePresent;
    }

    public void setPriceForOne(int priceForOne) {
        if (priceForOne > 0) {
            this.priceForOne = priceForOne;
        }
    }

    public String getName() {
        return name;
    }

    public int getPriceForOne() {
        return priceForOne;
    }

    public TypePresent getTypePresent() {
        return typePresent;
    }

    @Override
    public String toString() {
        return "Name : " + name
                + ", priceForOne " + priceForOne + ", type of Present " + typePresent;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }

        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }

        Present other = (Present) obj;

        return name.equals(other.name) && priceForOne == other.priceForOne && typePresent.equals(other.typePresent);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;

        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + Double.hashCode(priceForOne);

        return result;
    }

    protected boolean isValidString(String string) {
        return string != null && !string.isEmpty();
    }


}

