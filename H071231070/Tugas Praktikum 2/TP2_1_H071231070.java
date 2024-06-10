public class TP2_1_H071231070 {
    public static void main(String[] args){ 
        Person orang = new Person();

        orang.setAge(19);
        orang.setName("kesi");
        orang.setGender("perempuan"); 
        
        System.out.println(orang.getAge());
        System.out.println(orang.getName());
        System.out.println(  orang.getGender());
        
    }
}

class Person {
    private String name;
    private int age;
    private boolean isMale;

    void setName(String name){
        this.name = name;
    }
    String getName(){
        return name;
    }

    void setAge(int age){
        this.age = age;
    }
    int getAge(){
        return age;
    }
    
    void setGender(String gender){
        
        if (gender == "perempuan"){
            this.isMale = false; 
        }
        else {
            this.isMale = true;
        }

    }
    String getGender(){
        if (isMale ){
            return "male";
        } else {
            return "female";
        }
    }


}