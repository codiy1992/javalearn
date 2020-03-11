package datatypes;

public class Demo {
    public static void main(String[] args)
    {

        int a1 = 127;

        Integer a2 = Integer.valueOf(a1);

        Integer a3 = Integer.valueOf(127);

        Integer a4 = 127;

        System.out.println(a1 == a2);
        System.out.println(a2 == a3);
        System.out.println(a3 == a4);

        //
        int b1 = 128;

        Integer b2 = Integer.valueOf(b1);

        Integer b3 = Integer.valueOf(128);

        Integer b4 = 128;

        System.out.println(b1 == b2);
        System.out.println(b2 == b3);
        System.out.println(b3 == b4);
        
    }
}
