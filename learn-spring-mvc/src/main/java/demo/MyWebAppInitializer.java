package demo;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * @author codiy
 * 底层继承至Servlet的ServletContainerInitializer进行Servlet初始化工作
 * 会同时创建DispatcherServlet 和 ContextLoaderListener
 */
public class MyWebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    /**
     * 将获得的路径映射到DispatcherServlet上
     * @return
     */
    @Override
    protected String[] getServletMappings() {
        return new String[] { "/" };
    }

    /**
     * 返回带有@Configuration注解的类,将会用来定义DispatcherServlet应用上下文中的bean
     * @return
     */
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class<?>[] {RootConfig.class};
    }

    /**
     * 返回带有@Configuration注解的类,用来配置ContextLoaderListener创建的应用上下文的bean
     * @return
     */
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class<?>[] {WebConfig.class};
    }

}