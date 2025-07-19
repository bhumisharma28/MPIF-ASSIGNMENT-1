 class Test{
      public static void main(String[] args) {
        int length = 30;
        int width = 20;
        int path1 = 3;  
        int path2 = 4;  
        int Area = length * width;
        int pArea1 = path1 * width;   
        int pArea2 = path2 * length; 
        int overlapArea = path1 * path2;
        int usableArea = Area - pArea1 - pArea2 + overlapArea;
         System.out.println(usableArea );
    }
}