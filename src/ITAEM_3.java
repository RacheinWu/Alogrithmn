import java.util.Scanner;

/**
 * @Author 华南理工大学 吴远健
 * @Date 2022/9/21
 * @Description
 */
public class ITAEM_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入数字：");
        long time = scanner.nextInt();
        long calc_min = 60;
        long calc_hour = calc_min * 60;
        long calc_day = calc_hour * 24;
        long calc_month = calc_day * 30;
        long calc_year = calc_month * 12;
        long year = time / calc_year;
        time -= year * calc_year;
        long month = time / calc_month;
        time -= month * calc_month;
        long day = time / calc_day;
        time -= day * calc_day;
        long hour = time / calc_hour;
        time -= hour * calc_hour;

        long min = time / calc_min;
        long second = time -= min * calc_min;
        System.out.println(year + "年" + month +"月" + day + "天" + hour + "小时" + min + "分钟" + second + "秒");


    }
}
