package StudentDomen;

public class Student extends Person implements Comparable<Student>{ // класс наследуется от Person, подключается станлдартный интерфейс Comparable по студентам: Comparable<Student> 
    int id;
  
    public Student(String firstName, String secondName, int age, int id) {
      super(firstName, secondName, age); // параметры берутся из родительского класса
      this.id = id; // добавляется новый праметр 
    }
  
    /**
     * @return id
     */
    public int getId() { //возвращает id
      return id;
    }
  
    /**
     * @param id присваевает уник. номер
     */
    public void setId(int id) { // назначает id
      this.id = id;
    }
    @Override
    public String toString() { // переопределение функции toString, выводится через запятую имя, фамилия, возраст, id
        return "Student{" +
                "firstName='" + super.firstName + '\'' +
                ", secondName='" + super.getSecondName() + '\'' +
                ", age=" + super.getAge() +
                ", id=" + id +
                '}';
    }

    @Override
    public int compareTo(Student o) { //переопределение сортировки, по какому принципу сортируем
        //System.out.println(super.getFirstName()+" - "+o.getFirstName());
        if(this.getAge()==o.getAge())
        {
            if(this.getId()==o.getId())
            {
                return 0;
            }
            if(this.getId()<o.getId())
            {
                return -1;
            }
            return 1;
        }
        if(this.getAge()<o.getAge())
        {
        return -1;
        }        
        return 1;
    }
  }