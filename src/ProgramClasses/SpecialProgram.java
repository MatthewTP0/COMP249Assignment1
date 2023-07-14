package ProgramClasses;
import Remaining.*;
public class SpecialProgram extends Program{
    private int duration;
    private static int creditCost;

    public SpecialProgram() {
        super();
    }
    public SpecialProgram(String name, String specialization, Course[] requiredCourses, Course[] electiveCourses, int totalCredits, String institution, int duration) {
        super(name, specialization, requiredCourses, electiveCourses, totalCredits, institution);
        this.duration = duration;
    }
    public SpecialProgram(SpecialProgram specialProgram) {
        super(specialProgram);
        this.duration = specialProgram.duration;
    }

    public static int getCreditCost() {
        return creditCost;
    }

    public static void setCreditCost( int creditCostIn){
        creditCost = creditCostIn;
    }

    public String toString() {
        return super.toString().substring(0 , super.toString().length()-1) + ", duration=" + duration + "]" ;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }

        if (!(obj instanceof SpecialProgram)) {
            return false;
        }

        SpecialProgram program = (SpecialProgram) obj;
        return duration == program.duration;
    }


}
