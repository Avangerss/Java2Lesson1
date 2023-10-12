package ДЗ;

public class ChildClass1 extends ParentClass implements Printable {
    private int propertyChild1;

    public ChildClass1(String propertyParent, int propertyChild1) {
        super(propertyParent);
        this.propertyChild1 = propertyChild1;
    }

    public int getPropertyChild1() {
        return propertyChild1;
    }

    @Override
    public void print() {
        System.out.println("Вся информация о свойствах объекта ChildClass1: ");
        System.out.println("Свойство Родительского класса: " + getPropertyParent());
        System.out.println("Свойство ChildClass1: " + getPropertyChild1());
    }
}
