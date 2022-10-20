package T1;

public class Square extends Figure {
    public int coners;

    public void Square(double a) {
        this.coners = 4;
        this.dimention1 = a;
    }

    public void getArea(Square s){
        return dimention1*dimention1;/*не понимаю чего оно хочет */
    }
    
}
