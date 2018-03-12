package lab4zad1;

import java.util.ArrayList;


public class Lab4Zad1 {

    public static void main(String[] args) {
        ArrayList studenci = new ArrayList();
        // ArrayList<Student> studenci = new ArrayList<Student>();
        
        for (int i=0; i<4; i++) {
            studenci.add(new Student(i));
        }
        
        for (int i=0; i<studenci.size(); i++) {
            Student student = (Student)studenci.get(i);
            // Student student = studenci.get(i);
            System.err.println(student.getId());
        }
    }    
}