package md.itstep.models;

class Employee {
    private String name;
    private String lastname;
    private int age;

    public int getAge()
    {
        return age;
    }
    public void setAge(int age)
    {
        if(age < 0 ){
            System.out.println("Age cant be negative.Setting default to 18");
            this.age = 18;
        }
        this.age = age;
    }
    Department d = new Department();
    public void presentYourself()
    {
        System.out.println("Hello, my name is " + this.name + " " + this.lastname);
    }
}
