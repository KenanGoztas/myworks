package javaworks1;

public class String1 {
    public static void main(String[] args) {
        String str = "kenan goztas kenan kenan";
        if (!str.contains("kenan"))
            System.out.println("Cümle kenan içermiyor");
        else {
            int ilkIndex = str.indexOf("kenan");
            int ikinciIndex = str.indexOf("kenan", ilkIndex + 1);
            if (ikinciIndex == -1) {
                System.out.println("metin cümlede sadece bir defa geçiyor");
            } else
                System.out.println("metin cümlede birden fazla geçiyor");
        }

        System.out.println(str.indexOf("t", 9));

        System.out.println(str.indexOf(97));
        System.out.println((int) 'a');
        System.out.println(str.indexOf(66));
        System.out.println(str.isEmpty());
        System.out.println(str.indexOf("kenan", 14));
        String str2 = str.substring(1, 3);
        System.out.println(str2.isBlank());
        System.out.println(str.replaceAll("", "-"));


    }

}
