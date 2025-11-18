package cards;

public class App {

    public static void main(String[] args) {

        //CardTable table = new CardTable();

        //table.startPlaying();
        Deck deck = new Deck();
        Hand hand = new Hand(8);
        Card queenOfHearts = new Card(2, 11);
        hand.add(queenOfHearts);
        hand.length();
        //hand.toString();
        /*deck.print(5);
        deck.draw();
        deck.print(5);
        deck.draw();
        deck.print(5);*/
    }
}
