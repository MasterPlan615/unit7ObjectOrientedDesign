public class IDCard extends Card
{
   private String idNumber;
   
   public IDCard( String n, String id )
   {
       super( n );
       this.idNumber = id;
   }
   
   public String getID()
   {
       return this.idNumber;
   }
   
   public String format()
   {
       return super.format() + ", ID Number: " + this.idNumber;
   }
}
