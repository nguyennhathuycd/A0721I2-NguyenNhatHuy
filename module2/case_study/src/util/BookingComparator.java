package util;

import models.Booking;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Comparator;

public class BookingComparator implements Comparator<Booking> {

    @Override
    public int compare(Booking o1, Booking o2) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate startDay1 = LocalDate.parse(o1.getStartDate(), formatter);
        LocalDate startDay2 = LocalDate.parse(o2.getStartDate(), formatter);
        LocalDate endDay1 = LocalDate.parse(o1.getEndDate(), formatter);
        LocalDate endDay2 = LocalDate.parse(o2.getEndDate(), formatter);

        if (startDay1.compareTo(startDay2) < 0) {
            return 1;
        } else if (startDay1.compareTo(startDay2) > 0) {
            return -1;
        } else {
            if (endDay1.compareTo(endDay2) < 0) {
                return 1;
            } else if (endDay1.compareTo(endDay2) > 0) {
                return -1;
            } else {
                return 0;
            }
        }
    }
}
