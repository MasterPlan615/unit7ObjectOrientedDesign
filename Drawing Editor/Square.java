import java.awt.geom.Point2D;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;


public class Square extends Shape
{   
    private Rectangle2D.Double rec;
    
    public Square( Point2D.Double cen, double rad, Color col )
    {
        super( cen, rad, col );
    }
    
    public void draw( Graphics2D g, boolean filled )
    {
        rec = new Rectangle2D.Double( super.getCenter().getX(), super.getCenter().getY(), super.getRadius(), super.getRadius() );
        g.draw( rec );
        if( filled )
        {
            g.fill( rec );
        }
    }
   
    public void move( double x, double y )
    {
        super.getCenter().setLocation( x, y );
    }
    
    public boolean isInside( Point2D.Double point )
    {
        return rec.contains( point.getX(), point.getY() );
    }
    
    public boolean isOnBorder( Point2D.Double point )
    {
        if( point.getX() == ( super.getCenter().getX() + super.getRadius() ) && point.getY() == ( super.getCenter().getY() + super.getRadius() ) )
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}