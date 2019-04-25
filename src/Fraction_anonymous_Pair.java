public class Fraction_anonymous_Pair {
    abstract class APair{
        double a;
        double b;

        public double getA(){
            return a;
        }

        public double getB(){
            return b;
        }

        public APair(){
            a=0;
            b=0;

        }

        public APair(double a,double b){
            this.a=a;
            this.b=b;
        }

        public APair(APair r){
            this.a=r.a;
            this.b = r.b;

        }
        public abstract void Display();

    }
    public void Display(final double a, final double b){
        APair pair = new APair(a,b) {
            public void Display(){
                System.out.print("a = " + a + ";  b = " + b);
            }
        };
        pair.Display();
    }
}
