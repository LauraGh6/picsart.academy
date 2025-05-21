package Homework.oop;

public class Main {
    public static void main(String[] args) {
        Job job = new Job();
        job.companyName = "Apple";
        job.jobType = "Full-time";
        job.location = "USA";
        job.workingHours = 40;
        job.isRemote = false;

        job.describeJob();

        Job lauraDesigner = new ProductDesigner("Laura", 7, "Figma, Sketch", "Senior","UI",1000);
        Job andrewManager = new ProductManager("Andrew", 6,"Agile", 6,"Jira", 1200);
        Job arthurEngineer = new QAEngineer("Arthur", 3, 700,"Automation",true, "Selenium");

        lauraDesigner.describeRole();
        andrewManager.describeRole();
        arthurEngineer.describeRole();




    }
}
