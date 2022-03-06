package asciiPanel;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Main {

    @Bean
    public AsciiFont asciiFont() {
        return new AsciiFont("cp437_8x8.png", 8, 8);
    }

    @Bean
    public AsciiPanel asciiPanel() {
        return new AsciiPanel();
    }
    
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Main.class);
        AsciiPanel asciiPanel = context.getBean(AsciiPanel.class);
        System.out.println(asciiPanel.getAsciiFont().getFontFilename());
        System.out.println(asciiPanel.getAsciiFont().getWidth());
        System.out.println(asciiPanel.getAsciiFont().getHeight());
    }
}
