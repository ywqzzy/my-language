package mypro.tokenizer;

public class TokenizerTest {
    public static void main(String[] args) {
        String code = "class HelloWorld\n" +
                "    method main requires ()\n" +
                "      print \"hello\"\n";

        Tokenizer tokenizer = new Tokenizer(code);
        while(tokenizer.hasNextToken()) {
            System.out.println(tokenizer.nextToken().getToken());
        }
    }
}
