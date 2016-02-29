import javax.swing.JPanel;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;
import java.awt.Color;
import javax.swing.JColorChooser;
import java.awt.Dimension;
import java.awt.geom.Point2D;
import java.awt.Graphics2D;


public class DrawingPanel extends JPanel
{
    private ArrayList< Shape > list_shapes;
    private Shape active_shape;
    private boolean isPicked;
    private boolean isMoved;
    private boolean isStretched;
    private JColorChooser color_chooser;
    private Dimension dimen;
    private Point2D.Double center_screen;
    
    
    public DrawingPanel()
    {
        this.setBackground( Color.WHITE );
        this.isPicked = false;
        this.isMoved = false;
        this.isStretched = false;
        this.color_chooser = new JColorChooser( Color.BLACK );
        this.dimen = new Dimension( 750, 400 );
        this.center_screen = new Point2D.Double( (750/2), (400/2) );
    }
    
    public Color getColor()
    {
        return this.color_chooser.getColor();
    }
    
    public Dimension getPreferredSize()
    {
        return this.dimen;
    }
    
    public void pickColor()
    {
        
    }
    
    public void addCircle()
    {
        Circle circle = new Cirlce( center_screen, 20, this.getColor() );
        this.add( circle );
        this.repaint();
    }
    
    public void addSquare()
    {
        Square square = new Square( center_screen, 20, this.getColor() );
        this.add( square );
        this.repaint();
    }
    
    public void paintComponent( Graphics2D g )
    {
        
    }
}
