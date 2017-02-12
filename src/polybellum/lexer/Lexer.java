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
	//****************************FIELDS***************************************
	//*************************************************************************
	
	/**
	 * The internal index of where the Lexer is currently looking at the code
	 */
	private int _codeIndex = 0;
	
	/**
	 * The code that is being Lexed
	 */
	private String _code = "";
	
	//*************************************************************************
	//****************************METHODS**************************************
	//*************************************************************************

	/**
	 * Get the next character from the code and move the index forward
	 * @return The next character from the code.<br>
	 * '\r' if there are no more characters.
	 */
	protected char getNextCharacter(){
		
		//Return \r if there are no more characters
		if(_codeIndex == _code.length()) return '\r';
		
		//Increment the index
		_codeIndex++;
		
		//Return the next character
		return _code.charAt(_codeIndex);
	}
	
	/**
	 * Check if a certain character is downstream in the code.<br>
	 * Does not edit the lexer index.
	 * 
	 * @param c The character to look for
	 * @return If the character is found in the code downstream
	 */
	protected boolean isCharacterDownstream(char c){
		int i = _codeIndex;
		for(; i < _code.length(); i++){
			if(_code.charAt(i) == c) return true;
		}
		return false;
	}
	
	/**
	 * Determine if a character is whitespace.
	 * 
	 * @param c The character to analyze
	 * @return If c is space, \n, \r, or \t
	 */
	protected boolean isWhitespace(char c){
		return c == ' ' || c == '\n' || c == '\r' || c == '\t';
	}
	
	/**
	 * Get the next character from the code without moving the index
	 * @return The next character from the code.<br>
	 * '\r' if there are no more characters.
	 */
	protected char peekNextCharacter(){
		
		//Return \r if there are no more characters
		if(_codeIndex == _code.length()) return '\r';
		
		//Return the next character
		return _code.charAt(_codeIndex);
	}
	
	/**
	 * Set the Lexer code and reset the code index
	 * 
	 * @param code A new piece of code
	 */
	public void setCode(String code){
		//Remove \r from the code (leave \n)
		this._code = code.replace("\r", "");
		_codeIndex = 0;
	}
	
	/**
	 * Create a list of Tokens by tokenizing a string of code.
	 * 
	 * @param code The code to tokenize
	 * @return A list of LexerTokens representing the code in tokenized form
	 */
	public abstract List<LexerToken> tokenize(String code);
	
	
}
