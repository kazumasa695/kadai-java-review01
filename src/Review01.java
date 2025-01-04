
public class Review01 {

    public static void main(String[] args) {
        int num1 = 1500;
        int result;
        result = tax(num1);
        System.out.println(num1 + "円の商品の税込価格は" + (result + num1) + "円" + "（消費税は" + result + "円）です。");
    }
    public static int tax(int num1) {
        int tax = 10;
        int num = (int)((double)tax / 100 * num1);
        return num;
    }
}
