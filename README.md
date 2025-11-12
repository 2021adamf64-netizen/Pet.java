# Pet.java
This program is used to identify the type of pet and the specific details of the pet
// PetMain.java
// Adam Farah
// Demonstrates the use of the Dog class with preset (hardcoded) data.

public class Pet {

    public static void main(String[] args) {

        // Code for the dog program
        Dog[] dogShelter = new Dog[10];

        dogShelter[0] = new Dog(3, 15.0, 25.0, 70.0, true);
        dogShelter[1] = new Dog(8, 22.5, 60.0, 90.0, false);
        dogShelter[2] = new Dog(5, 18.0, 40.0, 80.0, true);
        dogShelter[3] = new Dog(2, 10.0, 12.0, 55.0, false);
        dogShelter[4] = new Dog(10, 25.0, 70.0, 100.0, true);
        dogShelter[5] = new Dog(6, 20.0, 50.0, 85.0, false);
        dogShelter[6] = new Dog(12, 30.0, 90.0, 110.0, true);
        dogShelter[7] = new Dog(4, 12.5, 18.0, 60.0, false);
        dogShelter[8] = new Dog(9, 28.0, 80.0, 95.0, true);
        dogShelter[9] = new Dog(7, 16.0, 35.0, 75.0, false);

        
        System.out.println("===== All Dogs =====");
        displayAllDogs(dogShelter);

        
        System.out.println("===== Cat Chasers =====");
        displayCatChasers(dogShelter);

        
        System.out.println("===== Oldest Dog =====");
        Dog oldest = getOldestDog(dogShelter);
        oldest.displayInfo();
		
		 // Create an array of 20 Cats
        Cat[] catShelter = new Cat[20];

        // Initialize the Cat array with preset data
        catShelter[0]  = new Cat(3, 9.2, 8.5, 40.0, true);
        catShelter[1]  = new Cat(5, 8.8, 7.0, 50.0, false);
        catShelter[2]  = new Cat(1, 9.0, 6.5, 30.0, true);
        catShelter[3]  = new Cat(4, 8.5, 8.0, 60.0, false);
        catShelter[4]  = new Cat(7, 9.5, 9.0, 55.0, true);
        catShelter[5]  = new Cat(9, 8.2, 7.8, 67.0, false);
        catShelter[6]  = new Cat(2, 9.1, 8.1, 45.0, true);
        catShelter[7]  = new Cat(6, 8.4, 7.5, 50.0, false);
        catShelter[8]  = new Cat(11, 9.8, 9.8, 60.0, true);
        catShelter[9]  = new Cat(13, 9.9, 10.2, 65.0, false);
        catShelter[10] = new Cat(10, 8.9, 7.9, 40.0, true);
        catShelter[11] = new Cat(12, 9.4, 8.8, 55.0, false);
        catShelter[12] = new Cat(14, 9.3, 10.0, 60.0, true);
        catShelter[13] = new Cat(8, 8.7, 8.2, 35.0, false);
        catShelter[14] = new Cat(15, 9.0, 9.1, 45.0, true);
        catShelter[15] = new Cat(16, 8.3, 8.3, 50.0, false);
        catShelter[16] = new Cat(17, 9.6, 9.4, 55.0, true);
        catShelter[17] = new Cat(18, 8.5, 7.6, 60.0, false);
        catShelter[18] = new Cat(19, 9.7, 9.0, 65.0, true);
        catShelter[19] = new Cat(20, 8.8, 8.5, 67.0, false);

        System.out.println("===== All Cats =====");
        displayAllCats(catShelter);

        System.out.println("===== Declawed Cats =====");
        displayDeclawedCats(catShelter);

        System.out.println("===== Youngest Cat =====");
        Cat youngest = getYoungestCat(catShelter);
        youngest.displayInfo();

        System.out.println("===== Tallest Cat =====");
        Cat tallest = getTallestCat(catShelter);
        tallest.displayInfo();
	}
		
		// Code for the cat program
		
    // methods for the dog program
   
    public static void displayAllDogs(Dog[] dogShelter) {
        for (Dog dog : dogShelter) {
            dog.displayInfo();
        }
    }

    
    public static void displayCatChasers(Dog[] dogShelter) {
        boolean found = false;
        for (Dog dog : dogShelter) {
            if (dog.isCatChaser()) {
                System.out.println(dog.getPetID());
                found = true;
            }
        }
        if (!found) {
            System.out.println("No cat chasers found!");
        }
    }

    
    public static Dog getOldestDog(Dog[] dogShelter) {
        Dog oldest = dogShelter[0];
        for (Dog dog : dogShelter) {
            if (dog.getAge() > oldest.getAge()) {
                oldest = dog;
            }
        }
        return oldest;
    }
	
	public static void displayAllCats(Cat[] catShelter) {
        for (Cat cat : catShelter) {
            cat.displayInfo();
        }
    }

    public static void displayDeclawedCats(Cat[] catShelter) {
        boolean found = false;
        for (Cat cat : catShelter) {
            if (cat.isDeclawed()) {
                System.out.println(cat.getPetID());
                found = true;
            }
        }
        if (!found) {
            System.out.println("No declawed cats found!");
        }
    }

    public static Cat getYoungestCat(Cat[] catShelter) {
        Cat youngest = catShelter[0];
        for (Cat cat : catShelter) {
            if (cat.getAge() < youngest.getAge()) {
                youngest = cat;
            }
        }
        return youngest;
    }

    public static Cat getTallestCat(Cat[] catShelter) {
        Cat tallest = catShelter[0];
        for (Cat cat : catShelter) {
            if (cat.getHeight() > tallest.getHeight()) {
                tallest = cat;
            }
        }
        return tallest;
    }
	
	
	
}
