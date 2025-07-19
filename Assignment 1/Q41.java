class Test {
    public static void main(String[] args) {
        double diameter = 30.0;
        double height = 50.0;
        double radius = diameter / 2;
        double volume = Math.PI * radius * radius * height;
        System.out.printf("Volume of the cylinder: %.2f cubic centimeters%n", volume);
    }
}
