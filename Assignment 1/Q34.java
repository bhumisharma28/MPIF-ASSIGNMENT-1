class Test {
    public static void main(String[] args) {
        double base1 = 128;
        double base2 = 92;
        double originalHeight = 40;
        double walkwayWidth = 4;
        double newHeight = originalHeight + walkwayWidth;
        double area = 0.5 * (base1 + base2) * newHeight;

        System.out.println("Area of the wooded area after adding the walkway: " + area + " square meters");
    }
}
