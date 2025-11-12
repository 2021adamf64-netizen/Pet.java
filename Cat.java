import java.util.Random;
public class Cat {
	private String petID;
	private String type;
	private int age;
	private double height;
	private double weight;
	private double purrVolume;
	private double meowVolume;
	private boolean deClawed;
	private static int lastAssignedPetNo = 0;
	public Cat() {
		java.util.Random randGen = new java.util.Random();
		this.type = "CAT";
		this.age = randGen.nextInt(38);
		this.height = 8 + (10 - 8) * randGen.nextDouble();
		this.weight = 6 + (12 - 6) * randGen.nextDouble();
		this.purrVolume = 67.8 * randGen.nextDouble();
		this.meowVolume = this.purrVolume * 1.35;
		this.deClawed = randGen.nextBoolean();
		lastAssignedPetNo++;
		this.petID = type + lastAssignedPetNo;
	}
	public Cat(int age, double height, double weight, double purrVolume, boolean deClawed) {
        this.type = "CAT";
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.purrVolume = purrVolume;
        this.meowVolume = purrVolume * 1.35;
        this.deClawed = deClawed;
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
	public double getPurrVolume() {
		return purrVolume;
	}
	public double getMeowVolume() {
		return meowVolume;
	}
	public boolean isDeclawed() {
		return deClawed;
	}
	public void setDeClawed(boolean deClawed) {
		this.deClawed = deClawed;
	}
	
	public void displayInfo() {
	    System.out.println(petID + ": " + type);
        System.out.println("Age: " + age);
        System.out.printf("Height: %.2f inches%n", height);
        System.out.printf("Weight: %.2f lbs%n", weight);
        System.out.printf("Purr Volume: %.2f dB%n", purrVolume);
        System.out.printf("Meow Volume: %.2f dB%n", meowVolume);
        System.out.println("Declawed: " + (deClawed ? "Yes" : "No"));
        System.out.println("-------------------------");
	}
}
