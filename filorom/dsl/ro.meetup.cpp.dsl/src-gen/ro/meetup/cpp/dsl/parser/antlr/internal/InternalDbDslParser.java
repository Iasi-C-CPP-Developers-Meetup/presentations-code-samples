package ro.meetup.cpp.dsl.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import ro.meetup.cpp.dsl.services.DbDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDbDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_DATE", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'persons'", "':'", "'meetings'", "'{'", "'}'", "'presentations'", "'participants'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_WS=10;
    public static final int RULE_STRING=6;
    public static final int RULE_ANY_OTHER=11;
    public static final int RULE_SL_COMMENT=9;
    public static final int RULE_DATE=5;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int RULE_INT=7;
    public static final int T__18=18;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalDbDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDbDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDbDslParser.tokenNames; }
    public String getGrammarFileName() { return "../ro.meetup.cpp.dsl/src-gen/ro/meetup/cpp/dsl/parser/antlr/internal/InternalDbDsl.g"; }



     	private DbDslGrammarAccess grammarAccess;
     	
        public InternalDbDslParser(TokenStream input, DbDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Model";	
       	}
       	
       	@Override
       	protected DbDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleModel"
    // ../ro.meetup.cpp.dsl/src-gen/ro/meetup/cpp/dsl/parser/antlr/internal/InternalDbDsl.g:67:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../ro.meetup.cpp.dsl/src-gen/ro/meetup/cpp/dsl/parser/antlr/internal/InternalDbDsl.g:68:2: (iv_ruleModel= ruleModel EOF )
            // ../ro.meetup.cpp.dsl/src-gen/ro/meetup/cpp/dsl/parser/antlr/internal/InternalDbDsl.g:69:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel75);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel85); 

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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../ro.meetup.cpp.dsl/src-gen/ro/meetup/cpp/dsl/parser/antlr/internal/InternalDbDsl.g:76:1: ruleModel returns [EObject current=null] : (otherlv_0= 'persons' otherlv_1= ':' ( (lv_persons_2_0= rulePerson ) )* otherlv_3= 'meetings' otherlv_4= ':' ( (lv_meetings_5_0= ruleMeeting ) )* ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_persons_2_0 = null;

        EObject lv_meetings_5_0 = null;


         enterRule(); 
            
        try {
            // ../ro.meetup.cpp.dsl/src-gen/ro/meetup/cpp/dsl/parser/antlr/internal/InternalDbDsl.g:79:28: ( (otherlv_0= 'persons' otherlv_1= ':' ( (lv_persons_2_0= rulePerson ) )* otherlv_3= 'meetings' otherlv_4= ':' ( (lv_meetings_5_0= ruleMeeting ) )* ) )
            // ../ro.meetup.cpp.dsl/src-gen/ro/meetup/cpp/dsl/parser/antlr/internal/InternalDbDsl.g:80:1: (otherlv_0= 'persons' otherlv_1= ':' ( (lv_persons_2_0= rulePerson ) )* otherlv_3= 'meetings' otherlv_4= ':' ( (lv_meetings_5_0= ruleMeeting ) )* )
            {
            // ../ro.meetup.cpp.dsl/src-gen/ro/meetup/cpp/dsl/parser/antlr/internal/InternalDbDsl.g:80:1: (otherlv_0= 'persons' otherlv_1= ':' ( (lv_persons_2_0= rulePerson ) )* otherlv_3= 'meetings' otherlv_4= ':' ( (lv_meetings_5_0= ruleMeeting ) )* )
            // ../ro.meetup.cpp.dsl/src-gen/ro/meetup/cpp/dsl/parser/antlr/internal/InternalDbDsl.g:80:3: otherlv_0= 'persons' otherlv_1= ':' ( (lv_persons_2_0= rulePerson ) )* otherlv_3= 'meetings' otherlv_4= ':' ( (lv_meetings_5_0= ruleMeeting ) )*
            {
            otherlv_0=(Token)match(input,12,FOLLOW_12_in_ruleModel122); 

                	newLeafNode(otherlv_0, grammarAccess.getModelAccess().getPersonsKeyword_0());
                
            otherlv_1=(Token)match(input,13,FOLLOW_13_in_ruleModel134); 

                	newLeafNode(otherlv_1, grammarAccess.getModelAccess().getColonKeyword_1());
                
            // ../ro.meetup.cpp.dsl/src-gen/ro/meetup/cpp/dsl/parser/antlr/internal/InternalDbDsl.g:88:1: ( (lv_persons_2_0= rulePerson ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../ro.meetup.cpp.dsl/src-gen/ro/meetup/cpp/dsl/parser/antlr/internal/InternalDbDsl.g:89:1: (lv_persons_2_0= rulePerson )
            	    {
            	    // ../ro.meetup.cpp.dsl/src-gen/ro/meetup/cpp/dsl/parser/antlr/internal/InternalDbDsl.g:89:1: (lv_persons_2_0= rulePerson )
            	    // ../ro.meetup.cpp.dsl/src-gen/ro/meetup/cpp/dsl/parser/antlr/internal/InternalDbDsl.g:90:3: lv_persons_2_0= rulePerson
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getPersonsPersonParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePerson_in_ruleModel155);
            	    lv_persons_2_0=rulePerson();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"persons",
            	            		lv_persons_2_0, 
            	            		"Person");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_3=(Token)match(input,14,FOLLOW_14_in_ruleModel168); 

                	newLeafNode(otherlv_3, grammarAccess.getModelAccess().getMeetingsKeyword_3());
                
            otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleModel180); 

                	newLeafNode(otherlv_4, grammarAccess.getModelAccess().getColonKeyword_4());
                
            // ../ro.meetup.cpp.dsl/src-gen/ro/meetup/cpp/dsl/parser/antlr/internal/InternalDbDsl.g:114:1: ( (lv_meetings_5_0= ruleMeeting ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==15) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../ro.meetup.cpp.dsl/src-gen/ro/meetup/cpp/dsl/parser/antlr/internal/InternalDbDsl.g:115:1: (lv_meetings_5_0= ruleMeeting )
            	    {
            	    // ../ro.meetup.cpp.dsl/src-gen/ro/meetup/cpp/dsl/parser/antlr/internal/InternalDbDsl.g:115:1: (lv_meetings_5_0= ruleMeeting )
            	    // ../ro.meetup.cpp.dsl/src-gen/ro/meetup/cpp/dsl/parser/antlr/internal/InternalDbDsl.g:116:3: lv_meetings_5_0= ruleMeeting
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getMeetingsMeetingParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleMeeting_in_ruleModel201);
            	    lv_meetings_5_0=ruleMeeting();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"meetings",
            	            		lv_meetings_5_0, 
            	            		"Meeting");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRulePerson"
    // ../ro.meetup.cpp.dsl/src-gen/ro/meetup/cpp/dsl/parser/antlr/internal/InternalDbDsl.g:142:1: entryRulePerson returns [EObject current=null] : iv_rulePerson= rulePerson EOF ;
    public final EObject entryRulePerson() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePerson = null;


        try {
            // ../ro.meetup.cpp.dsl/src-gen/ro/meetup/cpp/dsl/parser/antlr/internal/InternalDbDsl.g:143:2: (iv_rulePerson= rulePerson EOF )
            // ../ro.meetup.cpp.dsl/src-gen/ro/meetup/cpp/dsl/parser/antlr/internal/InternalDbDsl.g:144:2: iv_rulePerson= rulePerson EOF
            {
             newCompositeNode(grammarAccess.getPersonRule()); 
            pushFollow(FOLLOW_rulePerson_in_entryRulePerson240);
            iv_rulePerson=rulePerson();

            state._fsp--;

             current =iv_rulePerson; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePerson250); 

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
    // $ANTLR end "entryRulePerson"


    // $ANTLR start "rulePerson"
    // ../ro.meetup.cpp.dsl/src-gen/ro/meetup/cpp/dsl/parser/antlr/internal/InternalDbDsl.g:151:1: rulePerson returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_firstName_2_0= RULE_ID ) ) ( (lv_lastName_3_0= RULE_ID ) ) ( (lv_birthDate_4_0= RULE_DATE ) ) ( (lv_address_5_0= RULE_STRING ) ) otherlv_6= '}' ) ;
    public final EObject rulePerson() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_firstName_2_0=null;
        Token lv_lastName_3_0=null;
        Token lv_birthDate_4_0=null;
        Token lv_address_5_0=null;
        Token otherlv_6=null;

         enterRule(); 
            
        try {
            // ../ro.meetup.cpp.dsl/src-gen/ro/meetup/cpp/dsl/parser/antlr/internal/InternalDbDsl.g:154:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_firstName_2_0= RULE_ID ) ) ( (lv_lastName_3_0= RULE_ID ) ) ( (lv_birthDate_4_0= RULE_DATE ) ) ( (lv_address_5_0= RULE_STRING ) ) otherlv_6= '}' ) )
            // ../ro.meetup.cpp.dsl/src-gen/ro/meetup/cpp/dsl/parser/antlr/internal/InternalDbDsl.g:155:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_firstName_2_0= RULE_ID ) ) ( (lv_lastName_3_0= RULE_ID ) ) ( (lv_birthDate_4_0= RULE_DATE ) ) ( (lv_address_5_0= RULE_STRING ) ) otherlv_6= '}' )
            {
            // ../ro.meetup.cpp.dsl/src-gen/ro/meetup/cpp/dsl/parser/antlr/internal/InternalDbDsl.g:155:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_firstName_2_0= RULE_ID ) ) ( (lv_lastName_3_0= RULE_ID ) ) ( (lv_birthDate_4_0= RULE_DATE ) ) ( (lv_address_5_0= RULE_STRING ) ) otherlv_6= '}' )
            // ../ro.meetup.cpp.dsl/src-gen/ro/meetup/cpp/dsl/parser/antlr/internal/InternalDbDsl.g:155:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_firstName_2_0= RULE_ID ) ) ( (lv_lastName_3_0= RULE_ID ) ) ( (lv_birthDate_4_0= RULE_DATE ) ) ( (lv_address_5_0= RULE_STRING ) ) otherlv_6= '}'
            {
            // ../ro.meetup.cpp.dsl/src-gen/ro/meetup/cpp/dsl/parser/antlr/internal/InternalDbDsl.g:155:2: ( (lv_name_0_0= RULE_ID ) )
            // ../ro.meetup.cpp.dsl/src-gen/ro/meetup/cpp/dsl/parser/antlr/internal/InternalDbDsl.g:156:1: (lv_name_0_0= RULE_ID )
            {
            // ../ro.meetup.cpp.dsl/src-gen/ro/meetup/cpp/dsl/parser/antlr/internal/InternalDbDsl.g:156:1: (lv_name_0_0= RULE_ID )
            // ../ro.meetup.cpp.dsl/src-gen/ro/meetup/cpp/dsl/parser/antlr/internal/InternalDbDsl.g:157:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePerson292); 

            			newLeafNode(lv_name_0_0, grammarAccess.getPersonAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPersonRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }

            otherlv_1=(Token)match(input,15,FOLLOW_15_in_rulePerson309); 

                	newLeafNode(otherlv_1, grammarAccess.getPersonAccess().getLeftCurlyBracketKeyword_1());
                
            // ../ro.meetup.cpp.dsl/src-gen/ro/meetup/cpp/dsl/parser/antlr/internal/InternalDbDsl.g:177:1: ( (lv_firstName_2_0= RULE_ID ) )
            // ../ro.meetup.cpp.dsl/src-gen/ro/meetup/cpp/dsl/parser/antlr/internal/InternalDbDsl.g:178:1: (lv_firstName_2_0= RULE_ID )
            {
            // ../ro.meetup.cpp.dsl/src-gen/ro/meetup/cpp/dsl/parser/antlr/internal/InternalDbDsl.g:178:1: (lv_firstName_2_0= RULE_ID )
            // ../ro.meetup.cpp.dsl/src-gen/ro/meetup/cpp/dsl/parser/antlr/internal/InternalDbDsl.g:179:3: lv_firstName_2_0= RULE_ID
            {
            lv_firstName_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePerson326); 

            			newLeafNode(lv_firstName_2_0, grammarAccess.getPersonAccess().getFirstNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPersonRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"firstName",
                    		lv_firstName_2_0, 
                    		"ID");
            	    

            }


            }

            // ../ro.meetup.cpp.dsl/src-gen/ro/meetup/cpp/dsl/parser/antlr/internal/InternalDbDsl.g:195:2: ( (lv_lastName_3_0= RULE_ID ) )
            // ../ro.meetup.cpp.dsl/src-gen/ro/meetup/cpp/dsl/parser/antlr/internal/InternalDbDsl.g:196:1: (lv_lastName_3_0= RULE_ID )
            {
            // ../ro.meetup.cpp.dsl/src-gen/ro/meetup/cpp/dsl/parser/antlr/internal/InternalDbDsl.g:196:1: (lv_lastName_3_0= RULE_ID )
            // ../ro.meetup.cpp.dsl/src-gen/ro/meetup/cpp/dsl/parser/antlr/internal/InternalDbDsl.g:197:3: lv_lastName_3_0= RULE_ID
            {
            lv_lastName_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePerson348); 

            			newLeafNode(lv_lastName_3_0, grammarAccess.getPersonAccess().getLastNameIDTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPersonRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"lastName",
                    		lv_lastName_3_0, 
                    		"ID");
            	    

            }


            }

            // ../ro.meetup.cpp.dsl/src-gen/ro/meetup/cpp/dsl/parser/antlr/internal/InternalDbDsl.g:213:2: ( (lv_birthDate_4_0= RULE_DATE ) )
            // ../ro.meetup.cpp.dsl/src-gen/ro/meetup/cpp/dsl/parser/antlr/internal/InternalDbDsl.g:214:1: (lv_birthDate_4_0= RULE_DATE )
            {
            // ../ro.meetup.cpp.dsl/src-gen/ro/meetup/cpp/dsl/parser/antlr/internal/InternalDbDsl.g:214:1: (lv_birthDate_4_0= RULE_DATE )
            // ../ro.meetup.cpp.dsl/src-gen/ro/meetup/cpp/dsl/parser/antlr/internal/InternalDbDsl.g:215:3: lv_birthDate_4_0= RULE_DATE
            {
            lv_birthDate_4_0=(Token)match(input,RULE_DATE,FOLLOW_RULE_DATE_in_rulePerson370); 

            			newLeafNode(lv_birthDate_4_0, grammarAccess.getPersonAccess().getBirthDateDATETerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPersonRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"birthDate",
                    		lv_birthDate_4_0, 
                    		"DATE");
            	    

            }


            }

            // ../ro.meetup.cpp.dsl/src-gen/ro/meetup/cpp/dsl/parser/antlr/internal/InternalDbDsl.g:231:2: ( (lv_address_5_0= RULE_STRING ) )
            // ../ro.meetup.cpp.dsl/src-gen/ro/meetup/cpp/dsl/parser/antlr/internal/InternalDbDsl.g:232:1: (lv_address_5_0= RULE_STRING )
            {
            // ../ro.meetup.cpp.dsl/src-gen/ro/meetup/cpp/dsl/parser/antlr/internal/InternalDbDsl.g:232:1: (lv_address_5_0= RULE_STRING )
            // ../ro.meetup.cpp.dsl/src-gen/ro/meetup/cpp/dsl/parser/antlr/internal/InternalDbDsl.g:233:3: lv_address_5_0= RULE_STRING
            {
            lv_address_5_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulePerson392); 

            			newLeafNode(lv_address_5_0, grammarAccess.getPersonAccess().getAddressSTRINGTerminalRuleCall_5_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPersonRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"address",
                    		lv_address_5_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_6=(Token)match(input,16,FOLLOW_16_in_rulePerson409); 

                	newLeafNode(otherlv_6, grammarAccess.getPersonAccess().getRightCurlyBracketKeyword_6());
                

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
    // $ANTLR end "rulePerson"


    // $ANTLR start "entryRuleMeeting"
    // ../ro.meetup.cpp.dsl/src-gen/ro/meetup/cpp/dsl/parser/antlr/internal/InternalDbDsl.g:265:1: entryRuleMeeting returns [EObject current=null] : iv_ruleMeeting= ruleMeeting EOF ;
    public final EObject entryRuleMeeting() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMeeting = null;


        try {
            // ../ro.meetup.cpp.dsl/src-gen/ro/meetup/cpp/dsl/parser/antlr/internal/InternalDbDsl.g:266:2: (iv_ruleMeeting= ruleMeeting EOF )
            // ../ro.meetup.cpp.dsl/src-gen/ro/meetup/cpp/dsl/parser/antlr/internal/InternalDbDsl.g:267:2: iv_ruleMeeting= ruleMeeting EOF
            {
             newCompositeNode(grammarAccess.getMeetingRule()); 
            pushFollow(FOLLOW_ruleMeeting_in_entryRuleMeeting449);
            iv_ruleMeeting=ruleMeeting();

            state._fsp--;

             current =iv_ruleMeeting; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMeeting459); 

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
    // $ANTLR end "entryRuleMeeting"


    // $ANTLR start "ruleMeeting"
    // ../ro.meetup.cpp.dsl/src-gen/ro/meetup/cpp/dsl/parser/antlr/internal/InternalDbDsl.g:274:1: ruleMeeting returns [EObject current=null] : (otherlv_0= '{' ( (lv_date_1_0= RULE_DATE ) ) otherlv_2= 'presentations' otherlv_3= ':' ( (lv_presentations_4_0= rulePresentation ) )* otherlv_5= 'participants' otherlv_6= ':' ( (otherlv_7= RULE_ID ) )* otherlv_8= '}' ) ;
    public final EObject ruleMeeting() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_date_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        EObject lv_presentations_4_0 = null;


         enterRule(); 
            
        try {
            // ../ro.meetup.cpp.dsl/src-gen/ro/meetup/cpp/dsl/parser/antlr/internal/InternalDbDsl.g:277:28: ( (otherlv_0= '{' ( (lv_date_1_0= RULE_DATE ) ) otherlv_2= 'presentations' otherlv_3= ':' ( (lv_presentations_4_0= rulePresentation ) )* otherlv_5= 'participants' otherlv_6= ':' ( (otherlv_7= RULE_ID ) )* otherlv_8= '}' ) )
            // ../ro.meetup.cpp.dsl/src-gen/ro/meetup/cpp/dsl/parser/antlr/internal/InternalDbDsl.g:278:1: (otherlv_0= '{' ( (lv_date_1_0= RULE_DATE ) ) otherlv_2= 'presentations' otherlv_3= ':' ( (lv_presentations_4_0= rulePresentation ) )* otherlv_5= 'participants' otherlv_6= ':' ( (otherlv_7= RULE_ID ) )* otherlv_8= '}' )
            {
            // ../ro.meetup.cpp.dsl/src-gen/ro/meetup/cpp/dsl/parser/antlr/internal/InternalDbDsl.g:278:1: (otherlv_0= '{' ( (lv_date_1_0= RULE_DATE ) ) otherlv_2= 'presentations' otherlv_3= ':' ( (lv_presentations_4_0= rulePresentation ) )* otherlv_5= 'participants' otherlv_6= ':' ( (otherlv_7= RULE_ID ) )* otherlv_8= '}' )
            // ../ro.meetup.cpp.dsl/src-gen/ro/meetup/cpp/dsl/parser/antlr/internal/InternalDbDsl.g:278:3: otherlv_0= '{' ( (lv_date_1_0= RULE_DATE ) ) otherlv_2= 'presentations' otherlv_3= ':' ( (lv_presentations_4_0= rulePresentation ) )* otherlv_5= 'participants' otherlv_6= ':' ( (otherlv_7= RULE_ID ) )* otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleMeeting496); 

                	newLeafNode(otherlv_0, grammarAccess.getMeetingAccess().getLeftCurlyBracketKeyword_0());
                
            // ../ro.meetup.cpp.dsl/src-gen/ro/meetup/cpp/dsl/parser/antlr/internal/InternalDbDsl.g:282:1: ( (lv_date_1_0= RULE_DATE ) )
            // ../ro.meetup.cpp.dsl/src-gen/ro/meetup/cpp/dsl/parser/antlr/internal/InternalDbDsl.g:283:1: (lv_date_1_0= RULE_DATE )
            {
            // ../ro.meetup.cpp.dsl/src-gen/ro/meetup/cpp/dsl/parser/antlr/internal/InternalDbDsl.g:283:1: (lv_date_1_0= RULE_DATE )
            // ../ro.meetup.cpp.dsl/src-gen/ro/meetup/cpp/dsl/parser/antlr/internal/InternalDbDsl.g:284:3: lv_date_1_0= RULE_DATE
            {
            lv_date_1_0=(Token)match(input,RULE_DATE,FOLLOW_RULE_DATE_in_ruleMeeting513); 

            			newLeafNode(lv_date_1_0, grammarAccess.getMeetingAccess().getDateDATETerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMeetingRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"date",
                    		lv_date_1_0, 
                    		"DATE");
            	    

            }


            }

            otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleMeeting530); 

                	newLeafNode(otherlv_2, grammarAccess.getMeetingAccess().getPresentationsKeyword_2());
                
            otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleMeeting542); 

                	newLeafNode(otherlv_3, grammarAccess.getMeetingAccess().getColonKeyword_3());
                
            // ../ro.meetup.cpp.dsl/src-gen/ro/meetup/cpp/dsl/parser/antlr/internal/InternalDbDsl.g:308:1: ( (lv_presentations_4_0= rulePresentation ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==15) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../ro.meetup.cpp.dsl/src-gen/ro/meetup/cpp/dsl/parser/antlr/internal/InternalDbDsl.g:309:1: (lv_presentations_4_0= rulePresentation )
            	    {
            	    // ../ro.meetup.cpp.dsl/src-gen/ro/meetup/cpp/dsl/parser/antlr/internal/InternalDbDsl.g:309:1: (lv_presentations_4_0= rulePresentation )
            	    // ../ro.meetup.cpp.dsl/src-gen/ro/meetup/cpp/dsl/parser/antlr/internal/InternalDbDsl.g:310:3: lv_presentations_4_0= rulePresentation
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMeetingAccess().getPresentationsPresentationParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePresentation_in_ruleMeeting563);
            	    lv_presentations_4_0=rulePresentation();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getMeetingRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"presentations",
            	            		lv_presentations_4_0, 
            	            		"Presentation");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_5=(Token)match(input,18,FOLLOW_18_in_ruleMeeting576); 

                	newLeafNode(otherlv_5, grammarAccess.getMeetingAccess().getParticipantsKeyword_5());
                
            otherlv_6=(Token)match(input,13,FOLLOW_13_in_ruleMeeting588); 

                	newLeafNode(otherlv_6, grammarAccess.getMeetingAccess().getColonKeyword_6());
                
            // ../ro.meetup.cpp.dsl/src-gen/ro/meetup/cpp/dsl/parser/antlr/internal/InternalDbDsl.g:334:1: ( (otherlv_7= RULE_ID ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_ID) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../ro.meetup.cpp.dsl/src-gen/ro/meetup/cpp/dsl/parser/antlr/internal/InternalDbDsl.g:335:1: (otherlv_7= RULE_ID )
            	    {
            	    // ../ro.meetup.cpp.dsl/src-gen/ro/meetup/cpp/dsl/parser/antlr/internal/InternalDbDsl.g:335:1: (otherlv_7= RULE_ID )
            	    // ../ro.meetup.cpp.dsl/src-gen/ro/meetup/cpp/dsl/parser/antlr/internal/InternalDbDsl.g:336:3: otherlv_7= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getMeetingRule());
            	    	        }
            	            
            	    otherlv_7=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMeeting608); 

            	    		newLeafNode(otherlv_7, grammarAccess.getMeetingAccess().getParticipantsPersonCrossReference_7_0()); 
            	    	

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_8=(Token)match(input,16,FOLLOW_16_in_ruleMeeting621); 

                	newLeafNode(otherlv_8, grammarAccess.getMeetingAccess().getRightCurlyBracketKeyword_8());
                

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
    // $ANTLR end "ruleMeeting"


    // $ANTLR start "entryRulePresentation"
    // ../ro.meetup.cpp.dsl/src-gen/ro/meetup/cpp/dsl/parser/antlr/internal/InternalDbDsl.g:359:1: entryRulePresentation returns [EObject current=null] : iv_rulePresentation= rulePresentation EOF ;
    public final EObject entryRulePresentation() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePresentation = null;


        try {
            // ../ro.meetup.cpp.dsl/src-gen/ro/meetup/cpp/dsl/parser/antlr/internal/InternalDbDsl.g:360:2: (iv_rulePresentation= rulePresentation EOF )
            // ../ro.meetup.cpp.dsl/src-gen/ro/meetup/cpp/dsl/parser/antlr/internal/InternalDbDsl.g:361:2: iv_rulePresentation= rulePresentation EOF
            {
             newCompositeNode(grammarAccess.getPresentationRule()); 
            pushFollow(FOLLOW_rulePresentation_in_entryRulePresentation657);
            iv_rulePresentation=rulePresentation();

            state._fsp--;

             current =iv_rulePresentation; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePresentation667); 

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
    // $ANTLR end "entryRulePresentation"


    // $ANTLR start "rulePresentation"
    // ../ro.meetup.cpp.dsl/src-gen/ro/meetup/cpp/dsl/parser/antlr/internal/InternalDbDsl.g:368:1: rulePresentation returns [EObject current=null] : (otherlv_0= '{' ( (lv_title_1_0= RULE_STRING ) ) ( (otherlv_2= RULE_ID ) )* otherlv_3= '}' ) ;
    public final EObject rulePresentation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_title_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../ro.meetup.cpp.dsl/src-gen/ro/meetup/cpp/dsl/parser/antlr/internal/InternalDbDsl.g:371:28: ( (otherlv_0= '{' ( (lv_title_1_0= RULE_STRING ) ) ( (otherlv_2= RULE_ID ) )* otherlv_3= '}' ) )
            // ../ro.meetup.cpp.dsl/src-gen/ro/meetup/cpp/dsl/parser/antlr/internal/InternalDbDsl.g:372:1: (otherlv_0= '{' ( (lv_title_1_0= RULE_STRING ) ) ( (otherlv_2= RULE_ID ) )* otherlv_3= '}' )
            {
            // ../ro.meetup.cpp.dsl/src-gen/ro/meetup/cpp/dsl/parser/antlr/internal/InternalDbDsl.g:372:1: (otherlv_0= '{' ( (lv_title_1_0= RULE_STRING ) ) ( (otherlv_2= RULE_ID ) )* otherlv_3= '}' )
            // ../ro.meetup.cpp.dsl/src-gen/ro/meetup/cpp/dsl/parser/antlr/internal/InternalDbDsl.g:372:3: otherlv_0= '{' ( (lv_title_1_0= RULE_STRING ) ) ( (otherlv_2= RULE_ID ) )* otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_rulePresentation704); 

                	newLeafNode(otherlv_0, grammarAccess.getPresentationAccess().getLeftCurlyBracketKeyword_0());
                
            // ../ro.meetup.cpp.dsl/src-gen/ro/meetup/cpp/dsl/parser/antlr/internal/InternalDbDsl.g:376:1: ( (lv_title_1_0= RULE_STRING ) )
            // ../ro.meetup.cpp.dsl/src-gen/ro/meetup/cpp/dsl/parser/antlr/internal/InternalDbDsl.g:377:1: (lv_title_1_0= RULE_STRING )
            {
            // ../ro.meetup.cpp.dsl/src-gen/ro/meetup/cpp/dsl/parser/antlr/internal/InternalDbDsl.g:377:1: (lv_title_1_0= RULE_STRING )
            // ../ro.meetup.cpp.dsl/src-gen/ro/meetup/cpp/dsl/parser/antlr/internal/InternalDbDsl.g:378:3: lv_title_1_0= RULE_STRING
            {
            lv_title_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulePresentation721); 

            			newLeafNode(lv_title_1_0, grammarAccess.getPresentationAccess().getTitleSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPresentationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"title",
                    		lv_title_1_0, 
                    		"STRING");
            	    

            }


            }

            // ../ro.meetup.cpp.dsl/src-gen/ro/meetup/cpp/dsl/parser/antlr/internal/InternalDbDsl.g:394:2: ( (otherlv_2= RULE_ID ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_ID) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../ro.meetup.cpp.dsl/src-gen/ro/meetup/cpp/dsl/parser/antlr/internal/InternalDbDsl.g:395:1: (otherlv_2= RULE_ID )
            	    {
            	    // ../ro.meetup.cpp.dsl/src-gen/ro/meetup/cpp/dsl/parser/antlr/internal/InternalDbDsl.g:395:1: (otherlv_2= RULE_ID )
            	    // ../ro.meetup.cpp.dsl/src-gen/ro/meetup/cpp/dsl/parser/antlr/internal/InternalDbDsl.g:396:3: otherlv_2= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getPresentationRule());
            	    	        }
            	            
            	    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePresentation746); 

            	    		newLeafNode(otherlv_2, grammarAccess.getPresentationAccess().getPresentersPersonCrossReference_2_0()); 
            	    	

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_3=(Token)match(input,16,FOLLOW_16_in_rulePresentation759); 

                	newLeafNode(otherlv_3, grammarAccess.getPresentationAccess().getRightCurlyBracketKeyword_3());
                

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
    // $ANTLR end "rulePresentation"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleModel122 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleModel134 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_rulePerson_in_ruleModel155 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_14_in_ruleModel168 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleModel180 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_ruleMeeting_in_ruleModel201 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_rulePerson_in_entryRulePerson240 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePerson250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePerson292 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_rulePerson309 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePerson326 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePerson348 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_DATE_in_rulePerson370 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulePerson392 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_rulePerson409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMeeting_in_entryRuleMeeting449 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMeeting459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleMeeting496 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_DATE_in_ruleMeeting513 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleMeeting530 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleMeeting542 = new BitSet(new long[]{0x0000000000048000L});
    public static final BitSet FOLLOW_rulePresentation_in_ruleMeeting563 = new BitSet(new long[]{0x0000000000048000L});
    public static final BitSet FOLLOW_18_in_ruleMeeting576 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleMeeting588 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMeeting608 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_16_in_ruleMeeting621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePresentation_in_entryRulePresentation657 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePresentation667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rulePresentation704 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulePresentation721 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePresentation746 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_16_in_rulePresentation759 = new BitSet(new long[]{0x0000000000000002L});

}