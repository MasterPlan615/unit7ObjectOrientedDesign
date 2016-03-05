import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.BorderLayout;


public class ControlPanel extends JPanel
{
    private JButton pick_color;
    private JButton add_circle;
    private JButton add_square;
    private JPanel cur_color;
    private DrawingPanel canvas;
    
    
    public ControlPanel( DrawingPanel draw )
    {
        this.cur_color = new JPanel();
        this.canvas = draw;
        
        this.pick_color = new JButton( "Pick Color" );
        this.add_circle = new JButton( "Add Circle" );
        this.add_square = new JButton( "Add Square" );
        
        this.canvas.getColor();
        cur_color.setBackground( canvas.getColor() );
        
        this.add( this.pick_color, BorderLayout.WEST );
        this.add( this.add_circle, BorderLayout.CENTER );
        this.add( this.add_square, BorderLayout.EAST );
        this.add( this.cur_color, BorderLayout.CENTER );
        
        MouseListener pick_color_listener = new MousePCListener();
        this.pick_color.addMouseListener( pick_color_listener );
        
        MouseListener add_circle_listener = new MouseACListener();
        this.add_circle.addMouseListener( add_circle_listener );
        
        MouseListener add_square_listener = new MouseASListener();
        this.add_square.addMouseListener( add_square_listener );
    }
    
    
    class MousePCListener implements MouseListener
    {
        public void mouseClicked( MouseEvent event )
        {
            canvas.pickColor();
            cur_color.setBackground( canvas.getColor() );
        }

        public void mouseReleased( MouseEvent event ) {}

        public void mousePressed( MouseEvent event ){}

        public void mouseEntered( MouseEvent event ) {}

        public void mouseExited( MouseEvent event ) {}
    }
    
    
    class MouseACListener implements MouseListener
    {
        public void mouseClicked( MouseEvent event )
        {
            canvas.addCircle();
        }

        public void mouseReleased( MouseEvent event ) {}

        public void mousePressed( MouseEvent event ){}

        public void mouseEntered( MouseEvent event ) {}

        public void mouseExited( MouseEvent event ) {}
    }
    
    
    class MouseASListener implements MouseListener
    {
        public void mouseClicked( MouseEvent event )
        {
            canvas.addSquare();
        }

        public void mouseReleased( MouseEvent event ) {}

        public void mousePressed( MouseEvent event ){}

        public void mouseEntered( MouseEvent event ) {}

        public void mouseExited( MouseEvent event ) {}
    }
}
