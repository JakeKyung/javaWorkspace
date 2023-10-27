package chap_06;

public class _02_Parameter {
    public static void sum(int a, int b){
        System.out.println(a+b);
    }
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        sum(a,b); // 30
    }
}
