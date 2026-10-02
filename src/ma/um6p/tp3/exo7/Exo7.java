package ma.um6p.tp3.exo7;

public class Exo7 {
    public static double stdev(int[] arr){
        if(arr.length<=1){
            return 0.0;
        }

        //The sum
        int sum=0;
        for(int a: arr) sum+=a;

        double avg=(double)sum/arr.length;

        double num=0.0;
        for (int a:arr) num+=Math.pow(a-avg,2);
        return Math.sqrt(num/(arr.length-1));




    }
    public static void main(String[] args){
        int[] arr={1, -2, 4, -4, 9, -6, 16, -8, 25, -10};
        System.out.println(stdev(arr));
    }
}
