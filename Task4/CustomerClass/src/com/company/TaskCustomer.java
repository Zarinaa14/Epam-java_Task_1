package com.company;
// Создать класс Customer, спецификация которого приведена ниже.
// Определить конструкторы, set- и get- методы и метод  toString().
// Создать второй класс, агрегирующий массив типа Customer, с подходящими конструкторами и методами.
// Задать критерии выбора данных и вывести эти данные на консоль

/**Класс Customer: id, фамилия, имя, отчество, адрес, номер кредитной карточки, номер банковского счета.
 * Найти и вывести:  a) список покупателей в алфавитном порядке;
 b) список покупателей, у которых номер кредитной карточки находится в заданном интервале **/
import java.util.Random;



public class TaskCustomer {
    protected Customer[] arrayOfCustomer;
    Random random=new Random();

    protected TaskCustomer(int size){
        if(size>0) {
            arrayOfCustomer = new Customer[size];
            for (int i = 0; i < size; i++) {
                arrayOfCustomer[i] = new Customer();
            }
        }
    }

    protected void runCustomer(String[] surname,String[] name,String[] patronymic,String[] adress,int[] numCreditCard,int[] numberBankAccount){
        for(int i=0;i<4;i++){
            arrayOfCustomer[i]=new Customer(surname[random.nextInt(7)],name[random.nextInt(9)],patronymic[random.nextInt(9)],adress[random.nextInt(9)],numCreditCard[random.nextInt(9)],numberBankAccount[random.nextInt(7)]);
            arrayOfCustomer[i]=new Customer(surname[random.nextInt(7)],name[random.nextInt(9)],patronymic[random.nextInt(9)],adress[random.nextInt(9)],numCreditCard[random.nextInt(9)],numberBankAccount[random.nextInt(9)]);
            arrayOfCustomer[i]=new Customer(surname[random.nextInt(7)],name[random.nextInt(9)],patronymic[random.nextInt(9)],adress[random.nextInt(9)],numCreditCard[random.nextInt(9)],numberBankAccount[random.nextInt(9)]);
            arrayOfCustomer[i]=new Customer(surname[random.nextInt(7)],name[random.nextInt(9)],patronymic[random.nextInt(9)],adress[random.nextInt(9)],numCreditCard[random.nextInt(9)],numberBankAccount[random.nextInt(9)]);

        }
    }

    protected Customer[] getArrayOfCustomer(){
        return arrayOfCustomer;
    }

    protected Customer getCustomer(int index){
        if(index>=0 && index<getSize()){
            return arrayOfCustomer[index];
        }else{
            throw new IllegalArgumentException("Индекс выходит за пределы массива!");
        }
    }

    protected int getSize(){
        if(arrayOfCustomer !=null) {
            return arrayOfCustomer.length;
        } else{
            return 0;
        }
    }

    public void print(){
        System.out.println(toString());
    }

   // Отсортировать покупателей в алфавитном порядке.
    protected void arraySortAlphabet() {
        for (int i = 0; i < arrayOfCustomer.length; i++) {
            for (int j = 0; j < arrayOfCustomer.length; j++) {
                if (arrayOfCustomer[j].getSurname().toLowerCase().compareTo(arrayOfCustomer[i].getSurname().toLowerCase()) > 0) {

                    Customer tpm = arrayOfCustomer[j];
                    arrayOfCustomer[j] = arrayOfCustomer[i];
                    arrayOfCustomer[i] = tpm;
                }
            }
        }

    }

    //список покупателей, у которых номер кредитной карточки находится в заданном интервале
    protected void sortCustombersByCredit(int startOfMerge, int endOfMerge) {
        for(Customer customer: arrayOfCustomer){
            if(customer.getCreditCard()>=startOfMerge && customer.getCreditCard()<=endOfMerge){
                customer.print();
            }
        }
    }

    @Override
    public String toString(){
        if(arrayOfCustomer !=null) {
            String res = new String();
            for (Customer customer : arrayOfCustomer) {
                res += customer.toString() + "\n";
            }

            return res;

        } else{
            return "Покупатели отсутствуют!";
        }
    }

    @Override
    public boolean equals(Object obj){
        if(obj == this){
            return true;
        }

        if(obj==null || obj.getClass() != this.getClass()){
            return false;
        }

        TaskCustomer other=(TaskCustomer) obj;

        boolean isEqual=other.getSize()==getSize();

        for(int i=0;isEqual && i<getSize();i++){
            if(!arrayOfCustomer[i].equals(other.getArrayOfCustomer()[i])){
                isEqual=false;
            }
        }

        return isEqual;
    }

    @Override
    public int hashCode(){
         int prime=31;
        int result=1;

        for(int i=0;i<getSize();i++){
            result=result*prime + arrayOfCustomer[i].hashCode();
        }

        return result;
    }

}
