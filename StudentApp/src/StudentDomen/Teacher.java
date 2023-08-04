package StudentDomen;

public class Teacher extends Person{
    private String acadDegree;
    public Teacher(String firstName, String secondName, int age, String acadDegree) {
        super(firstName, secondName, age);
        this.acadDegree = acadDegree;
    }



    /**
     * @return acadDegree
     */
    public String getAcadDegree() { //возвращает acadDegree
      return acadDegree;
    }
  
    /**
     * @param acadDegree 
     */
    public void setAcadDegree(String acadDegree) { // назначает acadDegree
      this.acadDegree = acadDegree;
    }
    @Override
    public String toString() { // переопределение функции toString, выводится через запятую имя, фамилия, возраст, id
        return "Teacher{" +
                "firstName='" + super.firstName + '\'' +
                ", secondName='" + super.getSecondName() + '\'' +
                ", age=" + super.getAge() +
                ", acadDegree=" + acadDegree +
                '}';
    }
}