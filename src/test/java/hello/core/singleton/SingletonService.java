package hello.core.singleton;

public class SingletonService {

    // 1. static 영역에 객체를 딱 1개만 생성
    private static final SingletonService instance = new SingletonService();

    //2. public으로 열어 객체 인스턴스가 필요할 시 이 메소드를 통해서만 조회하도록.
    public static SingletonService getInstance(){
        return instance;
    }

    //3. 생성자 private 으로 선언해서 외부에서 new 키워드를 통해 객체 생성하는 것을 막는다.
    private SingletonService(){
    }
}

