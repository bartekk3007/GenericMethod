public class Main
{
    public static void main(String[] args)
    {
        var result1 = Main.getMiddle(1, 2, 3);
        System.out.println(result1);
        var result2 = Main.getMiddle("Andrzej", "Bartek", "Jan");
        System.out.println(result2);
        var result3 = Main.getMiddle(2.5, 0, 1);
        System.out.println(result3);
        Double d1 = 3.0;
        var result4 = Main.getMiddle("Bartek", 5, true);
        System.out.println(result4);
    }
    public static <T> T getMiddle(T... args)
    {
        return args[args.length / 2];
    }
}