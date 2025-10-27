package GenericTiplerAkışlar.odevi;

public class GenericMain {

    public static void main(String[] args) {
        Generic<String> a = new Generic<>("Selam");
        Generic<Integer> b = new Generic<>(2);
        Generic<Boolean> c = new Generic<>(true);
        Generic<Double> d = new Generic<>(3.14);
        Generic<Float> e = new Generic<>(4.2f);
        Generic f = new Generic(5);

        a.printValue();
        b.printValue();
        c.printValue();
        d.printValue();
        e.printValue();
        f.printValue();

    }

}
