public class Main {
    public static void main(String[] args) {
        boolean x = arNeigaiamasArTeigiamas(40);
        int y = -25;
        boolean z = arNeigaiamasArTeigiamas(y);
        System.out.println(z);
        System.out.println(x);
        System.out.println(arNeigaiamasArTeigiamas(125));
        //2uzd
        int a = 60;
        int b = 31;
        arLyginisArNelyginis(a);
        arLyginisArNelyginis(b);
        //3uzd
        int c = 12;
        int d = 5;
        System.out.println(palyginti(c, d));
        int e = 7;
        int f = 7;
        System.out.println(palyginti(e, f));
        int g = 3;
        int h = 8;
        System.out.println(palyginti(g, h));
    }
    public static boolean arNeigaiamasArTeigiamas(int x) {
        if (x < 0) return true;
        else {
            return false;
        }
    }
    public static void arLyginisArNelyginis(int x) {
        if (x % 2 == 0){
            System.out.println("Lyginis");
        }
        else {
            System.out.println("Nelyginis");
        }
    }
    public static byte palyginti (int c, int d) {
        if (c > d){
            return -1;
        } else if (c == d) {
            return 0;
        } else {
            return 1;
        }
    }
}