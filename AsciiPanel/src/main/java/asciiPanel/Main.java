package asciiPanel;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Main.class);
        AsciiPanel asciiPanel = context.getBean(AsciiPanel.class);
        System.out.println(asciiPanel.getAsciiFont().getFontFilename());
        System.out.println(asciiPanel.getAsciiFont().getWidth());
        System.out.println(asciiPanel.getAsciiFont().getHeight());
    }
}
