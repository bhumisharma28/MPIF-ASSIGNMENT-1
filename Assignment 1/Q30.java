 class Test {
    public static void main(String[] args) {
        int roomLength = 200, roomWidth = 400;
        int tileLength = 5, tileWidth = 8;

        int roomArea = roomLength*roomWidth;
        int tileArea = tileLength*tileWidth;
        int numTiles = roomArea/tileArea;

        System.out.println("Number of tiles needed: " + numTiles);
    }
}