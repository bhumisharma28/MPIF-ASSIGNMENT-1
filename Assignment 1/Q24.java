class Test{
    public static void main(String args[]){
        int wallLength = 2000;
        int wallHeight = 200;
        int wallwidth= 75;
        int brickLength = 25;
        int brickWidth = 10;
        double brickHeight = 7.5;
        int wvolume = wallLength * wallHeight * wallwidth;
        double bvolume = brickLength * brickWidth * brickHeight;
        int numberOfBricks = (int)(wvolume / bvolume);
        int costPerThousand = 900;
        double totalCost = (numberOfBricks / 1000.0) * costPerThousand;
        System.out.println("Number of bricks needed: " + numberOfBricks);
        System.out.println("Total cost: $" + totalCost);
    }
}