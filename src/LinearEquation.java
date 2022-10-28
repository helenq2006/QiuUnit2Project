public class LinearEquation {

    private int x1;
    private int y1;
    private int x2;
    private int y2;

    ;


    //add round to hundredth
    public double roundToHundredth(double toRound) {
        toRound = (double) Math.round(toRound + 100) / 100;
        return toRound;
    }

    public LinearEquation(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }

    public double distance() {
        return roundToHundredth(Math.sqrt((Math.pow(y2 - y1, 2)) + Math.pow(x2 - x1, 2)));
    }

    public double slope() {
        double num = y2 - y1;
        double den = x2 - x1;
        return roundToHundredth(num / den);
    }

    public double yIntercept() {
        double b = -1 * slope() * x1;
        b += y1;
        return roundToHundredth(b);
    }

    public String Equation() {
        int num = y2 - y1;
        int den = x2 - x1;
        String slope = "";
        boolean negY;
        boolean origin;

        if (yIntercept() == 0) {
            origin = true;
            negY = false;
        } else if (yIntercept() == Math.abs(yIntercept())) {
            negY = false;
            origin = false;
        } else {
            negY = true;
            origin = false;
        }
        if (y1 == y2) {
            return "y = " + (int) yIntercept();
        }

        if (((double) num/den) == -1) {
            slope = "-x";
        } else if (num/den == 1) {
            slope = "x";
        } else if (num % den == 0) {
            slope = num/den + "x";
        } else if (num % den != 0) {
            if (num < 0 && den < 0) {
                slope = (-1 * num) + "/" + (-1 * den) + "x";
            } else if (num < 0 && den > 0) {
                slope = num + "/" + den + "x";
            } else if (num > 0 && den > 0) {
                slope = num + "/" + den + "x";
            }
        }

        if (negY) {
            return "y = " + slope + " - " + Math.abs(yIntercept());
        } else if (origin) {
            return "y = " + slope;
        } else {
            return "y = " + slope + " + " + yIntercept();
        }
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
