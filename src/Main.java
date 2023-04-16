public class Main {
    public static void main(String[] args) {
        int mass = 98;// вес
        double stature = 1.87;// рост
        BmiService service = new BmiService();

        int calculate = service.calculate(mass, stature);
        System.out.println(calculate);
    }
}



