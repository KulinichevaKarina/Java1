public class BmiService {
    public static int calculate(int mass, double stature) {
        return (int) (mass / Math.pow(stature, 2));
    }
}
