package polybellum.markdown;

import polybellum.lexer.LexerToken;

/**
 * A Markdown Lexer Token
 * 
 * @author Nic Wilson
 * <br>
 * Created 2/12/17
 *
 */
public class MarkdownLexerToken extends LexerToken{
	
	//*************************************************************************
	//****************************CONSTRUCTORS*********************************
	//*************************************************************************
	
	/**
	 * Initialize the token and set the Type.
	 * 
	 * @param type The type of this token
	 */
	public MarkdownLexerToken(MarkdownLexerTokenType type){
		super(type);
	}
	
	/**
	 * Initialize the token, set the Type, and set the Data.
	 * 
	 * @param type The type of this token
	 * @param data Additional data for this token
	 */
	public MarkdownLexerToken(MarkdownLexerTokenType type, String data){
		super(type, data);
	}
	
	//*************************************************************************
	//****************************METHODS**************************************
	//*************************************************************************
	
}
