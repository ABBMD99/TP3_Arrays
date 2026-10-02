package ma.um6p.tp3.exo10;


public class Calculator {
    private Floor floor;
    private Carpet carpet;

    public Calculator(Floor floor,Carpet carpet){
        this.floor=floor;
        this.carpet=carpet;
    }

    public double getTotalCost(){
        return floor.getArea()*carpet.getCost();
    }

}
