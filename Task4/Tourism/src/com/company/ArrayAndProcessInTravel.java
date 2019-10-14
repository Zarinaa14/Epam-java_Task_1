package com.company;

/*
    Коллекция(массив) путевок
    Возможности:
    1) добавление/удаление путевки
    2) поиск путевки
    3) выбор/отмена путевки
    4) сортировка путевок по различным полям
    5) вывод на консоль
 */

public class ArrayAndProcessInTravel {

    private TravelVouncher[] arrayOfTravel;

    protected ArrayAndProcessInTravel(int number){
        if(number>0) {
            arrayOfTravel = new TravelVouncher[number];
            for (int i = 0; i < number; i++) {
                arrayOfTravel[i] = new TravelVouncher();
            }
        }
    }

    protected ArrayAndProcessInTravel(TravelVouncher[] array){
        setArrayOfTravel(array);
    }

    protected void setArrayOfTravel(TravelVouncher[] array){
        if(array!=null) {
            arrayOfTravel = new TravelVouncher[array.length];
            for (int i = 0; i < array.length; i++) {
                arrayOfTravel[i] = array[i];
            }
        }
    }

    protected int getNumOfVounchers(){
        return arrayOfTravel.length;
    }

    protected TravelVouncher[] getArrayOfTravel(){
        return arrayOfTravel;
    }



    protected void addVouncher(int typeChoise,int foodChoice,int transportChoice,int numOfDays,double cost){
        TravelVouncher[] newVounchers=new TravelVouncher[getNumOfVounchers()+1];
        for(int i=0;i<getNumOfVounchers();i++){
            newVounchers[i]= arrayOfTravel[i];
        }

        newVounchers[getNumOfVounchers()]=new TravelVouncher(typeChoise,foodChoice,transportChoice,numOfDays,cost);
        arrayOfTravel =newVounchers;
    }

    protected void deleteVouncher(double cost){
        int numOfVounchers=getNumOfVounchers();

        for(TravelVouncher vouncher: arrayOfTravel){
            if(vouncher.getPrice()>cost){
                numOfVounchers--;
            }
        }

        if(numOfVounchers<getNumOfVounchers()){
            TravelVouncher[] newVounchers=new TravelVouncher[numOfVounchers];
            for(int i=0,index=0;i<getNumOfVounchers();i++){
                if(arrayOfTravel[i].getPrice()<=cost){
                    newVounchers[index]= arrayOfTravel[i];
                    index++;
                }
            }
            arrayOfTravel =newVounchers;
        }
    }

    protected void deleteVouncher(int index){
        if(index>=0 && index<getNumOfVounchers()){
            int numOfVounchers=getNumOfVounchers()-1;
            TravelVouncher[] vounchers = new TravelVouncher[numOfVounchers];
            for(int i=0,j=0;i<getNumOfVounchers();i++){
                if(i!=index){
                    vounchers[j]= arrayOfTravel[i];
                    j++;
                }
            }

            arrayOfTravel =vounchers;
        }
    }


    //Сортирует путевки по цене. Если цены одинаковы, то сортирует по кол-ву дней
    protected void sortByPrice(){
        for(int i=0;i<getNumOfVounchers()-1;i++){
            for(int j=0;j<getNumOfVounchers()-i-1;j++){
                if(arrayOfTravel[j].getPrice()> arrayOfTravel[j+1].getPrice()){
                    change(j,j+1);
                }else{
                    if(arrayOfTravel[j+1].getPrice()== arrayOfTravel[j].getPrice()){
                        if(arrayOfTravel[j].getNumberOfDays()> arrayOfTravel[j+1].getNumberOfDays()){
                            change(j,j+1);
                        }
                    }
                }
            }
        }
    }

    //Сортирует по типу путевки. Если тип одинаковый, то сортирует по цене
    protected void sortByType(){
        int time;

        for(int i=0;i<getNumOfVounchers()-1;i++){
            for(int j=0;j<getNumOfVounchers()-i-1;j++){
                time= arrayOfTravel[j].getTypeTravel().compareTo(arrayOfTravel[j+1].getTypeTravel());
                if(time>0){
                    change(j,j+1);
                }else{
                    if(time==0){
                        if(arrayOfTravel[j].getPrice()> arrayOfTravel[j+1].getPrice()){
                            change(j,j+1);
                        }
                    }
                }
            }
        }
    }


    protected void print(){
        System.out.println(toString());
    }

    @Override
    public String toString(){
        String string= new String();

        for(int i=0;i<getNumOfVounchers();i++){
            string+=(i+1)+ arrayOfTravel[i].toString()+"\n";
        }

        return string;
    }

    @Override
    public boolean equals(Object obj){
        if(obj == this){
            return true;
        }

        if(obj==null || obj.getClass() != this.getClass()){
            return false;
        }

        ArrayAndProcessInTravel other=(ArrayAndProcessInTravel) obj;

        boolean isEqual=getNumOfVounchers()==other.getNumOfVounchers();

        for(int i=0;isEqual && i<getNumOfVounchers();i++){
            if(!arrayOfTravel[i].equals(other.getArrayOfTravel()[i])){
                isEqual=false;
            }
        }

        return isEqual;
    }

    @Override
    public int hashCode(){
        final int number=10;
        int result=1;

        for(TravelVouncher vouncher: arrayOfTravel){
            result=number*result+vouncher.hashCode();
        }

        return result;
    }

    private void change(int index1, int index2){

        if(index1>=0 && index1<getNumOfVounchers() && index2>=0 && index2<getNumOfVounchers()){
            TravelVouncher time= arrayOfTravel[index1];
            arrayOfTravel[index1]= arrayOfTravel[index2];
            arrayOfTravel[index2]=time;
        }
    }
}
