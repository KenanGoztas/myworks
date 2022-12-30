package javaworks1;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MailControl2 {
    public static void main(String[] args) {

        ArrayList addresses = new ArrayList();
        addresses.add(" ");
        addresses.add("test");
        addresses.add("test.com");
        addresses.add("test@com");
        addresses.add("test@test.com");
        addresses.add("test@test.com.");
        addresses.add("test@test.com.tr");
        addresses.add("test.test@test.com.tr");
        addresses.add("test@türkçe.karakter.tr");

        for (int i = 0; i < addresses.size(); i++) {
            System.out.println(addresses.get(i) + " :: "
                    + isEmailValid((String) addresses.get(i)));
        }




    }



//çalışıyor
    static boolean isEmailValid(String email) {
        String expression = "^[\\w\\-]([\\.\\w])+[\\w]+@([\\w\\-]+\\.)+[A-Z]{2,4}$";
        CharSequence inputStr = email;

        Pattern pattern = Pattern.compile(expression, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(inputStr);
        return matcher.matches();
    }
//çalışmıyor..
    static boolean isEmailValid2 (String email){
        String expression = "^(?=.{1,64}@)[A-Za-z0-9_-]+(\\\\.[A-Za-z0-9_-]+)*@[^-][A-Za-z0-9-]+(\\\\.[A-Za-z0-9-]+)*(\\\\.[A-Za-z]{2,})$\n";
        CharSequence inputStr = email;

        Pattern pattern = Pattern.compile(expression, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(inputStr);
        return matcher.matches();
    }


    //çalışıyor..
    public static final Pattern VALID_EMAIL_ADDRESS_REGEX =
            Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);

    public static boolean validate3 (String emailStr){
            Matcher matcher = VALID_EMAIL_ADDRESS_REGEX.matcher(emailStr);
            return matcher.find();
        }






}
