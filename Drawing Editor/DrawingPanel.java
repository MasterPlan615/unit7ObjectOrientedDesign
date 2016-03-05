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
import java.awt.Graphics;


public class DrawingPanel extends JPanel
{
    private ArrayList< Shape > list_shapes;
    private Shape active_shape;
    private boolean isPicked;
    private boolean isMoving;
    private boolean isStrech;
    private JColorChooser color_chooser;
    private Dimension dimen;
    private Point2D.Double center_screen;
    private MouseListener draw_listener;
    private MouseMotionListener motion_listener;
    
    
    public DrawingPanel()
    {
        this.setBackground( Color.WHITE );
        
        this.isPicked = false;
        this.isMoving = false;
        this.isStrech = false;
        
        this.color_chooser = new JColorChooser( Color.BLACK );
        this.dimen = new Dimension( 400, 400 );
        
        this.draw_listener = new MouseDrawListener();
        this.addMouseListener( draw_listener );
        
        this.motion_listener = new MouseMotListener();
        this.addMouseMotionListener( motion_listener );
        
        this.list_shapes = new ArrayList< Shape >();
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
        this.color_chooser.setColor( this.color_chooser.showDialog( color_chooser, "Color Chooser", Color.BLACK) );
    }
    
    public void addCircle()
    {
        this.center_screen = new Point2D.Double( 350, 200 );
        Circle circle = new Circle( center_screen, 100, this.getColor() );
        this.active_shape = circle;
        this.list_shapes.add( circle );
        
        this.repaint();
    }
    
    public void addSquare()
    {
        this.center_screen = new Point2D.Double( 350, 200 );
        Square square = new Square( center_screen, 100, this.getColor() );
        this.active_shape = square;
        this.list_shapes.add( square );
        
        this.repaint();
    }
    
    public void paintComponent( Graphics g )
    {
        Graphics2D g2 = ( Graphics2D ) g;
        super.paintComponent( g );
        
        if( isPicked )
        {
            for( int i = list_shapes.size() - 1; i >= 0; i--)
            {
                if( list_shapes.get( i ) != active_shape )
                {
                    this.list_shapes.get( i ).draw( g2, true );
                }
            }
            this.active_shape.draw( g2, false );
        }
        else
        {
            if( this.active_shape != null )
            {
                for( int i = list_shapes.size() - 1; i >= 0; i--)
                {
                    if( list_shapes.get( i ) != active_shape )
                    {
                        this.list_shapes.get( i ).draw( g2, true );
                    }
                }
                this.active_shape.draw( g2, true );
            }
            else
            {
                for( int i = list_shapes.size() - 1; i >= 0; i--)
                {
                    this.list_shapes.get( i ).draw( g2, true );
                }
            }
        }
    }
    
    
    class MouseDrawListener implements MouseListener
    {
        private Point2D.Double mouse_loc;
        private Point2D.Double shape_loc;
        
        
        public void mouseClicked( MouseEvent event ){}

        public void mouseReleased( MouseEvent event )
        {
            isPicked = false;
            isMoving = false;
            isStrech = false;
            
            repaint();
        }

        public void mousePressed( MouseEvent event )
        {
            mouse_loc = new Point2D.Double( event.getX(), event.getY() );
            
            for( Shape cur : list_shapes )
            {
                if( cur.isInside( mouse_loc ) )
                {
                    active_shape = cur;
                    isMoving = true;
                    isPicked = true;
                }
                else if( cur.isOnBorder( mouse_loc ) )
                {
                    active_shape = cur;
                    isStrech = true;
                    isPicked = true;
                }
            }
            
            repaint();
        }
        
        public void mouseEntered( MouseEvent event ) {}

        public void mouseExited( MouseEvent event ) {}
    }
    
    
    class MouseMotListener implements MouseMotionListener
    {
        private Point2D.Double mouse_loc;
        
        
        public void mouseDragged( MouseEvent event )
        {
            mouse_loc = new Point2D.Double( event.getX(), event.getY() );

            if( isMoving )
            {
                active_shape.move( mouse_loc.getX() - ( active_shape.getRadius()/2 ),
                    mouse_loc.getY() - ( active_shape.getRadius()/2 ));
            }
            else if( isStrech )
            {
                active_shape.setRadius( mouse_loc.getX() - active_shape.getCenter().getX() );
            }
            
            repaint();
        }
        
        public void mouseMoved( MouseEvent event ){}
    }
}
