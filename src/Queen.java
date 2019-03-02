public class Queen {
    private int x;
    private int y;
    public Queen(int x, int y){
        this.x = x;
        this.y = y;
    }
    public boolean collides(int x, int y){
        return((x == this.x) || (y == this.y) || (x-this.x == y-this.y) || (-y+this.y == x-this.x));
    }
    @Override
    public String toString(){
        return "(x: " + x + "| y: "+ y+")";
    }
}
