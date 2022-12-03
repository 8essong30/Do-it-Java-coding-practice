package section2.array;

public class ArrayCopy {
    public static void main(String[] args) {
        int[] array1 = {10, 20, 30, 40, 50};
        int[] array2 = {1, 2, 3, 4, 5};

        System.arraycopy(array1, 0, array2, 1, 4);
        //(복사할 배열, 복사 시작점, 붙여넣을 배열, 붙일 시작점, 복사할 요소 개수 )
        //length를 5로 하면 array2의 길이보다 요소 개수가 많아져서 ArrayIndexOutOfBoundsException 발생
        for(int i = 0; i < array2.length; i++){
            System.out.println(array2[i]); //{1, 10, 20, 30, 40}
        }
    }
}
