public class Room {
    public static void main(String[] args) {
        Object object1 = new Object();
        object1.name = "TV";
        object1.producer = "SONY";
        object1.size = 55;
        object1.turnedOn = true;

        Object object2 = new Object();
        object2.name = "Monitor";
        object2.producer = "LG";
        object2.size = 27;
        object2.turnedOn = false;

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
