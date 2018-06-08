class Token{
    private TokenType type;
    private String data;

    Token(String _data, TokenType _type){
        type = _type;
        data = _data;
    }

    public String getData(){
        return data;
    }

    public TokenType getType(){
        return type;
    }
}