public class Person {

    private String name;
    private  int age;
    private  String work ;
    private  int salary ;
    private  Phone phone ;

    public Person () {

    }

    public Person(String name, int age, String work, int salary, Phone phone) {
        this.name = name;
        this.age = age;
        this.work = work;
        this.salary = salary;
        this.phone = phone;
    }

    public String getName() {
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

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Phone getPhone() {
        return phone;
    }

    public void setPhone(Phone phone) {
        this.phone = phone;
    }
}


