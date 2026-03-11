public class OOPSG {
    public static class CharacterPatternMap {
        private final char character;
        private final String[] pattern;

        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public char getCharacter() {
            return character;
        }

        public String[] getPattern() {
            return pattern;
        }
    }

    private static String buildLine(CharacterPatternMap[] chars, int lineIndex) {
        StringBuilder line = new StringBuilder();
        for (CharacterPatternMap cp : chars) {
            line.append(cp.getPattern()[lineIndex]).append("  ");
        }
        return line.toString();
    }

    public static void main(String[] args) {
        String[] oPattern = {
            " **** ",
            "*    *",
            "*    *",
            "*    *",
            "*    *",
            "*    *",
            " **** "
        };
        String[] pPattern = {
            "***** ",
            "*    *",
            "*    *",
            "***** ",
            "*     ",
            "*     ",
            "*     "
        };
        String[] sPattern = {
            " *****",
            "*     ",
            "*     ",
            " *****",
            "     *",
            "     *",
            " *****"
        };

        CharacterPatternMap[] oopsChars = {
            new CharacterPatternMap('O', oPattern),
            new CharacterPatternMap('O', oPattern),
            new CharacterPatternMap('P', pPattern),
            new CharacterPatternMap('S', sPattern)
        };

        for (int i = 0; i < 7; i++) {
            System.out.println(buildLine(oopsChars, i));
        }
    }
}