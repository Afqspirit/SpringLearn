package ru.afqspirit.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class TestSpring {
    public static void main(String[] args){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        //Music music = context.getBean("musicBean",Music.class) ;

       // MusicPlayer musicPlayer = new MusicPlayer(music);
        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        musicPlayer.playMusic();



        context.close();
      //  System.out.println(testBean.getName()+", ты избранный!");
    }

}
