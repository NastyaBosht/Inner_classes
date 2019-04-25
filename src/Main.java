public class Main {

    public static void main(String[] args)
    {

        System.out.println("static: ");
        Fraction_static_Pair fs = new  Fraction_static_Pair(2, 3);
        fs.Display();
        System.out.println();



        //створення об'єкта статистичного класу
        Fraction_static_Pair.Pair fp = new Fraction_static_Pair.Pair (6,3);
        fp.Display();
        fs.Great(fp);
        System.out.println();
        System.out.println();

        System.out.println("inner: ");
        Fraction_inner_Pair fi = new  Fraction_inner_Pair(2, 3);
        fi.Display();
        System.out.println();

        //створення об'єкта внутрішнього класу
        Fraction_inner_Pair.Pair in = fi.new Pair(8,1);
        in.Display();
        fi.Great(in);
        System.out.println();
        System.out.println();

        System.out.println("local: ");
        Fraction_local_Pair lp = new Fraction_local_Pair();
        lp.Display(3,4);
        System.out.println();
        System.out.println();

        System.out.println("anonymous: ");
        Fraction_anonymous_Pair as = new Fraction_anonymous_Pair();
        as.Display(7,2);
        System.out.println();
        System.out.println();
    }
}
