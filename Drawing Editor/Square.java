import java.awt.geom.Point2D;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;


public class Square extends Shape
{   
    private Rectangle2D.Double rec;
    private Rectangle2D.Double rec2;
    
    
    public Square( Point2D.Double cen, double rad, Color col )
    {
        super( cen, rad, col );
    }
    
    public void draw( Graphics2D g, boolean filled )
    {
        Graphics2D g2 = ( Graphics2D ) g;
        
        rec = new Rectangle2D.Double( super.getCenter().getX(), super.getCenter().getY(), super.getRadius(), super.getRadius() );
        rec2 = new Rectangle2D.Double( super.getCenter().getX(), super.getCenter().getY(), ( super.getRadius()-( super.getRadius()*0.1 ) ),
            ( super.getRadius()-( super.getRadius()*0.1 ) ) );
        g2.setColor( super.getColor() );
        g2.draw( rec );
        if( filled )
        {
            g2.fill( rec );
        }
    }
    
    public boolean isInside( Point2D.Double point )
    {
        if( rec2.contains( point.getX(), point.getY() ) && rec.contains( point.getX(), point.getY() ) )
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
        if( rec.contains( point.getX(), point.getY() ) && !rec2.contains( point.getX(), point.getY() ) )
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}