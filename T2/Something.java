package T2;

public class Something {

    protected int arg1;
    protected String arg2;
    private double arg3;
    private int arg4;
    private String arg5;
    public int arg6;
    public String arg7;

    public Something(int arg1, String arg2, double arg3, int arg4, String arg5, int arg6, String arg7){
        this.arg1 = arg1;
        this.arg2 = arg2;/* Если не запонить данные, оно запишет null? */
        this.arg3 = arg3;
        this.arg4 = arg4;
        this.arg5 = arg5;
        this.arg6 = arg6;
        this.arg7 = arg7;
    }

}
    Something s = new Something(1, arg2, arg3, arg4, arg5, arg6, arg7);
