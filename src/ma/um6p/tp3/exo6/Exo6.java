package ma.um6p.tp3.exo6;

import java.util.Arrays;

public class Exo6 {
    public static int median(int[] arr){
        int index=arr.length/2;
        Arrays.sort(arr);
        return arr[index];
    }
    public static void main(String[] args){
        int[] arr1={5, 2, 4, 17, 55, 4, 3, 26, 18, 2,17};
        System.out.print("The Median of arr1 is: "+median(arr1));
        System.out.println();
        int[] arr2={42, 37, 1, 97, 1, 2, 7, 42, 3, 25, 89, 15, 10, 29, 27};
        System.out.print("The Median of arr2 is: "+median(arr2));

}


}
