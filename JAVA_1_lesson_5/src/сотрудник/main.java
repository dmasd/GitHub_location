package сотрудник;

public class main {
    public static void main(String[] args)
    {

        Person [] persArray  = new Person[5];  // массив из 5 сотрудников
        persArray[0] = new Person("Чебуреков Чебурек Чебурекович", "Повар", "chebyrek@yandex.ru", "21563", 20000, 25);
        persArray[1] = new Person("Васюткин Роман Одуванчикович", "Садовник", "odyfanchik@yandex.ru", "573234", 30000, 34);
        persArray[2] = new Person("Любовь Петровна Генадьевна", "Муза любви", "hot_love@yandex.ru", "745643", 50000, 21);
        persArray[3] = new Person("Кран Кранович Протечкин", "Сантехник", "very_pipe@uandex.ru", "5645645", 30000, 29);
        persArray[4] = new Person("Константин Константинович Костюшкин", "Электрик","electro@yandex.ru",  "56757567", 40000,47);


        for (int i = 0; i < Person.length; i++) // 40+ на выход
        {
            if (Person[i].getAge() > 40)
            {
                Person[i].data();
            }
        }
}}
