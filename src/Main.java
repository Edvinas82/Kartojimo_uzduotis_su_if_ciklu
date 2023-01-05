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
}