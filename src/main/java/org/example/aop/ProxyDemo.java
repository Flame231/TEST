package org.example.aop;


import org.springframework.aop.framework.ProxyFactory;

public class ProxyDemo {
    private static TransferService target;
    private static TransferService proxy;

    public static void init(){
        target = new TransferService();
        ProxyFactory proxyFactory = new ProxyFactory();
        proxyFactory.addAdvice(new Sniffer());
        proxyFactory.setTarget(target);
        proxy  = (TransferService) proxyFactory.getProxy();
    }

    public static void main(String[] args) {
        init();
        process(new TransferData());
        processProxy(new TransferData());

    }
    public static void process(TransferData data){
        target.print(data);
    }
    public static void processProxy(TransferData data){
        proxy.print(data);
    }
}
