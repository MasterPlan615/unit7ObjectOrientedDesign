import java.awt.geom.Point2D;
import java.awt.Color;
import java.awt.Graphics2D;


public abstract class Shape
{
    private Point2D.Double center;
    private double radius;
    private Color color;
    
    public Shape( Point2D.Double cen, double rad, Color col )
    {
        this.center = cen;
        this.radius = rad;
        this.color = col;
    }
    
    public Point2D.Double getCenter()
    {
        return this.center;
    }
    
    public double getRadius()
    {
        return this.radius;
    }
    
    public abstract void move( double x, double y );
    
    public void setRadius( double r )
    {
        this.radius = r;
    }
    
    public abstract boolean isInside( Point2D.Double point );
    
    public abstract boolean isOnBorder( Point2D.Double point );
   
    public abstract void draw( Graphics2D g2, boolean filled );
}
