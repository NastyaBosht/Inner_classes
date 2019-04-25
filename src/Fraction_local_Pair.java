public class Fraction_local_Pair {
    public void Display(double a, double b) {
        //локальний клас
        class Pair {

            double a;
            double b;

            public double getA() {
                return a;
            }

            public double getB() {
                return b;
            }

            public Pair() {
                a = 0;
                b = 0;

            }

            public Pair(double a, double b) {
                this.a = a;
                this.b = b;
            }

            public Pair(Pair r) {
                this.a = r.a;
                this.b = r.b;

            }

            public void Display() {
                System.out.print("a = " + a + ";   b = " + b);
            }
        }
        Pair pair = new Pair(a, b);
        pair.Display();
    }

}
