package Spittr.config;

import org.springframework.web.servlet.support.
        AbstractAnnotationConfigDispatcherServletInitializer;

import javax.servlet.MultipartConfigElement;
import javax.servlet.ServletRegistration;
import javax.servlet.annotation.MultipartConfig;

//set MAVEN_OPTS=-Xrunjdwp:transport=dt_socket,server=y,suspend=n,address=8000
//mvn tomcat7:run
//uses <warSourceDirectory> in pom.xml

public class SpittrWebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    //ContextLoaderListener = middle/Spittr.data tier backend
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[] {RootConfig.class};
    }

    //DispatcherServlet = Spittr.web components (controllers, views resolvers, handler mappings)
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[] {WebConfig.class};
    }

    @Override
    protected String[] getServletMappings() {
        return new String[] {"/"};
    }

    @Override
    protected void customizeRegistration(ServletRegistration.Dynamic registration) {
        registration.setMultipartConfig(new MultipartConfigElement("/tmp/spittr/uploads",2097152,4194304,0));
    }


}
