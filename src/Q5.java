class Q5 implements Cloneable{ //Copying Object using clone() method by implementing cloneable interface
    int rollno;
    String name;

    Q5(int rollno,String name){
        this.rollno=rollno;
        this.name=name;
    }

    public Object clone()throws CloneNotSupportedException{
        return super.clone();
    }

    public static void main(String args[]){
        try{
            Q5 obj1 =new Q5(101,"Sumit");

            Q5 obj2 =(Q5)obj1.clone();

            System.out.println(obj1.rollno+" "+obj1.name);
            System.out.println(obj2.rollno+" "+obj2.name);

        }catch(CloneNotSupportedException c){
            System.out.println(c);
        }

    }
}
