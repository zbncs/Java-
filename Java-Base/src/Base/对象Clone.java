package Base;

/**
 * 对象的Clone：
 *      被克隆的对象必须实现Cloneable接口，重写Clone方法，方法中调用super.clone();
 */
public class 对象Clone {
    public static void main(String[] args) throws CloneNotSupportedException {

        Person p = new Person("小明", 18);
        Person p1 = (Person) p.clone();

        // p 和 p1 地址不同，实现了克隆；
        System.out.println(p);
        System.out.println(p1);

    }

    static class Person implements Cloneable {
        private String name;
        private Integer age;
        @Override
        protected Object clone() throws CloneNotSupportedException {
            // 必须有这行代码
            return super.clone();
        }

        public Person(String name, Integer age) {
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
