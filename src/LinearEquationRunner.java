import java.util.Scanner;
public class LinearEquationRunner {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome!");

        //coord. to integer for 1st coordinate
        System.out.println("Enter coordinate 1: ");
        String coord1 = scan.nextLine();
        int comma = coord1.indexOf(",");
        int coord1Len = coord1.length();
        System.out.println(comma);
        String p1 = coord1.substring(1, comma);
        String p2 = coord1.substring((comma + 2), (coord1Len - 1));
        int x1 = Integer.parseInt(p1);
        int y1 = Integer.parseInt(p2);

        //coord. to integer for 2nd coordinate
        System.out.println("Enter coordinate 2: ");
        String coord2 = scan.nextLine();
        int comma2 = coord2.indexOf(",");
        int coord2Len = coord2.length();
        String q1 = coord2.substring(1,comma2);
        String q2 = coord2.substring((comma + 1), (coord2Len - 1 ));
        int x2 = Integer.parseInt(q1);
        int y2 = Integer.parseInt(q2);


        //if points are on vertical line and slope is undefined
        if (x1 == x2) {
            System.out.println("These points are on a vertical line: x = " + x1);

        } else {
// prints the line info for the coords given
            LinearEquation coordinates = new LinearEquation(x1, y1, x2, y2);
            System.out.print(coordinates.lineInfo());
        }




    }
}

