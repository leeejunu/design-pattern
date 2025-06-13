package singleton;

public class Singleton {

    private static Singleton singleton = new Singleton();

    private Singleton() {}

    //서로 다른 스레드가 동시의 if 문의 접근했을 때 서로 다른 객체를 생성할 수 있는 문제가 발생함.
    private static Singleton getInstance() {
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }

}
