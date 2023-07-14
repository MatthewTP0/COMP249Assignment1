package Remaining;
import ProgramClasses.*;
public class Main {

    public static int getCreditCost(Program program) {
        if (program instanceof GraduateProgram) {
            return GraduateProgram.getCreditCost();
        } else if (program instanceof UndergraduateProgram) {
            return UndergraduateProgram.getCreditCost();
        } else {
            // Default value if the program type is unknown
            return 0;
        }
    }
    public static String findLeastAndMostExpensiveProgram(Program[] programsArr) {
        if (programsArr == null || programsArr.length == 0) {
            return "There are no programs.";
        }


        Program highest = programsArr[0];
        Program lowest = programsArr[0];

        for (int i = 1; i < programsArr.length; i++) {
            int highestTotalCost = highest.getTotalCredits() * getCreditCost(programsArr[i]);
            int currentTotalCost = programsArr[i].getTotalCredits() * getCreditCost(programsArr[i]);

            if (currentTotalCost > highestTotalCost) {
                highest = programsArr[i];
            } else if (currentTotalCost < highestTotalCost) {
                lowest = programsArr[i];
            }
        }

        String result = "The highest is " + highest.toString() + "\nThe lowest is " + lowest.toString();
        return result;
    }

    public static void main(String[] args) {

    	//Object Creation
        Course c0 = new Course("Comp",4);
        Course c1 = new Course("Calculus",4);
        Course c2 = new Course("Programming",4);
        Course c3 = new Course("History", 3);
        Course c4 = new Course("Cooking",2);
        Course c5 = new Course("Swimming",2);
        Course c6 = new Course("Weightlifting",2);
        Course c7 = new Course("Economics",4);
        Course c8 = new Course("Software",5);
        Course c9 = new Course("Material Science", 5);
        Course c10 = new Course("Biology",5 );
        Course c11 = new Course("Psychology",3);
        Course c12 = new Course("Fishing", 2);
        Course c13 = new Course("Physics",5);
        Course c14 = new Course("Chemistry",5);
        Course c15 = new Course("Physical Science", 4);
        
        CertificateProgram p0 = new CertificateProgram("RealEstate", "Agricultural", Course.sortCourses(new Course[]{c12, c9, c10}), Course.sortCourses(new Course[]{c6, c4, c5}), Course.sumCredits(new Course[]{c12, c9, c10}, new Course[]{c6, c4, c5}), "Concordia", 10);
        CertificateProgram p1 = new CertificateProgram("RealEstate", "Commercial", Course.sortCourses(new Course[]{c12, c9, c10}), Course.sortCourses(new Course[]{c6, c4, c5}), Course.sumCredits(new Course[]{c12, c9, c10}, new Course[]{c6, c4, c5}), "John Abbott", 10);
        GraduateProgram p2 = new GraduateProgram("Business" , "Finance",Course.sortCourses(new Course[]{c7, c8, c9}), Course.sortCourses(new Course[]{c10, c11, c12}), Course.sumCredits(new Course[]{c7, c8, c9}, new Course[]{c10, c11, c12}), "Concordia", "Jack Hill");
        GraduateProgram p3 = new GraduateProgram("Law" , "Criminal Law", Course.sortCourses(new Course[]{c7, c8, c9}), Course.sortCourses(new Course[]{c10, c11, c12}), Course.sumCredits(new Course[]{c7, c8, c9}, new Course[]{c10, c11, c12}), "Harvard", "John Doe");
        GraduateProgram p4 = new GraduateProgram("Computer Science","Data Analytics", Course.sortCourses(new Course[]{c13, c14, c15}), Course.sortCourses(new Course[]{c10, c11, c12}), Course.sumCredits(new Course[]{c13, c14, c15}, new Course[]{c10, c11, c12}), "Concordia", "Jack Hill");
        GraduateProgram p5 = new GraduateProgram(p4);
        UndergraduateProgram p6 = new UndergraduateProgram("Computer Science","Data Analytics", Course.sortCourses(new Course[]{c13, c14, c15}), Course.sortCourses(new Course[]{c10, c11, c12}), Course.sumCredits(new Course[]{c13, c14, c15}, new Course[]{c10, c11, c12}), "Concordia", true);
        UndergraduateProgram p7 = new UndergraduateProgram("Paramedic","Emergency", Course.sortCourses(new Course[]{c13, c14, c15}), Course.sortCourses(new Course[]{c10, c11, c12, c1}), Course.sumCredits(new Course[]{c13, c14, c15}, new Course[]{c10, c11, c11, c1}), "Vanier College", true);
        UndergraduateProgram p8 = new UndergraduateProgram("Nursing","Emergency", Course.sortCourses(new Course[]{c13, c14, c15}), Course.sortCourses(new Course[]{c10}), Course.sumCredits(new Course[]{c13, c14, c15}, new Course[]{c10}), "Mcgill", false);
        UndergraduateProgram p9 = new UndergraduateProgram("Theology" , "Religion", Course.sortCourses(new Course[]{c7, c8, c9}), Course.sortCourses(new Course[]{c10, c11, c12}), Course.sumCredits(new Course[]{c7, c8, c9}, new Course[]{c10, c11, c12}), "St Marks", false);
        
        //Creation of Program Array
        Program[] all_programs = new Program[]{p0,p1,p2,p3,p4,p5,p6,p7,p8,p9};
        
        //Testing Equality
        //`Program.programArraytoString(all_programs);
        System.out.println(all_programs[2].equals(all_programs[5])); //same class but copy constructor
        System.out.println(all_programs[4].equals(all_programs[5])); //same class
        System.out.println(all_programs[2].equals(all_programs[4])); //same class, same coordinator
        System.out.println(all_programs[8].equals(all_programs[1])); //different class
        System.out.println(all_programs[4].equals(all_programs[6])); //same class, copy of p4

        
    
/*
        Course[] requiredCourses1 = new Course[2];
        requiredCourses1[0] = c1;
        requiredCourses1[1]= c2;
        Course.sortCourses(requiredCourses1);



        Course[] electiveCourses1 = new Course[2];
        electiveCourses1[0] = c3;
        electiveCourses1[1] = c4;
        Course.sortCourses(electiveCourses1);



        int totalCredits1 = 0;
        for(Course courseElement:requiredCourses1 ){
            totalCredits1 += courseElement.getCredits();
        }
        for(Course courseElement:electiveCourses1 ){
            totalCredits1 += courseElement.getCredits();
        }
        //UndergraduateProgram default1 = new UndergraduateProgram();
        UndergraduateProgram.setCreditCost(5);

        int totalCost1 = (UndergraduateProgram.getCreditCost())*totalCredits1;

        Program[] programsArr = new Program[2];
        programsArr[0] = p0;
        programsArr[1] = p1;

        System.out.println(findLeastAndMostExpensiveProgram(programsArr));
*/

















    }
}