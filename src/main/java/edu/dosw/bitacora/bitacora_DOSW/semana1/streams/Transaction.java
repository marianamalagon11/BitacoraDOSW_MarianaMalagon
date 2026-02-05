package edu.dosw.bitacora.bitacora_DOSW.semana1.streams;

public class Transaction {
    String id;
    Double amount;
    boolean approved;

    public Transaction(String id, Double amount, boolean approved) {
        this.id = id;
        this.amount = amount;
        this.approved = approved;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "id='" + id + '\'' +
                ", amount=" + amount +
                ", approved=" + approved +
                '}';
    }
}