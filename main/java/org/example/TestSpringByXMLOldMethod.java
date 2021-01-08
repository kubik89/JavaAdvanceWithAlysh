//package org.example;
//
//import org.springframework.context.support.ClassPathXmlApplicationContext;
//
//public class TestSpringByXMLOldMethod {
//    public static void main(String[] args) {
//// за допомогою ClassPathXmlApplicationContext ми отримуємо дані із xml який служить конфігураційним
//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
//                "applicationContext.xml"
//        );
//// вказуємо, що отримуємо дані із класу Music, а в лапках вказую id="" цього класу що в файлі
//// applicationContext.xml в тезі <bean> і кладу його в змінну
//// це старий метод за допомогою xml, де всі обєкти створюються вручну
//        Music music = context.getBean("musicBean", Music.class);
//
//        MusicPlayer musicPlayer = new MusicPlayer(music);
//        musicPlayer.playMusic();
//
//        context.close();
//    }
//
//}
