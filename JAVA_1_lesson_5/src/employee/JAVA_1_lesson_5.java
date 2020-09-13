package employee;

public class JAVA_1_lesson_5 {
    public static void main (String[] args) {

        String [] Person  = new  String PersArray [5];  // массив из 5 сотрудников
        Person [0] = new persArray("Чебуреков Чебурек Чебурекович", "Повар", "chebyrek@yandex.ru", "21563", 20000, 25);
        Person [1] = new persArray("Васюткин Роман Одуванчикович", "Садовник", "odyfanchik@yandex.ru", "573234", 30000, 34);
        Person [2] = new persArray("Любовь Петровна Генадьевна", "Муза любви", "hot_love@yandex.ru", "745643", 50000, 21);
        Person [3] = new persArray("Кран Кранович Протечкин", "Сантехник", "very_pipe@uandex.ru", "5645645", 30000, 29);
        Person [4] = new persArray("Константин Константинович Костюшкин", "Электрик","electro@yandex.ru",  "56757567", 40000,47);


        for (int i = 0; i < persArray.length; i++) // 40+ на выход
        {
            if (persArray[i].getAge() > 40)
            {
                persArray[i].data();
            }
        }
    }}
