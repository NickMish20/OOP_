package presenters;

import models.Table;
import models.TableModel;
import views.BookingView;

import java.util.Collection;
import java.util.Date;

public class BookingPresenter implements ViewObserver {

    private final View view;
    private final Model model;

    public BookingPresenter(View view, Model model) {
        this.view = view;
        this.model = model;
        view.setObserver(this);
    }

    private Collection<Table> loadTables(){
        return model.loadTables();
    }

    public void showTables(){
        view.showTables(loadTables());
    }

    private void showReservationTableResult(int reservationId){
        view.showReservationTableResult(reservationId);
    }

    private void showСhangeReservationTableResult(int reservationId){
        view.showChangeReservationTableResult(reservationId);
    }
    

    /**
     * Произошло событие, пользователь нажал на кнопку резерва столика
     * @param reservationDate
     * @param tableNo
     * @param name
     */
    @Override
    public void onReservationTable(Date reservationDate, int tableNo, String name) {
       int reservationId = model.reservationTable(reservationDate, tableNo, name);
        showReservationTableResult(reservationId);
    }

    @Override
    public void onChangeReservationTable(int oldReservationTable, Date reservationDate, int tableNo, String name) {

        int reservationId = model.changeReservationTable(oldReservationTable, reservationDate, tableNo, name);
        showСhangeReservationTableResult(reservationId);
    }

    


}
