package ma.um6p.tp3.exo1;

import java.util.Arrays;

public class ArraySort {
    public static void printArray(int[] lst){
        for(int i =0;i<lst.length;i++){
            System.out.println("Element "+i+" contents "+lst[i]);
        }
    }

    public static int[] sortIntegers(int[] oldArray){

        int[] newArray = Arrays.copyOf(oldArray, oldArray.length);


        //sorting the new Array
        for(int i= newArray.length-1;i>0;i--){
            for(int j=0;j<i;j++){
                if(newArray[j]<newArray[j+1]){
                    int temp=newArray[j];
                    newArray[j]=newArray[j+1];
                    newArray[j+1]=temp;
                }
            }
        }
        return newArray;

    }

    public static void main(String[] args){
        int[] oldArray={106,26,81,5,15};
        System.out.println("== Unsorted Array ==");
        printArray(oldArray);
        int[] newArray=sortIntegers(oldArray);
        System.out.println("== Sorted Array ==");
        printArray(newArray);

    }
}
