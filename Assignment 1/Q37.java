class Test {
    public static void main(String[] args) {
        double surfaceArea = 149;
        double height = 6;
        double pi = 3.14;

        double a = 2 * pi;
        double b = 2 * pi * height;         
        double c = -surfaceArea;
        double discriminant = (b * b) - (4 * a * c);

        if (discriminant >= 0) {
            double sqrtDisc = 1;
            double temp = discriminant;
            for (double i = 0.01; i * i <= temp; i += 0.01) {
                sqrtDisc = i;
            }

            double r1 = (-b + sqrtDisc) / (2 * a);
            double r2 = (-b - sqrtDisc) / (2 * a);
            double radius = (r1 > 0) ? r1 : r2;
            double diameter = 2 * radius;

            System.out.println("Approximate Diameter of the Cylinder: " + diameter + " cm");
        } else {
            System.out.println("No real solution.");
        }
    }
}