package com.example1.Spring_Project1;

class Ex {
    int getValue(){
        int b=10;
        return b;
    }
}
public class TightCouplingEx {

    int addNoBy10(int a){
    Ex o = new Ex();
    return a+o.getValue();
}
public static  void main(String[] args){
        TightCouplingEx l = new TightCouplingEx();
    System.out.println(l.addNoBy10(12));
}

}
