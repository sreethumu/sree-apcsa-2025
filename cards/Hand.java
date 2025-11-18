package cards;

public class Hand {

    private int max;
    private int addCard = 0;

    public Hand(int x){
        max = x;
    }
    
    private Card[] hand = new Card[max];
    
    public void add(Card x){
        hand[addCard] = x;
        addCard++;
    }

    public int length(){
        int numCards = 0;
        while(hand[numCards] != null){
            numCards++;
        }
        return numCards;
    }

    public Card get(int x){
        return hand[x];
    }

    public 

}
