package DSA.first;

public class garbege {


    public static  void main(String[] args) {
        GarbageEx g1=new GarbageEx();
        GarbageEx g2=new GarbageEx();
         g1=null;
        g2=null;
        System.gc();
            }
    private static class GarbageEx {
    }
}
