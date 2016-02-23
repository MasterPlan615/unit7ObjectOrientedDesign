import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;


public class TriangleFrame extends JFrame
{
    private static final int FRAME_WIDTH = 400;
    private static final int FRAME_HEIGHT = 400;
    
    
    public TriangleFrame()
    {
        this.setSize( FRAME_WIDTH, FRAME_HEIGHT );
        
        TriangleComponent scene = new TriangleComponent();
        this.add( scene );
    }
}
