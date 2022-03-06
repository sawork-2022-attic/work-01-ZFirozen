package asciiPanel;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AsciiConfig {

    @Bean
    public AsciiFont asciiFont() {
        return new AsciiFont("cp437_8x8.png", 8, 8);
    }

    @Bean
    public AsciiPanel asciiPanel() {
        return new AsciiPanel();
    }
}
