package chap_02;

public class _03_Operator3 {
    public static void main(String[] args) {
        // 비교 연산자(참이면 true, 거짓이면 false)
        System.out.println(5 > 3); // true
        System.out.println(5 >= 3); // true
        System.out.println(5 < 3); // false
        System.out.println(5 <= 3); // false
        System.out.println(5 == 5); // true
        System.out.println(5 != 3); // true

        // 논리 연산 OR, AND
        boolean cart = true;
        boolean purchase = false;

        System.out.println(cart || purchase); // true
        System.out.println(cart && purchase); // false

        // 논리 부정 연산자
        System.out.println(!true); // false
        System.out.println(!false); // true

        // 삼항 연산자
        // 결과 = (조건) ? 참의 경우 결과값 : 거짓의 경우 결과값
        int x = 5;
        int y = 3;
        int max = (x > y) ? x : y;
        System.out.println(max); // 5
    }
}
