package ma.um6p.tp3.exo8;

public class Wall {
    private double width;
    private double height;

    public Wall(){

    }
    public Wall(double w,double h){
        this.width=(w<0)?0:w;
        this.height=(h<0)?0:h;
    }
    public double getWidth(){
        return this.width;
    }
    public double getHeight(){
        return  this.height;
    }

    public void setWidth(double w){
        this.width=(w<0)?0:w;
    }
    public void setHeight(double h){
        this.height=(h<0)?0:h;

    }

    public double getArea(){
        return this.height*this.width;
    }


    
}
