package itc.hoseo.soolfarm.config;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import itc.hoseo.soolfarm.converter.StringDateConverter;

@Configuration
public class WebMvcConfig implements WebMvcConfigurer{

	@Autowired
	Environment env;
	
	@Override
	public void addFormatters(FormatterRegistry registry) {
		registry.addConverter(new StringDateConverter());
	}
	
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		Path uploadDir = Paths.get(env.getProperty("soolfarm.imgupload"));
		if(Files.exists(uploadDir) == false) {
			try {
				Files.createDirectory(uploadDir);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		//WebMvcConfigurer.super.addResourceHandlers(registry);
		registry.addResourceHandler("img/goods/**")
			.addResourceLocations("classpath:/static/img/goods/",
					"file:///" + env.getProperty("soolfarm.imgupload"));
	}
}
