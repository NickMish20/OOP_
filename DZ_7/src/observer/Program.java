
package observer;

public class Program {

    @param args
    public static void main(String[] args) {
        Publisher jobAgency = new JobAgency();
        Company google = new Company(jobAgency, "Google", 120000);
        Company yandex = new Company(jobAgency, "Yandex", 95000);
        Company geekBrains = new Company(jobAgency, "GeekBrains", 90000);

        Student pertov = new Student("Petrov");
        Master master = new Master("Ivanov");
        Master sidorov = new Master("Sidorov");

        jobAgency.registerObserver(pertov);
        jobAgency.registerObserver(master);
        jobAgency.registerObserver(sidorov);

        for (int i = 0; i < 3; i++){
            google.needEmployee();
            yandex.needEmployee();
            geekBrains.needEmployee();
        }


    }

}