import com.google.cloud.pubsub.spi.v1.PublisherClient;
import com.google.protobuf.ByteString;
import com.google.pubsub.v1.PubsubMessage;
import com.google.pubsub.v1.TopicName;
import org.junit.Test;

import java.io.IOException;

import static java.util.Arrays.asList;

public class PubsubTest {
	@Test
	public void testAssertion() throws IOException {
		var publisher = PublisherClient.create();
		publisher.publish(TopicName.create("wise-coyote-827", "hello"), asList(PubsubMessage.newBuilder()
				.setData(ByteString.copyFromUtf8("hello"))
				.build()));
	}
}
