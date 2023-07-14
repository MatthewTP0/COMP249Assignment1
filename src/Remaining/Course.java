package Remaining;

import ProgramClasses.Program;

import javax.crypto.Cipher;

public class Course {
    private String name;
    private int credits;

    public Course() {}

    public Course(String name, int credits) {
        this.name = name;
        this.credits = credits;
    }

    public Course(Course courseCopy) {
        this.name = courseCopy.name;
        this.credits = courseCopy.credits;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    @Override
    public String toString() {
        return "Course [name=" + name + ", credits=" + credits + "]";

    }
    public static Course[] sortCourses(Course[] courses){
        Course temp = new Course();
        for(int i=0; i<courses.length; i++){
            for(int j=0; j<courses.length; j++){
                if (courses[i].name.compareTo(courses[j].name)<0){
                    temp = courses[i];
                    courses[i] = courses[j];
                    courses[j] = temp;


                }
            }
        }

//Needs to be tested
        return courses;
    }
    public static int sumCredits(Course[] courses, Course[] courses1){
        int sum = 0;
        int sum2 = 0;
        for(int i = 0; i< courses.length; i++){
            sum += courses[i].credits;
        }
        for (int i = 0; i<courses1.length; i++){
            sum2 += courses1[i].credits;
        }
        sum = sum +sum2;
        return sum;
    }
}
