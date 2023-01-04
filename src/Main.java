public class Main {
    public static void main(String[] args) {

        boolean x = arNeigaiamasArTeigiamas(40);

        int y = -25;

        boolean z = arNeigaiamasArTeigiamas(y);

        System.out.println(z);

        System.out.println(x);

        System.out.println(arNeigaiamasArTeigiamas(125));


        arNeigaiamasArTeigiamas(40);
        arNeigaiamasArTeigiamas(-25);
        arNeigaiamasArTeigiamas(125);

    }
        public static boolean arNeigaiamasArTeigiamas(int x) {

            if (x < 0) return true;
            else {
                return false;
            }
    }
}