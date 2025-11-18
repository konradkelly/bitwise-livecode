public class Practice {
    public static void main(String[] args) {
        int x = 0b10101;
        int p = 0b11001;
        int q = x & p;
        System.out.println((Integer.toBinaryString(q)));
        int y = 0xcf4e;
        int z = 94;

        int color = 0xc4246D;
        int blueMask = 0x0000FF;

        int blue = color & blueMask;
        System.out.println(Integer.toHexString(blue));

        int greenMask = 0x00FF00;
        int green = (color & greenMask) >> 8;
        System.out.println(Integer.toHexString(green));
        int redMask = 0xFF0000;
        int red = (color & redMask) >> 16;
        System.out.println(Integer.toHexString(red));
        System.out.println(x);
        System.out.println(y);
        System.out.println(Integer.toBinaryString(z));
        System.out.println(Integer.toHexString(z));
    }
}