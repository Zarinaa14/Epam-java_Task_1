package com.epam.training.zaryna;


public class Directory {
    private String path;

    public Directory(String path) {
        this.path = path;
    }

    public String getPath() {
        return path;
    }

    @Override
    public boolean equals(Object obj){
        if(obj == this){
            return true;
        }

        if(obj==null || obj.getClass() != this.getClass()){
            return false;
        }

        Directory other=(Directory)obj;

        return path.equals(other.path);
    }

    @Override
    public int hashCode(){
        final int prime=31;
        int result=1;

        result=prime*result+((path==null)?0:path.hashCode());
        //result=prime*result+path.hashCode();

        return result;
    }
}