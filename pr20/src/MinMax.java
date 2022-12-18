public class MinMax <T extends Comparable> {
    T[] a;

    MinMax(T[] a)
    {
        this.a = a;
    }
    T Min()
    {
        if (a!=null)
        {
            T mini = a[0];
            for (int i =0 ; i<a.length; i++)
            {
                if (a[i].compareTo(mini) < 0) {
                     mini = a[i];
                }
            }
            return mini;
        }
        else {
            return null;
        }
        }


    T Max()
    {
        if (a!=null)
        {
            T maxi = a[0];
            for (int i =0 ; i<a.length; i++)
            {
                if (a[i].compareTo(maxi) > 0) {
                    maxi = a[i];
                }
            }
            return maxi;
        }
        else {
            return null;
        }
    }

    public static void main(String[] args)
    {
        Integer [] a={1, 3, 13, 0, 14, 50, -1};
        MinMax t= new MinMax(a);
        System.out.println(t.Min());
        System.out.println(t.Max());
    }
}

