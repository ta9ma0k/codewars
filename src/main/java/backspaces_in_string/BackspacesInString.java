package backspaces_in_string;

public class BackspacesInString {
    private final String DELETE_SYMBOL = "#";

    public String cleanString(String s) {
        String[] array = s.split("");
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < array.length; i++) {
            result = new StringBuilder(
              isDeleteSymbol(array[i])
                ? deletePreviousChar(result)
                : appendChar(result, array[i])
            );
        }

        return result.toString();
    }

    private boolean isDeleteSymbol(String word) {
        return DELETE_SYMBOL.equals(word);
    }

    private String deletePreviousChar(StringBuilder sb) {
        if (sb.length() == 0) {
            return sb.toString();
        }
        return sb.deleteCharAt(sb.length() - 1).toString();
    }

    private String appendChar(StringBuilder sb, String word) {
        return sb.append(word).toString();
    }
}
