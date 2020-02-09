/*
 * generated by Xtext 2.14.0
 */
package com.m1ice.fsm.dsl.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractGrammarElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class MyDslGrammarAccess extends AbstractGrammarElementFinder {
	
	public class FSMElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.m1ice.fsm.dsl.MyDsl.FSM");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cFSMKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameEStringParserRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Alternatives cAlternatives_3 = (Alternatives)cGroup.eContents().get(3);
		private final Group cGroup_3_0 = (Group)cAlternatives_3.eContents().get(0);
		private final Keyword cStateKeyword_3_0_0 = (Keyword)cGroup_3_0.eContents().get(0);
		private final Assignment cStateAssignment_3_0_1 = (Assignment)cGroup_3_0.eContents().get(1);
		private final RuleCall cStateStateParserRuleCall_3_0_1_0 = (RuleCall)cStateAssignment_3_0_1.eContents().get(0);
		private final Group cGroup_3_0_2 = (Group)cGroup_3_0.eContents().get(2);
		private final Keyword cCommaKeyword_3_0_2_0 = (Keyword)cGroup_3_0_2.eContents().get(0);
		private final Assignment cStateAssignment_3_0_2_1 = (Assignment)cGroup_3_0_2.eContents().get(1);
		private final RuleCall cStateStateParserRuleCall_3_0_2_1_0 = (RuleCall)cStateAssignment_3_0_2_1.eContents().get(0);
		private final Assignment cTransitionAssignment_3_1 = (Assignment)cAlternatives_3.eContents().get(1);
		private final RuleCall cTransitionTransitionParserRuleCall_3_1_0 = (RuleCall)cTransitionAssignment_3_1.eContents().get(0);
		private final Group cGroup_3_2 = (Group)cAlternatives_3.eContents().get(2);
		private final Keyword cInitialStateKeyword_3_2_0 = (Keyword)cGroup_3_2.eContents().get(0);
		private final Assignment cStateAssignment_3_2_1 = (Assignment)cGroup_3_2.eContents().get(1);
		private final RuleCall cStateInitalStateParserRuleCall_3_2_1_0 = (RuleCall)cStateAssignment_3_2_1.eContents().get(0);
		private final Group cGroup_3_3 = (Group)cAlternatives_3.eContents().get(3);
		private final Keyword cFinalStateKeyword_3_3_0 = (Keyword)cGroup_3_3.eContents().get(0);
		private final Assignment cStateAssignment_3_3_1 = (Assignment)cGroup_3_3.eContents().get(1);
		private final RuleCall cStateFinalStateParserRuleCall_3_3_1_0 = (RuleCall)cStateAssignment_3_3_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//FSM: // {FSM}
		//	'FSM ' name=EString '{' ('state' state+=State ("," state+=State)* | transition+=Transition | 'initialState'
		//	state+=initalState | 'finalState' state+=finalState)* // * 
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//// {FSM}
		//'FSM ' name=EString '{' ('state' state+=State ("," state+=State)* | transition+=Transition | 'initialState'
		//state+=initalState | 'finalState' state+=finalState)* // * 
		//'}'
		public Group getGroup() { return cGroup; }
		
		//// {FSM}
		//'FSM '
		public Keyword getFSMKeyword_0() { return cFSMKeyword_0; }
		
		//name=EString
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//EString
		public RuleCall getNameEStringParserRuleCall_1_0() { return cNameEStringParserRuleCall_1_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//('state' state+=State ("," state+=State)* | transition+=Transition | 'initialState' state+=initalState | 'finalState'
		//state+=finalState)*
		public Alternatives getAlternatives_3() { return cAlternatives_3; }
		
		//'state' state+=State ("," state+=State)*
		public Group getGroup_3_0() { return cGroup_3_0; }
		
		//'state'
		public Keyword getStateKeyword_3_0_0() { return cStateKeyword_3_0_0; }
		
		//state+=State
		public Assignment getStateAssignment_3_0_1() { return cStateAssignment_3_0_1; }
		
		//State
		public RuleCall getStateStateParserRuleCall_3_0_1_0() { return cStateStateParserRuleCall_3_0_1_0; }
		
		//("," state+=State)*
		public Group getGroup_3_0_2() { return cGroup_3_0_2; }
		
		//","
		public Keyword getCommaKeyword_3_0_2_0() { return cCommaKeyword_3_0_2_0; }
		
		//state+=State
		public Assignment getStateAssignment_3_0_2_1() { return cStateAssignment_3_0_2_1; }
		
		//State
		public RuleCall getStateStateParserRuleCall_3_0_2_1_0() { return cStateStateParserRuleCall_3_0_2_1_0; }
		
		//transition+=Transition
		public Assignment getTransitionAssignment_3_1() { return cTransitionAssignment_3_1; }
		
		//Transition
		public RuleCall getTransitionTransitionParserRuleCall_3_1_0() { return cTransitionTransitionParserRuleCall_3_1_0; }
		
		//'initialState' state+=initalState
		public Group getGroup_3_2() { return cGroup_3_2; }
		
		//'initialState'
		public Keyword getInitialStateKeyword_3_2_0() { return cInitialStateKeyword_3_2_0; }
		
		//state+=initalState
		public Assignment getStateAssignment_3_2_1() { return cStateAssignment_3_2_1; }
		
		//initalState
		public RuleCall getStateInitalStateParserRuleCall_3_2_1_0() { return cStateInitalStateParserRuleCall_3_2_1_0; }
		
		//'finalState' state+=finalState
		public Group getGroup_3_3() { return cGroup_3_3; }
		
		//'finalState'
		public Keyword getFinalStateKeyword_3_3_0() { return cFinalStateKeyword_3_3_0; }
		
		//state+=finalState
		public Assignment getStateAssignment_3_3_1() { return cStateAssignment_3_3_1; }
		
		//finalState
		public RuleCall getStateFinalStateParserRuleCall_3_3_1_0() { return cStateFinalStateParserRuleCall_3_3_1_0; }
		
		//// * 
		//'}'
		public Keyword getRightCurlyBracketKeyword_4() { return cRightCurlyBracketKeyword_4; }
	}
	public class EStringElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.m1ice.fsm.dsl.MyDsl.EString");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cSTRINGTerminalRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cIDTerminalRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//EString:
		//	STRING | ID;
		@Override public ParserRule getRule() { return rule; }
		
		//STRING | ID
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//STRING
		public RuleCall getSTRINGTerminalRuleCall_0() { return cSTRINGTerminalRuleCall_0; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_1() { return cIDTerminalRuleCall_1; }
	}
	public class StateElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.m1ice.fsm.dsl.MyDsl.State");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cStateAction_0 = (Action)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameEStringParserRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		
		//State:
		//	{State} name=EString;
		@Override public ParserRule getRule() { return rule; }
		
		//{State} name=EString
		public Group getGroup() { return cGroup; }
		
		//{State}
		public Action getStateAction_0() { return cStateAction_0; }
		
		//name=EString
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//EString
		public RuleCall getNameEStringParserRuleCall_1_0() { return cNameEStringParserRuleCall_1_0; }
	}
	public class TransitionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.m1ice.fsm.dsl.MyDsl.Transition");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cTransitionAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cTransitionKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Assignment cStateStartAssignment_2_0 = (Assignment)cGroup_2.eContents().get(0);
		private final CrossReference cStateStartStateCrossReference_2_0_0 = (CrossReference)cStateStartAssignment_2_0.eContents().get(0);
		private final RuleCall cStateStartStateEStringParserRuleCall_2_0_0_1 = (RuleCall)cStateStartStateCrossReference_2_0_0.eContents().get(1);
		private final Keyword cHyphenMinusGreaterThanSignKeyword_2_1 = (Keyword)cGroup_2.eContents().get(1);
		private final Assignment cStateEndAssignment_2_2 = (Assignment)cGroup_2.eContents().get(2);
		private final CrossReference cStateEndStateCrossReference_2_2_0 = (CrossReference)cStateEndAssignment_2_2.eContents().get(0);
		private final RuleCall cStateEndStateEStringParserRuleCall_2_2_0_1 = (RuleCall)cStateEndStateCrossReference_2_2_0.eContents().get(1);
		
		//Transition:
		//	{Transition}
		//	'transition' (stateStart=[State|EString] "->" stateEnd=[State|EString])*
		//	//		('stateStart' stateStart=[State|EString] "->" 'stateEnd' stateEnd=[State|EString])?
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//{Transition} 'transition' (stateStart=[State|EString] "->" stateEnd=[State|EString])*
		public Group getGroup() { return cGroup; }
		
		//{Transition}
		public Action getTransitionAction_0() { return cTransitionAction_0; }
		
		//'transition'
		public Keyword getTransitionKeyword_1() { return cTransitionKeyword_1; }
		
		//(stateStart=[State|EString] "->" stateEnd=[State|EString])*
		public Group getGroup_2() { return cGroup_2; }
		
		//stateStart=[State|EString]
		public Assignment getStateStartAssignment_2_0() { return cStateStartAssignment_2_0; }
		
		//[State|EString]
		public CrossReference getStateStartStateCrossReference_2_0_0() { return cStateStartStateCrossReference_2_0_0; }
		
		//EString
		public RuleCall getStateStartStateEStringParserRuleCall_2_0_0_1() { return cStateStartStateEStringParserRuleCall_2_0_0_1; }
		
		//"->"
		public Keyword getHyphenMinusGreaterThanSignKeyword_2_1() { return cHyphenMinusGreaterThanSignKeyword_2_1; }
		
		//stateEnd=[State|EString]
		public Assignment getStateEndAssignment_2_2() { return cStateEndAssignment_2_2; }
		
		//[State|EString]
		public CrossReference getStateEndStateCrossReference_2_2_0() { return cStateEndStateCrossReference_2_2_0; }
		
		//EString
		public RuleCall getStateEndStateEStringParserRuleCall_2_2_0_1() { return cStateEndStateEStringParserRuleCall_2_2_0_1; }
	}
	public class InitalStateElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.m1ice.fsm.dsl.MyDsl.initalState");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cInitialStateAction_0 = (Action)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameEStringParserRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		
		//initalState InitialState:
		//	{InitialState} name=EString;
		@Override public ParserRule getRule() { return rule; }
		
		//{InitialState} name=EString
		public Group getGroup() { return cGroup; }
		
		//{InitialState}
		public Action getInitialStateAction_0() { return cInitialStateAction_0; }
		
		//name=EString
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//EString
		public RuleCall getNameEStringParserRuleCall_1_0() { return cNameEStringParserRuleCall_1_0; }
	}
	public class FinalStateElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.m1ice.fsm.dsl.MyDsl.finalState");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cFinalStateAction_0 = (Action)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameEStringParserRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		
		//finalState FinalState:
		//	{FinalState} name=EString;
		@Override public ParserRule getRule() { return rule; }
		
		//{FinalState} name=EString
		public Group getGroup() { return cGroup; }
		
		//{FinalState}
		public Action getFinalStateAction_0() { return cFinalStateAction_0; }
		
		//name=EString
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//EString
		public RuleCall getNameEStringParserRuleCall_1_0() { return cNameEStringParserRuleCall_1_0; }
	}
	
	
	private final FSMElements pFSM;
	private final EStringElements pEString;
	private final StateElements pState;
	private final TransitionElements pTransition;
	private final InitalStateElements pInitalState;
	private final FinalStateElements pFinalState;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public MyDslGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pFSM = new FSMElements();
		this.pEString = new EStringElements();
		this.pState = new StateElements();
		this.pTransition = new TransitionElements();
		this.pInitalState = new InitalStateElements();
		this.pFinalState = new FinalStateElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("com.m1ice.fsm.dsl.MyDsl".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//FSM: // {FSM}
	//	'FSM ' name=EString '{' ('state' state+=State ("," state+=State)* | transition+=Transition | 'initialState'
	//	state+=initalState | 'finalState' state+=finalState)* // * 
	//	'}';
	public FSMElements getFSMAccess() {
		return pFSM;
	}
	
	public ParserRule getFSMRule() {
		return getFSMAccess().getRule();
	}
	
	//EString:
	//	STRING | ID;
	public EStringElements getEStringAccess() {
		return pEString;
	}
	
	public ParserRule getEStringRule() {
		return getEStringAccess().getRule();
	}
	
	//State:
	//	{State} name=EString;
	public StateElements getStateAccess() {
		return pState;
	}
	
	public ParserRule getStateRule() {
		return getStateAccess().getRule();
	}
	
	//Transition:
	//	{Transition}
	//	'transition' (stateStart=[State|EString] "->" stateEnd=[State|EString])*
	//	//		('stateStart' stateStart=[State|EString] "->" 'stateEnd' stateEnd=[State|EString])?
	//;
	public TransitionElements getTransitionAccess() {
		return pTransition;
	}
	
	public ParserRule getTransitionRule() {
		return getTransitionAccess().getRule();
	}
	
	//initalState InitialState:
	//	{InitialState} name=EString;
	public InitalStateElements getInitalStateAccess() {
		return pInitalState;
	}
	
	public ParserRule getInitalStateRule() {
		return getInitalStateAccess().getRule();
	}
	
	//finalState FinalState:
	//	{FinalState} name=EString;
	public FinalStateElements getFinalStateAccess() {
		return pFinalState;
	}
	
	public ParserRule getFinalStateRule() {
		return getFinalStateAccess().getRule();
	}
	
	//terminal ID:
	//	'^'? ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt:
	//	'0'..'9'+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//	'"' ('\\' . | !('\\' | '"'))* '"' | "'" ('\\' . | !('\\' | "'"))* "'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT:
	//	'/*'->'*/';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT:
	//	'//' !('\n' | '\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS:
	//	' ' | '\t' | '\r' | '\n'+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}
