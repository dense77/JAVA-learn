public class splittest {
    public static void main(String[] args) {
        String cmower = "沉默王二.一枚有趣的程序员";
        if (cmower.contains(".")) {
            String [] parts = cmower.split("，");
            System.out.println("第一部分：" + parts[0] +" 第二部分：" + parts[1]);
        } else {
            throw new IllegalArgumentException("当前字符串没有包含逗号");
        }
    }
}