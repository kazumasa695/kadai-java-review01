
public class Review01 {

    public static void main(String[] args) {
        int num1 = 1500;
        double result;
        result = tax(num1);
        System.out.println(num1 + "円の商品の税込価格は" + (result + num1) + "円" + "（消費税は" + result + "円）です。");
    }
    public static double tax(int num1) {
        double tax = 10;
        double num = num1 * (tax / 100);
        return num;
    }
}
