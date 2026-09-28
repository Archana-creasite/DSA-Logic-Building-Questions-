
//Signs of x and y decide the quadrant. Don't forget points lying on an axis or at the origin.
import java.util.Scanner;

class Main {
    public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.print("Enter the Value of x :");
int x = sc.nextInt();

System.out.print("Enter the value of y :");
int y = sc.nextInt();
 
if(x>0 && y>0){
    System.out.println("1 Quadrant");
}
else if(x<0 && y>0){
    System.out.println("2 Quadrant");
}
else if(x<0 && y<0){
    System.out.println("3 Quadrant");
}
else if(x>0 && y<0){
    System.out.println("4 Quadrant");
}
else{
    System.out.println("Point lies on X-axis, Y-axis, or Origin");
}


    }
}