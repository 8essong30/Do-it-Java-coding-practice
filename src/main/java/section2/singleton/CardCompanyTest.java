package section2.singleton;

public class CardCompanyTest {
    public static void main(String[] args) {
        CardCompany cardCompany = CardCompany.getInstance();

        Card card1 = new Card();
        Card card2 = new Card();

        System.out.println(card1.getCardNumber());
        System.out.println(card2.getCardNumber());
    }

}
