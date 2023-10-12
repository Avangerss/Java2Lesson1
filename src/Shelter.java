public class Shelter {
    public void setName(String name) {
        this.name = name;
    }

    private String name;
    private String adress;


    public Shelter(String name, String adress) {
        this.name = name;
        this.adress = adress;
    }

    public String getName() {
        return name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public void printInfo() {
        System.out.println("Имя: " + name);
        System.out.println("Приют: " + adress);

    }
}


