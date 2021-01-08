package org.example;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component("classicalMusicBean")
public class ClassicalMusic implements Music{

    private List<String> classicalMusicList = new ArrayList<>();

    {
        classicalMusicList.add("ClassicalMusic - 1");
        classicalMusicList.add("ClassicalMusic - 2");
        classicalMusicList.add("ClassicalMusic - 3");
    }

    public void doMyInit() {
        System.out.println("doMyInit method for ClassicalMusic class started");
    }

    public void doMyDestroy() {
        System.out.println("doMyDestroy method for ClassicalMusic class started");
    }

//    @Override
//    public String getSong() {
//        return "Classical music-1 ";
//    }

    @Override
    public List<String> getSongs() {
        return classicalMusicList;
    }
}
