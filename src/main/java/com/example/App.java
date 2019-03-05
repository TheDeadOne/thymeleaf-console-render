package com.example;

import java.io.StringWriter;

import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;
import org.thymeleaf.templateresolver.ClassLoaderTemplateResolver;

public class App {
    public static void main(String[] args) {
        TemplateEngine templateEngine = new TemplateEngine();
        ClassLoaderTemplateResolver templateResolver = new ClassLoaderTemplateResolver();
        templateResolver.setTemplateMode("HTML");
        templateEngine.setTemplateResolver(templateResolver);
        Context context = new Context();
        context.setVariable("h1", "Hello");
        context.setVariable("h2", "World");
        StringWriter stringWriter = new StringWriter();
        templateEngine.process("test.html", context, stringWriter);
        System.out.println(stringWriter.toString());
    }
}
