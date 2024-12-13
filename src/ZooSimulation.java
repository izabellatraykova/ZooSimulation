public class ZooSimulation {
    public static void main(String[] args) {
        Habitat rainforest = new Habitat("Rain Forest", 100.9,21.3);
        Habitat desert = new Habitat("Desert", 356.2,34.3);
        Habitat savannah = new Habitat("Savannah", 60.5,25.7);
        Habitat mountain = new Habitat("Mountain Forest", 243.9,17.5);
        Zoo zoo = new Zoo();
        zoo.addAnimal1("Tiger", "tiger", 5, rainforest);
        zoo.addAnimal2("Yore", "Donkey", 9, desert);
        zoo.addAnimal3("Piglet", "pig", 3, savannah);
        zoo.addAnimal4("Winnie", "bear", 6, mountain);
        Staff bella = new Staff("Bella", "Zookeeper", rainforest);
        Staff eliza = new Staff("Eliza", "Zookeeper", desert);
        bella.assignStaff(mountain);
    }
}
class Animal{
    private String name;
    private String species;
    private int age;
    Habitat habitat;

    public Animal(String name, String species, int age, Habitat habitat){
        this.name = name;
        this.species = species;
        this.age = age;
        this.habitat = habitat;
    }
}

class Habitat{
    private String type;
    private double size;
    private double temperature;

    public Habitat(String type, double size, double temperature){
        this.type = type;
        this.size = size;
        this.temperature = temperature;
    }
}

class Zoo{
    Animal a1;
    Animal a2;
    Animal a3;
    Animal a4;

    void addAnimal1(String name, String species, int age, Habitat habitat){
        a1 = new Animal(name, species, age, habitat);
    }
    void addAnimal2(String name, String species, int age, Habitat habitat){
        a2 = new Animal(name, species, age, habitat);
    }
    void addAnimal3(String name, String species, int age, Habitat habitat){
        a3 = new Animal(name, species, age, habitat);
    }
    void addAnimal4(String name, String species, int age, Habitat habitat){
        a4 = new Animal(name, species, age, habitat);
    }
}
class Staff{
    private String name;
    private String role;
    private Habitat assignedHabitat;
    public Staff(String name, String role, Habitat assignedHabitat){
        this.name = name;
        this.role = role;
        this.assignedHabitat = assignedHabitat;
    }
    public void assignStaff(Habitat habitat){
        assignedHabitat = habitat;
        System.out.println(name + " is assigned to habitat named " + habitat);
    }
}