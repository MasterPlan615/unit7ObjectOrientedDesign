import java.util.Scanner;

public class FillInQuestion extends Question
{
    // This class supports fill-in-the-blank questions where the answer is specified in the question's text.
    
    public void setText(String questionText)
    {
        Scanner parser = new Scanner( questionText );
        parser.useDelimiter( "_" );
        String question = parser.next();
        String answer = parser.next();
        question += "____" + parser.next();
        
        super.setText( question );
        this.setAnswer( answer );
    }
}
