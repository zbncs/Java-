package OOP面向对象;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Comparable接口实现在自身类中，代表默认排序，相当于内部比较器；
 * 而Comparator接口则是为类外实现的一个比较器，相当于外部比较器。
 */

public class 排序comparable和comparator {
    public static void main(String[] args) {
        User u = new User("zhang", 18);
        User u1 = new User("zhang1", 25);
        User u2 = new User("zhang2", 21);
        User u3 = new User("zhang3", 20);

        ArrayList<User> users = new ArrayList<>();

        users.add(u);
        users.add(u1);
        users.add(u2);
        users.add(u3);

//        Collections.sort(users);
//
//        for (User user : users) {
//            System.out.println(user.age);
//        }

        System.out.println("===========比较器排序===============");
        Collections.sort(users, new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                if (o1.getAge() != o2.getAge()) {
                    return o1.getAge() - o2.getAge();
                }
                return o1.getName().compareTo(o2.getName());
            }
        });

        for (User user : users) {
            System.out.println(user.age);
        }
    }

    static class User implements Comparable<User> {
        private String name;
        private Integer age;

        @Override
        public int compareTo(User o) {
            if (o.age != this.getAge()) {
                return this.getAge() - o.getAge();
            }

            return this.getName().compareTo(o.getName());
        }

        public User() {
        }

        public User(String name, Integer age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Integer getAge() {
            return age;
        }

        public void setAge(Integer age) {
            this.age = age;
        }
    }
}
