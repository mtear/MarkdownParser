package polybellum.markdown;

/**
 * A Markdown Lexer Token
 * 
 * @author Nic Wilson
 * Created 2/12/17
 *
 */
public class MarkdownLexerToken {

	//*************************************************************************
	//****************************FIELDS***************************************
	//*************************************************************************
	
	/**
	 * The type of Token this object is
	 */
	private MarkdownLexerTokenType _type;
	
	/**
	 * Any additional data field this Token has
	 */
	private String _data;
	
	//*************************************************************************
	//****************************CONSTRUCTORS*********************************
	//*************************************************************************
	
	/**
	 * Initialize the token and set the Type.
	 * 
	 * @param type The type of this token
	 */
	public MarkdownLexerToken(MarkdownLexerTokenType type){
		_type = type;
	}
	
	/**
	 * Initialize the token, set the Type, and set the Data.
	 * 
	 * @param type The type of this token
	 * @param data Additional data for this token
	 */
	public MarkdownLexerToken(MarkdownLexerTokenType type, String data){
		_type = type;
		_data = data;
	}
	
	//*************************************************************************
	//****************************METHODS**************************************
	//*************************************************************************

	/**
	 * Get the type of this Token
	 * 
	 * @return This token's Type
	 */
	public MarkdownLexerTokenType getType() {
		return _type;
	}

	/**
	 * Set the type of this Token
	 * 
	 * @param type The new Type
	 */
	public void setType(MarkdownLexerTokenType type) {
		this._type = type;
	}
	
	/**
	 * Get the additional data for this Token
	 * 
	 * @return The additional data from this Token
	 */
	public String getData(){
		return _data;
	}
	
	/**
	 * Set the data for this Token
	 * 
	 * @param data The new data for this Token
	 */
	public void setData(String data){
		_data = data;
	}
	
}
