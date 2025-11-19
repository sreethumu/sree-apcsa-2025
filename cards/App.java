package cards;

public class App {

    public static void main(String[] args) {

        //CardTable table = new CardTable();

        //table.startPlaying();
        Deck deck = new Deck();
        Hand hand = new Hand(8);
        Card queenOfHearts = new Card(2, 11);
        for(int i=0; i<8; i++){
            hand.add(deck.draw());
        }
        System.out.println(hand.toString());
        //hand.toString();
        /*deck.print(5);
        deck.draw();
        deck.print(5);
        deck.draw();
        deck.print(5);*/
    }
}
