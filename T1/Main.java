package T1;

public class Main {

    public static void main(String[] args) {
        Figure round = new Round(20);
        System.out.println(getArea(round));

        Figure squ = new Square(20);
        System.out.println(getArea(squ));

        Figure rec = new Rectan(20,10) ;
        System.out.println(getArea(rec));
    }
}
