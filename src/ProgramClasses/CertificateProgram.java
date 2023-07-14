package ProgramClasses;
import Remaining.*;

import java.security.cert.Certificate;

public class CertificateProgram extends Program{
    private int capacity;
    private static int creditCost;

    public CertificateProgram() {
        super();
    }

    public CertificateProgram(String name, String specialization, Course[] requiredCourses, Course[] electiveCourses, int totalCredits, String institution, int capacity) {
        super(name, specialization, requiredCourses, electiveCourses, totalCredits, institution);
        this.capacity = capacity;
    }
    public CertificateProgram(CertificateProgram certificateProgram) {
        super(certificateProgram);
        this.capacity = certificateProgram.capacity;
    }

    public static int getCreditCost() {
        return creditCost;
    }

    public static void setCreditCost( int creditCostIn){
        creditCost = creditCostIn;
    }

    @Override
    public String toString() {
        return super.toString().substring(0 , super.toString().length()-1) + ", capacity=" + capacity + "]" ;
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }

        if (!(obj instanceof CertificateProgram)) {
            return false;
        }

        CertificateProgram program = (CertificateProgram) obj;
        return capacity == program.capacity;
    }
}
