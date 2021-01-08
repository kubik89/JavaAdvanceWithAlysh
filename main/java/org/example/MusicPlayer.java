package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import java.util.ArrayList;
import java.util.List;


@Data

@Component
public class MusicPlayer {
    private List<Music> musicList = new ArrayList<>();
    private Music music;
    private Music music1;
    private Music music2;
    private String name;
    private int volume;

    public MusicPlayer() {
    }

    @Autowired
    public MusicPlayer(@Qualifier("rockMusic") Music music1,
                       @Qualifier("classicalMusicBean") Music music2) {
        this.music1 = music1;
        this.music2 = music2;
    }

//    public MusicPlayer(Music music) {
//        this.music = music;
//    }
//
//    public MusicPlayer(List<Music> musicList) {
//        this.musicList = musicList;
//    }

    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }

    public void playMusic(MusicGanres ganre) {
        if (ganre == MusicGanres.ROCK) {
            int i = (int) (Math.random() * (music1.getSongs().size()));
            System.out.println(music1.getSongs().get(i));
        } else {
            int i = (int) (Math.random() * (music2.getSongs().size()));
            System.out.println(music2.getSongs().get(i));
        }
    }

//    public void setMusic(Music music) {
//        this.music = music;
//    }
}
