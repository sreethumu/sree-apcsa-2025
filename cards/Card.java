package cards;
public class Card {
    private int suite;
    private int value;

    private String[] SUITES = {"♦", "♣", "♥", "♠"};
    private String[] VALUES = {"Ace", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};

    public Card(int suite, int value){
        this.suite = suite;
        this.value = value;
    }
    
    public int getValue(){
        return suite;
    }

    public String toString(){
        return "" + SUITES[suite] + VALUES[value];
    }
}
