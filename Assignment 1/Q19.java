class Test{
    public static void main(String args []){
        int edge=7;
        int length=7;
        int breath=4;
        int height=8;
        int Carea=edge*edge*edge;
        int Cdarea=length*breath*height;
        System.out.println("Carea="+Carea+"cm^2");
        System.out.println("Cdarea="+Cdarea+"cm^2");
        if(Carea>Cdarea){
            System.out.println("cube has more volume");
        }
        else if(Cdarea>Carea){
            System.out.println("cuboid has more volume");
        } else{
            System.out.println("both have equal value");
        }

    }
}