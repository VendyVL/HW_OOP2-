package T1;

public class Rectan extends Square {/* В таком виде оно может наследоваться просто от фигуры */
    private double dimention2;

    public void Rectangle(double a, double b){
        this.coners = 4;
        this.dimention1 = a;
        this.dimention2 = b;
    }
    
    public void getArea(Rectan r){
        return dimention1*dimention2;
    }
}
