
package observer;

import java.util.Random;

public class Company {

    private Random random = new Random();

    Publisher jobAgency;

    private String name;

    private int maxSalary;

    public Company(Publisher jobAgency, String name, int maxSalary) {
        this.jobAgency = jobAgency;
        this.name = name;
        this.maxSalary = maxSalary;
    }

    public void needEmployee(){
        int salary = random.nextInt(maxSalary);
        jobAgency.sendOffer(name, salary);
    }

    public void publishVacancy(String title, JobVacancyType type) {
        JobVacancy vacancy = new JobVacancy(title, type);
        jobAgency.sendVacancy(vacancy);
    }
    
}