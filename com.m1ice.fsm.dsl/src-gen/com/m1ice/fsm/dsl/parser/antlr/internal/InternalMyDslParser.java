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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'FSM '", "'{'", "'state'", "','", "'initialState'", "'finalState'", "'}'", "'transition'", "'->'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=6;
    public static final int RULE_ML_COMMENT=7;

    // delegates
    // delegators


        public InternalMyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMyDsl.g"; }



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




    // $ANTLR start "entryRuleFSM"
    // InternalMyDsl.g:64:1: entryRuleFSM returns [EObject current=null] : iv_ruleFSM= ruleFSM EOF ;
    public final EObject entryRuleFSM() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFSM = null;


        try {
            // InternalMyDsl.g:64:44: (iv_ruleFSM= ruleFSM EOF )
            // InternalMyDsl.g:65:2: iv_ruleFSM= ruleFSM EOF
            {
             newCompositeNode(grammarAccess.getFSMRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFSM=ruleFSM();

            state._fsp--;

             current =iv_ruleFSM; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFSM"


    // $ANTLR start "ruleFSM"
    // InternalMyDsl.g:71:1: ruleFSM returns [EObject current=null] : (otherlv_0= 'FSM ' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( (otherlv_3= 'state' ( (lv_state_4_0= ruleState ) ) (otherlv_5= ',' ( (lv_state_6_0= ruleState ) ) )* ) | ( (lv_transition_7_0= ruleTransition ) ) | (otherlv_8= 'initialState' ( (lv_state_9_0= ruleinitalState ) ) ) | (otherlv_10= 'finalState' ( (lv_state_11_0= rulefinalState ) ) ) )* otherlv_12= '}' ) ;
    public final EObject ruleFSM() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_state_4_0 = null;

        EObject lv_state_6_0 = null;

        EObject lv_transition_7_0 = null;

        EObject lv_state_9_0 = null;

        EObject lv_state_11_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:77:2: ( (otherlv_0= 'FSM ' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( (otherlv_3= 'state' ( (lv_state_4_0= ruleState ) ) (otherlv_5= ',' ( (lv_state_6_0= ruleState ) ) )* ) | ( (lv_transition_7_0= ruleTransition ) ) | (otherlv_8= 'initialState' ( (lv_state_9_0= ruleinitalState ) ) ) | (otherlv_10= 'finalState' ( (lv_state_11_0= rulefinalState ) ) ) )* otherlv_12= '}' ) )
            // InternalMyDsl.g:78:2: (otherlv_0= 'FSM ' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( (otherlv_3= 'state' ( (lv_state_4_0= ruleState ) ) (otherlv_5= ',' ( (lv_state_6_0= ruleState ) ) )* ) | ( (lv_transition_7_0= ruleTransition ) ) | (otherlv_8= 'initialState' ( (lv_state_9_0= ruleinitalState ) ) ) | (otherlv_10= 'finalState' ( (lv_state_11_0= rulefinalState ) ) ) )* otherlv_12= '}' )
            {
            // InternalMyDsl.g:78:2: (otherlv_0= 'FSM ' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( (otherlv_3= 'state' ( (lv_state_4_0= ruleState ) ) (otherlv_5= ',' ( (lv_state_6_0= ruleState ) ) )* ) | ( (lv_transition_7_0= ruleTransition ) ) | (otherlv_8= 'initialState' ( (lv_state_9_0= ruleinitalState ) ) ) | (otherlv_10= 'finalState' ( (lv_state_11_0= rulefinalState ) ) ) )* otherlv_12= '}' )
            // InternalMyDsl.g:79:3: otherlv_0= 'FSM ' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( (otherlv_3= 'state' ( (lv_state_4_0= ruleState ) ) (otherlv_5= ',' ( (lv_state_6_0= ruleState ) ) )* ) | ( (lv_transition_7_0= ruleTransition ) ) | (otherlv_8= 'initialState' ( (lv_state_9_0= ruleinitalState ) ) ) | (otherlv_10= 'finalState' ( (lv_state_11_0= rulefinalState ) ) ) )* otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getFSMAccess().getFSMKeyword_0());
            		
            // InternalMyDsl.g:83:3: ( (lv_name_1_0= ruleEString ) )
            // InternalMyDsl.g:84:4: (lv_name_1_0= ruleEString )
            {
            // InternalMyDsl.g:84:4: (lv_name_1_0= ruleEString )
            // InternalMyDsl.g:85:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getFSMAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFSMRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"com.m1ice.fsm.dsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getFSMAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:106:3: ( (otherlv_3= 'state' ( (lv_state_4_0= ruleState ) ) (otherlv_5= ',' ( (lv_state_6_0= ruleState ) ) )* ) | ( (lv_transition_7_0= ruleTransition ) ) | (otherlv_8= 'initialState' ( (lv_state_9_0= ruleinitalState ) ) ) | (otherlv_10= 'finalState' ( (lv_state_11_0= rulefinalState ) ) ) )*
            loop2:
            do {
                int alt2=5;
                switch ( input.LA(1) ) {
                case 13:
                    {
                    alt2=1;
                    }
                    break;
                case 18:
                    {
                    alt2=2;
                    }
                    break;
                case 15:
                    {
                    alt2=3;
                    }
                    break;
                case 16:
                    {
                    alt2=4;
                    }
                    break;

                }

                switch (alt2) {
            	case 1 :
            	    // InternalMyDsl.g:107:4: (otherlv_3= 'state' ( (lv_state_4_0= ruleState ) ) (otherlv_5= ',' ( (lv_state_6_0= ruleState ) ) )* )
            	    {
            	    // InternalMyDsl.g:107:4: (otherlv_3= 'state' ( (lv_state_4_0= ruleState ) ) (otherlv_5= ',' ( (lv_state_6_0= ruleState ) ) )* )
            	    // InternalMyDsl.g:108:5: otherlv_3= 'state' ( (lv_state_4_0= ruleState ) ) (otherlv_5= ',' ( (lv_state_6_0= ruleState ) ) )*
            	    {
            	    otherlv_3=(Token)match(input,13,FOLLOW_3); 

            	    					newLeafNode(otherlv_3, grammarAccess.getFSMAccess().getStateKeyword_3_0_0());
            	    				
            	    // InternalMyDsl.g:112:5: ( (lv_state_4_0= ruleState ) )
            	    // InternalMyDsl.g:113:6: (lv_state_4_0= ruleState )
            	    {
            	    // InternalMyDsl.g:113:6: (lv_state_4_0= ruleState )
            	    // InternalMyDsl.g:114:7: lv_state_4_0= ruleState
            	    {

            	    							newCompositeNode(grammarAccess.getFSMAccess().getStateStateParserRuleCall_3_0_1_0());
            	    						
            	    pushFollow(FOLLOW_6);
            	    lv_state_4_0=ruleState();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getFSMRule());
            	    							}
            	    							add(
            	    								current,
            	    								"state",
            	    								lv_state_4_0,
            	    								"com.m1ice.fsm.dsl.MyDsl.State");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }

            	    // InternalMyDsl.g:131:5: (otherlv_5= ',' ( (lv_state_6_0= ruleState ) ) )*
            	    loop1:
            	    do {
            	        int alt1=2;
            	        int LA1_0 = input.LA(1);

            	        if ( (LA1_0==14) ) {
            	            alt1=1;
            	        }


            	        switch (alt1) {
            	    	case 1 :
            	    	    // InternalMyDsl.g:132:6: otherlv_5= ',' ( (lv_state_6_0= ruleState ) )
            	    	    {
            	    	    otherlv_5=(Token)match(input,14,FOLLOW_3); 

            	    	    						newLeafNode(otherlv_5, grammarAccess.getFSMAccess().getCommaKeyword_3_0_2_0());
            	    	    					
            	    	    // InternalMyDsl.g:136:6: ( (lv_state_6_0= ruleState ) )
            	    	    // InternalMyDsl.g:137:7: (lv_state_6_0= ruleState )
            	    	    {
            	    	    // InternalMyDsl.g:137:7: (lv_state_6_0= ruleState )
            	    	    // InternalMyDsl.g:138:8: lv_state_6_0= ruleState
            	    	    {

            	    	    								newCompositeNode(grammarAccess.getFSMAccess().getStateStateParserRuleCall_3_0_2_1_0());
            	    	    							
            	    	    pushFollow(FOLLOW_6);
            	    	    lv_state_6_0=ruleState();

            	    	    state._fsp--;


            	    	    								if (current==null) {
            	    	    									current = createModelElementForParent(grammarAccess.getFSMRule());
            	    	    								}
            	    	    								add(
            	    	    									current,
            	    	    									"state",
            	    	    									lv_state_6_0,
            	    	    									"com.m1ice.fsm.dsl.MyDsl.State");
            	    	    								afterParserOrEnumRuleCall();
            	    	    							

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop1;
            	        }
            	    } while (true);


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalMyDsl.g:158:4: ( (lv_transition_7_0= ruleTransition ) )
            	    {
            	    // InternalMyDsl.g:158:4: ( (lv_transition_7_0= ruleTransition ) )
            	    // InternalMyDsl.g:159:5: (lv_transition_7_0= ruleTransition )
            	    {
            	    // InternalMyDsl.g:159:5: (lv_transition_7_0= ruleTransition )
            	    // InternalMyDsl.g:160:6: lv_transition_7_0= ruleTransition
            	    {

            	    						newCompositeNode(grammarAccess.getFSMAccess().getTransitionTransitionParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_5);
            	    lv_transition_7_0=ruleTransition();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getFSMRule());
            	    						}
            	    						add(
            	    							current,
            	    							"transition",
            	    							lv_transition_7_0,
            	    							"com.m1ice.fsm.dsl.MyDsl.Transition");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalMyDsl.g:178:4: (otherlv_8= 'initialState' ( (lv_state_9_0= ruleinitalState ) ) )
            	    {
            	    // InternalMyDsl.g:178:4: (otherlv_8= 'initialState' ( (lv_state_9_0= ruleinitalState ) ) )
            	    // InternalMyDsl.g:179:5: otherlv_8= 'initialState' ( (lv_state_9_0= ruleinitalState ) )
            	    {
            	    otherlv_8=(Token)match(input,15,FOLLOW_3); 

            	    					newLeafNode(otherlv_8, grammarAccess.getFSMAccess().getInitialStateKeyword_3_2_0());
            	    				
            	    // InternalMyDsl.g:183:5: ( (lv_state_9_0= ruleinitalState ) )
            	    // InternalMyDsl.g:184:6: (lv_state_9_0= ruleinitalState )
            	    {
            	    // InternalMyDsl.g:184:6: (lv_state_9_0= ruleinitalState )
            	    // InternalMyDsl.g:185:7: lv_state_9_0= ruleinitalState
            	    {

            	    							newCompositeNode(grammarAccess.getFSMAccess().getStateInitalStateParserRuleCall_3_2_1_0());
            	    						
            	    pushFollow(FOLLOW_5);
            	    lv_state_9_0=ruleinitalState();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getFSMRule());
            	    							}
            	    							add(
            	    								current,
            	    								"state",
            	    								lv_state_9_0,
            	    								"com.m1ice.fsm.dsl.MyDsl.initalState");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalMyDsl.g:204:4: (otherlv_10= 'finalState' ( (lv_state_11_0= rulefinalState ) ) )
            	    {
            	    // InternalMyDsl.g:204:4: (otherlv_10= 'finalState' ( (lv_state_11_0= rulefinalState ) ) )
            	    // InternalMyDsl.g:205:5: otherlv_10= 'finalState' ( (lv_state_11_0= rulefinalState ) )
            	    {
            	    otherlv_10=(Token)match(input,16,FOLLOW_3); 

            	    					newLeafNode(otherlv_10, grammarAccess.getFSMAccess().getFinalStateKeyword_3_3_0());
            	    				
            	    // InternalMyDsl.g:209:5: ( (lv_state_11_0= rulefinalState ) )
            	    // InternalMyDsl.g:210:6: (lv_state_11_0= rulefinalState )
            	    {
            	    // InternalMyDsl.g:210:6: (lv_state_11_0= rulefinalState )
            	    // InternalMyDsl.g:211:7: lv_state_11_0= rulefinalState
            	    {

            	    							newCompositeNode(grammarAccess.getFSMAccess().getStateFinalStateParserRuleCall_3_3_1_0());
            	    						
            	    pushFollow(FOLLOW_5);
            	    lv_state_11_0=rulefinalState();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getFSMRule());
            	    							}
            	    							add(
            	    								current,
            	    								"state",
            	    								lv_state_11_0,
            	    								"com.m1ice.fsm.dsl.MyDsl.finalState");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_12=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_12, grammarAccess.getFSMAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFSM"


    // $ANTLR start "entryRuleEString"
    // InternalMyDsl.g:238:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalMyDsl.g:238:47: (iv_ruleEString= ruleEString EOF )
            // InternalMyDsl.g:239:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalMyDsl.g:245:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:251:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalMyDsl.g:252:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalMyDsl.g:252:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_STRING) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_ID) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:253:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:261:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleState"
    // InternalMyDsl.g:272:1: entryRuleState returns [EObject current=null] : iv_ruleState= ruleState EOF ;
    public final EObject entryRuleState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleState = null;


        try {
            // InternalMyDsl.g:272:46: (iv_ruleState= ruleState EOF )
            // InternalMyDsl.g:273:2: iv_ruleState= ruleState EOF
            {
             newCompositeNode(grammarAccess.getStateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleState=ruleState();

            state._fsp--;

             current =iv_ruleState; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleState"


    // $ANTLR start "ruleState"
    // InternalMyDsl.g:279:1: ruleState returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) ) ;
    public final EObject ruleState() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:285:2: ( ( () ( (lv_name_1_0= ruleEString ) ) ) )
            // InternalMyDsl.g:286:2: ( () ( (lv_name_1_0= ruleEString ) ) )
            {
            // InternalMyDsl.g:286:2: ( () ( (lv_name_1_0= ruleEString ) ) )
            // InternalMyDsl.g:287:3: () ( (lv_name_1_0= ruleEString ) )
            {
            // InternalMyDsl.g:287:3: ()
            // InternalMyDsl.g:288:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getStateAccess().getStateAction_0(),
            					current);
            			

            }

            // InternalMyDsl.g:294:3: ( (lv_name_1_0= ruleEString ) )
            // InternalMyDsl.g:295:4: (lv_name_1_0= ruleEString )
            {
            // InternalMyDsl.g:295:4: (lv_name_1_0= ruleEString )
            // InternalMyDsl.g:296:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getStateAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStateRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"com.m1ice.fsm.dsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleState"


    // $ANTLR start "entryRuleTransition"
    // InternalMyDsl.g:317:1: entryRuleTransition returns [EObject current=null] : iv_ruleTransition= ruleTransition EOF ;
    public final EObject entryRuleTransition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransition = null;


        try {
            // InternalMyDsl.g:317:51: (iv_ruleTransition= ruleTransition EOF )
            // InternalMyDsl.g:318:2: iv_ruleTransition= ruleTransition EOF
            {
             newCompositeNode(grammarAccess.getTransitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTransition=ruleTransition();

            state._fsp--;

             current =iv_ruleTransition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTransition"


    // $ANTLR start "ruleTransition"
    // InternalMyDsl.g:324:1: ruleTransition returns [EObject current=null] : ( () otherlv_1= 'transition' ( ( ( ruleEString ) ) otherlv_3= '->' ( ( ruleEString ) ) )* ) ;
    public final EObject ruleTransition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalMyDsl.g:330:2: ( ( () otherlv_1= 'transition' ( ( ( ruleEString ) ) otherlv_3= '->' ( ( ruleEString ) ) )* ) )
            // InternalMyDsl.g:331:2: ( () otherlv_1= 'transition' ( ( ( ruleEString ) ) otherlv_3= '->' ( ( ruleEString ) ) )* )
            {
            // InternalMyDsl.g:331:2: ( () otherlv_1= 'transition' ( ( ( ruleEString ) ) otherlv_3= '->' ( ( ruleEString ) ) )* )
            // InternalMyDsl.g:332:3: () otherlv_1= 'transition' ( ( ( ruleEString ) ) otherlv_3= '->' ( ( ruleEString ) ) )*
            {
            // InternalMyDsl.g:332:3: ()
            // InternalMyDsl.g:333:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTransitionAccess().getTransitionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,18,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getTransitionAccess().getTransitionKeyword_1());
            		
            // InternalMyDsl.g:343:3: ( ( ( ruleEString ) ) otherlv_3= '->' ( ( ruleEString ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=RULE_STRING && LA4_0<=RULE_ID)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalMyDsl.g:344:4: ( ( ruleEString ) ) otherlv_3= '->' ( ( ruleEString ) )
            	    {
            	    // InternalMyDsl.g:344:4: ( ( ruleEString ) )
            	    // InternalMyDsl.g:345:5: ( ruleEString )
            	    {
            	    // InternalMyDsl.g:345:5: ( ruleEString )
            	    // InternalMyDsl.g:346:6: ruleEString
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getTransitionRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getTransitionAccess().getStateStartStateCrossReference_2_0_0());
            	    					
            	    pushFollow(FOLLOW_8);
            	    ruleEString();

            	    state._fsp--;


            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    otherlv_3=(Token)match(input,19,FOLLOW_3); 

            	    				newLeafNode(otherlv_3, grammarAccess.getTransitionAccess().getHyphenMinusGreaterThanSignKeyword_2_1());
            	    			
            	    // InternalMyDsl.g:364:4: ( ( ruleEString ) )
            	    // InternalMyDsl.g:365:5: ( ruleEString )
            	    {
            	    // InternalMyDsl.g:365:5: ( ruleEString )
            	    // InternalMyDsl.g:366:6: ruleEString
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getTransitionRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getTransitionAccess().getStateEndStateCrossReference_2_2_0());
            	    					
            	    pushFollow(FOLLOW_7);
            	    ruleEString();

            	    state._fsp--;


            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTransition"


    // $ANTLR start "entryRuleinitalState"
    // InternalMyDsl.g:385:1: entryRuleinitalState returns [EObject current=null] : iv_ruleinitalState= ruleinitalState EOF ;
    public final EObject entryRuleinitalState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleinitalState = null;


        try {
            // InternalMyDsl.g:385:52: (iv_ruleinitalState= ruleinitalState EOF )
            // InternalMyDsl.g:386:2: iv_ruleinitalState= ruleinitalState EOF
            {
             newCompositeNode(grammarAccess.getInitalStateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleinitalState=ruleinitalState();

            state._fsp--;

             current =iv_ruleinitalState; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleinitalState"


    // $ANTLR start "ruleinitalState"
    // InternalMyDsl.g:392:1: ruleinitalState returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) ) ;
    public final EObject ruleinitalState() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:398:2: ( ( () ( (lv_name_1_0= ruleEString ) ) ) )
            // InternalMyDsl.g:399:2: ( () ( (lv_name_1_0= ruleEString ) ) )
            {
            // InternalMyDsl.g:399:2: ( () ( (lv_name_1_0= ruleEString ) ) )
            // InternalMyDsl.g:400:3: () ( (lv_name_1_0= ruleEString ) )
            {
            // InternalMyDsl.g:400:3: ()
            // InternalMyDsl.g:401:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getInitalStateAccess().getInitialStateAction_0(),
            					current);
            			

            }

            // InternalMyDsl.g:407:3: ( (lv_name_1_0= ruleEString ) )
            // InternalMyDsl.g:408:4: (lv_name_1_0= ruleEString )
            {
            // InternalMyDsl.g:408:4: (lv_name_1_0= ruleEString )
            // InternalMyDsl.g:409:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getInitalStateAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInitalStateRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"com.m1ice.fsm.dsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleinitalState"


    // $ANTLR start "entryRulefinalState"
    // InternalMyDsl.g:430:1: entryRulefinalState returns [EObject current=null] : iv_rulefinalState= rulefinalState EOF ;
    public final EObject entryRulefinalState() throws RecognitionException {
        EObject current = null;

        EObject iv_rulefinalState = null;


        try {
            // InternalMyDsl.g:430:51: (iv_rulefinalState= rulefinalState EOF )
            // InternalMyDsl.g:431:2: iv_rulefinalState= rulefinalState EOF
            {
             newCompositeNode(grammarAccess.getFinalStateRule()); 
            pushFollow(FOLLOW_1);
            iv_rulefinalState=rulefinalState();

            state._fsp--;

             current =iv_rulefinalState; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulefinalState"


    // $ANTLR start "rulefinalState"
    // InternalMyDsl.g:437:1: rulefinalState returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) ) ;
    public final EObject rulefinalState() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:443:2: ( ( () ( (lv_name_1_0= ruleEString ) ) ) )
            // InternalMyDsl.g:444:2: ( () ( (lv_name_1_0= ruleEString ) ) )
            {
            // InternalMyDsl.g:444:2: ( () ( (lv_name_1_0= ruleEString ) ) )
            // InternalMyDsl.g:445:3: () ( (lv_name_1_0= ruleEString ) )
            {
            // InternalMyDsl.g:445:3: ()
            // InternalMyDsl.g:446:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFinalStateAccess().getFinalStateAction_0(),
            					current);
            			

            }

            // InternalMyDsl.g:452:3: ( (lv_name_1_0= ruleEString ) )
            // InternalMyDsl.g:453:4: (lv_name_1_0= ruleEString )
            {
            // InternalMyDsl.g:453:4: (lv_name_1_0= ruleEString )
            // InternalMyDsl.g:454:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getFinalStateAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFinalStateRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"com.m1ice.fsm.dsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulefinalState"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000000007A000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000007E000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000080000L});

}