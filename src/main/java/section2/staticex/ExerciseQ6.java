package section2.staticex;
class Card{
    static int serialNum;
    int ID;

    public Card() {
        serialNum++;
        ID = serialNum;
    }
}

public class ExerciseQ6 {
    public static void main(String[] args) {
        Card card1 = new Card();
        Card card2 = new Card();
        System.out.println(card1.ID);
        System.out.println(card2.ID);
    }
}
