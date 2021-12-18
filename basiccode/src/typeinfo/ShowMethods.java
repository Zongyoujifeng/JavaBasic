package typeinfo;

import java.util.regex.Pattern;

public class ShowMethods {
    private static String usage =
            "usage:\n" +
            "ShowMethods qualified.class.name\n" +
            "To show all methods in class or: \n" +
            "ShowMethods qualified.class.name word\n" +
            "To search for methods involving 'word'";

    private static Pattern p = Pattern.compile("\\w+\\.");

    public static void main(String[] args) {

    }
}
