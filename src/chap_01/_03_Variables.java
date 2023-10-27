package chap_01;

public class _03_Variables {
    public static void main(String[] args) {
        // int, long, float, double, char, String, boolean
        String name = "Jake";
        int hour = 15;
        System.out.println(name + "님 배송시작");
        System.out.println(name + "님 배송출발 " + hour + "시 도착 예정");

        double score = 90.5;
        char grade = 'A'; // 작은 따옴표('')로 선언
        name = "Kyung";
        System.out.println(name + "님의 학점은 " + grade + " 평점은 " + score);

        boolean pass = true;
        System.out.println("시헙 합격 여부 " + pass);

        double d = 3.14123456789;
        float f = 3.14123456789F; // float 자료형 뒤에는 F 명시 해줘야함, 정밀하게 표현 안됨
        System.out.println(d);
        System.out.println(f);

        //int i = 100000000000000000; // Integer number too large (+-21억)
        long l = 100000000000000_000L; // int 범위보다 크게 선언 가능, L 명시, 언더바(_)로 구분해도 출력은 동일
        System.out.println(l);

    }
}
