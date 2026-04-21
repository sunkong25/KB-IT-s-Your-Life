package ch07.abstract_;

public class AbstractMain extends AbstractTest{
    //자식 클래스는 반드시 추상메서드를 Override
    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        AbstractTest at = new AbstractMain();
        at.setName("홍길동");
        System.out.println(at.getName());
    }
}
