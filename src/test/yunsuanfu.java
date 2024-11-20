public class yunsuanfu {
    public static void main(String[] args) {
//        int a = 10;
//        float c = 3.0f;
//        double d = 3.0;
//        int b = 3;
//        System.out.println(a / c); // 3.3333333
//        System.out.println(a / d); // 3.3333333333333335
//        System.out.println(a % c); // 1.0
//        System.out.println(a % d); // 1.0
//        System.out.println(a % b);

        int a = 60, b = 13;
        System.out.println("a 的二进制：" + Integer.toBinaryString(a)); // 111100
        System.out.println("b 的二进制：" + Integer.toBinaryString(b)); // 1101

        int c = a & b;
        System.out.println("a & b：" + c + "，二进制是：" + Integer.toBinaryString(c));

        c = a | b;
        System.out.println("a | b：" + c + "，二进制是：" + Integer.toBinaryString(c));

        c = a ^ b;
        System.out.println("a ^ b：" + c + "，二进制是：" + Integer.toBinaryString(c));

        c = ~a;
        System.out.println("~a：" + c + "，二进制是：" + Integer.toBinaryString(c));

        c = a << 2;
        System.out.println("a << 2：" + c + "，二进制是：" + Integer.toBinaryString(c));

        c = a >> 2;
        System.out.println("a >> 2：" + c + "，二进制是：" + Integer.toBinaryString(c));

        c = a >>> 2;
        System.out.println("a >>> 2：" + c + "，二进制是：" + Integer.toBinaryString(c));
    }
}
