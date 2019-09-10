package singleton;

public class Singleton {

    //饿汉模式
    private static Singleton singleton = new Singleton();
    private Singleton() {
        System.out.println("生成一个实例");
    }

    public static Singleton getSingleton(){
        return singleton;
    }

}
