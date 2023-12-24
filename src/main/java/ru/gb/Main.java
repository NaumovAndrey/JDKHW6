package ru.gb;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        //1 способ
//       PlainInterface plainInterface = new PlainInterface() {
//           @Override
//           public String action(int x, int y) {
//               return String.valueOf(x + y);
//           }
//       };
        //2 способ лямда выражение
        //Интеофейс имеет только одно переопределение (является фунциональным)
//        PlainInterface plainInterface = (x, y) -> String.valueOf(x + y);
//
//
//        PlainInterface plainInterface1 = (x, y) -> String.valueOf(Integer.compare(x, y)); //сравнение двух чисел

//        PlainInterface plainInterface = Integer::sum;
//        PlainInterface plainInterface1 = Integer::compare; //сравнение двух чисел
//
//
//        System.out.println(plainInterface.action(5, 8));
//        System.out.println(plainInterface1.action(4, 9));


//        List<String> list = Arrays.asList("Привет", "мир", "я", "учусь", "программировать");
//        list = list.stream().filter(str -> str.length() > 4).collect(Collectors.toList());
//
//        for (String item: list) {
//            System.out.println(item);
//        }

//        List<String> list = Arrays.asList("Привет", "мир", "я", "учусь", "программировать");
//        list.stream().filter(str -> str.length() > 4).forEach(System.out::println);


//        List<String> list = Arrays.asList("Привет", "мир", "я", "учусь", "программировать");
//        list.stream().filter(str -> str.length() > 4).filter(s -> s.contains("о")).forEach(System.out::println);

//        Arrays.asList(8, 2, 25, 4, 5).stream().map(n -> "число: " + n + " квадрат числа " + n * n).forEach(System.out::println);

//        Arrays.asList(8, 2, 25, 0, 5).stream().sorted().forEach(System.out::println);

//        Arrays.asList(8, 2, 25, 0, 5, 5, 25).stream().sorted().distinct().forEach(System.out::println);

//        System.out.println(Arrays.asList(8, 2, 25, 0, 5, 5, 25).stream().sorted().distinct().findFirst().get());


        List<User> user = Arrays.asList(
                new User("Андрей", 41),
                new User("Алёна", 35),
                new User("Анна", 14)
        );

        user.stream().map(us -> new User(us.name, us.age - 5)).filter(us -> us.age <= 18).forEach(System.out::println);
    }
}