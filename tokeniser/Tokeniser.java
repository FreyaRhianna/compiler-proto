import java.util.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

class Tokeniser{
    public static List<Token> list = new ArrayList<Token>();
    public static void generateTokens(String str){
        str = str.trim();
        if(str.equals("")){
            return;
        }
        Matcher m;
        Pattern p;
        for(TokenType t: TokenType.values()){
            p = Pattern.compile(t.getPattern());
            m = p.matcher(str);
            if(m.find()){
                addToList(m.group(1),t);
                str = str.replaceFirst(m.group(1),"");
                break;
            }
        }
        generateTokens(str);


    }


    public static void addToList(String data, TokenType type){
        Token toAdd = new Token(data, type);
        list.add(toAdd);
    }
}