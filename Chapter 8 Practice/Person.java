import java.util.Scanner;

public class Person
{
    private String name;
    
    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);
        Object first = null;
        Object last = null;
        
        for( int i = 0; i < 10; i++ )
        {
            System.out.println( "Please enter the person's name: " );
            String check = scan.next();
            Object person = new Object(check);
        }
        
        System.out.println( "First: " + first + " Last: " + last );
    }
    
    public int compareTo( Object otherObject )
    {
        if(this.equals(otherObject))
        {
            return 0;
        }
        else if(  otherObject)
        {
            return 1;
        }
        
    }
    
    
}
