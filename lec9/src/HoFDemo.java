public class HoFDemo {
    public static int doTwice(IntUnaryFunction f, int x) {
        return f.apply(f.apply(x));
    }

    public static void main(String args[]) {
        IntUnaryFunction ten_x = new TenX();
        System.out.println(doTwice(ten_x, 2));
    }
}
