import com.google.cloud.translate.v3beta1.TranslateTextRequest;
import com.google.cloud.translate.v3beta1.TranslateTextResponse;
import com.google.cloud.translate.v3beta1.TranslationServiceClient;
import org.junit.Test;

import java.io.IOException;

import static com.google.common.truth.Truth.*;

public class SimpleTest {
	@Test
	public void testAssertion() throws IOException {
		TranslationServiceClient client = TranslationServiceClient.create();

		TranslateTextResponse response = client.translateText(TranslateTextRequest.newBuilder()
				.addContents("你好")
				.setSourceLanguageCode("zh")
				.setTargetLanguageCode("en")
				.build());

		assertThat(response).isNotNull();
		assertThat(response.getTranslationsCount()).isEqualTo(1);
	}
}
