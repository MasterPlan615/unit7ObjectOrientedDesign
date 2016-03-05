import java.awt.geom.Point2D;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.lang.Math;


public class Circle extends Shape
{
    private Ellipse2D.Double circ;
    private Ellipse2D.Double circ2;
    
    
    public Circle( Point2D.Double cen, double rad, Color col )
    {
        super( cen, rad, col );
    }
    
    public void draw( Graphics2D g, boolean filled )
    {
        Graphics2D g2 = ( Graphics2D ) g;
        
        circ = new Ellipse2D.Double( super.getCenter().getX(), super.getCenter().getY(), super.getRadius(), super.getRadius() );
        circ2 = new Ellipse2D.Double( super.getCenter().getX(), super.getCenter().getY(), 
            ( super.getRadius()-( super.getRadius()*0.1 ) ), ( super.getRadius()-( super.getRadius()*0.1 ) ) );
        g2.setColor( super.getColor() );
        g2.draw( circ );
        if( filled )
        {
            g2.fill( circ );
        }
    }

    public boolean isInside( Point2D.Double point )
    {
        if( circ2.contains( point.getX(), point.getY() ) && circ.contains( point.getX(), point.getY() ) )
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public boolean isOnBorder( Point2D.Double point )
    {
        if( circ.contains( point.getX(), point.getY() ) && !circ2.contains( point.getX(), point.getY() ) )
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}