package com.learnJava.streams;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

public class StreamsMapReduceExample {

    public static void main(String[] args) {

        int numberOfNotebooks = StudentDataBase.getAllStudents().stream()
            .filter((student -> student.getGradeLevel() >= 3))
            .map(Student::getNoteBooks)
            .reduce(0, Integer::sum);
        System.out.println("Number of notebooks: " + numberOfNotebooks);
    }
}
