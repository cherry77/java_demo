package com.flora.typeinfo;

/**
 * @author Flora on 2021/1/16.
 */
class Candy{
    static {
        System.out.println("Loading Candy");
    }
}
class Gum{
    static {
        System.out.println("Loading Gum");
    }
}
class Cookie{
    static {
        System.out.println("Loading Cookie");
    }
}
interface Buy{

}

public class SweetShop {
    public static void main(String[] args) {
/*        new Candy();
        try{
            // 要写全包路径
            Class<?> c = Class.forName("com.flora.typeinfo.Gum");
//            Class<?> i = Class.forName("com.flora.typeinfo.Buy");
//            System.out.println(i.isInterface());
        }catch (ClassNotFoundException e){
            System.out.println("Couldn't find Gum");
        }
        new Cookie();*/
        if(args.length < 1){
            System.out.println("Usage: sweetName");
            System.exit(0);
        }
        Class c = null;
        try {
            c = Class.forName(args[0]);
            System.out.println(c);
        } catch (ClassNotFoundException e) {
            System.out.println("Couldn't find " + args[0]);
        }
    }
}
