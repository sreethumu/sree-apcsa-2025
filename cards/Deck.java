package cards;

public class Deck {

    private Card[] deck = new Card[52];
    private int cardDrawn = 0;
    int fillCards = 0;

    public Deck(){
        for(int i=0; i<4; i++){
            for(int j=0; j<=12; j++){
                Card newCard = new Card(i,j);
                for(int u =0; u<=51; u++){
                    if(deck[u]!=null){
                        deck[u] = newCard;
                    }
                }
            }
            fillCards++;
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
