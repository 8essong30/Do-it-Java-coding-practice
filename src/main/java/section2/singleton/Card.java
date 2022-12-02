package section2.singleton;

public class Card {
    private static int serialNum = 1000;
    private int CardNumber;

    public Card() {
        serialNum++;
        CardNumber = serialNum;
    }

    public int getCardNumber() {
        return CardNumber;
    }
}
