class Test{
    public static void main(String args[]){
        int edge=3;
        int Carea=edge*edge*edge;
        System.out.println("Carea="+Carea);
        int length=15;
        int width=9;
        int height=12;
        int Cbarea=length*width*height;
        System.out.println("Cbarea="+ Cbarea);
        int boxesfit=Cbarea/Carea;
        System.out.println("boxesfit="+boxesfit);

    }
}