 class Test {
    public static void main(String[] args) {
        int gardenSide = 150;
        int poolSide = 25;

        int gArea = gardenSide * gardenSide;
        int pArea = poolSide * poolSide;
        int usableArea = gArea - pArea;

        System.out.println(usableArea);
    }
 }