public class Mobile {
    private String name;
    private String color;
    private String brand;

    public Mobile(String name, String color, String brand) {
        this.name = name;
        this.color = color;
        this.brand = brand;
    }

    public void call(String inputMsg) {
        System.out.printf("Message : %s\n", inputMsg);
    }

    public void printInfo() {
        System.out.printf("name: %s, color: %s, brand: %s\n", name, color, brand);
    }

}
