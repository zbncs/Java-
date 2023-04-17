package 泛型;

import java.util.ArrayList;
import java.util.List;

/**
 * <? extends T> 和 <? super T>
 * <? extends T>表示 ？必须是T或者T的子类，泛型的上限；
 * <? super T>表示? 必须是T或者T的父类，泛型的下限；
 *
 * PECS原则：
 *      <? extends T> 不能添加
 *      <? super T> 能添加，获取类型只能是Object
 */

public class 泛型通配符 {
    public static void main(String[] args) {
        // <? extends  Fruit>
        List<? extends  Fruit> list = new ArrayList<>();
        //list.add(new Apple());

        ArrayList<Apple> apples = new ArrayList<>();
        apples.add(new Apple());
        apples.add(new Apple());

        list = apples;

        Fruit fruit = list.get(0);
        System.out.println(fruit);

        // <? super Apple>
        ArrayList<Fruit> fruits = new ArrayList<>();
        fruits.add(new Apple());
        ArrayList<? super Apple> apples1 = fruits;
// 返回值是泛型的方法只会返回Object类型
        Object object = apples1.get(0);
// 但是添加没有问题, 可以添加的类型需要时apple及其子类
        apples1.add(new Apple());
// apples.add(new Fruit()); // 父类无法添加

    }
}

class Fruit {

}
class Apple extends Fruit {}
