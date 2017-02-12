package polybellum.lexer;

/**
 * Interface for different types of Lexer Tokens.
 * 
 * @author Nic Wilson
 * <br>
 * Created 2/12/17
 * 
 */
public abstract class LexerTokenType<I> {

	//*************************************************************************
	//****************************METHODS**************************************
	//*************************************************************************
	
	/**
	 * Get the Generic instance of the inherited class
	 * 
	 * @return I.this
	 */
	public abstract I T();
	
}
