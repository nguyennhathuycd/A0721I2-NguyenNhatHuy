package models;

public class Contract {
    private int contractNumber;
    private String bookingCode;
    private double depositAmount;
    private double totalPaymentAmount;
    private String customerCode;

    public Contract() {
    }

    public Contract(int contractNumber, String bookingCode, double depositAmount, double totalPaymentAmount, String customerCode) {
        this.contractNumber = contractNumber;
        this.bookingCode = bookingCode;
        this.depositAmount = depositAmount;
        this.totalPaymentAmount = totalPaymentAmount;
        this.customerCode = customerCode;
    }

    public int getContractNumber() {
        return contractNumber;
    }

    public void setContractNumber(int contractNumber) {
        this.contractNumber = contractNumber;
    }

    public String getBookingCode() {
        return bookingCode;
    }

    public void setBookingCode(String bookingCode) {
        this.bookingCode = bookingCode;
    }

    public double getDepositAmount() {
        return depositAmount;
    }

    public void setDepositAmount(double depositAmount) {
        this.depositAmount = depositAmount;
    }

    public double getTotalPaymentAmount() {
        return totalPaymentAmount;
    }

    public void setTotalPaymentAmount(double totalPaymentAmount) {
        this.totalPaymentAmount = totalPaymentAmount;
    }

    public String getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode;
    }

    @Override
    public String toString() {
        return "Contract{" +
                "contractNumber=" + contractNumber + '\'' +
                ", bookingCode='" + bookingCode + '\'' +
                ", depositAmount=" + depositAmount + '\'' +
                ", totalPaymentAmount=" + totalPaymentAmount + '\'' +
                ", customerCode='" + customerCode + '\'' +
                '}';
    }
}
