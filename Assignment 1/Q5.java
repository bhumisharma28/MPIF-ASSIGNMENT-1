class Test {
    public static void main(String[] args) {
        int cost = 1600;
        int ratePerMeter = 25;
        int length = 20;
        int perimeter = cost / ratePerMeter;
        int breadth = (perimeter / 2) - length;
        int area = length * breadth;
        System.out.println("Breadth of the park: " + breadth + " meters");
        System.out.println("Perimeter of the park: " + perimeter + " meters");
        System.out.println("Area of the park: " + area + " square meters");
    }
}
