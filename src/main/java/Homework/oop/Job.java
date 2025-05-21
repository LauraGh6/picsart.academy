package Homework.oop;

public class Job {
    private String name;
    private int experience;

    public String companyName;
    public String jobType;
    public String location;
    public int workingHours;
    public boolean isRemote;

    public Job(String name, int experience) {
        this.name = name;
        this.experience= experience;
    }

    public Job() {

    }
    public String getName(){
        return name;
    }

    public int getExperience() {
        return experience;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public void describeRole() {
        System.out.println("This is a general job role");

    }

    public void describeJob() {
        System.out.println(companyName + " , " + jobType + ", " + isRemote + " , " + workingHours + " , " + location);
    }


}
