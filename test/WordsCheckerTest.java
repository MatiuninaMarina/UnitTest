import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class WordsCheckerTest {
    @Test
    public void testHasWord() {
        WordsChecker wordsChecker = new WordsChecker("programming");
        boolean result1 = wordsChecker.hasWord("programming");
        assertThat(result1).isTrue();
    }

    @Test
    public void testHasMistake() {
        WordsChecker wordsChecker = new WordsChecker("programming");
        boolean result1 = wordsChecker.hasWord("programing");
        assertThat(result1).isFalse();
    }

    @Test
    public void testHasNull() {
        WordsChecker wordsChecker = new WordsChecker("programming");
        boolean result1 = wordsChecker.hasWord(null);
        assertThat(result1).isFalse();
    }
}
