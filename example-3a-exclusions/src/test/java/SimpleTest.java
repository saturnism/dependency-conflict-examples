import com.google.cloud.translate.Translate;
import com.google.cloud.translate.TranslateOptions;
import org.junit.Test;

import java.io.IOException;

import static com.google.common.truth.Truth.*;

public class SimpleTest {
	@Test
	public void testAssertion() throws IOException {
		var client = TranslateOptions.getDefaultInstance().getService();

		var response = client.translate("你好！", Translate.TranslateOption.sourceLanguage("zh"), Translate.TranslateOption.targetLanguage("en"));

		assertThat(response).isNotNull();
		assertThat(response.getTranslatedText()).isNotEmpty();
		System.out.println(response.getTranslatedText());
	}
}
