package main.learnings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {

    //(?:1-?)?[(]?\\d{3}[)]?\\s?-?\\s?\\d{3}\\s?-?\\s?\\d{4}

    public static void main(String[] args) {
        String regex = "^\\(?([0-9]{3})\\)?[-.\\s]?([0-9]{3})[-.\\s]?([0-9]{4})$";

        Pattern pattern = Pattern.compile(regex);

        String phoneNumber = "(801)      4 44-1200";
        Matcher matcher = pattern.matcher(phoneNumber.replaceAll(" ", ""));
        System.out.println(matcher.replaceFirst("$1$2$3"));

    }


}
