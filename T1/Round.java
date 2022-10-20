package T1;

public class Round extends Figure {
    public double radius;

    public void Round(double a) {
        this.radius = a;
    }

    public void getArea(Round ro){
        return 3.14*radius*radius;
    }
    
}
