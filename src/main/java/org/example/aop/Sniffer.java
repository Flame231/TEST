package org.example.aop;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class Sniffer implements MethodInterceptor {

    public Object invoke(MethodInvocation invocation) throws Throwable {
        Object[] args = invocation.getArguments();
        TransferData data = (TransferData) args[0];
        StringBuffer sb = new StringBuffer(100);
        sb.append("CardNo(Sniffer)" + data.getCardNo()).append("password(Sniffer)" + data.getPassword());
        System.out.println(sb.toString());
        return invocation.proceed();
    }
}
