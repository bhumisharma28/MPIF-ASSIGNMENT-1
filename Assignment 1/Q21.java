class Test{
    public static void main(String args[]){
        int blength=15;
        int bbreath=8;
        int bheight=5;
        int bvolume=blength*bbreath*bheight;
        System.out.print("bvolume="+bvolume);
        int wlength=15;
        int wbreath=10;
        int wheight=8;
        int wvolume=wlength*wbreath*wheight;
        System.out.println("wvolume="+wvolume);
        int number=wvolume-bvolume;
        System.out.println("number="+number);
    }
}