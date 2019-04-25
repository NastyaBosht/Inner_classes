public class Fraction_inner_Pair {
    //внутрішній клас
    public class Pair{
        double a;
        double b;

        public double getA(){
            return a;
        }

        public double getB(){
            return b;
        }

        public Pair(){
            a=0;
            b=0;

        }

        public Pair(double a,double b){
            this.a=a;
            this.b=b;
        }

        public Pair(Pair r){
            this.a=r.a;
            this.b = r.b;

        }

        public void Display() {
            System.out.print("a = " + a + ";   b = " + b);
        }
        public boolean Great(Pair l){
            return a>l.a || a == l.a && b>l.b;

        }
    }
    private Fraction_inner_Pair.Pair pair;
    public Fraction_inner_Pair(){
        pair = new Pair();
    }
    public Fraction_inner_Pair(double a, double b) {
        pair = new Pair(a,b);
    }

    public Fraction_inner_Pair(Fraction_inner_Pair r){
        pair = new Pair(r.pair.getA(), r.pair.getB());
    }
    public void Display(){
        pair.Display();
    }
    public boolean Great(Pair l){
        return pair.getA()>l.a ||  pair.getA()== l.a && pair.getB()>l.b;

    }
}
