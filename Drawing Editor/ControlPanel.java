import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import javax.swing.JColorChooser;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Canvas;


public class ControlPanel
{
    private JButton pick_color;
    private JButton add_circle;
    private JButton add_square;
    private JPanel con_pan;
    private Canvas canvas;
    
    public ControlPanel()
    {
        this.con_pan = new JPanel();
        this.canvas = new Canvas();
        this.pick_color = new JButton( "Pick Color" );
        this.add_circle = new JButton( "Add Circle" );
        this.add_square = new JButton( "Add Square" );
        
        this.con_pan.add( this.pick_color );
        this.con_pan.add( this.add_circle );
        this.con_pan.add( this.add_square );
        
        MouseListener pick_color_listener = new MouseActionListener();
        this.pick_color.addMouseListener( pick_color_listener );
    }
    
    class MouseActionListener implements MouseListener
    {
        public void mouseClicked( MouseEvent event )
        {
            JColorChooser color_chooser = new JColorChooser();
        }

        public void mouseReleased( MouseEvent event ) {}

        public void mousePressed( MouseEvent event ) {}

        public void mouseEntered( MouseEvent event ) {}

        public void mouseExited( MouseEvent event ) {}
    }
}
