package com.umiitkose.java.basic.statik;

public class StatikDenemeleri {
    private int privateVariable;
    private static int staticPrivateVariable;
    public int publicVariable;
    public static int publicStaticVariable;

    //Sınıf Bloğu
    static{
        System.out.println("static blok başladı");
    }

    //Sınıf Bloğu
    static{
        System.out.println("static 2.blok başladı");
    }

    //Nesne bloğu
    {
        System.out.println("nesne bloğu başladı");
    }

    //Dikkat !!!! ---- > Sadece instance variable constructor 'da yer alıyor.
    public StatikDenemeleri(int privateVariable, int publicVariable) {
        this.privateVariable = privateVariable;
        this.publicVariable = publicVariable;
        System.out.println("constructor başladı");
    }

    //Getter - Setterlar sınıf değişkeni için static.
    public static int getStaticPrivateVariable() {
        return staticPrivateVariable;
    }


    public static void main(String[] args) {
        StatikDenemeleri statikDenemeleri=new StatikDenemeleri(5,5);
        System.out.println(StatikDenemeleri.staticPrivateVariable);
        System.out.println(statikDenemeleri.publicVariable);

    }
}
