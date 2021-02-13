package com.flora.typeinfo;

/**
 * @author Flora on 2021/1/16.
 */
interface HasBatteries{}
interface WaterProof{}
interface Shoots{}

class Toy{
    Toy(){}
    Toy(int i){}
}

class FancyToy extends Toy implements HasBatteries, WaterProof, Shoots{
    private String name;
    FancyToy(){super(1);}
}

public class ToyTest {
    /**
     * getName() 表示全限定的类名
     * isInterface() 这个class对象是否表示某个接口
     * getSimpleName() 表示不含包名的类名
     * getCanonicalName() 全限定类名
     * @param cc
     */
    static void printInfo(Class cc){
        System.out.println("Class name:" + cc.getName() + " is interface?[" + cc.isInterface() + "]");
        System.out.println("Simple name: " + cc.getSimpleName());
        System.out.println("Canonical name: " + cc.getCanonicalName());
        System.out.println("==========================");
    }

    public static void main(String[] args){
        Class c = null;
        try{
            c = Class.forName("com.flora.typeinfo.FancyToy");
        }catch (ClassNotFoundException e){
            System.out.println("Can't find FancyToy");
            System.exit(1);
        }
        printInfo(c);

        for(Class face : c.getInterfaces()){
            printInfo(face);
        }

        Class up = c.getSuperclass();
        Object obj = null;
        try{
            // Require default constructor
            obj = up.newInstance();
        }catch (InstantiationException e){
            System.out.println("Cannot instantiate");
            System.exit(1);
        }catch(IllegalAccessException e){
            System.out.println("Cannot access");
            System.exit(1);
        }
        printInfo(obj.getClass());

        hierarchy(new FancyToy());

        char[] chars = new char[10];
        // chars is an Object:
        System.out.println("Superclass of char[] c: " +
                chars.getClass().getSuperclass());
        System.out.println("char[] c instanceof Object: " +
                (chars instanceof Object));
    }

    /**
     * 递归打印该对象所在的继承体系中的所有类
     * @param o
     */
    public static void hierarchy(Object o){
        Object[] fields = o.getClass().getDeclaredFields();
        if(fields.length == 0){
            System.out.println(o.getClass() + " has no fields");
        }
        if(fields.length > 0){
            System.out.println("Field(s) of " + o.getClass() + ":");
            for(Object obj : fields){
                System.out.println(" " + obj);
            }
        }
        if(o.getClass().getSuperclass() != null){
            System.out.println(o.getClass() + " is a subclass of " + o.getClass().getSuperclass());
            try {
                hierarchy(o.getClass().getSuperclass().newInstance());
            } catch (InstantiationException e) {
                System.out.println("Unable to instantiate obj");
            } catch (IllegalAccessException e) {
                System.out.println("Unable to access");
            }
        }
    }

    /**
     * 判断char数组究竟是个基本类型，还是一个对象
     * Write a program to determine whether an array of char is a primitive type
     * or a true Object.
     */
    public static boolean isObject(char[] chars){
        return chars instanceof Object;
    }
}
