import java.util.Scanner;

/**
 * @Author 华南理工大学 吴远健
 * @Date 2022/9/21
 * @Description
 */
public class ITAEM_4 {
    public static void main(String[] args) {
        System.out.println("请输入想打印多少行呢：");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            //打印空格:
            for (int j = 1; j <= (n-i); j++) {
                System.out.print(" ");
            }
            //打印*：
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n-1; i >= 0; i--) {
            //打印空格：
            for (int j = 1; j <= (n-i); j++) {
                System.out.print(" ");
            }
            //打印*:
            for (int j = 1; j <= (2 * i -1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
