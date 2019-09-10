package singleton;

public class SingletonNull {

    private SingletonNull(){}
    //懒汉模式
    private static SingletonNull instance = null;

    //volatitle修饰符阻止了变量访问前后的指令重拍
    private volatile static SingletonNull instanceVolatitle = null;

    //非线程安全
    /*
    public static SingletonNull getInstance() {
        if (instance == null) {
            instance = new SingletonNull();
        }
        return instance;
    }*/

    //线程安全
    public static SingletonNull getInstance() {
        if (instance == null) {
            synchronized (SingletonNull.class) {
                if (instance == null) {
                    instance = new SingletonNull();
                }
            }
        }
        return instance;
    }

}
