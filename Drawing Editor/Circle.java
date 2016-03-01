import java.awt.geom.Point2D;
import java.awt.Color;
import java.awt.Graphics2D;


public class Circle extends Shape
{
    private Point2D.Double center;
    private Color color;
    private double radius;
    
    public Circle( Point2D.Double cen, double rad, Color col )
    {
        super.center = cen;
        super.radius = rad;
        super.color = col;
    }
    
    public Point2D.Double getCenter()
    {
        return super.center;
    }
    
    public double getRadius()
    {
        return super.radius;
    }
    
    public void move( double x, double y )
    {
        super.center.setLocation( x, y );
    }
    
    public void setRadius( double r )
    {
        super.radius = r;
    }
}