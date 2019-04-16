package per.kyle.proxy._static;

public class RealSubject implements ISubject {
    @Override
    public void invoke() {
        System.out.println("Hello");
    }
}