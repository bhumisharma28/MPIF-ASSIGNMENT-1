class Test  {
    public static void main(String[] args) {
        double radius = 7.7;
        double height = 12;
        double pi = 3.14;
        double lateralArea = 2 * pi * radius * height;
        double baseArea = 2 * pi * radius * radius;
        double totalArea = lateralArea + baseArea;
        System.out.println(totalArea);
    }
}
