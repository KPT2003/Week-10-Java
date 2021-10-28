import java.util.ArrayList;

public class University {
    private String universityName;
    private int worldRank;
    private ArrayList<Faculty> faculities;
    private ArrayList<Student> student;
    private ArrayList<Enrollment> enrollment;

    public University(String universityName,int worldRank){
        faculities = new ArrayList();
        student = new ArrayList();
        enrollment = new ArrayList();
        setUniversityName(universityName);
        setRank(worldRank);
    }

    public String getUniversityName(){
        return universityName;
    }

    public int getWorldRank(){
        return worldRank;
    }

    public void setUniversityName(String universityName){
        if (universityName.length() >= 3) {
            this.universityName = universityName;
        }
    }

    public boolean setRank(int newWorldRank){
        boolean isValid = false;
        if (worldRank > 0) {
            worldRank = newWorldRank;
            isValid = true;
        }
        return (isValid);
    }

    public ArrayList<Faculty> getFaculties(){
        return faculities;
    }

    public ArrayList<Enrollment> getEnrollment(){
        return enrollment;
    }


    public String toString(){
        String output = "";
        output += String.format("(%s, %d", universityName, worldRank, faculities, student, enrollment);
        return output;
    }

}
