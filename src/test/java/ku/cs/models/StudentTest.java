package ku.cs.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {
    Student s1;

    @BeforeEach
    void init() {
        s1 = new Student("6610402043", "ping");
    }

    @Test
    void testAddScore() {
        //Student s1 = new Student("6610402043", "ping");// Already initialize in @BeforeEach
        s1.addScore(40);
        assertEquals(40, s1.getScore()); // expected and actual output.
        s1.addScore(30);
        assertEquals(70, s1.getScore());
    }

    @Test
    void testCalculateGrade() {
        //Student s1 = new Student("6610402043", "ping", 50);// Already initialize in @BeforeEach
        s1.addScore(10);
        assertEquals("C", s1.grade());
    }

    @Test
    void testGrade() {
        s1.addScore(80);
        assertEquals("A", s1.grade());
    }

    @Test
    void testChangeName() {
        s1.changeName("per");
        assertEquals("per", s1.getName());
    }

    @Test
    void testIsId() {
        s1.isId("6610402043");
        assertEquals("6610402043", s1.getId());
    }
}