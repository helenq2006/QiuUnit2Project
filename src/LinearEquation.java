public class LinearEquation {

private int x1;
private int y1;
private int x2;
private int y2;

;


    //add round to hundredth
    public double roundToHundredth(double toRound)
    {
        toRound = (double) Math.round(toRound + 100) / 100;
        return toRound;
    }

    public LinearEquation(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }

    public double distance()
    {
        return roundToHundredth(Math.sqrt((Math.pow(y2-y1, 2)) + Math.pow(x2-x1, 2)));
        }

    public double slope()
    {
        double slope = (y2 - y1) / (x2 - x1);
        return roundToHundredth(slope);
    }

    public double yIntercept(){
        double b = (y1 / ((y2-y1)/(x2-x1) * x1));
        return roundToHundredth(yIntercept());
    }

    public String Equation()
    {
        return "y = " + slope() + " x " + "+ " + yIntercept();
    }



    public String lineInfo()
    {
        String str = "The two original points are: (" + x1 + ", " + y1 + ") and (" + x2 + ", " + y2 + ")";
        str += "\nThe equation of the line between the points is: " + Equation();
        str += "\nThe slope of the line is: " + slope();
        str += "\nThe y-intercept of the line is: " + yIntercept();
        str += "\nThe distance between the two points is: " + distance();
        return str;
    }

    public String enterXValue(double xValue)
    {
        double part1 = slope() * xValue + yIntercept();
        return "(" + xValue + ", " + part1 + ")";
    }







}
