package StudentDomen;

public class Person {
    protected String firstName;
    protected String secondName;
    protected int age;

    /**
   * Конструктор класса 
   * @param firstName Имя
   * @param secondName Фамилия
   * @param age Возраст
   */
    public Person(String firstName, String secondName, int age) 
    {
        this.firstName=firstName;
        this.secondName=secondName;
        this.age=age;
    }

    public String getFirstName() { //возвращает Имя
        return firstName;
    }

    public void setFirstName(String firstName) { //задает Имя
        this.firstName = firstName;
    }

    public String getSecondName() { //возвращает фамилию
        return secondName;
    }

    public void setSecondName(String secondName) { //задает фамилию
        this.secondName = secondName;
    }

    public int getAge() { //возвращает возраст
        return age;
    }

    public void setAge(int age) { //задает возраст
        this.age = age;
    }

    @Override
    public String toString() { //переопределяет метод toString,выводя через запятую имя, фамилию и возраст
         
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", age=" + age +
                '}';
    }
}