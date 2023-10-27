package chap_01;

public class _07_TypeCasting {
    public static void main(String[] args) {
        // * TypeCasting
        // 정수 -> 실수
        // 실수 -> 정수형
        int score = 90;
        System.out.println(score); // 90
        System.out.println((float) score); // 90.0
        System.out.println((double) score); // 90.0


        float score_f = 90.5F;
        double score_d = 90.5;
        System.out.println((int)score_f); // 90
        System.out.println((int)score_d); // 90

        score = 90 + (int)98.8;
        System.out.println(score); // 188

        score_d = 93 + 98.8; // 형변환 선언 없어도 자동 형변환
        System.out.println(score_d); // 191.8

        double convertedScoreDouble = score;
        System.out.println(convertedScoreDouble); // 188.0

        int convertedScoreInt = (int) score_d; // 191.8 -> 191
        // double -> float -> long -> int : 수동 형변환 해야함

        // 숫자 -> 문자열
        //System.out.println((String) score); // Inconvertible types; cannot cast 'int' to 'java.lang.String'
        String s1 = String.valueOf(15);
        System.out.println(s1);

        String s2;
        s2 = Double.toString(15.5);
        System.out.println(s2);

        // 문자열 -> 숫자
        int i = Integer.parseInt("20");
        System.out.println(i);
        double d = Double.parseDouble(("20.2"));
        System.out.println(d);
    }
}
