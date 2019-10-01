package com.company;
//. Дан массив названий переменных в camelCase. Преобразовать названия в snake_case.
public class Main {
    protected static String addUnderscores(String name) {
         StringBuilder buf = new StringBuilder( name.replace('.', '_') );
        for (int i=1; i<buf.length()-1; i++) {
            if (
                    Character.isLowerCase( buf.charAt(i-1) ) &&
                            Character.isUpperCase( buf.charAt(i) ) &&
                            Character.isLowerCase( buf.charAt(i+1) )
            ) {
                buf.insert(i++, '_');
            }
        }
        return buf.toString().toLowerCase();
    }

    public static void main(String[] args) {
        String text="CamelCase";
        System.out.print("String "+addUnderscores(text));
    }
}
