package polybellum.markdown;

/**
 * An enum to the different types of Lexer tokens.
 * 
 * @author Nic Wilson
 * Created 2/12/17
 * 
 */
public enum MarkdownLexerTokenType {
	POUND, //Pound symbol
	SPACES, //Set of spaces
	NEWLINE, //A newline character
	WORD, //A set of characters that doesn't fit anything else
	LPAREN, //Left Parenthesis
	RPARAN, //Right Parenthesis
	LBRACKET, //Left Bracket
	IMG_LBRACKET, //Image bracke
	RBRACKET, //Right Bracket
	DASH, //Hyphen
	EQUALS, //Equals
	BAR, //Vertical Bar
	TAB, //A tab
	GRAVE, //Grave `
	BLOCKQUOTE, // Block quote marker
	
	ITALIC, //Emphasized text
	BOLD, //Bold text
	STRIKE, //Strikethrough tex
	ORDEREDLIST, //Ordered List Markert
	UNORDEREDLIST, //Unordered List Marker
	CHECKBOX_O, //Open Checkbox
	CHECKBOX_N, //Closed Checkbox
	URL, //URL Linkt
	EMOJI, //An emoji
}
