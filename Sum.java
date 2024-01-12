public class Sum {
    public static void main(String[] args) {
        if (args.length > 0) {
            try {
                int a1 = Integer.parseInt(args[0]);
                int a2 = Integer.parseInt(args[1]);

                System.out.println("Summe: " + (a1 + a2));
            } catch (NumberFormatException ignored) {
                System.err.println("Argumente müssen Zahlen enthalten");
            }
        } else {
            System.err.println("Keine Argumente angegeben");
        }
    }
}
