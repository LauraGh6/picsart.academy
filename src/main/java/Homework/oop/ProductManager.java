package Homework.oop;

public class ProductManager extends Job {
    private String productLifeCycle;
    private int productLaunches;
    private String tools;
    private double budgetResponsibility;

    public ProductManager(String name, int experience, String productLifeCycle, int productLaunches, String tools, double budgetResponsibility) {
        super(name, experience);
        this.productLifeCycle = productLifeCycle;
        this.productLaunches = productLaunches;
        this.tools = tools;
        this.budgetResponsibility = budgetResponsibility;
    }

    @Override
    public void describeRole() {
        System.out.println(getName() + " is a Product Manager managing" + productLifeCycle + "lifecycle with" + productLaunches + "launches");
    }

    public void manageProduct() {
        System.out.println("Managing product with:" + tools);
    }

    public String getProductLifeCycle() {
        return productLifeCycle;
    }

    public void setProductLifeCycle(String productLifeCycle) {
        this.productLifeCycle = productLifeCycle;
    }

    public String getTools() {
        return tools;
    }

    public void setTools(String tools) {
        this.tools = tools;
    }

    public int getProductLaunches() {
        return productLaunches;
    }

    public void setProductLaunches(int productLaunches) {
        this.productLaunches = productLaunches;
    }
}
