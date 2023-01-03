
package Abstractpkg;

public class Teacher extends Person {
    
    public String post;
    public int sallary;

    public Teacher(String post, int sallary) {
        this.post = post;
        this.sallary = sallary;
    }
    
    
    
    @Override
    public void name()
    {
        System.out.println("Junayed");
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
        System.out.println("5.6 Fit");
    }
    
    
}
