public class Calculation implements Runnable {
    double radius;
    double side;
    double area;
    double phi = 3.14;
    double square;
    double circle;
    double trapezoid;

    public void setSquare(double side) {
        double squareArea = side*side;
        this.square = squareArea;
    }

    public double getSquare() {
        return square
    }

    public void setCircle(double radius) {

    }

    public double getCircle() {
        return circle
    }

    public void setTrapezoid(double side) {

    }

    public double getTrapezoid() {
        return trapezoid 
    }

    @Override
    public void run(){
        System.out.println("Program will start in")
        for (int i = 3; i <=3; i--){
            try {
                Thread.sleep();
            } catch (InteruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

