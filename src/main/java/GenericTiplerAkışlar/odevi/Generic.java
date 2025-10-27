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
        Class <?> clazz = obj.getClass();
        if (clazz == String.class) {
            System.out.println(obj + " Stirg bir değerdir");
        }
        else if (clazz == Integer.class) {
            System.out.println(obj + " Integer bir değerdir");
        }
        else if (clazz == Double.class) {
            System.out.println(obj + " Double bir değerdir");
        }
        else if (clazz == Float.class) {
            System.out.println(obj + " Float bir değerdir");
        }
        else if (clazz == Boolean.class) {
            System.out.println(obj + " Boolean bir değerdir");
        }
        else if (clazz == Object.class) {
            System.out.println(obj + " Genel bir değerdir");
        }
    }



}
