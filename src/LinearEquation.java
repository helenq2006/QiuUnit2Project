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

    public String linearEquation()
    {
        return "y = " + slope() + " x " + "+ " + yIntercept();
    }



}
