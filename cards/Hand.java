package cards;

public class Hand {

    private int max;
    private int addCardNum = 0;

    public Hand(int x){
        max = x;
    }
    
    private Card[] hand = new Card[max];
    
    public void add(Card x){
        hand[addCardNum] = x;
        addCardNum++;
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

    public Card remove(int indexOfCard){
        Card removedCard = hand[indexOfCard];
        for(int i = 0; i<max-1; i++){
            if(hand[i] == null){
                if(i==max-1){
                    max -= 1;
                }else{
                    Card initial = hand[i];
                    hand[i] = hand[i+1];
                    hand[i+1] = initial;
                }
            }
        }
        Hand hand = new Hand(max);
        ///Add removing length
        return removedCard;
    }

    public String toString(){
        String handString = "";
        for(int i = 0; i<max; i++){
            handString += hand[i].toString();
        }
        return handString;
    }


}
