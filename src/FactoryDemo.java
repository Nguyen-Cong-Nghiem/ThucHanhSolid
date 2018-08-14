public class FactoryDemo {
    public static void main(String[] args) {
        AnimalFactory animalFactory = new AnimalFactory();
        Animals a1 = animalFactory.getAnimal("feline");
        System.out.println("a1 sounds: " + a1.makeSound());
        Animals a2 = animalFactory.getAnimal("cannie");
        System.out.println("a2 sounds: " + a2.makeSound());
    }
}
