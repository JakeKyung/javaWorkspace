package chap_06;

public class _03_Return {

    public static String getPhoneNumber() {
        String phoneNumber = "010-1234-5687";
        return phoneNumber;
    }
    public static void main(String[] args) {
        String number = getPhoneNumber();
        System.out.println(number);
    }
}
