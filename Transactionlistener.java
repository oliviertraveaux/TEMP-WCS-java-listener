public interface Transactionlistener {

    void onLoading();

    void onComplete(int total);

    void onError(String error);
}