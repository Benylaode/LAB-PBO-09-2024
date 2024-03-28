class Tugas001b {
    private String name;
    private int age;
    private boolean isMale;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setGender(boolean isMale) {
        this.isMale = isMale;
    }

    public String getGender() {
        return isMale? "Laki-laki" : "Perempuan";
    }

    public static void main(String[] args) {
        Tugas001b person = new Tugas001b();
        
        person.setName("Zainab");
        person.setAge(17);
        person.setGender(false);

        System.out.println("=====Informasi yang Diperoleh=====");
        System.out.println("Nama        : " + person.getName());
        System.out.println("Usia        : " + person.getAge());
        System.out.println("Gender      : " + person.getGender());
    }
}