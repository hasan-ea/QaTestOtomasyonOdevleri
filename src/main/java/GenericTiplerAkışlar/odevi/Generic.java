package GenericTiplerAkışlar.odevi;

public class Generic<T> {
    T obj;

    public Generic(T obj) {
        this.obj = obj;
    }

    public T getObj() {
        return obj;
    }

    public void printValue() {
        Class <?> klas = obj.getClass();
        if (klas == String.class) {
            System.out.println(obj + " Stirg bir değerdir");
        }
        else if (klas == Integer.class) {
            System.out.println(obj + " Integer bir değerdir");
        }
        else if (klas == Double.class) {
            System.out.println(obj + " Double bir değerdir");
        }
        else if (klas == Float.class) {
            System.out.println(obj + " Float bir değerdir");
        }
        else if (klas == Boolean.class) {
            System.out.println(obj + " Boolean bir değerdir");
        }
        else if (klas == Object.class) {
            System.out.println(obj + " Genel bir değerdir");
        }
    }



}
