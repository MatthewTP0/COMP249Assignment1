package ProgramClasses;
import Remaining.*;
public class Program {
    private String name;
    private String specialization;
    private Course[] requiredCourses;
    private Course[] electiveCourses;
    private int totalCredits;
    private String institution;


    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public Course[] getRequiredCourses() {
        return requiredCourses;
    }

    public void setRequiredCourses(Course[] requiredCourses) {
        this.requiredCourses = requiredCourses;
    }

    public Course[] getElectiveCourses() {
        return electiveCourses;
    }

    public void setElectiveCourses(Course[] electiveCourses) {
        this.electiveCourses = electiveCourses;
    }

    public int getTotalCredits() {
        return totalCredits;
    }

    public void setTotalCredits(int totalCredits) {
        this.totalCredits = totalCredits;
    }

    public String getInstitution() {
        return institution;
    }

    public void setInstitution(String institution) {
        this.institution = institution;
    }


    public Program() {}

    public Program(String name, String specialization, Course[] requiredCourses, Course[] electiveCourses, int totalCredits, String institution) {
        this.name = name;
        this.specialization = specialization;
        this.requiredCourses = requiredCourses;
        this.electiveCourses = electiveCourses;
        this.totalCredits = totalCredits;
        this.institution = institution;
    }

    public Program (Program programCopy) {
        this.name = programCopy.name;
        this.specialization = programCopy.specialization;
        this.requiredCourses = programCopy.requiredCourses;
        this.electiveCourses = programCopy.electiveCourses;
        this.totalCredits = programCopy.totalCredits;
        this.institution = programCopy.institution;
    }
    public Object copyObjectConstructor (Object obj){
        Program program = new Program((Program) obj);
        return program;
    }
    @Override
    public String toString() {
        return "Program [name=" + name + ", specialization=" + specialization + ", requiredCourses="
                + ", totalCredits=" + totalCredits + ", institution=" + institution + "]";
    }
    public static void programArraytoString(Program[] programs)
    {
        for (int i =0; i < programs.length; i++){
        System.out.println(programs[i].toString());

        }
    }





    @Override
    public boolean equals(Object obj) {
        if (obj == null){
            return false;
        }
        if (obj == this){
            return true;
        }
        if (!(obj instanceof Program)){
            return false;
        }
        if (obj.getClass() != this.getClass()){
            return false;
        }

        Program program = (Program) obj;

        for (int i=0; i<requiredCourses.length; i++){
            if(!(requiredCourses[i].getName().equals(program.requiredCourses[i].getName()))){
                return false;
            }
            if (!(requiredCourses[i].getCredits() == (program.requiredCourses[i].getCredits()))){
                return false;
            }

        }
        for (int i=0; i<electiveCourses.length; i++){
            if(!(electiveCourses[i].getName().equals(program.electiveCourses[i].getName()))){
                return false;
            }
            if (!(electiveCourses[i].getCredits() == (program.electiveCourses[i].getCredits()))){
                return false;
            }}

        if (name.equals(program.name) && specialization.equals(program.specialization)&& (totalCredits == program.totalCredits) && institution.equals(program.institution)) {
            return true;
        }
        else {
            return false;
        }

}
}
