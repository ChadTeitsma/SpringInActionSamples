package Spittr.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

//mvn tomcat7:run
//uses <warSourceDirectory> in pom.xml

public class SpittrWebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    //ContextLoaderListener = middle/ tier backend
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[] {RootConfig.class};
    }

    //DispatcherServlet = web components (controllers, views resolvers, handler mappings)
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[] {WebConfig.class};
    }

    @Override
    protected String[] getServletMappings() {
        return new String[] {"/"};
    }
}
