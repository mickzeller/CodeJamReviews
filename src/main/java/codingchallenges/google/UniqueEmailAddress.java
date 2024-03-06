package codingchallenges.google;

import java.util.HashSet;
import java.util.Set;

public class UniqueEmailAddress {

    //Using a HashSet for this data structure
    public static void main(String[] args) {
        String[] emails = {"test.email+alex@leetcode.com", "test.e.mail+bob.cathy@leetcode.com", "testemail+david@lee.tcode.com"};
        String[] emails2 = {"test.email+alex@leetcode.com", "test.e.mail+bob.cathy@leetcode.com", "testemail+david@lee.tcode.com"};
        System.out.println(numberOfUniqueEmails(emails));
    }

    private static int numberOfUniqueEmails(String[] emails) {
        Set<String> set = new HashSet<>();
        for (String email : emails) {
            int i = email.indexOf("@");
            String local = email.substring(0, i).replace(".", "");
            String domain = email.substring(i);

            if (local.contains("+")) {
                local = local.substring(0, local.indexOf("+"));
            }
            set.add(local.concat(domain));
        }
        return set.size();

    }

}
