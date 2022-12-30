package javaworks1;

public class JavaRegex {
    public static void main(String[] args) {
        String str1 = "NEUEUEUEm98888eeakliaüiyü83934949=..,.B.>=>";
        String str2 = str1.replaceAll("[0-9]", "?");
        System.out.println(str2);
        String str3 = str1.replaceAll("[A-Za-z0-9]", "");
        System.out.println(str3);


    }
}
