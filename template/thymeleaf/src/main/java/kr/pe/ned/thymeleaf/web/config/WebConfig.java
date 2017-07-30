package kr.pe.ned.thymeleaf.web.config;

import nz.net.ultraq.thymeleaf.LayoutDialect;
import nz.net.ultraq.thymeleaf.decorators.strategies.GroupingStrategy;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Description;
import org.springframework.web.context.ServletContextAware;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;
import org.thymeleaf.spring4.SpringTemplateEngine;
import org.thymeleaf.spring4.view.ThymeleafViewResolver;
import org.thymeleaf.templateresolver.ServletContextTemplateResolver;

import javax.servlet.ServletContext;
import java.util.Locale;


/**
 * using multi properties files
 * http://nixmash.com/post/multiple-module-application-properties-files-in-spring-boot
 *
 */
@Configurable
//@PropertySource({
//        "classpath:messages.properties"
//})
//@ComponentScan(
//        basePackages = {"kr.pe.ned.thymeleaf.web.controller"},
//        includeFilters = {@ComponentScan.Filter(value = Controller.class, type = FilterType.ANNOTATION)}
//)
public class WebConfig extends WebMvcConfigurerAdapter {

    @Bean
    public LocaleResolver localeResolver() {
        SessionLocaleResolver slr = new SessionLocaleResolver();
        slr.setDefaultLocale(Locale.US);
        return slr;
    }

    @Bean
    public LocaleChangeInterceptor localeChangeInterceptor() {
        LocaleChangeInterceptor localeChangeInterceptor = new LocaleChangeInterceptor();
        localeChangeInterceptor.setParamName("lang");
        return localeChangeInterceptor;
    }

//    @Override
//    public void addFormatters(final FormatterRegistry registry) {
//        super.addFormatters(registry);
//        registry.addFormatter(varietyFormatter());
//        registry.addFormatter(dateFormatter());
//    }

//    @Bean
//    public DateFormatter dateFormatter() {
//        return new DateFormatter();
//    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(localeChangeInterceptor());
    }

}
