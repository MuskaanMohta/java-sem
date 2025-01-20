class Controller
{
    private Employee model;
    private View view;
    Controller(Employee model,View view)
    {
        this.model=model;
        this.view=view;
    }
    public int getEmployeeSalary()
    {
        return model.getSalary();
    }
    public void setEmployeeSalary(int salary)
    {
        model.setSalary(salary);
    }
    public void updateView()
    {
        view.printEmployeeDetails(model.getId(),model.getName(),model.getSalary());
    }
}