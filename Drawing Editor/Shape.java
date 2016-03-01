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
    
    public Shape( Point2D.Double cen, Color col )
    {
        this.center = cen;
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
    
    public void move( double x, double y )
    {
        this.center.setLocation( x, y );
    }
    
    public void setRadius( double r )
    {
        this.radius = r;
    }
    
    public boolean isInside( Point2D.Double point )
    {
        
    }
    
    public boolean isOnBorder( Point2D.Double point )
    {
        
    }
    
    public void draw( Graphics2D g2, boolean filled )
    {
        
    }
}
