// Generated from DataModel.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link DataModelParser}.
 */
public interface DataModelListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link DataModelParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(DataModelParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataModelParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(DataModelParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataModelParser#datamodel}.
	 * @param ctx the parse tree
	 */
	void enterDatamodel(DataModelParser.DatamodelContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataModelParser#datamodel}.
	 * @param ctx the parse tree
	 */
	void exitDatamodel(DataModelParser.DatamodelContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataModelParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(DataModelParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataModelParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(DataModelParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataModelParser#object}.
	 * @param ctx the parse tree
	 */
	void enterObject(DataModelParser.ObjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataModelParser#object}.
	 * @param ctx the parse tree
	 */
	void exitObject(DataModelParser.ObjectContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataModelParser#keyvalue}.
	 * @param ctx the parse tree
	 */
	void enterKeyvalue(DataModelParser.KeyvalueContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataModelParser#keyvalue}.
	 * @param ctx the parse tree
	 */
	void exitKeyvalue(DataModelParser.KeyvalueContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataModelParser#array}.
	 * @param ctx the parse tree
	 */
	void enterArray(DataModelParser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataModelParser#array}.
	 * @param ctx the parse tree
	 */
	void exitArray(DataModelParser.ArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataModelParser#encapsulated}.
	 * @param ctx the parse tree
	 */
	void enterEncapsulated(DataModelParser.EncapsulatedContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataModelParser#encapsulated}.
	 * @param ctx the parse tree
	 */
	void exitEncapsulated(DataModelParser.EncapsulatedContext ctx);
}