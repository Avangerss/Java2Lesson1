package ДЗ;

public class ChildClass3 extends ParentClass implements Printable {
    private boolean propertyChild3;

    public ChildClass3(String propertyParent, boolean propertyChild3) {
        super(propertyParent);
        this.propertyChild3 = propertyChild3;
    }

    public boolean isPropertyChild3() {
        return propertyChild3;
    }

    @Override
    public void print() {
        System.out.println("Вся информация о свойствах объекта ChildClass3: ");
        System.out.println("Свойство Родительского класса: " + getPropertyParent());
        System.out.println("Свойство ChildClass3: " + isPropertyChild3());
    }
}
