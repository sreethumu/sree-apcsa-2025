package cards;

public class Deck {

    private String[] deck = new String[51];

    public Deck(){
        for(int num=0; num<52; num++){   
            for(int i=0; i<4; i++){
                for(int j=0; j<=12; j++){
                    Card newCard = new Card(i,j);
                    deck[num] = newCard.toString();
                }
            }
        }
    }

}
