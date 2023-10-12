import java.awt.Color;

final public class Dog extends Pet  {
    private String name;
    private String breed;

    public Dog(String name) {
        super();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getCommands() {
        return commands;
    }

    public void setCommands(String commands) {
        this.commands = commands;
    }

    private String commands;

    public Dog(String name, String breed, String commands) {
        this.name = name;
        this.breed = breed;
        this.commands = commands;
    }

    public Dog(String name, String breed, Color color, Shelter shelter) {
        this.name = name;
        this.breed = breed;

    }

    public Dog(String name, String breed, String color, String shelter, String commands) {
        this.name = name;
        this.breed = breed;
        this.commands = commands;
    }

    public void printInfo() {
        System.out.println("Имя: " + name);
        System.out.println("Порода: " + breed);
        System.out.println("Команды: " + commands);


    }
    public void bark() {
        System.out.println(name + ": Woof woof woof!");
    }

    public void makeVoice() {
        System.out.println(name + ": Woof woof woof!");
    }

    public void makeVoice(int numberOfBarks) {
        for (int i = 0; i < numberOfBarks; i++) {
            System.out.print("Woof ");
        }
        System.out.println();
    }

    public void makeVoice(String sound) {
        System.out.println(name + ": " + sound);
    }
}
