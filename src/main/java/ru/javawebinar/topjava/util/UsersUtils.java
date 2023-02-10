package ru.javawebinar.topjava.util;

import ru.javawebinar.topjava.model.Role;
import ru.javawebinar.topjava.model.User;

import java.util.Arrays;
import java.util.List;

public class UsersUtils {

    public static List<User> users = Arrays.asList(
            new User(1, "Admin", "admin@gmail.com", "111", Role.ADMIN, Role.USER),
            new User(2, "Albert", "gazin.albert@mail.ru", "222", Role.USER),
            new User(3, "Alina", "a.pirogova95@gmail.com", "333", Role.USER),
            new User(4, "Clark", "clark@gmail.com", "444", Role.USER),
            new User(5, "DraggsBonys", "draggsbony@gmail.com", "555", Role.USER),
            new User(6, "john", "machoman345@yandex.ru", "666", Role.USER),
            new User(7, "Liza", "chulkova_liza@mail.ru", "777", Role.USER),
            new User(8, "name", "name@mail.ru", "888", Role.USER),
            new User(9, "Sergey", "czar997@ya.ru", "999", Role.USER),
            new User(10, "STC", "crazytosser.ct@gmail.com	", "101010", Role.USER),
            new User(11, "string", "string@ma.ru", "111111", Role.USER),
            new User(12, "Tommy", "tommy@mail.com", "121212", Role.USER),
            new User(13, "User", "sobaka@gmail.com", "131313", Role.USER),
            new User(14, "User", "user@yandex.ru", "141414", Role.USER),
            new User(15, "user111", "111@ya.ru", "151515", Role.USER),
            new User(16, "Vasily", "df@vas.com", "161616", Role.USER),
            new User(17, "Vova", "vkokourov@gmail.com", "171717", Role.USER),
            new User(18, "Александрдр", "5erzhant@mail.ru", "181818", Role.USER),
            new User(19, "Анна Ветрова", "hg@mail.com", "191919", Role.USER),
            new User(20, "Антон", "anton_test@gmail.com", "202020", Role.USER),
            new User(21, "Бек", "tereggbg@mail.ru", "212121", Role.USER),
            new User(22, "Дон", "don@ya.ru", "222222", Role.USER),
            new User(23, "Дрюсо", "verygool@yandex.ru", "232323", Role.USER),
            new User(24, "Илья", "iculigin@yandex.ru", "242424", Role.USER),
            new User(25, "ОРЛАНДО", "genapolena931@yandex.ru", "252525", Role.USER),
            new User(26, "Попка", "user@mail.ru", "262626", Role.USER),
            new User(27, "Сергей", "videtskikh@yandex.ru", "272727", Role.USER),
            new User(28, "Эдуард Абдрахманов", "edikgagra@gmail.com", "282828", Role.USER),
            new User(29, "Юрий", "yri@mail.com", "292929", Role.USER),
            new User(30, "Юрий", "yrkash@gmail.com", "303030", Role.USER)
            );
}
