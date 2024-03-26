import java.util.Scanner;

public class Ex601 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String[] myArr = new String[3];

        System.out.println("3개의 문자열을 입력하세요: ");

        // 사용자 입력 받기
        for(int i = 0; i < 3; i++) {
            myArr[i] = s.nextLine();
        }

        // 배열 값 출력하기
        for(int i = 0; i < 3; i++) {
            System.out.print(myArr[i] + " ");
        }
    }
}