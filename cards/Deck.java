package cards;

public class Deck {

    private Card[] deck = new Card[52];
    private int cardDrawn = 0;

    public Deck(){
        for(int num=0; num<52; num++){   
            for(int i=0; i<4; i++){
                for(int j=0; j<=12; j++){
                    Card newCard = new Card(i,j);
                    deck[num] = newCard;
                }
            }
        }
    }

    public void shuffle(){
        int min = 0;
        int max = 51;
        for(int i = 0; i<=51; i++){
            int randomCard = (int)(Math.random() * ((max - min) + 1) + min);
            deck[i] = deck[randomCard];
            min++;
        }
    }

    public Card draw(){
        if(cardDrawn >= 52){
            return null;
        }else{
            Card card = deck[cardDrawn];
            cardDrawn++;
            return card;
        }
    }


}
