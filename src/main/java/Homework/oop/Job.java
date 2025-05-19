package Homework.oop;

public class Job {
    String companyName;
    String jobType;
    String location;
    int workingHours;
    boolean isRemote;

    void describeJob() {
        System.out.println(companyName + " , " + jobType + ", " + isRemote + " , " + workingHours + " , " + location);
    }


}
