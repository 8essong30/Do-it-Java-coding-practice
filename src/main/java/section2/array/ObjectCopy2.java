package section2.array;

//얕은 복사
public class ObjectCopy2 {
    public static void main(String[] args) {
        Book[] bookArray1 = new Book[3];
        Book[] bookArray2 = new Book[3];

        bookArray1[0] = new Book("태백산맥", "조정래");
        bookArray1[1] = new Book("데미안", "헤르만 헤세");
        bookArray1[2] = new Book("어떻게 살 것인가", "유시민");
        System.arraycopy(bookArray1, 0, bookArray2, 0, 3);

        for (Book book : bookArray2) {
            book.showBookInfo();
        }

        bookArray1[0].setBookName("나목"); //1 배열 요소값 변경
        bookArray1[0].setAuthor("박완서");

        System.out.println("=== bookArray1 ===");
        for(int i = 0; i < bookArray1.length; i++){
            bookArray1[i].showBookInfo();
        }
        System.out.println("=== bookArray2 ===");
        for(int i = 0; i < bookArray2.length; i++){
            bookArray2[i].showBookInfo();  //2도 변경됨
            // 객체배열의 요소에 저장된 값은 인스턴스의 주소값이기 때문
            // 객체배열 복사 시 인스턴스의 주소 값만 복사
        }
    }
}
