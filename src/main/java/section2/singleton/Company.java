package section2.singleton;

/*
1. 싱글톤패턴에서는 생성자를 반드시 명시적으로 만들고 접근제어자는 private로
2. 클래스 내부 유일한 인스턴스 static으로 생성
3. 외부 참조 public 메서드 생성 -> 생성한 인스턴스 반환
4. 실제 사용 코드 생성
 */
public class Company {
    private static Company instance = new Company(); //유일한 인스턴스
    private Company(){ } //private 생성자

    public static Company getInstance(){  //게터
        if(instance == null){
            instance = new Company();
        }
        return instance;
    }

    public static void main(String[] args) {
        Company myCompany1 = Company.getInstance();  //클래스 이름으로 게터 호출하여
        Company myCompany2 = Company.getInstance();  // 참조변수에 대입

        System.out.println(myCompany1 == myCompany2); // 두 변수가 같은 주소인지 확인
        // true 출력
        // 같은 참조 값을 가지는 동일한 인스턴스임
    }
}
