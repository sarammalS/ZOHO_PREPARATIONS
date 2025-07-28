
//Create a class University with attribute universityName. Inherit it in class Student with attributes studentName and rollNo.cl
class University{
   static String uname ="ww";

}
class Student extends University{
    String name;
    int roll;
    Student(String name, int roll){
        this.name=name;
        this.roll=roll;
    }
    void display(){
        System.out.println(name);
        System.out.println(roll);
        System.out.println(uname);
    }

}
class Q3{
    public static  void main(String[] args){
        Student s= new Student("sara",1);
        s.display();
    }
}