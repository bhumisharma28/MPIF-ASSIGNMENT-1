class Test {
    public static void main(String[] args) {
        
        double diameter = 12.0;
        double height = 9.0;
        double radius = diameter / 2;
        double pi = 3.14;
        double curvedSurfaceArea = 2 * pi * radius * height;
        double baseArea = 2 * pi * radius * radius;
        double totalSurfaceArea = curvedSurfaceArea + baseArea;
        System.out.println( totalSurfaceArea );
    }
}