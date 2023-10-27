package chap_02;

public class _01_Operator1 {
    public static void main(String[] args) {
        // 산술 연산자

        // 일반 연산
        System.out.println(4 + 1); // 5
        System.out.println(4 - 1); // 3
        System.out.println(4 * 2); // 8
        System.out.println(4 / 3); // 1
        System.out.println(4 % 2); // 0

        // 우선 순위 연산
        System.out.println(2 + 2 * 2); // 6
        System.out.println((2 + 2) * 2); // 8

        // 변수 연산
        int a = 20;
        int b = 10;
        int c;
        c = a + b;
        System.out.println(c); // 30
        c = a - b;
        System.out.println(c); // 10
        c = a * b;
        System.out.println(c); // 200
        c = a / b;
        System.out.println(c); // 2
        c = a % b;
        System.out.println(c); // 0

        // 증감 연산 ++, --
        int val;
        val = 10;
        System.out.println(val); // 10
        System.out.println(++val); // 11
        System.out.println(val); // 11
        val = 10;
        System.out.println(val); // 10
        System.out.println(val++); // 10
        System.out.println(val); // 11

        val = 10;
        val--;
        System.out.println(val); // 9


    }
}
