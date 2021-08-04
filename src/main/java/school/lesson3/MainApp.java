package school.lesson3;

public class MainApp {
    public static void main(String[] args) {
        Employee[] emplArray = new Employee[5];
        emplArray[0] = new Employee("Shevchenko Olena", "HR", "shevolena@gmail.com", "380994425489", 12000, 20);
        emplArray[1] = new Employee("Dorosh Nikita", "Developer", "dorosh_n@gmail.com", "380962210022", 40000, 43);
        emplArray[2] = new Employee("Yakymenko Petro", "Administrator", "petroyakymenko@gmail.com", "380931223144", 20000, 29);
        emplArray[3] = new Employee("Ivanova Anna", "PM", "ivanova_a@gmail.com", "380503412553", 55000, 51);
        emplArray[4] = new Employee("Dmytruk Bogdan", "QA", "dbogd@gmail.com", "380639000121", 29000, 34);

        System.out.println("Информация о сотрудниках, которые старше 40!");
        for(Employee employee : emplArray) {
            if(employee.getAge() > 40) {
                employee.info();
            }
        }
    }
}
