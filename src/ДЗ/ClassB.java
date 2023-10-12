package ДЗ;

public class ClassB extends ClassA {
    private int propertyB;

    public ClassB(String propertyA, int propertyB) {
        super(propertyA);
        this.propertyB = propertyB;
    }

    public int getPropertyB() {
        return propertyB;
    }

    public void methodB() {
        System.out.println("Метод B из класса ClassB");
    }

    public final void methodC() {
        System.out.println("Неперезаписываемый метод C из класса ClassB");
    }
}
