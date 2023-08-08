package Class;

import java.util.Iterator;
import java.util.List;

// В рамках имплементации интерфейса Iterable нам потребуется вернуть объект типа 
// итератора (Iterator) для группы, создадим соответствующий класс:


public class StudentGroupIterator implements Iterator<Student> {

    private int counter;
    private final List<Student> students;

    public StudentGroupIterator(StudentGroup studentGroup) {
        this.students = studentGroup.getStudents();
        this.counter = 0;
    }

    @Override
    public boolean hasNext() {
        return counter < students.size() - 1;
    }

    @Override
    public Student next() {
        if (!hasNext()){
            return null;
        }
        counter++;
        return students.get(counter);
    }
}
