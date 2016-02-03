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
   
   // override tge equals method defined in Card as well as Object
   public boolean equals( Object other )
   {
       // check if this object and the other object are both of the same class
       if( this.getClass() == other.getClass() )
       {
           // first check if this object and the other object are equal from the perspective of the superclass (i.e., Card)
           boolean isEqual = super.equals( otherCard );
           
           // second, cast the other object to an IDCard and check if idNumber are equal
           
           IDCard otherIDCard = (IDCard) other;
           return isEqual && this.idNumber.equals( otherCard.idNumber );
       }
       
       return false;
   }
}
