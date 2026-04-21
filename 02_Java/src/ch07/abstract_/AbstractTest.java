package ch07.abstract_;

public abstract class AbstractTest {
    String name;

    public abstract void setName(String name); //추상메서드

    public String getName() {
        return name;
    }
}