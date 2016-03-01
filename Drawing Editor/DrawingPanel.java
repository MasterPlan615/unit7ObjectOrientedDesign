import javax.swing.JPanel;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseEvent;
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
    private JColorChooser color_chooser;
    private Dimension dimen;
    private Point2D.Double center_screen;
    private MouseListener shape_listener;
    
    
    public DrawingPanel()
    {
        this.setBackground( Color.WHITE );
        this.isPicked = false;
        this.color_chooser = new JColorChooser( Color.BLACK );
        this.dimen = new Dimension( 750, 400 );
        this.center_screen = new Point2D.Double( (750/2), (400/2) );
        this.shape_listener = new MouseShapeListener();
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
        this.active_shape = circle;
        this.list_shapes.add( circle );
        circle.addMouseListener( this.shape_listener );
        
        this.repaint();
    }
    
    public void addSquare()
    {
        Square square = new Square( center_screen, 20, this.getColor() );
        this.add( square );
        this.active_shape = square;
        this.list_shapes.add( square );
        square.addMouseListener( this.shape_listener );
        
        this.repaint();
    }
    
    public void paintComponent( Graphics2D g )
    {
        
    }
    
    
    class MouseShapeListener implements MouseListener
    {
        public void mouseClicked( MouseEvent event )
        {
            this.active_shape = this.event;
            this.isPicked = true;
            Point2D.Double mouse_loc = new Point2D.Double( this.event.getX(), this.event.getY() );
            this.active_shape.isInside( mouse_loc );
        }

        public void mouseReleased( MouseEvent event ) {}

        public void mousePressed( MouseEvent event ) {}

        public void mouseEntered( MouseEvent event ) {}

        public void mouseExited( MouseEvent event ) {}
    }
}
