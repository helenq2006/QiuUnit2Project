public class LinearEquation {

private int x1;
private int y1;
private int x2;
private int y2;

public double slope;
public double yIntercept;

    public LinearEquation(int x1, int y1, int x2, int y2) {}

    public double distance()
    {
        double distance1 = y1 - x1;
        double distance2 = y2 - x2;
        double distanceFinal = distance2 - distance1;
        double roundtoHundredth = Math.round(distanceFinal);
        return roundtoHundredth;
        }

    public double slope()
    {
        double slope = (y2 - y1) / (x2 - x1);
        double slopeRounded = Math.round(slope);
        this.slope = slopeRounded;
        return slopeRounded;
    }
    //add yIntercept
    //y= mx+b
    // y/mx = b

    public double yIntercept(){
        double b = (y1 / ((y2-y1)/(x2-x1) * x1));
        double yInterceptRounded = Math.round(b);
        this.yIntercept = yInterceptRounded;
        return yInterceptRounded;
    }

    public String Equation()
    {
        return "y = " + slope() + " x " + "+ " + yIntercept();
    }

    //add round to hundredth

    public String lineInfo()
    {
        String str = "The two original points are: (" + x1 + ", " + y1 + ") and (" + x2 + ", " + y2 + ")";
        str += "\nThe equation of the line between the points is: " + Equation();
        str += "\nThe slope of the line is: " + slope();
        str += "\nThe y-intercept of the line is: " + yIntercept();
        str += "\nThe distance between the two points is: " + distance();
        return str;
    }





}
