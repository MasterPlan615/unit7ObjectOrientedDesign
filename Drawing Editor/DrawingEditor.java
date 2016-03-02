import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JPanel;

public class DrawingEditor extends JFrame
{
    public static final int FRAME_WIDTH = 800;
    public static final int FRAME_HEIGHT = 600;
    
    public DrawingEditor()
    {
        this.setSize( FRAME_WIDTH, FRAME_HEIGHT );
        
        DrawingPanel canvas = new DrawingPanel();
        this.add( canvas , BorderLayout.CENTER );
        //this.setContentPane( canvas );
        
        ControlPanel controls = new ControlPanel( canvas );
        this.add( controls , BorderLayout.SOUTH );
        
        this.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        this.setVisible( true );
    }
    
    public static void main( String[] args )
    {
        DrawingEditor start = new DrawingEditor();
    }
}
