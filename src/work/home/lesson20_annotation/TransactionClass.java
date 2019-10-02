package work.home.lesson20_annotation;

/*
Реализовать аннотацию Transaction и анализатор данной транзакции. Смысл данной аннотации заключается в том,
что если метод помечен данной аннотацией, значит он вызывается в рамках транзакции.
В рамках транзакции - когда выводится на консоль два сообщения: “Transaction is started”; “Transaction is ended”.
 */

public class TransactionClass {
    @Transaction
    private static void doSomeTransaction() {
        System.out.println("It is transactional method in TransactionClass");
    }

    private static void doSomething() {
        System.out.println("It is same method in TransactionClass");
    }


    public static void main(String[] args) {
        TransactionAnalyzer.transactionAnalyzer(TransactionClass.class);
    }
}
