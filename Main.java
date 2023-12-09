public class Main {

    public static void main(String[] args) {

        Bank account = new Bank(1000);

        Transactions.withdraw(account, 100, new Transactionlistener() {
            @Override
            public void onLoading() {
                System.out.println("Please wait...");
            }

            @Override
            public void onComplete(int total) {
                System.out.printf("Your balance is: %d%n", total);
            }

            @Override
            public void onError(String error) {

            }
        });

    }
}
