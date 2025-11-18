package cards;

public class Deck {

    private Card[] deck = new Card[52];
    private int cardDrawn = 0;
    private int fillCards = 0;

    public Deck(){
        for(int i=0; i<4; i++){
            for(int j=0; j<=12; j++){
                Card newCard = new Card(i,j);
                deck[fillCards]=newCard;
                fillCards++;
            }
            
        }
    }

    public void shuffle(){
        int min = 0;
        int max = 51;
        for(int i = 0; i<=51; i++){
            int randomCard = (int)(Math.random() * ((max - min) + 1) + min);
            deck[i] = deck[randomCard];
            deck[randomCard] = deck[i];
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

    public void print(int x){
        String printCards = "";
        for(int i = 0; i<=x; i++){
            printCards += deck[i].toString() + " ";
        }
        System.out.println(printCards);
    }

    public void cut(int numCardsToCut){
        for(int i = 0; i<numCardsToCut; i++){
            for(int j = 0; j<52; j++){
                deck[j-1] = deck[j];
            }
        }
    }

}
