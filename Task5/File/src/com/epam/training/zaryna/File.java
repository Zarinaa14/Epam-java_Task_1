package com.epam.training.zaryna;

public abstract class File {
    private Directory directory;
    private String name;

    public File(String name,Directory directory){
        this.name=name;
        this.directory=directory;
    }

    public void rename(String name){
        this.name=name;
    }

    public void delete(){
        //Do nothing
    }

    public String getName() {
        return name;
    }

    public Directory getDirectory() {
        return directory;
    }

    @Override
    public String toString(){
        return directory + "//" + name;
    }

    @Override
    public boolean equals(Object obj){
        if(obj == this){
            return true;
        }

        if(obj==null || obj.getClass() != this.getClass()){
            return false;
        }

        File other=(File) obj;

        return directory.equals(other.directory) && name.equals(other.name);
    }

    @Override
    public int hashCode(){
        final int prime=31;
        int result=1;

        result=prime*result+((name ==null)?0: name.hashCode());
        result=prime*result+directory.hashCode();

        return result;
    }


}
