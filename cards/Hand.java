package cards;

public class Hand {

    private int max;
    private int addCardNum = 0;
    private Card[] hand;
    private int length;

    public Hand(int x){
        hand = new Card[x];
        max = x;
    }
    
    
    public void add(Card x){
        hand[addCardNum] = x;
        addCardNum++;
        length++;
    }

    public int length(){
        return length;
    }

    public Card get(int x){
        return hand[x];
    }

    public Card remove(int indexOfCard){
        Card removedCard = hand[indexOfCard];
        hand[indexOfCard] = null;
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
        //max--; 
        length--;
        ///Add removing length
        return removedCard;
    }

    public String toString(){
        String handString = "";
        for(int i = 0; i<length; i++){
            handString += "" + hand[i].toString();
        }
        return handString;
    }


}
