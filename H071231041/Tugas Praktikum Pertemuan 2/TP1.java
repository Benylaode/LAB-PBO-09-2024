import java.util.InputMismatchException;
import java.util.Scanner;
class Person {
    private String name;
    private int age;
    private boolean isMale;
    
    // Setter methods
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void setAge(int age) {
        try {
            this.age = age;
            
        } catch (InputMismatchException e) {
            // TODO: handle exception
            System.out.println("Error: Invalid age input");
            System.exit(1);
        }
    }
    
    public void setGender(String gender) {
        
        try {
            if (gender.equals("male")) {
                this.isMale = true;
            }
            
            else if (gender.equals("female")) {
                this.isMale = false;
            }
            
            else {
                throw new IllegalArgumentException("Invalid input. Enter Male or Female.");
            }
            
        } 
        
        catch (IllegalArgumentException e) {
            // TODO: handle exception
            System.out.println("Error: " + e.getMessage());
            System.exit(1);
        }
        
    }
        
        // Getter methods
        
        public String getName() {
            return this.name;
            // System.out.println(this.name);
        }
        
        public int getAge() {
            return this.age;
        // System.out.println(this.age);
    }
    
    public String getGender() {
        String get_gender;
        if (isMale) {
            get_gender = "Male";
            // System.out.println("Male");
        }
        else {
            get_gender = "Female";
            // System.out.println("Female");
        }
        
        return get_gender;
    }
}

public class TP1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Person person1 = new Person();
        
        System.out.print("Enter name : ");
        String name = input.next();
        person1.setName(name);
        
        
        System.out.print("Enter age : ");
        int age = input.nextInt();
        person1.setAge(age);

        System.out.print("Enter gender (Male/Female) : ");
        String gender = input.next().toLowerCase();
        person1.setGender(gender);
        
        System.out.println("Name: " + person1.getName());
        System.out.println("Age: " + person1.getAge());
        System.out.println("Gender: " + person1.getGender());

        input.close();
    }
}