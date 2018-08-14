public class AnimalFactory {
    public Animals getAnimal(String type) {
        if ("cannie".equals(type)) {
            return new Dogs();
        } else {
            return new Cats();
        }
    }
}
