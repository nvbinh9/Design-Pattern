package creational;

public class Singleton {

    private static Singleton singleton;

    private Singleton() {};

    public static Singleton getInstance() {
        if (singleton == null) {
            synchronized(Singleton.class) {
                if(singleton == null) {
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }
}

class Entry {
    public static void main(String [] arg) {
        Singleton singleton = Singleton.getInstance();
        Singleton singleton1 = Singleton.getInstance();
        System.out.println(singleton.toString());
        System.out.println(singleton1.toString());
    }
}
