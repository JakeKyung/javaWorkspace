package chap_01;

public class _05_VariableNaming {
    public static void main(String[] args) {
        // 변수 네이밍
        // 1. 언더바, 문자, 숫자 사용 가능(공백 사용 불가)
        // 2. 밑줄 또는 문자로 시작 가능
        // 3. 한 단어 또는 2개 이상 단어의 연속
        // 4. 소문자로 시작, 각 단어의 시작 글자는 대문자 (첫 단어는 제외)
        // 5. 예약어 사용 불가 (public, static, void, int, double, float, ...)

        // ex. CamelCase
        String nationality = "대한민국";
        String firstName = "Jake";
        String lastName = "Kyung";
        String dateOfBirth = "19xx-12-12";
        String residentialAddress = "시그니엘 5012";
        String purposeOfVisit = "관광";

        // 프로그램 흐름을 위해 사용 되는 경우
        int i = 0;
        String str = "";

        // 상수(final)는 대문자, 값 변경 불가
        final String CODE = "KR";
    }
}
