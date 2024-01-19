public class Ican {
    public static void main(String[] args) {
        int x = 120; int y = 2; int z = 3;
        Object o = (x != 'x' ? 2f : 1);
        System.out.println(o.getClass().getName().split("\\.")[2] + " " + o);
    }
}
