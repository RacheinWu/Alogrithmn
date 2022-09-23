/**
 * @Author 华南理工大学 吴远健
 * @Date 2022/9/21
 * @Description
 */
public class ITAEM_1 {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " * " + j + " = " + (i*j) + "\t");
            }
            System.out.println();
        }
    }
}
