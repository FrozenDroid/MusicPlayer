package com.frozendroid.musicplayer;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

public class MusicPlayerInitializer implements WebApplicationInitializer {

    @Override
    public void onStartup(ServletContext servletContainer) throws ServletException {
        AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
        context.register(MusicPlayerConfiguration.class);
        context.setServletContext(servletContainer);

        ServletRegistration.Dynamic servlet = servletContainer.addServlet(
                "dispatcher", new DispatcherServlet(context)
        );
        servlet.setLoadOnStartup(1);
        servlet.addMapping("/");
    }
}
