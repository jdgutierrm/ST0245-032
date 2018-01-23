/**
 * Write a description of class Punto2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Punto2
{
    private float x;
    private float y;
    
    public Punto2(float x, float y){
        this.x = x;
        this.y = y;
    }
    
    public float distancia(Punto2 otroPunto){
        return (float) Math.sqrt(Math.pow(x - otroPunto.getX(), 2) +
                                 Math.pow(y - otroPunto.getY(), 2));
    }
    
    public float getX(){
        return x;
    }
    
    public float getY(){
        return y;
    }
    
    public float radio(){
        return (float) Math.sqrt((x * x) + (y * y));
    }
    
    public float angulo(){
        return (float) Math.atan(y / x);
    }
}
