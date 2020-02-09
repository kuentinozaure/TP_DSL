/*
 * generated by Xtext 2.14.0
 */
grammar InternalMyDsl;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package com.m1ice.fsm.dsl.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package com.m1ice.fsm.dsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import com.m1ice.fsm.dsl.services.MyDslGrammarAccess;

}

@parser::members {

 	private MyDslGrammarAccess grammarAccess;

    public InternalMyDslParser(TokenStream input, MyDslGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "FSM";
   	}

   	@Override
   	protected MyDslGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleFSM
entryRuleFSM returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getFSMRule()); }
	iv_ruleFSM=ruleFSM
	{ $current=$iv_ruleFSM.current; }
	EOF;

// Rule FSM
ruleFSM returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='FSM '
		{
			newLeafNode(otherlv_0, grammarAccess.getFSMAccess().getFSMKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getFSMAccess().getNameEStringParserRuleCall_1_0());
				}
				lv_name_1_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getFSMRule());
					}
					set(
						$current,
						"name",
						lv_name_1_0,
						"com.m1ice.fsm.dsl.MyDsl.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getFSMAccess().getLeftCurlyBracketKeyword_2());
		}
		(
			(
				otherlv_3='state'
				{
					newLeafNode(otherlv_3, grammarAccess.getFSMAccess().getStateKeyword_3_0_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getFSMAccess().getStateStateParserRuleCall_3_0_1_0());
						}
						lv_state_4_0=ruleState
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getFSMRule());
							}
							add(
								$current,
								"state",
								lv_state_4_0,
								"com.m1ice.fsm.dsl.MyDsl.State");
							afterParserOrEnumRuleCall();
						}
					)
				)
				(
					otherlv_5=','
					{
						newLeafNode(otherlv_5, grammarAccess.getFSMAccess().getCommaKeyword_3_0_2_0());
					}
					(
						(
							{
								newCompositeNode(grammarAccess.getFSMAccess().getStateStateParserRuleCall_3_0_2_1_0());
							}
							lv_state_6_0=ruleState
							{
								if ($current==null) {
									$current = createModelElementForParent(grammarAccess.getFSMRule());
								}
								add(
									$current,
									"state",
									lv_state_6_0,
									"com.m1ice.fsm.dsl.MyDsl.State");
								afterParserOrEnumRuleCall();
							}
						)
					)
				)*
			)
			    |
			(
				(
					{
						newCompositeNode(grammarAccess.getFSMAccess().getTransitionTransitionParserRuleCall_3_1_0());
					}
					lv_transition_7_0=ruleTransition
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getFSMRule());
						}
						add(
							$current,
							"transition",
							lv_transition_7_0,
							"com.m1ice.fsm.dsl.MyDsl.Transition");
						afterParserOrEnumRuleCall();
					}
				)
			)
			    |
			(
				otherlv_8='initialState'
				{
					newLeafNode(otherlv_8, grammarAccess.getFSMAccess().getInitialStateKeyword_3_2_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getFSMAccess().getStateInitalStateParserRuleCall_3_2_1_0());
						}
						lv_state_9_0=ruleinitalState
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getFSMRule());
							}
							add(
								$current,
								"state",
								lv_state_9_0,
								"com.m1ice.fsm.dsl.MyDsl.initalState");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)
			    |
			(
				otherlv_10='finalState'
				{
					newLeafNode(otherlv_10, grammarAccess.getFSMAccess().getFinalStateKeyword_3_3_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getFSMAccess().getStateFinalStateParserRuleCall_3_3_1_0());
						}
						lv_state_11_0=rulefinalState
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getFSMRule());
							}
							add(
								$current,
								"state",
								lv_state_11_0,
								"com.m1ice.fsm.dsl.MyDsl.finalState");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)
		)*
		otherlv_12='}'
		{
			newLeafNode(otherlv_12, grammarAccess.getFSMAccess().getRightCurlyBracketKeyword_4());
		}
	)
;

// Entry rule entryRuleEString
entryRuleEString returns [String current=null]:
	{ newCompositeNode(grammarAccess.getEStringRule()); }
	iv_ruleEString=ruleEString
	{ $current=$iv_ruleEString.current.getText(); }
	EOF;

// Rule EString
ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_STRING_0=RULE_STRING
		{
			$current.merge(this_STRING_0);
		}
		{
			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
		}
		    |
		this_ID_1=RULE_ID
		{
			$current.merge(this_ID_1);
		}
		{
			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
		}
	)
;

// Entry rule entryRuleState
entryRuleState returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getStateRule()); }
	iv_ruleState=ruleState
	{ $current=$iv_ruleState.current; }
	EOF;

// Rule State
ruleState returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getStateAccess().getStateAction_0(),
					$current);
			}
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getStateAccess().getNameEStringParserRuleCall_1_0());
				}
				lv_name_1_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getStateRule());
					}
					set(
						$current,
						"name",
						lv_name_1_0,
						"com.m1ice.fsm.dsl.MyDsl.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleTransition
entryRuleTransition returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTransitionRule()); }
	iv_ruleTransition=ruleTransition
	{ $current=$iv_ruleTransition.current; }
	EOF;

// Rule Transition
ruleTransition returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getTransitionAccess().getTransitionAction_0(),
					$current);
			}
		)
		otherlv_1='transition'
		{
			newLeafNode(otherlv_1, grammarAccess.getTransitionAccess().getTransitionKeyword_1());
		}
		(
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getTransitionRule());
						}
					}
					{
						newCompositeNode(grammarAccess.getTransitionAccess().getStateStartStateCrossReference_2_0_0());
					}
					ruleEString
					{
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_3='->'
			{
				newLeafNode(otherlv_3, grammarAccess.getTransitionAccess().getHyphenMinusGreaterThanSignKeyword_2_1());
			}
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getTransitionRule());
						}
					}
					{
						newCompositeNode(grammarAccess.getTransitionAccess().getStateEndStateCrossReference_2_2_0());
					}
					ruleEString
					{
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
	)
;

// Entry rule entryRuleinitalState
entryRuleinitalState returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getInitalStateRule()); }
	iv_ruleinitalState=ruleinitalState
	{ $current=$iv_ruleinitalState.current; }
	EOF;

// Rule initalState
ruleinitalState returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getInitalStateAccess().getInitialStateAction_0(),
					$current);
			}
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getInitalStateAccess().getNameEStringParserRuleCall_1_0());
				}
				lv_name_1_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getInitalStateRule());
					}
					set(
						$current,
						"name",
						lv_name_1_0,
						"com.m1ice.fsm.dsl.MyDsl.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRulefinalState
entryRulefinalState returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getFinalStateRule()); }
	iv_rulefinalState=rulefinalState
	{ $current=$iv_rulefinalState.current; }
	EOF;

// Rule finalState
rulefinalState returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getFinalStateAccess().getFinalStateAction_0(),
					$current);
			}
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getFinalStateAccess().getNameEStringParserRuleCall_1_0());
				}
				lv_name_1_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getFinalStateRule());
					}
					set(
						$current,
						"name",
						lv_name_1_0,
						"com.m1ice.fsm.dsl.MyDsl.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
