package tgspraktikump2;

public class person {
    String name;
    int age;
    boolean isMale;
   
    public String getname(){
        return name;
    }
    public void setname(String newname){
        this.name = newname;
    }
    
    public int getage(){
        return age;
    }
    public void setage(int newage){
        this.age = newage;
    }

    public String getGender(){
        return isMale ? "laki-laki" : "perempuan";
    }
    public void setGender(String newGender){
        if("Laki-laki" == newGender){
            this.isMale = true;
        }else if ("perempuan" == newGender) {
            this.isMale = false;
        } 
    }

    public static void main(String[] args) {
        person Person = new person();
        Person.setname("A.Muh.Muflih");
        Person.setage(18);
        Person.setGender("Laki-laki");

        System.out.println("Nama saya adalah " + Person.getname());
        System.out.println("Saya berumur " + Person.getage() + " Tahun");
        System.out.println("Saya berjenis kelamin " + Person.getGender());
    }

}
