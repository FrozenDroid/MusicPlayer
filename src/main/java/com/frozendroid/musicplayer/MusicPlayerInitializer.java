package com.frozendroid.musicplayer;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

@EnableWebMvc
@Configuration
@ComponentScan
public class MusicPlayer implements WebApplicationInitializer {

    @Override
    public void onStartup(ServletContext servlet) throws ServletException {
        AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();

    }
}
