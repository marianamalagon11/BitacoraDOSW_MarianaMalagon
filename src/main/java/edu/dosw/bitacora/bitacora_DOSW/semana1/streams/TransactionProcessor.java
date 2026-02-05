package edu.dosw.bitacora.bitacora_DOSW.semana1.streams;

import java.util.List;

public class TransactionProcessor {

    public boolean isValidBatch(List<Transaction> transactions) {
        boolean allApproved = transactions.stream()
                .peek(transaction -> System.out.println("Procesando transacción: " + transaction))
                .allMatch(transaction -> transaction.approved);
        return allApproved;
    }

    public boolean hasUnapprovedTransactions(List<Transaction> transactions) {
        return transactions.stream()
                .anyMatch(transaction -> !transaction.approved);
    }

    public static void main(String[] args) {
        List<Transaction> transactions = List.of(
                new Transaction("Tr1", 10340.50, true),
                new Transaction("Tr2", 5065.00, true),
                new Transaction("Tr3", 750.75, false)
        );

        TransactionProcessor processor = new TransactionProcessor();

        boolean isValid = processor.isValidBatch(transactions);
        System.out.println("Resultado para saber si el lote es valido: " + isValid);

        boolean hasUnapproved = processor.hasUnapprovedTransactions(transactions);
        System.out.println("Resultado para ver si tiene transacciones no aprobadas? " + hasUnapproved);
    }
}
