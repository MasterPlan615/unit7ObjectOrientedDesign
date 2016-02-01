public class DriverLicense extends Card
{
   private String age;
    
   public DriverLicense( String n, String a )
   {
       super( n );
       this.age = a;
   }
   
   public String getAge()
   {
       return this.age;
   }
   
   public String format()
   {
       return super.format() + ", Age: " + this.age;
   }
}
