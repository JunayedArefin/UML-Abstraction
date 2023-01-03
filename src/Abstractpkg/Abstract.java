
package Abstractpkg;

public class Abstract {

    
    public static void main(String[] args) {
        
        System.out.println("");
        System.out.println("Teacher Details,");
        Teacher t = new Teacher("Lacturer",40000);
        
        
        
        t.name();
        t.gender();
        t.age();
        t.hight();
        
        System.out.println("");
        System.out.println("Student Details,");
        Student s = new Student("4.00",201);
        s.name();
        s.gender();
        s.age();
        s.hight();
    }
   
    
}
