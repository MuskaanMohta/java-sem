public class MVC
{
    public static void main(String args[])
    {
        Employee model = retrieveEmployeeFromDatabase();
        View view = new View();
        Controller controller = new Controller(model,view);
        controller.updateView();
        int newSal=(int)(controller.getEmployeeSalary()*1.10);
        controller.setEmployeeSalary(newSal);
        controller.updateView();
    }
    public static Employee retrieveEmployeeFromDatabase()
    {
        Employee emp1 = new Employee();
        emp1.setId(1012345);
        emp1.setName("Muskaan Mohta");
        emp1.setSalary(150000);
        return emp1;
    }
}