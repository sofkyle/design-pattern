package per.kyle.proxy.cglib;

import java.awt.image.SampleModel;
import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

/**
 * CglibSample
 */
public class CglibSample {

    public void test() {
        System.out.println("hello world");
    }

    public static void main(String[] args) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(CglibSample.class);
        enhancer.setCallback(new MethodInterceptor() {

            @Override
			public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
                System.out.println("before method run");
                Object result = proxy.invokeSuper(obj, args);
                System.out.println("after method run");
                return result;
			}

        });

        CglibSample cglibSample = (CglibSample) enhancer.create();
        cglibSample.test();
    }
}