package org.color;

import org.springframework.context.annotation.*;

import java.awt.*;

@Configuration
@ComponentScan(basePackages = "org.color")
public class Config {
    @Bean
    public Color color() {
        return new Color(255,0,0);
    }

    public static void main(String[] args) throws InterruptedException {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

        for (int i = 0; i <= 50; i++) {
            if (i == 50) {
                new SpecialFrame();
            } else {
                new ColorFrame(context.getBean(Color.class));
            }
            Thread.sleep(50);
        }
    }
}
