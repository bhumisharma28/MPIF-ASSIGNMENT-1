class Test{
    public static void main(String[] args) {
        double diameter = 15;
        double height = 7;
        double pi = 3.14;
        double radius = diameter / 2;
        double area = (2 * pi * radius * radius) + (2 * pi * radius * height);

        System.out.println(area);
    }
}