package com.youkeda;

import com.youkeda.dewu.model.PayType;
import com.youkeda.dewu.model.Result;
import com.youkeda.dewu.param.PaymentParam;
import com.youkeda.dewu.service.impl.PayServiceImpl;
import com.youkeda.dewu.util.UUIDUtils;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class YkdTest {
    public static void error(String msg) {
        System.err.println("<YkdError>" + msg + "</YkdError>");
    }

    @Test
    void contextLoads() {

        Class<?> aClass = null;
        try {
            aClass = Class.forName("com.youkeda.dewu.service.impl.PayServiceImpl");
        } catch (ClassNotFoundException e) {
            error("没有创建`com.youkeda.dewu.service.impl.PayServiceImpl`类");
            return;
        }

       PayServiceImpl payService = new PayServiceImpl();
       String orderId = UUIDUtils.getUUID();
       PaymentParam paymentParam = new PaymentParam();
       paymentParam.setOrderNumber(orderId);
       paymentParam.setPayAmount(1.0);
       paymentParam.setPayType(PayType.ALIPAY);
       Result result = payService.aliPay(orderId, paymentParam);
    //    if (!result.isSuccess()) {
    //        error("调用支付宝支付接口支付失败");
    //        return;
    //    }
    //    if (StringUtils.isEmpty(result.getData())) {
    //        error("调用支付宝支付接口支付失败");
    //        return;
    //    }
    }

}
