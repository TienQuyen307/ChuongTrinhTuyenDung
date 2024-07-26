package models;

public class School {
    private String schoolId;
    private String name;
    private String email;
    private String fieldOfStudy;

    public School(String schoolId, String name, String email, String fieldOfStudy) {
        this.schoolId = schoolId;
        this.name = name;
        this.email = email;
        this.fieldOfStudy = fieldOfStudy;
    }

    public String getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(String schoolId) {
        this.schoolId = schoolId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFieldOfStudy() {
        return fieldOfStudy;
    }

    public void setFieldOfStudy(String fieldOfStudy) {
        this.fieldOfStudy = fieldOfStudy;
    }
}

