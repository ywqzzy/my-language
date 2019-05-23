package mypro.parser;

import mypro.block.Block;
import mypro.block.Class;
import mypro.tokenizer.Tokenizer;

public class ClassParser extends Parser<Class> {
    @Override
    public boolean shouldParse(String line) {
        return line.matches("class [a-zA-Z][a-zA-Z0-9]*");
    }

    @Override
    public Class parse(Block superBlock, Tokenizer tokenizer) {
        tokenizer.nextToken();//skip the class token
        String name = tokenizer.nextToken().getToken();
        return new Class(name);
    }
}
