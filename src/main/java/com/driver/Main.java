package com.driver;

public class Main {
    public static  void main(String[] args)
    {
        A objA=new A();
        B objB= new B();
       String s=objA.meth();
        System.out.println(s);
       String str=objB.meth();
        System.out.println(str);
  
}
public static class A
{
    public String meth()
    {
        return "Invoking method from class A";
    }

}
public static class B extends A
{
public String meth()
{
    return "Method is overridden in Extendend class B";
}
}
}