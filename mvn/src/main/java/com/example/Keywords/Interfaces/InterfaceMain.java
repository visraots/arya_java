package com.example.Keywords.Interfaces;

public class InterfaceMain implements AbsInterface, Interface1 {

    @Override
    public void func2() {
        System.out.println("Interface1");
    }

    @Override
    public void func1() {
        System.out.println("AbsInterface");
    }
    public static void main(String [] args){
        InterfaceMain i= new InterfaceMain();
        i.func1();
        i.func2();
    }
}
