public class Main {
    public static void main(String[] args) {
        Phone phone = new Phone( "IPhone ","11",128);
        phone.setScreen(5);
        phone.setPrice(3400);
        System.out.println("name: " +  phone.getBrand()+"\nVersion: "+phone.getVersion()+"\nMemory: "+phone.getMemory()+"\nScreen: "+phone.getScreen()+"\nPrice: "+phone.getPrice());
        System.out.println("___________________________________________");

        Phone phone1 = new Phone( "Lenonvo ","12",256);
        phone1.setScreen(4);
        phone1.setPrice(50000);
        System.out.println("name: " +  phone1.getBrand()+"\nVersion: "+phone1.getVersion()+"\nMemory: "+phone1.getMemory()+"\nScreen: "+phone1.getScreen()+"\nPrice: "+phone1.getPrice());
        System.out.println("_______________________________________________");

        Phone phone2 = new Phone( "Samsung ","23",256);
        phone2.setScreen(6);
        phone2.setPrice(75000);
        System.out.println("name: " +  phone2.getBrand()+"\nVersion: "+phone2.getVersion()+"\nMemory: "+phone2.getMemory());
        System.out.println("Screen "+ phone2.getScreen()+"\nPrice"+phone2.getPrice());
        System.out.println("_______________________________________________");

        Phone phone3 = new Phone( "Redmi ","13",256);
        phone3.setScreen(6);
        phone3.setPrice(75000);
        System.out.println("name: " +  phone3.getBrand()+"\nVersion: "+phone3.getVersion()+"\nMemory: "+phone3.getMemory());
        System.out.println("Screen "+ phone3.getScreen()+"\nPrice"+phone3.getPrice());
        System.out.println("_______________________________________________");

        Phone phone4 = new Phone( "Poco ","14",256);
        phone4.setScreen(6);
        phone4.setPrice(75000);
        System.out.println("name: " +  phone4.getBrand()+"\nVersion: "+phone4.getVersion()+"\nMemory: "+phone4.getMemory());
        System.out.println("Screen "+ phone4.getScreen()+"\nPrice"+phone4.getPrice());
        System.out.println("_______________________________________________");

        Person person = new Person("Malik",18,"ITer",100000,phone);
        Person person1 = new Person("Baiel",17,"Programmist",90000,phone1);
        Person person2 = new Person("Matmusa ", 20,"Hacker",120000,phone2);
        Person person3 = new Person("Ruslan", 20,"Raznarabotnik",80000,phone3);
        Person person4 = new Person("Baktiyar",20,"Black hacker",130000,phone4);
        Person [] persons  ={person , person1, person2, person3,person4 } ;
        int min=person4.getSalary();
        int max=person4.getSalary();
        for (Person p : persons ) {
            System.out.println("Name: " + p.getName() + " \nAge: " + p.getAge() + "\nWork: " + p.getWork() + "\nSalary: " + p.getSalary() + "\nPhone Price: " + p.getPhone().getPrice());
        }
        for (int i = 0; i < persons.length; i++) {
            if ( min>persons[i].getSalary()) {
                min= persons[i].getSalary();
            } else if (max< persons[i].getSalary()) {
                max=persons[i].getSalary();
            }
        }
        System.out.println(" ");
        System.out.println("Min Salary: "+min);
        System.out.println("Max Salary: "+max);

        for (int i = 0; i < persons.length; i++) {
            if (min > persons[i].getPhone().getPrice()) {
                min = persons[i].getPhone().getPrice();
            } else if (max<persons[i].getPhone().getPrice()) {
                max = persons[i].getPhone().getPrice();
            }
        }
        System.out.println("Price phone: "+min);
        System.out.println("Price phone: "+max);
    }
}
    