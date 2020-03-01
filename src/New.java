import java.util.Scanner;

/*
   write a java program that creates the area and parameter of
   a circle
*/
    public class New {

    public static  void main (String[]args){

        Scanner input = new Scanner(System.in);

    System.out.println( "Enter the radius: " );
    double r = (input.nextInt());
    double pie = 3.14;
// fine the area of a circle

        double area = r * r * pie;
        System.out.println( "Area of the circle is : "+ area );
        double perm = (pie * (2*r));
       System.out.println( "Perimeter of the circle is: "+ perm );




}

}
