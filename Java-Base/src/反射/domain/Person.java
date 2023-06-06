package 反射.domain;

public class Person {
    private String name;
    private Integer age;
    public String hhh;

    public String getHhh() {
        return hhh;
    }

    public void setHhh(String hhh) {
        this.hhh = hhh;
    }

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
        System.out.println("有参构造");
    }

    private void privateMethod() {
        System.out.println("私有方法");
    }

    public Person() {
        System.out.println("无参构造");
    }

    public void show() {
        System.out.println("show");
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
