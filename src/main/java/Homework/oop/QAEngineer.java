package Homework.oop;

public class QAEngineer extends Job {
    private int salary;
    private String testingType;
    private boolean isAutomation;
    private String tools;

    public QAEngineer(String name, int experience, int salary, String testingType, boolean isAutomation, String tools) {
        super(name, experience);
        this.salary = salary;
        this.testingType = testingType;
        this.isAutomation = isAutomation;
        this.tools= tools;
    }

    @Override
    public void describeRole() {
        System.out.println(getName() + "is a QA engineer doing testing with" + tools );
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public boolean isAutomation() {
        return isAutomation;
    }

    public void setAutomation(boolean automation) {
        isAutomation = automation;
    }
}
