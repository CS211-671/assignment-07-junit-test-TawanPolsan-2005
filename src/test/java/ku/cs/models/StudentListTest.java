package ku.cs.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StudentListTest {
    StudentList studentlist;

    @BeforeEach
    void init() {
        studentlist = new StudentList();
        studentlist.addNewStudent("6610402043", "ping");
        studentlist.addNewStudent("6610402044", "pung");
        studentlist.addNewStudent("6610402045", "per");
    }

    @Test
    void TestAddNewStudent() {
        String expected = "{id: '6610402043', name: 'ping', score: 0.0}";
        String actual = studentlist.getStudents().get(0).toString();
        assertEquals(expected, actual);
    }

    @Test
    void TestFindStudentById() {
        Student student1 = studentlist.findStudentById("6610402043");
        Student student2 = studentlist.findStudentById("6610402044");
        Student student3 = studentlist.findStudentById("6610402045");
        assertEquals("ping", student1.getName());
        assertEquals("pung", student2.getName());
        assertEquals("per", student3.getName());
    }

    @Test
    void TestGiveScoreId() {
        studentlist.giveScoreToId("6610402043", 10.0);
        studentlist.giveScoreToId("6610402044", 20.0);
        studentlist.giveScoreToId("6610402045", 30.0);

        Student student1 = studentlist.findStudentById("6610402043");
        Student student2 = studentlist.findStudentById("6610402044");
        Student student3 = studentlist.findStudentById("6610402045");

        assertEquals(10.0, student1.getScore());
        assertEquals(20.0, student2.getScore());
        assertEquals(30.0, student3.getScore());
    }

    @Test
    void TestViewGradeOfId() {
        studentlist.giveScoreToId("6610402043", 80.0);
        studentlist.giveScoreToId("6610402044", 70.0);
        studentlist.giveScoreToId("6610402045", 60.0);

        String grade1 = studentlist.viewGradeOfId("6610402043");
        String grade2 = studentlist.viewGradeOfId("6610402044");
        String grade3 = studentlist.viewGradeOfId("6610402045");

        assertEquals("A", grade1);
        assertEquals("B", grade2);
        assertEquals("C", grade3);
    }
}