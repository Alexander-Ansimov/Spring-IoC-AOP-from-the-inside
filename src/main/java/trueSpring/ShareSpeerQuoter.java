package trueSpring;

/**
 * Created by alex on 17.06.16.
 */
public class ShareSpeerQuoter implements Quoter {

    private String message;
    @Override
    public void sayQuote() {

        System.out.println(message);
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
