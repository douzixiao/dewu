package com.youkeda.dewu.service;

import com.youkeda.dewu.model.Result;
import com.youkeda.dewu.param.PaymentParam;

public interface PayService {
     public  Result aliPay(String orderId, PaymentParam paymentParam);
     
     
}