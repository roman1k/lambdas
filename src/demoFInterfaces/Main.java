package demoFInterfaces;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {


        Calculator calculator = new Calculator() {
            @Override
            public void calcluate(int a, int b) {
                System.out.println(a+b);
            }
        };
        calculator.calcluate(90,90);

        Calculator calculator1 = (a, b) -> {
            System.out.println(a+b);
        };

        List<User> users = new ArrayList<>();

        users.add(new User(1, "Oleg", true));
        users.add(new User(2, "Vasya", false));
        users.add(new User(3, "jonh", true));
        users.add(new User(4, "Olya", true));
        users.add(new User(5, "maryna", true));
        users.add(new User(6, "Marta", true));
        users.add(new User(6, "Marta", true));

//        Stream<User> stream = users.stream();
//        Stream<User> distinct = stream.distinct();
//        List<User> collect = distinct.collect(Collectors.toList());
//        System.out.println(collect);

        List<User> userList = users
                .stream()
                .distinct()
                .filter(user -> user.isStatus())
                .filter(user -> user.getId()%2==0)
                .filter(user -> user.getName().length()>3)
                .sorted((o1, o2) -> o2.getId() - o1.getId())
                .collect(Collectors.toList());

        System.out.println(userList);

         Map<Integer, String> map = userList.stream().collect(
                 Collectors.toMap(
                         user -> user.getId(),
                         user -> user.getName()
                 ));
        System.out.println(map);


    }
}
