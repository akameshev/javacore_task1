package simple;

import regular.Decorator;
import regular.OtherClass;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int result = OtherClass.add(2,2);
        System.out.println(Decorator.decorate(result));
        result = OtherClass.div(3,3);
        System.out.println(Decorator.decorate(result));
        result = OtherClass.mul(3,3);
        System.out.println(Decorator.decorate(result));
        result = OtherClass.mod(8,3);
        System.out.println(Decorator.decorate(result));
        result = OtherClass.sub(8,5);
        System.out.println(Decorator.decorate(result));
    }

}
