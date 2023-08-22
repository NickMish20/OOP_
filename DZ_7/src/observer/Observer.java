
package observer;

public interface Observer {

    void receiveOffer(String nameCompany, int salary);

    void receiveVacancy(JobVacancy vacancy);

}
