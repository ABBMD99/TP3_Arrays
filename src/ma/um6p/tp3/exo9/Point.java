package ma.um6p.tp3.exo9;

public class Point {
    private int x;
    private int y;

    public Point(){

    }
    public Point(int x,int y){
        this.x=x;
        this.y=y;
    }
    public int getX(){
        return this.x;
    }
    public int getY(){
        return this.y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance(){
        return Math.sqrt((this.x*this.x)+(this.y*this.y));

    }

    public double distance(Point p){
        double a=Math.pow(this.x-p.getX(),2) + Math.pow(this.y-p.getY(),2);
        return Math.sqrt(a);
    }

    public double distance(int x,int y){
        double a=Math.pow(this.x-x,2) + Math.pow(this.y-y,2);
        return Math.sqrt(a);
    }


}
