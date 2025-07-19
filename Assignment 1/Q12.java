/*Find the area of a right angled triangle whose hypotenuse is 13 cm and one of its sides containing the 
right angle is 12 cm. Find the length of the other side.*/
class Test{
    public static void main(String args[]){
    int hypotenuse=13;
    double  base=12;
    double height=Math.sqrt((hypotenuse*hypotenuse)-(base*base));
    System.out.println(height);
    double area=(base*height)/2;
    System.out.print(area);
    }
}