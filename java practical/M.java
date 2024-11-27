import java.util.*;

class M{
    public static void main(String args[])
    {
        ArrayList<Object> a=new ArrayList<Object>();
        a.add("mca");
        a.add("bca");
        a.add("mba");
        a.add("bba");
        int h=a.size();
        System.out.println("Size of array is :"+h);
        System.out.println(a);
        System.out.println(""+a.get(3));
        a.set(2,"bsc");
        System.out.println(""+a);
        System.out.println(""+a.indexOf("bca"));
        a.remove(3);
        System.out.println(""+a);
        // System.out.println(""+a.lastIndex());
        // System.out.println(""+a.clear("mca"));

    }
}