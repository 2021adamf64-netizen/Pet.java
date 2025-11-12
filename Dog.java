import java.util.Random;
public class Dog {

    // ===========================
    // Instance Variables
    // ===========================
    private String petID;
    private String type;
    private int age;
    private double height;
    private double weight;
    private double barkVolume;
    private double growlVolume;
    private boolean catChaser;

    // ===========================
    // Static Variable
    // ===========================
    private static int lastAssignedPetNo = 0;

    // ===========================
    // Constructors
    // ===========================

    // Default constructor (creates random Dog)
    public Dog() {
        java.util.Random randGen = new java.util.Random();
        this.type = "DOG";
        this.age = randGen.nextInt(32); // 0–31 inclusive
        this.height = 4 + (40 - 4) * randGen.nextDouble(); // 4–40 inches
        this.weight = 1 + (343 - 1) * randGen.nextDouble(); // 1–343 pounds
        this.barkVolume = 113.1 * randGen.nextDouble(); // 0–113.1 dB
        this.growlVolume = this.barkVolume / 2.0;
        this.catChaser = randGen.nextBoolean();

        lastAssignedPetNo++;
        this.petID = type + lastAssignedPetNo;
    }

    // Constructor for fixed (manual) values
    public Dog(int age, double height, double weight, double barkVolume, boolean catChaser) {
        this.type = "DOG";
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.barkVolume = barkVolume;
        this.growlVolume = barkVolume / 2.0;
        this.catChaser = catChaser;

        lastAssignedPetNo++;
        this.petID = type + lastAssignedPetNo;
    }
    
    public String getPetID() {
        return petID;
    }

    public String getType() {
        return type;
    }

    public int getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    public double getBarkVolume() {
        return barkVolume;
    }

    public double getGrowlVolume() {
        return growlVolume;
    }

    public boolean isCatChaser() {
        return catChaser;
    }

    public void setCatChaser(boolean catChaser) {
        this.catChaser = catChaser;
    }

    // ===========================
    // Instance Method
    // ===========================
    public void displayInfo() {
        System.out.println(petID + ": " + type);
        System.out.println("Age: " + age);
        System.out.printf("Height: %.2f inches%n", height);
        System.out.printf("Weight: %.2f lbs%n", weight);
        System.out.printf("Bark Volume: %.2f dB%n", barkVolume);
        System.out.printf("Growl Volume: %.2f dB%n", growlVolume);
        System.out.println("Cat Chaser: " + (catChaser ? "Yes" : "No"));
        System.out.println("-------------------------");
    }
}
