public class Billfold
{
    private Card card1;
    private Card card2;
    
    public Billfold()
    {
        this.card1 = null;
        this.card2 = null;
    }
    
    public void addCard(Card c)
    {
        if( this.card1 == null )
        {
            this.card1 = c;
        }
        else
        {
            if( this.card2 == null )
            {
                this.card2 = c;
            }
            else
            {
                System.out.println("All available card slots are full.");
            }
        }
    }
    
    public String formatCards()
    {
        return "Card 1: " + card1.format() + "| Card 2: " + card2.format();
    }
    
    public int getExpiredCardCount()
    {
        int totalexp = 0;
        
        if( this.card1.isExpired() == true )
        {
            totalexp += 1;
        }
        else if( this.card2.isExpired() == true )
        {
            totalexp += 1;
        }
        
        return totalexp;
    }
}