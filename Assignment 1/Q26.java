class Test {
    public static void main(String[] args) {

        int pLength = 12000;
        int pBreadth = 240;
        int bLength = 24;
        int bBreadth = 15;
        int pArea = pLength*pBreadth;
        int bArea = bLength*bBreadth;
        int numberOfBricks = pArea/bArea;

        System.out.println("Number of bricks needed: " + numberOfBricks);
    }
}
