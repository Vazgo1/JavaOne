package lesson5;

public class Employees {
    public String fio;
    public String post;
    public String email;
    public int phone;
    public int salary;
    public int age;

    public Employees(String fio, String post, String email, int phone, int salary, int age) {
        this.fio = fio;
        this.post = post;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }


    public void info (){
        System.out.println("fio ="+ this.fio +" post = " + this.post + " email =" + this.email + " phone = " + this.phone + " salary = " + this.salary +" age = " + this.age );

    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {

        Employees[] employees = new Employees[5];
        employees[0] = new Employees("Gribanov Nikolay ", "Diveloper", "Gribanov@mail.ru", 545454, 85000, 32 );
        employees[1] = new Employees("Diakov Sergey ", "Diveloper ",  " Diakov.ru",  535353 ,8500 , 28 );
        employees[2] = new Employees("Samoshenko Vladislav ", "Diveloper", "Samoshenko.ru", 505453, 85000, 27 );
        employees[3] = new Employees("Ivanov Ivan ", "Diveloper", "Ivanov@mail.ru", 506454, 85000, 45 );
        employees[4] = new Employees("Petrov Nikolay ", "Diveloper", "Petrov@mail.ru", 568454, 85000, 41 );
        for (int i = 0; i < employees.length; i++){
            if(employees[i].getAge()>40){
                employees[i].info();
            }
        }
    }

}
