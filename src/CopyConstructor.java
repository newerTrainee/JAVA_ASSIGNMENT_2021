public class CopyConstructor {
   private  int age;
   private String name;

    CopyConstructor(int age, String name){
      this.age = age;
      this.name = name;
   }
     CopyConstructor(CopyConstructor CopyConstructor){
       System.out.println("CopyConstructor called");
       age = CopyConstructor.age;
       name = CopyConstructor.name;
     }

     public int getAge(){
       return age;
     }
     public String getName(){
       return name;
     }

     public static void main(String[] args){
       CopyConstructor obj1 = new CopyConstructor(22,"Raj");
       System.out.println(obj1.age+" "+obj1.name);
       CopyConstructor obj2 =  new CopyConstructor(obj1);
       System.out.println(obj2.age+" "+obj2.name);
     }

}
