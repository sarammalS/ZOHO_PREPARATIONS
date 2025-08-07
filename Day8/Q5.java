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
// Shallow Copy
public Student shallowCopy() {
return new Student(this.name, this.id, this.dept,this.loc);
}
// Deep Copy
public Student deepCopy() {
Department newDept = new Department(this.dept.deptName);
Location newloc=new Location(this.loc.location);
return new Student(this.name, this.id, newDept,newloc);
}
@Override
public String toString() {
return "Name: " + name + ", ID: " + id + ", Department: " + dept+" Location : "
+loc;
}
}
public class Q5{
public static void main(String[] args) {
Department dept = new Department("ECE");
Location loc = new Location("UDT");
Student original = new Student("Jothi", 1, dept,loc);
Student shallow = original.shallowCopy();
Student deep = original.deepCopy();
shallow.dept.deptName = "EEE";
System.out.println("After modifying shallow copy:");
System.out.println("Original: " + original);
System.out.println("Shallow : " + shallow);
deep.dept.deptName = "CSE";
deep.loc.location="CHENNAI";
System.out.println("\nAfter modifying deep copy:");
System.out.println("Original: " + original);
System.out.println("Deep : " + deep);
}
}