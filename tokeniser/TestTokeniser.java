class TestTokeniser{
    public static void main(String[] args){
        Tokeniser test = new Tokeniser();
        String str = "aheDD 8 8 \"yooo\"";
        Tokeniser.generateTokens(str);

        for(Token t : test.list ){
            System.out.println(t.getData() + " " + t.getType().getType());
        }
    }
}