package uz.music.components;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
@Component
public class RockMusic implements Music {
    public List<Details> album(){
        List<Details> album=new ArrayList<>();

        album.add(new Details("Jaloldin Ahmadaliyev - 19 yil ","https://www.youtube.com/embed/fIR4YF0_B6M"));
                album.add(new Details("Hamdam sobirov - Gavharim","https://www.youtube.com/embed/0cxfArXnw9c"));
                        album.add(new Details("imron  - seni bugun ko'rmasam bo'lmas","https://www.youtube.com/embed/mYEqMm4YPao"));
    return album;
    }
    @Override
    public Details music() {
        Random random=new Random();
        return album().get(random.nextInt(3));
    }
}
