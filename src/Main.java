public class Main {

    public static void main(String args[]) {
        WordsChecker wordsChecker = new WordsChecker("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.");
        boolean searchWord = wordsChecker.hasWord("tempor");
        printResult(searchWord);
        boolean searchWord1 = wordsChecker.hasWord("sun");
        printResult(searchWord1);
    }

    private static void printResult(boolean searchWord) {
        if (searchWord) {
            System.out.println("В данном тексте это слово встречается");
        } else {
            System.out.println("В данном тексте это слово не встречается");
        }
    }
}