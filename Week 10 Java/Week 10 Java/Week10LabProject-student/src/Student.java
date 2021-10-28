public class Student {
    private String name;
    private int age;

    public Student(String name, int age){
        setName(name);
        setAge(age);
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public boolean setName(String newName){
        boolean isValid = false;
        if (name.length() >= 2) {
            name = newName;
            isValid = true;
        }
        return isValid;
    }

    public boolean setAge(int newAge){
        boolean isValid = false;
        if (age >= 15 && age <= 95) {
            this.age= newAge;
            isValid = true;
        }
        return isValid;
    }

    public String toString(){
        String output = "";
        output += String.format("(%s, %d", name, age);
        return output;
    }
}
