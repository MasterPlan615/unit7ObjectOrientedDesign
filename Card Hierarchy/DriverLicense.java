import java.util.GregorianCalendar;

public class DriverLicense extends Card
{
   private String age;
   private int expYear;
   private GregorianCalendar calendar = new GregorianCalendar(2016,2,2);
    
   public DriverLicense( String n, String a, int e)
   {
       super( n );
       this.age = a;
       this.expYear = e;
   }
   
   public String getAge()
   {
       return this.age;
   }
   
   public String format()
   {
       return super.format() + ", Age: " + this.age;
   }
   
   public boolean isExpired()
   {
       if(expYear < calendar.get(calendar.YEAR))
       {
           return true;
       }
       else
       {
           return false;
       }
   }
}
