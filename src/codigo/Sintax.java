
//----------------------------------------------------
// The following code was generated by CUP v0.11a beta 20060608
// Wed Aug 05 21:08:31 BOT 2020
//----------------------------------------------------

package codigo;

import java_cup.runtime.Symbol;

/** CUP v0.11a beta 20060608 generated parser.
  * @version Wed Aug 05 21:08:31 BOT 2020
  */
public class Sintax extends java_cup.runtime.lr_parser {

  /** Default constructor. */
  public Sintax() {super();}

  /** Constructor which sets the default scanner. */
  public Sintax(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public Sintax(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\042\000\002\002\004\000\002\002\003\000\002\023" +
    "\030\000\002\026\011\000\002\022\003\000\002\022\003" +
    "\000\002\022\003\000\002\022\003\000\002\025\010\000" +
    "\002\025\011\000\002\025\012\000\002\025\013\000\002" +
    "\025\014\000\002\027\003\000\002\027\003\000\002\027" +
    "\003\000\002\027\003\000\002\015\012\000\002\017\012" +
    "\000\002\020\012\000\002\021\012\000\002\016\010\000" +
    "\002\016\010\000\002\016\010\000\002\016\010\000\002" +
    "\024\004\000\002\024\006\000\002\024\010\000\002\024" +
    "\012\000\002\024\014\000\002\030\003\000\002\030\003" +
    "\000\002\004\005\000\002\004\007" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\132\000\004\042\004\001\002\000\004\040\010\001" +
    "\002\000\004\002\007\001\002\000\004\002\000\001\002" +
    "\000\004\002\001\001\002\000\004\032\011\001\002\000" +
    "\004\005\012\001\002\000\006\040\015\054\014\001\002" +
    "\000\004\053\016\001\002\000\022\005\uffe2\017\uffe2\020" +
    "\uffe2\021\uffe2\022\uffe2\031\uffe2\037\uffe2\053\uffe2\001\002" +
    "\000\022\005\uffe3\017\uffe3\020\uffe3\021\uffe3\022\uffe3\031" +
    "\uffe3\037\uffe3\053\uffe3\001\002\000\004\056\017\001\002" +
    "\000\004\037\020\001\002\000\004\005\026\001\002\000" +
    "\004\040\ufffa\001\002\000\004\040\ufffc\001\002\000\004" +
    "\040\114\001\002\000\004\040\ufffd\001\002\000\004\040" +
    "\ufffb\001\002\000\012\044\032\045\030\046\027\047\031" +
    "\001\002\000\004\030\106\001\002\000\004\030\100\001" +
    "\002\000\004\030\072\001\002\000\004\030\033\001\002" +
    "\000\004\005\035\001\002\000\004\031\047\001\002\000" +
    "\006\040\015\054\014\001\002\000\006\005\037\031\uffe8" +
    "\001\002\000\006\040\015\054\014\001\002\000\006\005" +
    "\041\031\uffe7\001\002\000\006\040\015\054\014\001\002" +
    "\000\006\005\043\031\uffe6\001\002\000\006\040\015\054" +
    "\014\001\002\000\006\005\045\031\uffe5\001\002\000\006" +
    "\040\015\054\014\001\002\000\004\031\uffe4\001\002\000" +
    "\004\032\050\001\002\000\004\051\052\001\002\000\004" +
    "\033\071\001\002\000\004\052\053\001\002\000\006\040" +
    "\015\054\014\001\002\000\012\017\057\020\056\021\060" +
    "\022\055\001\002\000\006\040\015\054\014\001\002\000" +
    "\006\040\015\054\014\001\002\000\006\040\015\054\014" +
    "\001\002\000\006\040\015\054\014\001\002\000\004\037" +
    "\062\001\002\000\004\033\uffe9\001\002\000\004\037\064" +
    "\001\002\000\004\033\uffec\001\002\000\004\037\066\001" +
    "\002\000\004\033\uffeb\001\002\000\004\037\070\001\002" +
    "\000\004\033\uffea\001\002\000\004\040\uffee\001\002\000" +
    "\004\005\035\001\002\000\004\031\074\001\002\000\004" +
    "\032\075\001\002\000\004\051\052\001\002\000\004\033" +
    "\077\001\002\000\004\040\ufff0\001\002\000\004\005\035" +
    "\001\002\000\004\031\102\001\002\000\004\032\103\001" +
    "\002\000\004\051\052\001\002\000\004\033\105\001\002" +
    "\000\004\040\uffed\001\002\000\004\005\035\001\002\000" +
    "\004\031\110\001\002\000\004\032\111\001\002\000\004" +
    "\051\052\001\002\000\004\033\113\001\002\000\004\040" +
    "\uffef\001\002\000\004\030\115\001\002\000\004\031\116" +
    "\001\002\000\004\032\117\001\002\000\004\050\120\001" +
    "\002\000\004\052\121\001\002\000\012\044\126\045\123" +
    "\046\122\047\124\001\002\000\004\030\ufff3\001\002\000" +
    "\004\030\ufff1\001\002\000\004\030\ufff4\001\002\000\004" +
    "\030\127\001\002\000\004\030\ufff2\001\002\000\004\056" +
    "\130\001\002\000\004\031\131\001\002\000\004\037\132" +
    "\001\002\000\004\033\133\001\002\000\004\033\134\001" +
    "\002\000\004\002\uffff\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\132\000\006\002\004\023\005\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\004\030\012\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\014\015\023\017" +
    "\021\020\024\021\020\022\022\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\004\024" +
    "\033\001\001\000\002\001\001\000\004\030\035\001\001" +
    "\000\002\001\001\000\004\030\037\001\001\000\002\001" +
    "\001\000\004\030\041\001\001\000\002\001\001\000\004" +
    "\030\043\001\001\000\002\001\001\000\004\030\045\001" +
    "\001\000\002\001\001\000\002\001\001\000\004\016\050" +
    "\001\001\000\002\001\001\000\002\001\001\000\004\030" +
    "\053\001\001\000\002\001\001\000\004\030\066\001\001" +
    "\000\004\030\064\001\001\000\004\030\062\001\001\000" +
    "\004\030\060\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\004\024\072\001\001\000\002\001\001\000" +
    "\002\001\001\000\004\016\075\001\001\000\002\001\001" +
    "\000\002\001\001\000\004\024\100\001\001\000\002\001" +
    "\001\000\002\001\001\000\004\016\103\001\001\000\002" +
    "\001\001\000\002\001\001\000\004\024\106\001\001\000" +
    "\002\001\001\000\002\001\001\000\004\016\111\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\004\027\124\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$Sintax$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$Sintax$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$Sintax$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}



    private Symbol s;
    
    public void syntax_error(Symbol s){
        this.s = s;
    }

    public Symbol getS(){
        return this.s;
}

}

/** Cup generated class to encapsulate user supplied action code.*/
class CUP$Sintax$actions {
  private final Sintax parser;

  /** Constructor */
  CUP$Sintax$actions(Sintax parser) {
    this.parser = parser;
  }

  /** Method with the actual generated action code. */
  public final java_cup.runtime.Symbol CUP$Sintax$do_action(
    int                        CUP$Sintax$act_num,
    java_cup.runtime.lr_parser CUP$Sintax$parser,
    java.util.Stack            CUP$Sintax$stack,
    int                        CUP$Sintax$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$Sintax$result;

      /* select the action based on the action number */
      switch (CUP$Sintax$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 33: // DECLARACION ::= Int IDENTIFICADORES Assign Numero P_coma 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("DECLARACION",2, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-4)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 32: // DECLARACION ::= Int IDENTIFICADORES P_coma 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("DECLARACION",2, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-2)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 31: // IDENTIFICADORES ::= Identificador_Var 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("IDENTIFICADORES",22, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 30: // IDENTIFICADORES ::= Identificador 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("IDENTIFICADORES",22, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 29: // PARAMETRO ::= Int IDENTIFICADORES Int IDENTIFICADORES Int IDENTIFICADORES Int IDENTIFICADORES Int IDENTIFICADORES 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("PARAMETRO",18, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-9)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 28: // PARAMETRO ::= Int IDENTIFICADORES Int IDENTIFICADORES Int IDENTIFICADORES Int IDENTIFICADORES 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("PARAMETRO",18, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-7)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 27: // PARAMETRO ::= Int IDENTIFICADORES Int IDENTIFICADORES Int IDENTIFICADORES 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("PARAMETRO",18, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-5)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 26: // PARAMETRO ::= Int IDENTIFICADORES Int IDENTIFICADORES 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("PARAMETRO",18, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-3)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 25: // PARAMETRO ::= Int IDENTIFICADORES 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("PARAMETRO",18, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 24: // RETORNO ::= Return Memb_Access IDENTIFICADORES Multiplicacion IDENTIFICADORES P_coma 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("RETORNO",12, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-5)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 23: // RETORNO ::= Return Memb_Access IDENTIFICADORES Division IDENTIFICADORES P_coma 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("RETORNO",12, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-5)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 22: // RETORNO ::= Return Memb_Access IDENTIFICADORES Resta IDENTIFICADORES P_coma 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("RETORNO",12, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-5)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // RETORNO ::= Return Memb_Access IDENTIFICADORES Suma IDENTIFICADORES P_coma 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("RETORNO",12, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-5)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // MULTIPLICACION ::= Int Op_Multiplicar Parentesis_a PARAMETRO Parentesis_c Llave_a RETORNO Llave_c 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("MULTIPLICACION",15, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-7)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // DIVISION ::= Int Op_Dividir Parentesis_a PARAMETRO Parentesis_c Llave_a RETORNO Llave_c 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("DIVISION",14, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-7)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // RESTA ::= Int Op_Restar Parentesis_a PARAMETRO Parentesis_c Llave_a RETORNO Llave_c 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("RESTA",13, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-7)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // SUMA ::= Int Op_Sumar Parentesis_a PARAMETRO Parentesis_c Llave_a RETORNO Llave_c 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("SUMA",11, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-7)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // OP_ARISMETICAS ::= Op_Multiplicar 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("OP_ARISMETICAS",21, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // OP_ARISMETICAS ::= Op_Dividir 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("OP_ARISMETICAS",21, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // OP_ARISMETICAS ::= Op_Restar 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("OP_ARISMETICAS",21, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // OP_ARISMETICAS ::= Op_Sumar 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("OP_ARISMETICAS",21, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // LLAMADA ::= Identificador Parentesis_a Parentesis_c Llave_a IMPRIMIR IMPRIMIR IMPRIMIR IMPRIMIR IMPRIMIR Llave_c 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("LLAMADA",19, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-9)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // LLAMADA ::= Identificador Parentesis_a Parentesis_c Llave_a IMPRIMIR IMPRIMIR IMPRIMIR IMPRIMIR Llave_c 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("LLAMADA",19, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-8)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // LLAMADA ::= Identificador Parentesis_a Parentesis_c Llave_a IMPRIMIR IMPRIMIR IMPRIMIR Llave_c 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("LLAMADA",19, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-7)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // LLAMADA ::= Identificador Parentesis_a Parentesis_c Llave_a IMPRIMIR IMPRIMIR Llave_c 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("LLAMADA",19, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-6)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // LLAMADA ::= Identificador Parentesis_a Parentesis_c Llave_a IMPRIMIR Llave_c 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("LLAMADA",19, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-5)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // OPERACIONES ::= MULTIPLICACION 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("OPERACIONES",16, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // OPERACIONES ::= DIVISION 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("OPERACIONES",16, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // OPERACIONES ::= RESTA 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("OPERACIONES",16, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // OPERACIONES ::= SUMA 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("OPERACIONES",16, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // IMPRIMIR ::= Print Memb_Access OP_ARISMETICAS Parentesis_a Numero Parentesis_c P_coma 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("IMPRIMIR",20, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-6)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // CLASE ::= Class Identificador Llave_a Int IDENTIFICADORES Assign Numero P_coma OPERACIONES Identificador Parentesis_a Parentesis_c Llave_a Print Memb_Access OP_ARISMETICAS Parentesis_a Numero Parentesis_c P_coma Llave_c Llave_c 
            {
              Object RESULT =null;
		int n1left = ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-15)).left;
		int n1right = ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-15)).right;
		Integer n1 = (Integer)((java_cup.runtime.Symbol) CUP$Sintax$stack.elementAt(CUP$Sintax$top-15)).value;
		int n2left = ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-4)).left;
		int n2right = ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-4)).right;
		Integer n2 = (Integer)((java_cup.runtime.Symbol) CUP$Sintax$stack.elementAt(CUP$Sintax$top-4)).value;
		 RESULT = n1.intValue() + n2.intValue(); 
              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("CLASE",17, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-21)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // INICIO ::= CLASE 
            {
              Object RESULT =null;
		int senleft = ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()).left;
		int senright = ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()).right;
		Object sen = (Object)((java_cup.runtime.Symbol) CUP$Sintax$stack.peek()).value;
		 RESULT = sen; 
              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("INICIO",0, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= INICIO EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)).value;
		RESULT = start_val;
              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$Sintax$parser.done_parsing();
          return CUP$Sintax$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number found in internal parse table");

        }
    }
}

