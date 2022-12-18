public class pr20<T extends Comparable<String>, V extends Serializable, K>  {
    private T t;
    private V v;
    private K k;

    pr20(T t, V v, K k)
    {
         this.t=t;
         this.v=v;
         this.k=k;
    }

    V getV()
    {
        return v;
    }

    T getT()
    {
        return t;
    }

    K getK()
    {
        return k;
    }



    void showTypes() {
        System.out.println("Тип T: " + t.getClass().getName());
        System.out.println("Тип V: " + v.getClass().getName());
        System.out.println("Тип K: " + k.getClass().getName());
    }




}
