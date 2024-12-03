import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class shuzu {
    public static void main(String[] args) {

        int[] array1 = {1, 2, 3};
        int[] array2 = {4, 5, 6};

        // 创建一个新数组，长度为两个数组长度之和
        int[] mergedArray = new int[array1.length + array2.length];
        // 复制第一个数组到新数组
        System.arraycopy(array1, 0, mergedArray, 0, array1.length);
        System.out.println(Arrays.toString(mergedArray));

        int[] anArray = new int[] {1, 2, 3, 4, 5};
        try{
            System.out.println(anArray[5]);
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println(Arrays.toString(anArray));

    }


}
