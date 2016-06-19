package trueSpring;

import java.util.List;

/**
 * Created by alex on 17.06.16.
 */
public class TerminatorQuoter implements Quoter {

    private List<String> messages;
    @Override
    public void sayQuote() {
        messages.forEach(System.out::println);
    }

    public List<String> getMessages() {
        return messages;
    }

    public void setMessages(List<String> messages) {
        this.messages = messages;
    }
}
