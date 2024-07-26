package models;

public class Candidate {
    private String candidateId;
    private String name;
    private int birthYear;
    private String schoolId;
    private String position;
    private String result;

    public Candidate(String candidateId, String name, int birthYear, String schoolId, String position) {
        this.candidateId = candidateId;
        this.name = name;
        this.birthYear = birthYear;
        this.schoolId = schoolId;
        this.position = position;
        this.result = null;
    }

    public String getCandidateId() {
        return candidateId;
    }

    public void setCandidateId(String candidateId) {
        this.candidateId = candidateId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public String getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(String schoolId) {
        this.schoolId = schoolId;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }
}
