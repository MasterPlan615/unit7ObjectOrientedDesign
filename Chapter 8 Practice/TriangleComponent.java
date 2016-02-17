import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;

public class TriangleComponent extends JComponent
{
    private int cur_pnt;

    private int pnt_x;
    private int pnt_y;

    private int pnt_x2;
    private int pnt_y2;

    private int pnt_x3;
    private int pnt_y3;

    public TriangleComponent()
    {
        MouseListener listener = new MouseClickListener();
        addMouseListener( listener );
    }

    public void addPoint( int x, int y )
    {
        if( this.cur_pnt == 0 || this.cur_pnt > 2 )
        {
            this.cur_pnt = 0;
            this.pnt_x = x;
            this.pnt_y = y;
            //reset();
            this.cur_pnt++;
            repaint();
        }
        else if( this.cur_pnt == 1 )
        {
            this.pnt_x2 = x;
            this.pnt_y2 = y;
            this.cur_pnt++;
            repaint();
        }
        else if( this.cur_pnt == 2 )
        {
            this.pnt_x3 = x;
            this.pnt_y3 = y;
            this.cur_pnt++;
            repaint();
        }
    }

    //     public String getData()
    //     {
    //         return "X: " + this.pnt_x + " Y: " + this.pnt_y + 
    //         " X2: " + this.pnt_x2 + " Y2: " + this.pnt_y2 + 
    //         " X3: " + this.pnt_x3 + " Y3: " + this.pnt_y3 + 
    //         " Current Point: " + this.cur_pnt;
    //     }

    //     public void reset()
    //     {
    //         this.pnt_x2 = 0;
    //         this.pnt_y2 = 0;
    //         this.pnt_x3 = 0;
    //         this.pnt_y3 = 0;
    //     }

    public void paintComponent( Graphics g )
    {
        Graphics2D g2 = ( Graphics2D ) g;

        g2.drawLine( this.pnt_x,this.pnt_y,this.pnt_x2,this.pnt_y2 );
        g2.drawLine( this.pnt_x2,this.pnt_y2,this.pnt_x3,this.pnt_y3 );
        g2.drawLine( this.pnt_x3,this.pnt_y3,this.pnt_x,this.pnt_y );

    }

    class MouseClickListener implements MouseListener
    {
        public void mouseClicked( MouseEvent event )
        {
            int x = event.getX();
            int y = event.getY();
            addPoint( x, y );
        }

        public void mouseReleased( MouseEvent event ) {}

        public void mousePressed( MouseEvent event ) {}

        public void mouseEntered( MouseEvent event ) {}

        public void mouseExited( MouseEvent event ) {}
    }

}
