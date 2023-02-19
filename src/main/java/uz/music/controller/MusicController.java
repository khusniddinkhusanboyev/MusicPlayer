package uz.music.controller;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import uz.music.components.*;
import uz.music.configuration.BeanConfiguration;
import uz.music.configuration.MusicConfiguration;

@Controller
public class MusicController {
    public Details musicPlayer(Janr janr){
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(BeanConfiguration.class);
        MusicPlayer player=context.getBean(MusicPlayer.class);
        Details music=player.musicPlayer(janr);
        context.close();
        return music;

    }
    @GetMapping("/music")
    public String musicPlayer(@RequestParam("janr") Janr janr, Model model){
        model.addAttribute("music",musicPlayer(janr));
        return "music/music";
    }


}
