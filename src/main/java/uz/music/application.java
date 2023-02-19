package uz.music;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import uz.music.components.Details;
import uz.music.components.Janr;
import uz.music.components.MusicPlayer;
import uz.music.configuration.BeanConfiguration;
import uz.music.configuration.MusicConfiguration;

public class application {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(BeanConfiguration.class);
        MusicPlayer player=context.getBean(MusicPlayer.class);
        Details music=player.musicPlayer(Janr.ROCK);
        System.out.println(music.getName()+" : "+music.getImg());
        context.close();



    }
}
