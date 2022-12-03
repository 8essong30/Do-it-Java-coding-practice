package section2.array;

public class BookArray {
    public static void main(String[] args) {
        Book[] library = new Book[5];

//        for(int i= 0; i < library.length; i ++){
//            System.out.println(library[i]); //null * 5
        library[0] = new Book("태백산맥", "조정래");
        library[1] = new Book("데이안", "헤르만헤세");
        library[2] = new Book("어떻게 살 것인가", "유시민");
        library[3] = new Book("토지", "박경래");
        library[4] = new Book("어린왕자", "생택쥐베리");

        for(int i = 0; i < library.length; i++){
            library[i].showBookInfo();
        }
        for(Book book:library){
            System.out.println(book); //인스턴스 저장 메모리 공간 주소 출력
        }
    }
}
