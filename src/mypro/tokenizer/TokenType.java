package mypro.tokenizer;

public enum TokenType {
    /* for example  ( ) = ,  */
    TOKEN,
    /* First character is a letter, any proceeding characters are letters or numbers     */
    IDENTIFIER,
    /*A number */
    INTEGER_LITERAL,
    /* anything enclosed in double quotes "hello" "1" */
    STRING_LITERAL
}
