package chapter2.ifExample;

public class SwitchCase {
    public static void main(String[] args) {
        int ranking = 1;
        char medalColor;

        switch (ranking) {
            case 1 : medalColor = 'G';
                    break;
            case 2 : medalColor = 'S';
                    break;
            case 3 : medalColor = 'B';
                    break;
            default:
                medalColor = 'A';
        }
        System.out.println(ranking + "등 메달의 색깔은 " + medalColor + "입니다");

        String medal = "Gold";

        switch (medal) {
            case "Gold":
                System.out.println("금메달입니다.");
                break;
            case "Silver": case "Bronze":
                System.out.println("케이스 여러개 같이 쓸 수 있습ㄴ디ㅏ 결과가 같으면");
                break;
            default:
                System.out.println("메달이 없습닏다.");
                break;
        }
    }
}
