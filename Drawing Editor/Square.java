import java.awt.geom.Point2D;
import java.awt.Color;
import java.awt.Graphics2D;


public class Square extends Shape
{
    private Point2D.Double center;
    private Color color;
    
    public Square( Point2D.Double cen, Color col )
    {
        super.center = cen;
        super.color = col;
    }
    
    public Point2D.Double getCenter()
    {
        return super.center;
    }
    
    public void move( double x, double y )
    {
        super.center.setLocation( x, y );
    }
}