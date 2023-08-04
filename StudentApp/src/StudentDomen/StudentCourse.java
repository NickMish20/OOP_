package StudentDomen;

import java.util.Iterator;
import java.util.List;

public class StudentCourse implements Iterable<StudentGroup>{
    List<StudentGroup> course;
    private int countStudent;

    public StudentCourse(List<StudentGroup> course, int countStudent) {
        this.course = course;
        this.countStudent = countStudent;
    }

    @Override
    public String toString() {
        return "StudentCourse{" +
        "course=" + course +
        ", countStudent=" + countStudent +
        '}';
    }

    public List<StudentGroup> getCourse() {
        return course;
    }

    public void setCourse(List<StudentGroup> course) {
        this.course = course;
    }


    public int getCountStudent() {
        return countStudent;
    }

    public void setCountStudent(int countStudent) {
        this.countStudent = countStudent;
    }
    // @Override
    // public int compareTo (StudentCourse o) {
    //     if(this.getCountStudent()==o.getCountStudent())
    //         {
    //             return 0;
    //         }
    //         if(this.getCountStudent()<o.getCountStudent())
    //         {
    //             return -1;
    //         }
    //         return 1;
    // }
    @Override
    public Iterator<StudentGroup> iterator() {

        return new Iterator<StudentGroup>()
        {
            private int counter;
       
            @Override
            public boolean hasNext() {
                return counter<course.size();
            }
        
            @Override
            public StudentGroup next() {
                if(!hasNext())
                {
                    return null;
                }
                return course.get(counter++);
            }
        };
    }
}
