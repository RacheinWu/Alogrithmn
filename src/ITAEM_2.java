import java.util.Scanner;

/**
 * @Author 华南理工大学 吴远健
 * @Date 2022/9/21
 * @Description
 */
public class ITAEM_2 {

    public static void main(String[] args) {
        System.out.print("请输入五位数字：");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int 第一个数字 = n / 10000;
        int 第二个数字 = n / 1000 % 10;
        int 第三个数字 = n / 100 % 10;
        int 第四个数字 = n / 10 % 10;
        int 第五个数字 = n % 10;
        System.out.println("第一个数字：" + 第一个数字);
        System.out.println("第二个数字：" + 第二个数字);
        System.out.println("第三个数字：" + 第三个数字);
        System.out.println("第四个数字：" + 第四个数字);
        System.out.println("第五个数字：" + 第五个数字);
    }

}
