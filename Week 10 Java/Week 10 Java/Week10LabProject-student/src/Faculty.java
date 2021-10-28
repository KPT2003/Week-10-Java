public class Faculty {
    private String facultyName;

    public Faculty(String facultyName){
        setFacultyName(facultyName);
    }

    public String getFacultyName(){
        return facultyName;
    }
    public void setFacultyName(String newFacultyName){
        facultyName = newFacultyName;
    }

    public String toString(){
        String output = "";
        output += String.format("(%s, %d");
        return output;
    }


}
