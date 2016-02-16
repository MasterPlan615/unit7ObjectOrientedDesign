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
    
    private MouseListener listener;
    
    public TriangleComponent()
    {
        addMouseListener( listener );
    }
    
    public void addPoint( int x, int y )
    {
        if( this.cur_pnt == 0 || this.cur_pnt > 2 )
        {
            this.cur_pnt = 0;
            this.pnt_x = x;
            this.pnt_y = y;
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
    
    public void paintComponents( Graphics g )
    {
        Graphics2D g2 = ( Graphics2D ) g;
        g2.drawLine(this.pnt_x,this.pnt_y,this.pnt_x,this.pnt_y);
    }
}
