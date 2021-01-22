import java.time.ZonedDateTime;

/**
 * @author Jiusen Guo
 * @date 2021/1/22 23:31
 */
public class T2
{
    public static void main(String[] args)
    {
        ZonedDateTime zbj = ZonedDateTime.now();   //默认时区
        System.out.println(zbj);
        //2021-01-22T23:32:22.975+08:00[Asia/Shanghai]
    }
}
