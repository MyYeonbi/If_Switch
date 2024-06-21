package Switch_Q7;

public class BiggerNum {
    public static void main(String[] args) {
        //여러분은 두 개의 정수 변수 a와 b를 가지고 있다.
        //a의 값은 10이고, b의 값은 20이다.
        //삼항연산자를 사용하여 더 큰 숫자를 출력하는 코드작성

        int a = 5;
        int b = 2;

        int max = (a > b) ? a : b;
        System.out.println("더 큰 숫자는 " + max + "입니다.");
    }
}
