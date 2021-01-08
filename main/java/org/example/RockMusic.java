package org.example;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class RockMusic implements Music{

    private List<String> rockMusicList = new ArrayList<>();

    {
        rockMusicList.add("RockMusic - 1");
        rockMusicList.add("RockMusic - 2");
        rockMusicList.add("RockMusic - 3");
    }

    public void doMyInit() {
        System.out.println("doMyInit method for RockMusic class started");
    }

    public void doMyDestroy() {
        System.out.println("doMyDestroy method for RockMusic class started");
    }

    @Override
    public List<String> getSongs() {
        return rockMusicList;
    }
}
