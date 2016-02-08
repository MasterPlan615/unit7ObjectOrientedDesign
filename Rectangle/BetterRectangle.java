import java.awt.Rectangle;

public class BetterRectangle extends Rectangle
{
    public BetterRectangle()
    {
        super.setLocation(10,25);
        super.setSize(20,40);
    }
    
    public double getPerimeter()
    {
        return (super.getWidth() * 2) + (super.getHeight() * 2);
    }
    
    public double getArea()
    {
        return super.getWidth() * super.getHeight();
    }
}
