class Test {
    public static void main(String[] args) {
        double volume = 1287;
        double radius = 10;
        double pi = 3.14;
        double height = volume / (pi * radius * radius);

        double surfaceArea = (2 * pi * radius * radius) + (2 * pi * radius * height);

        System.out.println(surfaceArea);
    }
}