package per.kyle.proxy;

public class TestProxy {

    @Test
    public void testStaticProxy() {
        RealSubject realSubject = new RealSubject();
        ProxySubject proxySubject = new ProxySubject(realSubject);
        proxySubject.invoke();
    }
}
