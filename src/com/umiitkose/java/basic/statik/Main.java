package com.umiitkose.java.basic.statik;

public class Main {

    /* Neden Sınıf değişkenine ihtiyaç duyarız. Sınıf değişkeni neydi harbi ?
    * Static keyword'lu işlemler sınıflara ait değişken ya da metotları tanımlar. Kısaca sınıfla özgü işleri anlatır.
    * Math sınıfını hepiniz biliyorsunuz, içerisini girdiğinizde ne görüyorsunuz ?
    * ---- -> Math sınıfına bakılır.
    * final bir class yani kalıtım alınamıyor bu sınıftan..
    * eee constructor 'da private, Joshua Bloch'un da efective java 'da 1. kısımda 4. itemde bahsettiği durum için ideal.
    * Nesnesi oluşturulmayacak class 'ları private constructor ile destekleyin.
    *
    * Yukarıdaki durumdan sonra peki sonuç, bu sınıfı nasıl kullanıcaz. Herşey olumsuz bizim tarafta ?
    *
    * bu sınıfın sadece Sınıf değişkenleri ya da metotları üzerinden erişimlerini sağlayarak kullanıcaz tabiki. Her metot
    * static 'tir. İnceleyebilirsiniz.(utility class)
    * */


    public static void main(String[] args) {
        int absExample = Math.abs(-55);
        System.out.println(absExample);


    }
}
