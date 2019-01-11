import com.hharo.gcp.pubsub.PubSubPublisher;

public class Main {
    public static void main (String [] args) {
        PubSubPublisher publisher = new PubSubPublisher();
        try {
            publisher.publishAsync("Test message");
            System.out.println("Async call completed.");
            publisher.publishSync("Test sync message");
            System.out.println("Sync call completed");
        }catch (Exception e) {
            System.out.println("There was a problem closing the publisher client: " + e.getMessage());
        }
    }
}
