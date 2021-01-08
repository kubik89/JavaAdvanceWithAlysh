//package org.example;
//
//import org.springframework.context.support.ClassPathXmlApplicationContext;
//
//public class TestSpringWithXMLCopy {
//    public static void main(String[] args) {
//// за допомогою ClassPathXmlApplicationContext ми отримуємо дані із xml який служить конфігураційним
//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
//                "applicationContext.xml"
//        );
//// вказуємо, що отримуємо дані із класу Music, а в лапках вказую id="" цього класу що в файлі
//// applicationContext.xml в тезі <bean> і кладу його в змінну
//// це старий метод за допомогою xml, де всі обєкти створюються вручну
//        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//
//        musicPlayer.playMusic();
//
//        System.out.println(musicPlayer.getName());
//        System.out.println(musicPlayer.getVolume());
//
//        Car car1 = context.getBean("car", Car.class);
//        Car car2 = context.getBean("car", Car.class);
//
//        car1.setEngine(20);
//        System.out.println(car1);
//        System.out.println(car2);
//
//        boolean compareCar = car1 == car2;
//        System.out.println(compareCar);
//
//        context.close();
//    }
//
//}
