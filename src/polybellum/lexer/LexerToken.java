package polybellum.lexer;

/**
 * A Lexer Token for use in parsing a Grammar
 * 
 * @author Nic Wilson
 * <br>
 * Created 2/12/17
 *
 */
public abstract class LexerToken {
	
	//*************************************************************************
	//****************************FIELDS***************************************
	//*************************************************************************
	
	/**
	 * The type of Token this object is
	 */
	@SuppressWarnings({ "unused" })
	private byte _type;
	
	/**
	 * Any additional data field this Token has
	 */
	@SuppressWarnings("unused")
	private String _data;
	
	//*************************************************************************
	//****************************CONSTRUCTORS*********************************
	//*************************************************************************
	
	/**
	 * Initialize the token and set the Type.
	 * 
	 * @param type The type of this token
	 */
	public LexerToken(byte type){
		_type = type;
	}
	
	/**
	 * Initialize the token, set the Type, and set the Data.
	 * 
	 * @param type The type of this token
	 * @param data Additional data for this token
	 */
	public LexerToken(byte type,
			String data){
		_type = type;
		_data = data;
	}
	
}
