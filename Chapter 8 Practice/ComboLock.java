
public class ComboLock
{
    private int[] curPoint = new int[3];
    private int index = -1;
    private boolean direct = false;
    private int num1 = 0;
    private int num2 = 0;
    private int num3 = 0;
    
    
    public ComboLock( int secret1, int secret2, int secret3 )
    {
        this.num1 =  secret1;
        this.num2 = secret2;
        this.num3 = secret3;
    }
    
    public void reset()
    {
        this.curPoint = new int[3];
        this.index = -1;
        this.direct = false;
    }
    
    public void turnLeft( int ticks )
    {
        if( this.direct == true && this.index != -1 )
        {
            this.index++;
            this.direct = false;
        }
        else
        {
            return;
        }
        if( ticks <= 39 && ticks >= 0)
        {
            this.curPoint[this.index] += ticks;
        }
    }
    
    public void turnRight( int ticks )
    {
        if( this.direct == false )
        {
            this.index++;
            this.direct = true;
        }
        if( ticks <= 39 && ticks >= 0)
        {
            this.curPoint[this.index] += ticks;
        }
    }
    
    public boolean open()
    {
        if( this.direct == true && this.curPoint[0] == this.num1 && this.curPoint[1] == this.num2 && this.curPoint[2] == this.num3)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}