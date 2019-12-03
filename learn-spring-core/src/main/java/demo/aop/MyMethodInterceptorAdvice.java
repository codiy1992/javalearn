package demo.aop;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * @author codiy
 */
public class MyMethodInterceptorAdvice implements MethodInterceptor {

    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        System.out.println("环绕通知:........ 调用了" + invocation.getMethod() + "方法, 准备执行具体过程.........");
        invocation.proceed();
        System.out.println("环绕通知:........ "+ invocation.getMethod() +"方法处理完毕, 准备return.........");
        return null;
    }
}
