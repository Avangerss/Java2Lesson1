import ДЗ.*;

public class Main {
    public static void main(String[] args) {


        Dog dog1 = new Dog("Туз", "Хаски", "Дать Лапу");
        Dog dog2 = new Dog("Бобик", "Дворняга", "Серый", "Пушкина", "Лежать" );
        Dog dog3 = new Dog("Рекс", "Овчарка", "Черный", "Гоголь", "Сидеть" );


        ClassB objectA = new ClassB("Property A", 10);
        ClassC objectB = new ClassC("Property A", 20, EnumType.TYPE1);
        ClassC objectC = new ClassC("Property A", 30, EnumType.TYPE2);


        Printable object1 = createObject("ChildClass1");
        Printable object2 = createObject("ChildClass2");
        Printable object3 = createObject("ChildClass3");

        dog1.printInfo();
        dog1.bark();
        dog1.makeVoice();

        System.out.println();

        dog2.printInfo();
        dog2.bark();
        dog2.makeVoice();

        System.out.println("  ");

        dog3.printInfo();
        dog3.bark();
        dog3.makeVoice("Bow wow!");


        System.out.println("Свойства объекта objectA:");
        System.out.println("PropertyA: " + objectA.getPropertyA());
        System.out.println("PropertyB: " + objectA.getPropertyB());

        objectA.methodB();
        objectA.methodC();

        System.out.println("Свойства объекта objectB:");
        System.out.println("PropertyA: " + objectB.getPropertyA());
        System.out.println("PropertyB: " + objectB.getPropertyB());
        System.out.println("PropertyC: " + objectB.getPropertyC());

        objectB.methodB();
        objectB.methodC();

        System.out.println("Свойства объекта objectC:");
        System.out.println("PropertyA: " + objectC.getPropertyA());
        System.out.println("PropertyB: " + objectC.getPropertyB());
        System.out.println("PropertyC: " + objectC.getPropertyC());

        objectC.methodB();
        objectC.methodC();

        object1.print();
        object2.print();
        object3.print();
    }

        public static Printable createObject (String className){
            switch (className) {
                case "ChildClass1":
                    ChildClass1 object1 = new ChildClass1("Родительское свойство 1", 1);
                    return object1;
                case "ChildClass2":
                    ChildClass2 object2 = new ChildClass2("Родительское свойство 2", 3.14);
                    return object2;
                case "ChildClass3":
                    ChildClass3 object3 = new ChildClass3("Родительское свойство 3", true);
                    return object3;
                default:
                    System.out.println("Некорректное имя класса!");
                    return null;
            }
        }
    }
