package per.kyle.proxy._static;

public class ProxySubject implements ISubject {
    private ISubject subject;
    
    public ProxySubject(ISubject subject) {
        this.subject = subject;
    }

    @Override
    public void invoke() {
        before();
        subject.invoke();
        after();
    }

    private void before() {
        System.out.println("before");
    }

    private void after() {
        System.out.println("after");
    }
}