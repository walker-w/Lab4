package Lab4Start;

public class Faculty extends Employee {
    private String[] courses;

    public Faculty(String inName, double inSalary, String[] inCourses){
        name = inName;
        salary = inSalary;
        courses = inCourses;
    }

    public String getName(){
        return String.format("Professor %s", name);
    }

    public String[] getCourses(){
        String[] copy_courses = new String[courses.length];
        for(int i = 0; i < courses.length; i++){
            copy_courses[i] = courses[i];
        }
        return copy_courses;
    }

    public String getCourseNames() {
        String course_names = "";
        for(int i =0; i < courses.length; i++){
            course_names = course_names + " " + courses[i] + " ";
        }
        return course_names;
    }

    public void setCourses(String[] new_courses){
        courses = new String[new_courses.length];
        for (int i = 0; i < new_courses.length; i++) {
            courses[i] = new String(new_courses[i]);
        }
    }

    public String toString(){
        return String.format("%-10s %-15s \n%-10s %-15.2f \n%-9s %-15s",
                "Name:", name, "Salary:", salary, "Courses:", getCourseNames());
    }




}
