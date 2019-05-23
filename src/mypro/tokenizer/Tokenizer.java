package mypro.tokenizer;

import java.util.ArrayList;
import java.util.regex.Pattern;

public class Tokenizer {
    private ArrayList<TokenData> tokenDatas;
    private String str;
    private Token lastToken;
    private boolean pushBack;
    public Tokenizer(String str) {
        this.tokenDatas = new ArrayList<TokenData>();
        this.str = str;
        tokenDatas.add(new TokenData(Pattern.compile("[a-zA-Z][a-zA-Z0-9]*"),TokenType.IDENTIFIER));
        tokenDatas.add(new TokenData(Pattern.compile("(-)?[0-9]+"),TokenType.INTEGER_LITERAL));
        tokenDatas.add(new TokenData(Pattern.compile("\".*\""),TokenType.STRING_LITERAL));
        for(String t: new String[] {"=", "\\(", "\\)", "\\.", "\\,"}) {
            tokenDatas.add(new TokenData(Pattern.compile(t),TokenType.TOKEN));
        }
    }

    public Token nextToken() {
        str = str
    }
}
