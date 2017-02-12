package polybellum.markdown;

import java.util.List;

import polybellum.lexer.Lexer;
import polybellum.lexer.LexerToken;

/**
 * A Markdown Lexer Object.<br> <br>
 *
 * Parses Markdown text and turns it into a sequence of Markdown Tokens
 * 
 * @author Nic Wilson
 * <br>
 * Created 2/12/17
 *
 */
public class MarkdownLexer extends Lexer{
	
	//*************************************************************************
	//****************************METHODS**************************************
	//*************************************************************************

	@Override
	public List<LexerToken> tokenize(String code){
		return null;
	}
	
}
