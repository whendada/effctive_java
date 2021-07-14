package unit2.static_factory_method;

import java.util.HashMap;
import java.util.Map;

/**
 * 1. 序：什么是静态工厂方法
 *    不通过 new 用一个静态方法来对外提供自身实例的方法，即为我们所说的静态工厂方法(Static factory method)。
 *
 * 2.1 静态工厂方法与构造器不同的第一优势在于，它们有名字
 * 2.2 第二个优势，不用每次被调用时都创建新对象
 * 2.3 第三个优势，可以返回原返回类型的子类
 * 2.4 第四个优势，在创建带泛型的实例时，能使代码变得简洁
 *
 * 除此之外
 * 3.1 可以有多个参数相同但名称不同的工厂方法
 * 3.2 可以减少对外暴露的属性
 * 3.3 多了一层控制，方便统一修改
 */
class StaticFactoryMethod {

    /**
     * 2.1、他们有名字
     */
    Example example = Example.getAnExample();

    /**
     * 2.2、不用每次被调用时都创建新对象
     * 参考单例模式的写法，这就是静态工厂
     */
    Example instance = Example.getInstance();

    /**
     * 2.3、可以返回原返回类型的子类
     */
    Example sub = Example.getSubExp();

    /**
     * 2.4 在创建带泛型的实例时，能使代码变得简洁
     * 例如 HashMap
     */
    Map<Integer, String> map = new HashMap<>();
}
