package section2.array;

//배열에서 유효한 값이 저장된 배열 요소까지만 출력
public class ArrayTest3 {
    public static void main(String[] args) {
        double[] data = new double[5];
        int size = 0;  // 유효한 값이 저장된 배열 요소 개수 저장 변수

        data[0] = 10.0; size++; // 값 저장 후 size변수 값 증가
        data[1] = 20.0; size++;
        data[2] = 30.0; size++;

        for(int i = 0 ; i < size; i ++){ //유효한 값이 저장된 배열 요소 개수만큼 반복문 실행
            System.out.println(data[i]);
        }
    }
}
