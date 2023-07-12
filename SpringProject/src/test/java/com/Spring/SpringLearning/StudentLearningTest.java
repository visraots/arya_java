package com.Spring.SpringLearning;
import com.Spring.SpringLearning.model.Student;
import com.Spring.SpringLearning.service.StudentService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.*;

public class StudentLearningTest {


        @Mock
        private StudentService studentService;

        @InjectMocks
        private StudentController studentController;

        @BeforeEach
        public void setup() {
            MockitoAnnotations.openMocks(this);
        }

        @Test
        public void testGetStudents() {
            // Set up
            List<Student> students = Arrays.asList(
                    new Student(1, "John"),
                    new Student(2, "Jane")
            );
            when(studentService.getAllStudents()).thenReturn(students);

            // Test
            List<Student> result = studentController.getStudents();

            // Verify
            verify(studentService, times(1)).getAllStudents();
            // Add additional assertions as per your requirements
        }

        @Test
        public void testSaveStudent() {
            // Set up
            Student student = new Student(1, "John");

            // Test
            studentController.saveStudent(student);

            // Verify
            verify(studentService, times(1)).saveStudent(student);
        }

        @Test
        public void testUpdateStudent() {
            // Set up
            Student student = new Student(1, "John");

            // Test
            studentController.updateStudent(student);

            // Verify
            verify(studentService, times(1)).updateStudent(student);
        }

        @Test
        public void testRemoveStudent() {
            // Set up
            int id = 1;

            // Test
            studentController.removeStudent(id);

            // Verify
            verify(studentService, times(1)).removeStudent(id);
        }
    }


