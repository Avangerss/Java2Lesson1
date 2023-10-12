package ДЗ;

public class ChildClass2 extends ParentClass implements Printable {
    private double propertyChild2;

    public ChildClass2(String propertyParent, double propertyChild2) {
        super(propertyParent);
        this.propertyChild2 = propertyChild2;
    }

    public double getPropertyChild2() {
        return propertyChild2;
    }

    @Override
    public void print() {
        System.out.println("Вся информация о свойствах объекта ChildClass2: ");
        System.out.println("Свойство Родительского класса: " + getPropertyParent());
        System.out.println("Свойство ChildClass2: " + getPropertyChild2());
    }
}
