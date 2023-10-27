package chap_06;

public class _05_Overloading {

    public static int getPower(int number) {
        int result = number * number;
        return result;
    }
    public static int getPower(String strNumber) {
        int number = Integer.parseInt(strNumber);
        return number*number;
    }

    public static void main(String[] args) {
        // 메소드 오버로딩 : 이름이 같은 메서드를 여러번 선언, but 전달값의 타입이 다르거나 전달값의 갯수를 다르게 해서 사용
        System.out.println(getPower(2)); // 4
        System.out.println(getPower("2")); // 4
    }
}
