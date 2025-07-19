class Test {
    public static void main(String[] args) {
        double diameter = 2.25;
        double height = 2.25;
        double radius = diameter / 2;
        double volume = Math.PI * radius * radius * height;
        System.out.printf("Volume of the cylinder: %.3f cubic centimeters%n", volume);
    }
}
