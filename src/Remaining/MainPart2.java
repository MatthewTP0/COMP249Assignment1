package Remaining;
import ProgramClasses.*;

public class MainPart2 {

    public static Object[] copyTheObjects(Object[] objects){

        Object[] copy = new Object[objects.length];
        for (int i = 0; i < objects.length; i++) {
            if(objects[i] instanceof Program){
                copy[i] = ((Program) objects[i]).copyObjectConstructor(objects[i]);
            }
            else {
                copy[i] = new Course((Course) objects[i]);
            }

        }
        for (int i = 0; i<copy.length; i++) {
            System.out.println(copy[i]);
        }
        return copy;
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
        GraduateProgram p2 = new GraduateProgram("Business" , "Finance",Course.sortCourses(new Course[]{c7}), Course.sortCourses(new Course[]{c10}), Course.sumCredits(new Course[]{c7}, new Course[]{c10}), "Concordia", "Jack Hill");
        GraduateProgram p3 = new GraduateProgram("Law" , "Criminal Law", Course.sortCourses(new Course[]{c7, c8, c9}), Course.sortCourses(new Course[]{c10, c11, c12}), Course.sumCredits(new Course[]{c7, c8, c9}, new Course[]{c10, c11, c12}), "Harvard", "John Doe");
        GraduateProgram p4 = new GraduateProgram("Computer Science","Data Analytics", Course.sortCourses(new Course[]{c13, c14, c15}), Course.sortCourses(new Course[]{c10, c11, c12}), Course.sumCredits(new Course[]{c13, c14, c15}, new Course[]{c10, c11, c12}), "Concordia", "Jack Hill");
        GraduateProgram p5 = new GraduateProgram(p4);
        UndergraduateProgram p6 = new UndergraduateProgram("Computer Science","Data Analytics", Course.sortCourses(new Course[]{c13, c14, c15}), Course.sortCourses(new Course[]{c10, c11, c12}), Course.sumCredits(new Course[]{c13, c14, c15}, new Course[]{c10, c11, c12}), "Concordia", true);
        UndergraduateProgram p7 = new UndergraduateProgram("Paramedic","Emergency", Course.sortCourses(new Course[]{c13, c14, c15}), Course.sortCourses(new Course[]{c10, c11, c12, c1}), Course.sumCredits(new Course[]{c13, c14, c15}, new Course[]{c10, c11, c11, c1}), "Vanier College", true);
        UndergraduateProgram p8 = new UndergraduateProgram("Nursing","Emergency", Course.sortCourses(new Course[]{c13, c14, c15}), Course.sortCourses(new Course[]{c10}), Course.sumCredits(new Course[]{c13, c14, c15}, new Course[]{c10}), "Mcgill", false);
        UndergraduateProgram p9 = new UndergraduateProgram("Theology" , "Religion", Course.sortCourses(new Course[]{c7, c8, c9}), Course.sortCourses(new Course[]{c10, c11, c12}), Course.sumCredits(new Course[]{c7, c8, c9}, new Course[]{c10, c11, c12}), "St Marks", false);

        Program[] all_programs = new Program[]{p0,p1,p2,p3,p4,p5,p6,p7,p8,p9};
        Object[] mixed = new Object[]{c1,c3,p0,p1,p2,p3,p4,p5,p6,p7,p8,p9,c1,c2,c3,c4,c5,c6,c7,c8,c9};
        Object[] courses_mixed = new Object[]{c1,c2,c3,c4,c5,c6,c7,c8,c9,c0,c1,c2,c4,c9,c5};
        for (int i = 0; i<mixed.length; i++) {
           System.out.println(mixed[i]);     }
        System.out.println("test1");

        Object copy[] = MainPart2.copyTheObjects(mixed);
        p9.setName("baba");
        System.out.println("test2");
        for (int i = 0; i<copy.length; i++) {
           System.out.println(copy[i]);
                }


    }




}
