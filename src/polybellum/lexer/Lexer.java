package polybellum.lexer;

import java.util.List;

/**
 * A Lexer object.
 * <br><br>
 * Used to tokenize a grammar.
 * 
 * @author Nic Wilson
 * <br>
 * Created 2/12/17
 *
 */
public abstract class Lexer {

	//*************************************************************************
	//****************************METHODS**************************************
	//*************************************************************************

	public abstract List<LexerToken> tokenize(String code);
	
}
