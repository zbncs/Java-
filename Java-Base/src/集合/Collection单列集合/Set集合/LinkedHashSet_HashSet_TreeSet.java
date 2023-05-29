package 集合.Collection单列集合.Set集合;

import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

/**
 * Set集合：无序，无索引，不重复
 *
 * ArrayList集合判断相等（包含，删除对象）使用的是equals；
 * HashSet集合使用时equals 和 hashcode；
 *
 *  HashSet：哈希表结构，增删改查性能都可以，
 *          字符串 :  它本身就重写了Hashcode和equals方法,保证键的唯一；
 *          自定义对象 :   需要重写hashcode和equals方法
 *
 *  TreeSet：可以对Set集合元素进行排序
 *         比较字符串:    本身重写了hashcode和equals方法
 *         比较自定义对象:    自然排序  比较器排序
 *
 *  LinkedHashSet：有序，链表和哈希表实现
 *
 *  哈希表判断元素是否相等
 *         先判断哈希值(Hashcode)，哈希值相等再判断内容(equals)。
 *
 */

public class LinkedHashSet_HashSet_TreeSet {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        TreeSet<String> treeSet = new TreeSet<>();

        System.out.println("==========HashSet===============");
        hashSet.add("zhang");
        hashSet.add("li");
        hashSet.add("ma");
        hashSet.add("ma");

       for (String s : hashSet) {
           System.out.println(s);
       }

        System.out.println("==========TreeSet===============");
        treeSet.add("cdef");
        treeSet.add("abcd");
        treeSet.add("bcde");

        for (String s : treeSet) {
            System.out.println(s);
        }

        System.out.println("==========TreeSet存入自定义对象===============");

        class Person {
            private String name;
            private Integer age;

            Person(String name, Integer age) {
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

        TreeSet<Person> people = new TreeSet<>(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                if (o1.getAge() == o2.getAge()) {
                    return o1.getName().compareTo(o2.getName());
                }
                return o1.getAge() - o2.getAge();
            }
        });
        people.add(new Person("lisi", 18));
        people.add(new Person("lisi1", 19));
        people.add(new Person("lisi2", 20));

        for (Person s : people) {
            System.out.println(s.getName() + " : " + s.getAge());
        }


        System.out.println("==========HashSet===============");


        System.out.println("==========HashSet===============");

    }
}
