package Problems.BookMyShow.Models;

import Problems.BookMyShow.Enums.PaymentStatus;

public class Payment {
    Integer id;
    Booking boookingDetails;
    PaymentStatus paymentStatus;

    public Payment(Integer id, Booking boookingDetails, PaymentStatus paymentStatus) {
        this.id = id;
        this.boookingDetails = boookingDetails;
        this.paymentStatus = paymentStatus;
    }

    public PaymentStatus getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(PaymentStatus paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Booking getBoookingDetails() {
        return boookingDetails;
    }

    public void setBoookingDetails(Booking boookingDetails) {
        this.boookingDetails = boookingDetails;
    }

    public Payment(Integer id, Booking boookingDetails) {
        this.id = id;
        this.boookingDetails = boookingDetails;
    }
}
