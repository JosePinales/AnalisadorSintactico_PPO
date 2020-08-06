/* The following code was generated by JFlex 1.4.3 on 8/5/20 9:08 PM */

package codigo;
import java_cup.runtime.Symbol;

/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 8/5/20 9:08 PM from the specification file
 * <tt>D:/1UNIBE/2020-C3/Compilador/Proyect/AnalizadorSintactico4/Analizador_2/src/codigo/LexerCup.flex</tt>
 */
class LexerCup implements java_cup.runtime.Scanner {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = {
     0,  0,  0,  0,  0,  0,  0,  0,  0,  3,  5,  0,  0,  3,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     3, 37,  6,  0,  0,  0, 35,  0, 39, 40, 34, 33,  3, 28,  0,  4, 
     2,  2,  2,  2,  2,  2,  2,  2,  2,  2,  0, 45, 38, 32, 29,  0, 
     0,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1, 
     1,  1,  1, 23,  1,  1,  1,  1,  1,  1,  1, 43,  0, 44, 30,  1, 
     0, 13,  7, 11, 20, 10, 19, 18, 12, 22,  1,  1, 15, 25, 17, 16, 
    26,  1, 14, 24,  9, 21, 27, 31,  1,  8,  1, 41, 36, 42,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0
  };

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\3\1\4\1\5\1\6\15\2"+
    "\1\7\1\10\1\11\1\2\1\12\1\13\1\14\3\15"+
    "\1\10\1\16\1\17\1\20\1\21\1\22\1\23\1\24"+
    "\1\25\1\4\12\2\1\26\2\2\1\27\6\2\1\30"+
    "\1\31\1\10\1\2\1\15\1\0\12\2\1\32\2\2"+
    "\1\33\7\2\1\0\1\34\1\35\1\36\11\2\1\37"+
    "\3\2\1\3\1\40\5\2\1\41\2\2\1\42\1\2"+
    "\1\43\2\2\1\44\2\2\1\45\1\46\3\2\1\47"+
    "\1\2\1\50\2\2\1\51";

  private static int [] zzUnpackAction() {
    int [] result = new int[133];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\56\0\134\0\212\0\270\0\346\0\56\0\u0114"+
    "\0\u0142\0\u0170\0\u019e\0\u01cc\0\u01fa\0\u0228\0\u0256\0\u0284"+
    "\0\u02b2\0\u02e0\0\u030e\0\u033c\0\u036a\0\u0398\0\56\0\u03c6"+
    "\0\u03f4\0\u0422\0\56\0\u0450\0\u047e\0\u03f4\0\u04ac\0\u04da"+
    "\0\56\0\56\0\56\0\56\0\56\0\56\0\u0508\0\u0536"+
    "\0\u0564\0\u0592\0\u05c0\0\u05ee\0\u061c\0\u064a\0\u0678\0\u06a6"+
    "\0\u06d4\0\u0702\0\u0730\0\u075e\0\u078c\0\134\0\u07ba\0\u07e8"+
    "\0\u0816\0\u0844\0\u0872\0\u08a0\0\56\0\56\0\56\0\u08ce"+
    "\0\56\0\u08fc\0\u092a\0\u0958\0\u0986\0\u09b4\0\u09e2\0\u0a10"+
    "\0\u0a3e\0\u0a6c\0\u0a9a\0\u0ac8\0\134\0\u0af6\0\u0b24\0\134"+
    "\0\u0b52\0\u0b80\0\u0bae\0\u0bdc\0\u0c0a\0\u0c38\0\u0c66\0\u0c94"+
    "\0\134\0\134\0\134\0\u0cc2\0\u0cf0\0\u0d1e\0\u0d4c\0\u0d7a"+
    "\0\u0da8\0\u0dd6\0\u0e04\0\u0e32\0\134\0\u0e60\0\u0e8e\0\u0ebc"+
    "\0\56\0\134\0\u0eea\0\u0f18\0\u0f46\0\u0f74\0\u0fa2\0\134"+
    "\0\u0fd0\0\u0ffe\0\134\0\u102c\0\134\0\u105a\0\u1088\0\134"+
    "\0\u10b6\0\u10e4\0\134\0\134\0\u1112\0\u1140\0\u116e\0\134"+
    "\0\u119c\0\134\0\u11ca\0\u11f8\0\134";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[133];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\1\3\1\4\1\5\1\6\1\5\1\7\1\10"+
    "\1\3\1\11\1\12\1\13\2\3\1\14\1\15\3\3"+
    "\1\16\1\17\1\3\1\20\1\21\1\22\1\23\1\24"+
    "\1\3\1\25\1\26\1\27\1\30\1\31\1\32\1\33"+
    "\1\34\1\35\1\36\1\37\1\40\1\41\1\42\1\43"+
    "\1\44\1\45\1\46\57\0\1\3\1\47\4\0\25\3"+
    "\3\0\1\3\20\0\1\4\56\0\1\5\1\0\1\5"+
    "\54\0\1\50\52\0\1\3\1\47\4\0\1\3\1\51"+
    "\23\3\3\0\1\3\17\0\1\3\1\47\4\0\7\3"+
    "\1\52\15\3\3\0\1\3\17\0\1\3\1\47\4\0"+
    "\10\3\1\53\14\3\3\0\1\3\17\0\1\3\1\47"+
    "\4\0\5\3\1\54\2\3\1\55\14\3\3\0\1\3"+
    "\17\0\1\3\1\47\4\0\3\3\1\56\21\3\3\0"+
    "\1\3\17\0\1\3\1\47\4\0\11\3\1\57\13\3"+
    "\3\0\1\3\17\0\1\3\1\47\4\0\6\3\1\60"+
    "\1\3\1\61\1\62\13\3\3\0\1\3\17\0\1\3"+
    "\1\47\4\0\11\3\1\63\5\3\1\64\5\3\3\0"+
    "\1\3\17\0\1\3\1\47\4\0\12\3\1\65\1\3"+
    "\1\66\5\3\1\67\2\3\3\0\1\3\17\0\1\3"+
    "\1\47\4\0\2\3\1\70\22\3\3\0\1\3\17\0"+
    "\1\3\1\47\4\0\16\3\1\71\6\3\3\0\1\3"+
    "\17\0\1\3\1\47\4\0\6\3\1\72\7\3\1\73"+
    "\6\3\3\0\1\3\17\0\1\3\1\47\4\0\11\3"+
    "\1\74\13\3\3\0\1\3\52\0\1\75\1\76\55\0"+
    "\1\77\2\0\1\77\16\0\1\3\1\47\4\0\5\3"+
    "\1\100\17\3\3\0\1\3\56\0\1\77\56\0\1\75"+
    "\57\0\1\101\56\0\1\101\51\0\1\77\5\0\1\77"+
    "\43\0\1\102\22\0\2\47\4\0\25\47\3\0\1\47"+
    "\16\0\5\50\1\0\50\50\1\0\1\3\1\47\4\0"+
    "\2\3\1\103\22\3\3\0\1\3\17\0\1\3\1\47"+
    "\4\0\16\3\1\104\6\3\3\0\1\3\17\0\1\3"+
    "\1\47\4\0\21\3\1\105\3\3\3\0\1\3\17\0"+
    "\1\3\1\47\4\0\6\3\1\106\16\3\3\0\1\3"+
    "\17\0\1\3\1\47\4\0\6\3\1\107\16\3\3\0"+
    "\1\3\17\0\1\3\1\47\4\0\2\3\1\110\16\3"+
    "\1\111\3\3\3\0\1\3\17\0\1\3\1\47\4\0"+
    "\12\3\1\112\12\3\3\0\1\3\17\0\1\3\1\47"+
    "\4\0\10\3\1\113\14\3\3\0\1\3\17\0\1\3"+
    "\1\47\4\0\11\3\1\114\13\3\3\0\1\3\17\0"+
    "\1\3\1\47\4\0\7\3\1\115\15\3\3\0\1\3"+
    "\17\0\1\3\1\47\4\0\16\3\1\116\6\3\3\0"+
    "\1\3\17\0\1\3\1\47\4\0\24\3\1\117\3\0"+
    "\1\3\17\0\1\3\1\47\4\0\2\3\1\120\22\3"+
    "\3\0\1\3\17\0\1\3\1\47\4\0\23\3\1\121"+
    "\1\3\3\0\1\3\17\0\1\3\1\47\4\0\7\3"+
    "\1\122\15\3\3\0\1\3\17\0\1\3\1\47\4\0"+
    "\22\3\1\123\2\3\3\0\1\3\17\0\1\3\1\47"+
    "\4\0\17\3\1\124\5\3\3\0\1\3\17\0\1\3"+
    "\1\47\4\0\10\3\1\125\14\3\3\0\1\3\17\0"+
    "\1\3\1\47\4\0\2\3\1\126\22\3\3\0\1\3"+
    "\17\0\1\3\1\47\4\0\17\3\1\127\5\3\3\0"+
    "\1\3\20\0\1\130\54\0\1\3\1\47\4\0\3\3"+
    "\1\131\21\3\3\0\1\3\17\0\1\3\1\47\4\0"+
    "\3\3\1\132\21\3\3\0\1\3\17\0\1\3\1\47"+
    "\4\0\3\3\1\133\21\3\3\0\1\3\17\0\1\3"+
    "\1\47\4\0\7\3\1\131\15\3\3\0\1\3\17\0"+
    "\1\3\1\47\4\0\21\3\1\134\3\3\3\0\1\3"+
    "\17\0\1\3\1\47\4\0\11\3\1\135\13\3\3\0"+
    "\1\3\17\0\1\3\1\47\4\0\2\3\1\136\22\3"+
    "\3\0\1\3\17\0\1\3\1\47\4\0\13\3\1\131"+
    "\11\3\3\0\1\3\17\0\1\3\1\47\4\0\21\3"+
    "\1\104\3\3\3\0\1\3\17\0\1\3\1\47\4\0"+
    "\6\3\1\137\16\3\3\0\1\3\17\0\1\3\1\47"+
    "\4\0\1\140\24\3\3\0\1\3\17\0\1\3\1\47"+
    "\4\0\17\3\1\141\5\3\3\0\1\3\17\0\1\3"+
    "\1\47\4\0\7\3\1\142\15\3\3\0\1\3\17\0"+
    "\1\3\1\47\4\0\17\3\1\143\5\3\3\0\1\3"+
    "\17\0\1\3\1\47\4\0\6\3\1\144\16\3\3\0"+
    "\1\3\17\0\1\3\1\47\4\0\12\3\1\145\12\3"+
    "\3\0\1\3\17\0\1\3\1\47\4\0\2\3\1\146"+
    "\22\3\3\0\1\3\17\0\1\3\1\47\4\0\3\3"+
    "\1\147\21\3\3\0\1\3\17\0\1\3\1\47\4\0"+
    "\10\3\1\150\14\3\3\0\1\3\20\0\1\130\45\0"+
    "\1\151\6\0\1\3\1\47\4\0\3\3\1\152\21\3"+
    "\3\0\1\3\17\0\1\3\1\47\4\0\7\3\1\153"+
    "\15\3\3\0\1\3\17\0\1\3\1\47\4\0\6\3"+
    "\1\154\16\3\3\0\1\3\17\0\1\3\1\47\4\0"+
    "\2\3\1\131\22\3\3\0\1\3\17\0\1\3\1\47"+
    "\4\0\10\3\1\103\14\3\3\0\1\3\17\0\1\3"+
    "\1\47\4\0\15\3\1\155\7\3\3\0\1\3\17\0"+
    "\1\3\1\47\4\0\17\3\1\156\5\3\3\0\1\3"+
    "\17\0\1\3\1\47\4\0\12\3\1\157\12\3\3\0"+
    "\1\3\17\0\1\3\1\47\4\0\7\3\1\160\15\3"+
    "\3\0\1\3\17\0\1\3\1\47\4\0\17\3\1\161"+
    "\5\3\3\0\1\3\17\0\1\3\1\47\4\0\12\3"+
    "\1\162\12\3\3\0\1\3\17\0\1\3\1\47\4\0"+
    "\3\3\1\163\21\3\3\0\1\3\17\0\1\3\1\47"+
    "\4\0\12\3\1\164\12\3\3\0\1\3\17\0\1\3"+
    "\1\47\4\0\7\3\1\165\15\3\3\0\1\3\17\0"+
    "\1\3\1\47\4\0\17\3\1\166\5\3\3\0\1\3"+
    "\17\0\1\3\1\47\4\0\22\3\1\167\2\3\3\0"+
    "\1\3\17\0\1\3\1\47\4\0\13\3\1\170\11\3"+
    "\3\0\1\3\17\0\1\3\1\47\4\0\23\3\1\171"+
    "\1\3\3\0\1\3\17\0\1\3\1\47\4\0\4\3"+
    "\1\172\20\3\3\0\1\3\17\0\1\3\1\47\4\0"+
    "\6\3\1\173\16\3\3\0\1\3\17\0\1\3\1\47"+
    "\4\0\7\3\1\174\15\3\3\0\1\3\17\0\1\3"+
    "\1\47\4\0\17\3\1\175\5\3\3\0\1\3\17\0"+
    "\1\3\1\47\4\0\10\3\1\176\14\3\3\0\1\3"+
    "\17\0\1\3\1\47\4\0\17\3\1\177\5\3\3\0"+
    "\1\3\17\0\1\3\1\47\4\0\7\3\1\200\15\3"+
    "\3\0\1\3\17\0\1\3\1\47\4\0\17\3\1\201"+
    "\5\3\3\0\1\3\17\0\1\3\1\47\4\0\6\3"+
    "\1\202\16\3\3\0\1\3\17\0\1\3\1\47\4\0"+
    "\4\3\1\203\20\3\3\0\1\3\17\0\1\3\1\47"+
    "\4\0\6\3\1\204\16\3\3\0\1\3\17\0\1\3"+
    "\1\47\4\0\7\3\1\205\15\3\3\0\1\3\16\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[4646];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\4\1\1\11\17\1\1\11\3\1\1\11"+
    "\5\1\6\11\26\1\3\11\1\1\1\11\1\0\25\1"+
    "\1\0\20\1\1\11\34\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[133];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
    private Symbol symbol(int type, Object value){
        return new Symbol(type, yyline, yycolumn, value);
    }
    private Symbol symbol(int type){
        return new Symbol(type, yyline, yycolumn);
    }


  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  LexerCup(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  LexerCup(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzCurrentPos*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
    }

    /* finally: fill the buffer with new input */
    int numRead = zzReader.read(zzBuffer, zzEndRead,
                                            zzBuffer.length-zzEndRead);

    if (numRead > 0) {
      zzEndRead+= numRead;
      return false;
    }
    // unlikely but not impossible: read 0 characters, but not at end of stream    
    if (numRead == 0) {
      int c = zzReader.read();
      if (c == -1) {
        return true;
      } else {
        zzBuffer[zzEndRead++] = (char) c;
        return false;
      }     
    }

	// numRead < 0
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() throws java.io.IOException {
    if (!zzEOFDone) {
      zzEOFDone = true;
      yyclose();
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public java_cup.runtime.Symbol next_token() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      yychar+= zzMarkedPosL-zzStartRead;

      boolean zzR = false;
      for (zzCurrentPosL = zzStartRead; zzCurrentPosL < zzMarkedPosL;
                                                             zzCurrentPosL++) {
        switch (zzBufferL[zzCurrentPosL]) {
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          yyline++;
          zzR = false;
          break;
        case '\r':
          yyline++;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
          }
          break;
        default:
          zzR = false;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof) 
            zzPeek = false;
          else 
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL)
            zzInput = zzBufferL[zzCurrentPosL++];
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = zzBufferL[zzCurrentPosL++];
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 16: 
          { return new Symbol(sym.Llave_a, yychar, yyline, yytext());
          }
        case 42: break;
        case 36: 
          { return new Symbol(sym.Cadena, yychar, yyline, yytext());
          }
        case 43: break;
        case 27: 
          { return new Symbol(sym.Int, yychar, yyline, yytext());
          }
        case 44: break;
        case 32: 
          { return new Symbol(sym.Class, yychar, yyline, yytext());
          }
        case 45: break;
        case 30: 
          { return new Symbol(sym.Else, yychar, yyline, yytext());
          }
        case 46: break;
        case 13: 
          { return new Symbol(sym.Op_logico, yychar, yyline, yytext());
          }
        case 47: break;
        case 18: 
          { return new Symbol(sym.Corchete_a, yychar, yyline, yytext());
          }
        case 48: break;
        case 5: 
          { return new Symbol(sym.Division, yychar, yyline, yytext());
          }
        case 49: break;
        case 40: 
          { return new Symbol(sym.Op_Potencia, yychar, yyline, yytext());
          }
        case 50: break;
        case 22: 
          { return new Symbol(sym.Do, yychar, yyline, yytext());
          }
        case 51: break;
        case 39: 
          { return new Symbol(sym.Print, yychar, yyline, yytext());
          }
        case 52: break;
        case 6: 
          { return new Symbol(sym.Comillas, yychar, yyline, yytext());
          }
        case 53: break;
        case 26: 
          { return new Symbol(sym.For, yychar, yyline, yytext());
          }
        case 54: break;
        case 28: 
          { return new Symbol(sym.T_dato, yychar, yyline, yytext());
          }
        case 55: break;
        case 14: 
          { return new Symbol(sym.Parentesis_a, yychar, yyline, yytext());
          }
        case 56: break;
        case 7: 
          { return new Symbol(sym.Resta, yychar, yyline, yytext());
          }
        case 57: break;
        case 3: 
          { return new Symbol(sym.Numero, yychar, yyline, new Integer(yytext()));
          }
        case 58: break;
        case 17: 
          { return new Symbol(sym.Llave_c, yychar, yyline, yytext());
          }
        case 59: break;
        case 37: 
          { return new Symbol(sym.Return, yychar, yyline, yytext());
          }
        case 60: break;
        case 19: 
          { return new Symbol(sym.Corchete_c, yychar, yyline, yytext());
          }
        case 61: break;
        case 23: 
          { return new Symbol(sym.If, yychar, yyline, yytext());
          }
        case 62: break;
        case 24: 
          { return new Symbol(sym.Op_incremento, yychar, yyline, yytext());
          }
        case 63: break;
        case 41: 
          { return new Symbol(sym.Op_Multiplicar, yychar, yyline, yytext());
          }
        case 64: break;
        case 38: 
          { return new Symbol(sym.Op_Dividir, yychar, yyline, yytext());
          }
        case 65: break;
        case 35: 
          { return new Symbol(sym.Op_Restar, yychar, yyline, yytext());
          }
        case 66: break;
        case 31: 
          { return new Symbol(sym.Main, yychar, yyline, yytext());
          }
        case 67: break;
        case 15: 
          { return new Symbol(sym.Parentesis_c, yychar, yyline, yytext());
          }
        case 68: break;
        case 20: 
          { return new Symbol(sym.P_coma, yychar, yyline, yytext());
          }
        case 69: break;
        case 10: 
          { return new Symbol(sym.Assign, yychar, yyline, yytext());
          }
        case 70: break;
        case 21: 
          { return new Symbol(sym.Identificador_Var, yychar, yyline, yytext());
          }
        case 71: break;
        case 12: 
          { return new Symbol(sym.Multiplicacion, yychar, yyline, yytext());
          }
        case 72: break;
        case 11: 
          { return new Symbol(sym.Suma, yychar, yyline, yytext());
          }
        case 73: break;
        case 25: 
          { return new Symbol(sym.Memb_Access, yychar, yyline, yytext());
          }
        case 74: break;
        case 33: 
          { return new Symbol(sym.Op_Sumar, yychar, yyline, yytext());
          }
        case 75: break;
        case 1: 
          { return new Symbol(sym.ERROR, yychar, yyline, yytext());
          }
        case 76: break;
        case 34: 
          { return new Symbol(sym.While, yychar, yyline, yytext());
          }
        case 77: break;
        case 4: 
          { /*Ignore*/
          }
        case 78: break;
        case 2: 
          { return new Symbol(sym.Identificador, yychar, yyline, yytext());
          }
        case 79: break;
        case 8: 
          { return new Symbol(sym.Op_relacional, yychar, yyline, yytext());
          }
        case 80: break;
        case 9: 
          { return new Symbol(sym.Power, yychar, yyline, yytext());
          }
        case 81: break;
        case 29: 
          { return new Symbol(sym.Op_booleano, yychar, yyline, yytext());
          }
        case 82: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            zzDoEOF();
              { return new java_cup.runtime.Symbol(sym.EOF); }
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}