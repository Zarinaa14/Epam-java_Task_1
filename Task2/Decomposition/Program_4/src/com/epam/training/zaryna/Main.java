package com.epam.training.zaryna;
import java.util.Scanner;
public class Main {

    private static double calculateDistanceBetweenPoints(double x1,double y1,double x2,double y2){
        return Math.sqrt( (x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
    }
    private static void printPoints(double[] arr_x,double[] arr_y){
        for(int i=0;i<arr_x.length;i++){
            System.out.print("["+arr_x[i]+";"+arr_y[i]+"] ");
        }
    }

    private static double findPointsGreatestDistance(double[] xCoord, double[] yCoord){
        double currDistance =0;
        double max = 0;
        int index[]=new int[2];
        for(int i=0;i<xCoord.length;i++) {
            for (int j = 0; j < yCoord.length; j++) {
                currDistance = calculateDistanceBetweenPoints(xCoord[i], yCoord[i], xCoord[j], yCoord[j]);
                if(currDistance>max){
                    max=currDistance;
                    index[0]=i;
                    index[1]=j;
                }
            }
        }
        return max;
    }

    private static int[] findPointsIndex(double[] arr_x, double[] arr_y){
        double currDistance =0;
        double max = 0;
        int index[]=new int[2];
        for(int i=0;i<arr_x.length;i++) {
            for (int j = 0; j < arr_y.length; j++) {
                currDistance = calculateDistanceBetweenPoints(arr_x[i], arr_y[i], arr_x[j], arr_y[j]);
                if(currDistance>max){
                    max=currDistance;
                    index[0]=i;
                    index[1]=j;
                }
            }
        }
        return index;
    }
    private static void enter_arr(int size,double arr[],Scanner in){
        //Scanner in = new Scanner(System.in);
        for (int i = 0; i < size; i++) {
            arr[i] = in.nextDouble();
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите кол-во точек: ");
        int numberOfPoints = in.nextInt();
        double array_x[]= new double[numberOfPoints];
        double array_y[]= new double[numberOfPoints];
        System.out.println("Insert array elements x:");
        enter_arr(numberOfPoints,array_x,in);
        System.out.println("Insert array elements y:");
        enter_arr(numberOfPoints,array_y,in);

        int[] arrOfIndexes = findPointsIndex(array_x, array_y);
        double max=findPointsGreatestDistance(array_x, array_y);
        max =Math.round(max * 100) / 100.0d;;
        printPoints(array_x,array_y);
        System.out.print("\nМаксимальное расстояние = "+max+" между точками: [" + array_x[arrOfIndexes[0]] + ";" + array_y[arrOfIndexes[0]] + "]");
        System.out.println(" и {" + array_x[arrOfIndexes[1]] + ";" + array_y[arrOfIndexes[1]] + "}");

    }
}
