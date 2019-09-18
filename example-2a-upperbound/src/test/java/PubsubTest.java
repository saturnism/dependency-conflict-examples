import com.google.cloud.pubsub.spi.v1.PublisherApi;
import com.google.cloud.pubsub.spi.v1.PublisherSettings;
import com.google.common.collect.Lists;
import com.google.protobuf.ByteString;
import com.google.pubsub.v1.PubsubMessage;
import org.junit.Test;

import java.io.IOException;
import com.google.cloud.pubsub.*;

import static java.util.Arrays.asList;

public class PubsubTest {
	@Test
	public void testAssertion() throws IOException {
		PublisherApi publisher = PublisherApi
				.create();
		publisher.publish("projects/wise-coyote-827/topics/test", asList(PubsubMessage.newBuilder()
				.setData(ByteString.copyFromUtf8("hello"))
				.build()));
	}
}
