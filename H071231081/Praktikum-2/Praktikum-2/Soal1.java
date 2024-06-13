public class Soal1 {
    String name;
    int age;
    String gender ;
    boolean isMale;

    public String getname(){
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    // public String getGender(){
    //     return gender;
    // }
    public void setGender(String gender){
        // boolean isMale ;
        if (gender == "male"){
            isMale = true; 
        }else{
            isMale = false;
        }
        
    }
    
    public String getGender(){
        if (this.isMale) { 
            return "male";
        } else {
            return "female";
        }
    }
    
    public static void main(String[] args) {
        Soal1 name = new Soal1();
        
        name.setName("Rara");
        name.setAge(18);
        name.setGender("female");

        System.out.println("Nama  : " + name.getname());
        System.out.println("Age   : " + name.getAge());
        System.out.println("gender: " + name.getGender());
    }
    
}
