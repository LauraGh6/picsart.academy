package Homework.oop;

public class Main {
    public static void main(String[] args) {
        Job job = new Job();
        job.companyName = "Apple";
        job.jobType = "Full-time";
        job.location = "USA";
        job.workingHours = 40;
        job.isRemote = false;

        System.out.println(job.companyName);
        System.out.println(job.jobType);
        System.out.println(job.location);
        System.out.println(job.workingHours);
        System.out.println(job.isRemote);


        ProductDesigner lauraDesigner = new ProductDesigner();
        lauraDesigner.jobType = "Full-time";
        lauraDesigner.companyName = "Apple";
        lauraDesigner.workingHours = 40;
        lauraDesigner.designTools = "Figma,Sketch";
        lauraDesigner.experienceLevel = "Senior";
        lauraDesigner.salary = 1000;
        lauraDesigner.designFocus = "UI";

        System.out.println(lauraDesigner.companyName);
        System.out.println(lauraDesigner.designFocus);
        System.out.println(lauraDesigner.designTools);
        System.out.println(lauraDesigner.experienceLevel);
        System.out.println(lauraDesigner.salary);

        lauraDesigner.describeJob();


        QAEngineer arthurEngineer = new QAEngineer();
        arthurEngineer.companyName = "Apple";
        arthurEngineer.location = "USA";
        arthurEngineer.jobType = "Part-time";
        arthurEngineer.isRemote = false;
        arthurEngineer.salary = 800;
        arthurEngineer.testingType = "Automation";
        arthurEngineer.isAutomation = true;
        arthurEngineer.tools = "Selenium";

        System.out.println(arthurEngineer.jobType);
        System.out.println(arthurEngineer.isRemote);
        System.out.println(arthurEngineer.testingType);
        System.out.println(arthurEngineer.tools);
        System.out.println(arthurEngineer.isAutomation);

        arthurEngineer.describeJob();


        ProductManager andrewManager = new ProductManager();
        andrewManager.companyName = "Apple";
        andrewManager.location = "USA";
        andrewManager.workingHours = 40;
        andrewManager.isRemote = false;
        andrewManager.productLifeCycle = "Agile";
        andrewManager.productLaunches = 15;
        andrewManager.budgetResponsibility = 847.99;
        andrewManager.tools = "JIRA";

        System.out.println(andrewManager.location);
        System.out.println(andrewManager.jobType);
        System.out.println(andrewManager.productLaunches);
        System.out.println(andrewManager.productLifeCycle);
        System.out.println(andrewManager.budgetResponsibility);
        System.out.println(andrewManager.tools);

        andrewManager.describeJob();


    }
}
