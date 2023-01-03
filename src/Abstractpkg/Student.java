
package Abstractpkg;

public class Student extends Person{
    
    
    public String cgpa;
    public int id;

    public Student(String cgpa, int id) {
        this.cgpa = cgpa;
        this.id = id;
    }
    
    
    
    @Override
    public void name()
    {
        System.out.println("Lisan");
    }
    
    @Override
    public void gender()
    {
        System.out.println("Male");
    }
    
    @Override
    public void age()
    {
        System.out.println("22");
    }
    
    @Override
    public void hight()
    {
        System.out.println("5.3 Fit");
    }
    
    
}
