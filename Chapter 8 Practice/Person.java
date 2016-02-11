import java.util.Scanner;

public class Person implements Comparable<Person>
{
    private String name;
    
    public Person( String name )
    {
        this.name = name;
    }
    
    public String getName()
    {
        return name;
    }
    
    public int compareTo( Person other )
    {
        String myName = this.name;
        String otherName = other.name;
        
        return myName.compareTo(otherName);
    }
}
