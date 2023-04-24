package Base;

public class 对象Clone {
    public static void main(String[] args) {

    }

    static class ObjClone implements Cloneable {
        @Override
        protected Object clone() throws CloneNotSupportedException {
            return super.clone();
        }
    }
}
