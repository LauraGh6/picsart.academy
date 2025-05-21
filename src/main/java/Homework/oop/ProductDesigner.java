package Homework.oop;

public class ProductDesigner extends Job {
    private String designTools;
    private String experienceLevel;
    private String designFocus;
    private int salary;

    public ProductDesigner(String name, int experience, String designTools, String experienceLevel, String designFocus, int salary) {
        super(name, experience);
        this.designTools = designTools;
        this.experienceLevel = experienceLevel;
        this.designFocus = designFocus;
        this.salary = salary;

    }

    @Override
    public void describeRole() {
        System.out.println(getName() + "is a Product Designer using" + designTools + ".");
    }

    public String getDesignTools() {
        return designTools;
    }

    public void setDesignTools(String designTools) {
        this.designTools = designTools;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}

