package polybellum.markdown;

import polybellum.lexer.LexerTokenType;

/**
 * An enum to the different types of Lexer tokens.
 * 
 * @author Nic Wilson
 * <br>
 * Created 2/12/17
 * 
 */
public class MarkdownLexerTokenType extends LexerTokenType<MarkdownLexerTokenType>{
	
	//*************************************************************************
	//****************************CONSTANTS************************************
	//*************************************************************************
	
	public static final byte POUND = 0; //Pound symbol
	public static final byte SPACES = 1; //Set of spaces
	public static final byte NEWLINE = 2; //A newline character
	public static final byte WORD = 3; //A set of characters that doesn't fit anything else
	public static final byte LPAREN = 4; //Left Parenthesis
	public static final byte RPARAN = 5; //Right Parenthesis
	public static final byte LBRACKET = 6; //Left Bracket
	public static final byte IMG_LBRACKET = 7; //Image bracke
	public static final byte RBRACKET = 8; //Right Bracket
	public static final byte DASH = 9; //Hyphen
	public static final byte EQUALS = 10; //Equals
	public static final byte BAR = 11; //Vertical Bar
	public static final byte TAB = 12; //A tab
	public static final byte GRAVE = 13; //Grave `
	public static final byte BLOCKQUOTE = 14; // Block quote marker
	
	public static final byte ITALIC = 15; //Emphasized text
	public static final byte BOLD = 16; //Bold text
	public static final byte STRIKE = 17; //Strikethrough tex
	public static final byte ORDEREDLIST = 18; //Ordered List Markert
	public static final byte UNORDEREDLIST = 19; //Unordered List Marker
	public static final byte CHECKBOX_O = 20; //Open Checkbox
	public static final byte CHECKBOX_N = 21; //Closed Checkbox
	public static final byte URL = 22; //URL Link
	public static final byte EMOJI = 23; //An emoji
	
	//*************************************************************************
	//****************************METHODS**************************************
	//*************************************************************************
	
	@Override
	public MarkdownLexerTokenType T() {
		return this;
	}
	
}
