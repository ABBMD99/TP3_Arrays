package ma.um6p.tp3.exo3;

public class Exo3 {
     public static void exo3(){
        int[][] rows=new int[5][];

        int current=1;
        for(int i=0;i<rows.length;i++){

            rows[i]=new int[i+1];

            for( int j=0;j<i+1;j++){
                rows[i][j]=current;
                current++;
            }

        }

        //Affichage
        for(int i=0;i<rows.length;i++){
            for(int j=0;j<rows[i].length;j++){
                System.out.print(rows[i][j]+(j<rows[i].length-1?" ":""));
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        exo3();
    }

}
