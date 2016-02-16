import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;

public class TriangleFrame extends JFrame
{
    private static final int FRAME_WIDTH = 400;
    private static final int FRAME_HEIGHT = 400;
    
    private TriangleComponent scene;
    
    public TriangleFrame()
    {
        add( scene );
        setSize( FRAME_WIDTH, FRAME_HEIGHT );
    }
}
