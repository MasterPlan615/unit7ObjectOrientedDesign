public class CallingCard extends Card
{
    private String phonenum;
    
    public CallingCard( String n, String pn )
    {
        super( n );
        this.phonenum = pn;
    }
    
    public String getPhoneNumber()
    {
        return this.phonenum;
    }
    
    public String format()
    {
        return super.format() + ", Phone Number: " + this.phonenum;
    }
}
