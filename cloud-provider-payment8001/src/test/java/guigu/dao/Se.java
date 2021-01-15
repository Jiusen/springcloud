package guigu.dao;

import com.atguigu.springcloud.PaymentMain8001;
import com.atguigu.springcloud.service.PaymentService;
import com.atguigu.springcloud.service.impl.PaymentServiceImpl;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author Jiusen Guo
 * @date 2021/1/15 2:49
 */
@SpringBootTest(classes = PaymentMain8001.class)
@RunWith(SpringRunner.class)
public class Se
{
    @Autowired
    private PaymentServiceImpl paymentService;
}
