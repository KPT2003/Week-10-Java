public class DriverClass {
    public static void main(String[] args) {
        University monash=new University("Monash",20);
        monash.addFaculty("FIT");
        monash.addFaculty("Law");
        monash.addFaculty("Business");
        monash.addFaculty("La");//rejected
        System.out.println("Faculties="+monash.getFaculties()); //test faculties OK
        monash.addStudent("John");
        monash.addStudent("Tim");
        monash.addStudent("Emma");
        monash.addStudent("E"); //rejected
        System.out.println("Students="+monash.getStudents());
        monash.addEnrollment("John","FIT");
        monash.addEnrollment("Emma","FIT");
        monash.addEnrollment("Tim","Law");
        System.out.println("Enrollments="+monash.getEnrollment()); // test enrollment OK

        int studentsInFIT=monash.countStudentsPerFaculty("FIT");
        int studentsInLaw=monash.countStudentsPerFaculty("Law");
        int studentsInBusiness=monash.countStudentsPerFaculty("Business");
        System.out.println("Number of students in FIT ="+studentsInFIT);
        System.out.println("Number of students in Law ="+studentsInLaw);
        System.out.println("Number of students in Business ="+studentsInBusiness);





    }
}
