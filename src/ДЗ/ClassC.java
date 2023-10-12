package ДЗ;

public final class ClassC extends ClassB {
    private EnumType propertyC;

    public ClassC(String propertyA, int propertyB, EnumType propertyC) {
        super(propertyA, propertyB);
        this.propertyC = propertyC;
    }

    public EnumType getPropertyC() {
        return propertyC;
    }

    @Override
    public void methodB() {
        System.out.println("Перезаписанный метод B из класса ClassC");
    }
}