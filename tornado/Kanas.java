package tornado;

public class Kanas {

    private static int count;

    private static String[] stops = new String[]{"Washington", "Monroe", "jackson", "Lasalee"};

    public static void main(String[] args) {
        while (count < stops.length) {
            if (stops[count++].length() < 8) {
                continue;
            }

        }
        System.out.println(count);
    }
}
