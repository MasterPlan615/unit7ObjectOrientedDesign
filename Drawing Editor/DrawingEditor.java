import javax.swing.JFrame;


public class DrawingEditor extends JFrame
{
    public static final int FRAME_WIDTH = 800;
    public static final int FRAME_HEIGHT = 600;

    
    public DrawingEditor()
    {
        this.setSize( FRAME_WIDTH, FRAME_HEIGHT );
        
        ControlPanel control_panel = new ControlPanel();
        this.add( control_panel );
        
        DrawingPanel drawing_panel = new DrawingPanel();
        this.add( drawing_panel );
        
        start.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        this.setVisible( true );
    }
    
    public static void main( String[] args )
    {
        JFrame start = new DrawingEditor();
    }
}
