package ma.um6p.tp3.exo2;


import java.util.Arrays;

public class Reverse {
    public static void reverse(int[] arr){
        System.out.println("Array = " + Arrays.toString(arr));
        int n=arr.length/2;
        for(int i=0;i<n;i++){
            int temp=arr[i];
            arr[i]=arr[arr.length-1-i];
            arr[arr.length-1-i]=temp;
        }
        System.out.println("Reversed array = " + Arrays.toString(arr));




    }
    public static void main(String[] args){
        int[] arr={1,2,3,4,5};
        reverse(arr);
    }
}
