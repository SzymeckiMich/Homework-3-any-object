public class Room {
    public static void main(String[] args) {
        Object object1 = new Object("TV", "SONY", 55, true);

        Object object2 = new Object("Monitor", "LG", 27, false);

        System.out.println("Object name: " + object1.name +
                "\nObject producer: " + object1.producer +
                "\nObject size: " + object1.size + " inch" +
                "\nIs the object turned on: " + object1.turnedOn + "\n");

        System.out.println("Object name: " + object2.name +
                "\nObject producer: " + object2.producer +
                "\nObject size: " + object2.size + " inch" +
                "\nIs the object turned on: " + object2.turnedOn);
    }
}
