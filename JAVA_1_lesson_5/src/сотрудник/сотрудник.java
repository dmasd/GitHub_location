package сотрудник;

public class сотрудник {
    public String name;        //имя
    public String profession;  //профессия
    public String mail;        //электронная почта
    int telephone;      //телефон
    int salary;         //зарплата
    int age;            //возраст

    void data (){   // создаём метод вывода данных
        System.out.println ("\n ФИО: " + name );
        System.out.println ("\n Профессия: " + profession );
        System.out.println ("\n Электронная почта: " + mail );
        System.out.println ("\n Телефон: " + telephone );
        System.out.println ("\n Зарплата: " + salary );
        System.out.println ("\n Возраст: " + age );

        }

    сотрудник(String name, String profession, String mail, int telephone, int salary, int age) {

        this.name = name;
        this.profession = profession;
        this.mail = mail;
        this.telephone = telephone;
        this.salary = salary;
        this.age = age;

    }

    public int getAge()
    {
        return age;
    }
}
