import java.util.ArrayList;
import java.util.List;

public class test {

    public static void main(String[] args) {
        float price1 = 10.9f;
        double price2 = 5.8;
        int num1 = 2;
        int num2 = 4;
        double res1 = price1 * num1 + price2 * num2;
        int res2 = (int) (price1 * num1 + price2 * num2);
        System.out.println("一共付给收银员" + res2 + "元");
        System.out.println(res1);
    }
}

