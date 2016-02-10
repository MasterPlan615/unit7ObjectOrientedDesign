import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.event.ActionEvent;

public class ButtonViewer
{
    private static final int FRAME_WIDTH = 150;
    private static final int FRAME_HEIGHT = 150;

    private JFrame frame;
    private JPanel panel;
    private JButton a;
    private JButton b;
    private JLabel label;

    public ButtonViewer()
    {
        this.frame = new JFrame();
        this.panel = new JPanel();

        this.a = new JButton( "A" );
        this.panel.add( this.a );

        this.b = new JButton( "B" );
        this.panel.add( this.b );

        this.label = new JLabel();
        this.panel.add( this.label );

        this.frame.add( panel );

        ClickListener listener = new ClickListener();
        this.a.addActionListener( listener );
        this.b.addActionListener( listener);

        this.frame.setSize( FRAME_WIDTH, FRAME_HEIGHT );
        this.frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        this.frame.setVisible( true );
    }

    public static void main( String[] args )
    {
        ButtonViewer view = new ButtonViewer();
    }

    public class ClickListener implements ActionListener
    {
        //     private int count;
        //     private String name;
        //     
        //     public ClickListener( String buttonName )
        //     {
        //         this.count = 0;
        //         this.name = buttonName;
        //     }

        public void actionPerformed( ActionEvent event )
        {
            label.setText( "Button " + event.getActionCommand() + " was clicked!" );

            //         this.count++;
            //         
            //         if( this.count == 1 )
            //         {
            //             System.out.println( "I was clicked 1 time!" );
            //         }
            //         else
            //         {
            //             System.out.println( "I was clicked " + this.count + " times!" );
            //         }
        }
    }
}