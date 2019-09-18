import com.google.cloud.pubsub.v1.Publisher;
import com.google.protobuf.ByteString;
import com.google.pubsub.v1.PubsubMessage;
import org.junit.Test;

import java.io.IOException;

public class PubsubTest {
	@Test
	public void testAssertion() throws IOException {
		var publisher = Publisher.newBuilder("hello").build();

		publisher.publish(PubsubMessage.newBuilder()
				.setData(ByteString.copyFromUtf8("hello"))
				.build());
	}
}
