package edu.wctc;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        for (int i = 0; i < 5; i++) {
            PrototypeBean pb = context.getBean(PrototypeBean.class);
            System.out.println(pb.hashCode());
        }

        for (int i = 0; i < 5; i++) {
            SingletonBean sb = context.getBean(SingletonBean.class);
            System.out.println(sb.hashCode());
        }
    }
}