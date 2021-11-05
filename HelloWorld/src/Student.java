public class Student {
    private String name;
    private String dateOfBirth;
    private boolean hasStudntHousing;
    private Course course;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public boolean hasStudntHousing() {
        return hasStudntHousing;
    }

    public void setStudntHousing(boolean hasStudntHousing) {
        this.hasStudntHousing = hasStudntHousing;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }
}
