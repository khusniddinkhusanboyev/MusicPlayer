package uz.music.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import uz.music.components.ClassicalMusic;
import uz.music.components.MusicPlayer;
import uz.music.components.RockMusic;

@Configuration
@ComponentScan("uz.music.components")
public class BeanConfiguration {
    //Music Beans
    @Bean
    public RockMusic rockMusic(){
        return new RockMusic();
    }
    @Bean
    public ClassicalMusic classicalMusic(){
        return new ClassicalMusic();
    }
    @Bean
    public MusicPlayer musicPlayer(){
        return new MusicPlayer(rockMusic(),classicalMusic());
    }
}
