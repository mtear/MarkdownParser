package polybellum.markdown;

import java.util.ArrayList;
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

	@SuppressWarnings("static-access")
	@Override
	public List<LexerToken> tokenize(String code){
		
		//Make token list
		List<LexerToken> tokens = new ArrayList<LexerToken>();
		
		//Abbreviate
		MarkdownLexerTokenType mltt = null;
		
		//Parse the code in a loop
		char last = '\r';
		while(peekNextCharacter() != '\r'){
			char c = getNextCharacter(), n = peekNextCharacter();
			
			//Do lexer logic from a neutral state
			if(c == '\n'){
				tokens.add(new MarkdownLexerToken(mltt.NEWLINE));
			}else if(c == '#'){
				//Count consecutive
				int count = 1;
				StringBuilder data = new StringBuilder("#");
				while(n == '#'){
					getNextCharacter();
					data.append("#");
					count++;
				} //no more #
				if(isWhitespace(n)){ //It's a header!
					
				}else{ //It's a word
					
				}
			}
			
			last = c;
		}
		
		return tokens;
	}
	
}
