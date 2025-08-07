/*Develop a Java program to illustrate the usage of toString() method.*/
class Location{
    String location;
    Location(String location){
        this.location=location;
    }
    @Override
    public String toString(){
        return location;
    }
}
class Department {
String deptName;
Department(String deptName) {
this.deptName = deptName;
}
@Override
public String toString() {
return deptName;
}
}
class Student {
String name;
int id;
Department dept;
Location loc;
Student(String name, int id, Department dept,Location loc) {
this.name = name;
this.id = id;
this.dept = dept;
this.loc=loc;
}
public String toString(){
    return "Name : "+name+" id : "+id+" dept "+dept+" loc : "+loc;
}}
class Q7{
    public static void main(String[] args){
        Department dept= new Department("CSE");
        Location loc= new Location("UDT");
        Student s= new Student("sara",1,dept,loc);
        System.out.println(s);
    }
}