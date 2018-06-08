public enum TokenType{
    INTEGER{
        @Override
        public String getPattern() {
            return "^(\\d)";
        }

        @Override
        public String getType() {
            return "Integer";
        }
    },
    STRING_LITERAL{
        @Override
        public String getPattern() {
            return "^(\"(.)*\")";
        }

        @Override
        public String getType() {
            return "String literal";
        }
    },
    SPECIAL_CHAR{
        @Override
        public String getPattern() {
            return "^([^a-zA-Z0-9\\s])+";
        }

        @Override
        public String getType() {
            return "Special character";
        }
    },
    IDENTIFIER{
        @Override
        public String getPattern() {
            return "^([a-z]+[a-zA-Z0-9]*)+";
        }

        @Override
        public String getType() {
            return "Identifier";
        }
    };

    public abstract String getPattern();
    public abstract String getType();
}