package unit2.static_factory_method;

public class Example {

    // 这个无参构造方法其实是不合适的，但为了返回子类将就一下
    public Example() {

    }

    public static Example getInstance() {
        return new Example();
    }

    public static Example getAnExample() {
        return new Example();
    }

    public static Example getSubExp() {
        return new SubExp();
    }

}
