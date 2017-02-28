package ro.meetup.cpp.dsl.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import ro.meetup.cpp.dsl.services.DbDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDbDslParser extends AbstractInternalContentAssistParser {
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
    public String getGrammarFileName() { return "../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g"; }


     
     	private DbDslGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(DbDslGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleModel"
    // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:60:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:61:1: ( ruleModel EOF )
            // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:62:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel61);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:69:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:73:2: ( ( ( rule__Model__Group__0 ) ) )
            // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:74:1: ( ( rule__Model__Group__0 ) )
            {
            // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:74:1: ( ( rule__Model__Group__0 ) )
            // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:75:1: ( rule__Model__Group__0 )
            {
             before(grammarAccess.getModelAccess().getGroup()); 
            // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:76:1: ( rule__Model__Group__0 )
            // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:76:2: rule__Model__Group__0
            {
            pushFollow(FOLLOW_rule__Model__Group__0_in_ruleModel94);
            rule__Model__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRulePerson"
    // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:90:1: entryRulePerson : rulePerson EOF ;
    public final void entryRulePerson() throws RecognitionException {
        try {
            // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:91:1: ( rulePerson EOF )
            // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:92:1: rulePerson EOF
            {
             before(grammarAccess.getPersonRule()); 
            pushFollow(FOLLOW_rulePerson_in_entryRulePerson123);
            rulePerson();

            state._fsp--;

             after(grammarAccess.getPersonRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePerson130); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePerson"


    // $ANTLR start "rulePerson"
    // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:99:1: rulePerson : ( ( rule__Person__Group__0 ) ) ;
    public final void rulePerson() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:103:2: ( ( ( rule__Person__Group__0 ) ) )
            // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:104:1: ( ( rule__Person__Group__0 ) )
            {
            // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:104:1: ( ( rule__Person__Group__0 ) )
            // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:105:1: ( rule__Person__Group__0 )
            {
             before(grammarAccess.getPersonAccess().getGroup()); 
            // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:106:1: ( rule__Person__Group__0 )
            // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:106:2: rule__Person__Group__0
            {
            pushFollow(FOLLOW_rule__Person__Group__0_in_rulePerson156);
            rule__Person__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPersonAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePerson"


    // $ANTLR start "entryRuleMeeting"
    // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:122:1: entryRuleMeeting : ruleMeeting EOF ;
    public final void entryRuleMeeting() throws RecognitionException {
        try {
            // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:123:1: ( ruleMeeting EOF )
            // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:124:1: ruleMeeting EOF
            {
             before(grammarAccess.getMeetingRule()); 
            pushFollow(FOLLOW_ruleMeeting_in_entryRuleMeeting187);
            ruleMeeting();

            state._fsp--;

             after(grammarAccess.getMeetingRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMeeting194); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMeeting"


    // $ANTLR start "ruleMeeting"
    // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:131:1: ruleMeeting : ( ( rule__Meeting__Group__0 ) ) ;
    public final void ruleMeeting() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:135:2: ( ( ( rule__Meeting__Group__0 ) ) )
            // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:136:1: ( ( rule__Meeting__Group__0 ) )
            {
            // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:136:1: ( ( rule__Meeting__Group__0 ) )
            // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:137:1: ( rule__Meeting__Group__0 )
            {
             before(grammarAccess.getMeetingAccess().getGroup()); 
            // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:138:1: ( rule__Meeting__Group__0 )
            // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:138:2: rule__Meeting__Group__0
            {
            pushFollow(FOLLOW_rule__Meeting__Group__0_in_ruleMeeting220);
            rule__Meeting__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMeetingAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMeeting"


    // $ANTLR start "entryRulePresentation"
    // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:150:1: entryRulePresentation : rulePresentation EOF ;
    public final void entryRulePresentation() throws RecognitionException {
        try {
            // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:151:1: ( rulePresentation EOF )
            // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:152:1: rulePresentation EOF
            {
             before(grammarAccess.getPresentationRule()); 
            pushFollow(FOLLOW_rulePresentation_in_entryRulePresentation247);
            rulePresentation();

            state._fsp--;

             after(grammarAccess.getPresentationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePresentation254); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePresentation"


    // $ANTLR start "rulePresentation"
    // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:159:1: rulePresentation : ( ( rule__Presentation__Group__0 ) ) ;
    public final void rulePresentation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:163:2: ( ( ( rule__Presentation__Group__0 ) ) )
            // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:164:1: ( ( rule__Presentation__Group__0 ) )
            {
            // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:164:1: ( ( rule__Presentation__Group__0 ) )
            // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:165:1: ( rule__Presentation__Group__0 )
            {
             before(grammarAccess.getPresentationAccess().getGroup()); 
            // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:166:1: ( rule__Presentation__Group__0 )
            // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:166:2: rule__Presentation__Group__0
            {
            pushFollow(FOLLOW_rule__Presentation__Group__0_in_rulePresentation280);
            rule__Presentation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPresentationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePresentation"


    // $ANTLR start "rule__Model__Group__0"
    // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:181:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:185:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:186:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__0315);
            rule__Model__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__1_in_rule__Model__Group__0318);
            rule__Model__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0"


    // $ANTLR start "rule__Model__Group__0__Impl"
    // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:193:1: rule__Model__Group__0__Impl : ( 'persons' ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:197:1: ( ( 'persons' ) )
            // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:198:1: ( 'persons' )
            {
            // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:198:1: ( 'persons' )
            // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:199:1: 'persons'
            {
             before(grammarAccess.getModelAccess().getPersonsKeyword_0()); 
            match(input,12,FOLLOW_12_in_rule__Model__Group__0__Impl346); 
             after(grammarAccess.getModelAccess().getPersonsKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0__Impl"


    // $ANTLR start "rule__Model__Group__1"
    // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:212:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:216:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:217:2: rule__Model__Group__1__Impl rule__Model__Group__2
            {
            pushFollow(FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__1377);
            rule__Model__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__2_in_rule__Model__Group__1380);
            rule__Model__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1"


    // $ANTLR start "rule__Model__Group__1__Impl"
    // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:224:1: rule__Model__Group__1__Impl : ( ':' ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:228:1: ( ( ':' ) )
            // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:229:1: ( ':' )
            {
            // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:229:1: ( ':' )
            // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:230:1: ':'
            {
             before(grammarAccess.getModelAccess().getColonKeyword_1()); 
            match(input,13,FOLLOW_13_in_rule__Model__Group__1__Impl408); 
             after(grammarAccess.getModelAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1__Impl"


    // $ANTLR start "rule__Model__Group__2"
    // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:243:1: rule__Model__Group__2 : rule__Model__Group__2__Impl rule__Model__Group__3 ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:247:1: ( rule__Model__Group__2__Impl rule__Model__Group__3 )
            // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:248:2: rule__Model__Group__2__Impl rule__Model__Group__3
            {
            pushFollow(FOLLOW_rule__Model__Group__2__Impl_in_rule__Model__Group__2439);
            rule__Model__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__3_in_rule__Model__Group__2442);
            rule__Model__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__2"


    // $ANTLR start "rule__Model__Group__2__Impl"
    // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:255:1: rule__Model__Group__2__Impl : ( ( rule__Model__PersonsAssignment_2 )* ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:259:1: ( ( ( rule__Model__PersonsAssignment_2 )* ) )
            // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:260:1: ( ( rule__Model__PersonsAssignment_2 )* )
            {
            // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:260:1: ( ( rule__Model__PersonsAssignment_2 )* )
            // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:261:1: ( rule__Model__PersonsAssignment_2 )*
            {
             before(grammarAccess.getModelAccess().getPersonsAssignment_2()); 
            // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:262:1: ( rule__Model__PersonsAssignment_2 )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:262:2: rule__Model__PersonsAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__Model__PersonsAssignment_2_in_rule__Model__Group__2__Impl469);
            	    rule__Model__PersonsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getPersonsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__2__Impl"


    // $ANTLR start "rule__Model__Group__3"
    // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:272:1: rule__Model__Group__3 : rule__Model__Group__3__Impl rule__Model__Group__4 ;
    public final void rule__Model__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:276:1: ( rule__Model__Group__3__Impl rule__Model__Group__4 )
            // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:277:2: rule__Model__Group__3__Impl rule__Model__Group__4
            {
            pushFollow(FOLLOW_rule__Model__Group__3__Impl_in_rule__Model__Group__3500);
            rule__Model__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__4_in_rule__Model__Group__3503);
            rule__Model__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__3"


    // $ANTLR start "rule__Model__Group__3__Impl"
    // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:284:1: rule__Model__Group__3__Impl : ( 'meetings' ) ;
    public final void rule__Model__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:288:1: ( ( 'meetings' ) )
            // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:289:1: ( 'meetings' )
            {
            // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:289:1: ( 'meetings' )
            // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:290:1: 'meetings'
            {
             before(grammarAccess.getModelAccess().getMeetingsKeyword_3()); 
            match(input,14,FOLLOW_14_in_rule__Model__Group__3__Impl531); 
             after(grammarAccess.getModelAccess().getMeetingsKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__3__Impl"


    // $ANTLR start "rule__Model__Group__4"
    // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:303:1: rule__Model__Group__4 : rule__Model__Group__4__Impl rule__Model__Group__5 ;
    public final void rule__Model__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:307:1: ( rule__Model__Group__4__Impl rule__Model__Group__5 )
            // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:308:2: rule__Model__Group__4__Impl rule__Model__Group__5
            {
            pushFollow(FOLLOW_rule__Model__Group__4__Impl_in_rule__Model__Group__4562);
            rule__Model__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__5_in_rule__Model__Group__4565);
            rule__Model__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__4"


    // $ANTLR start "rule__Model__Group__4__Impl"
    // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:315:1: rule__Model__Group__4__Impl : ( ':' ) ;
    public final void rule__Model__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:319:1: ( ( ':' ) )
            // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:320:1: ( ':' )
            {
            // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:320:1: ( ':' )
            // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:321:1: ':'
            {
             before(grammarAccess.getModelAccess().getColonKeyword_4()); 
            match(input,13,FOLLOW_13_in_rule__Model__Group__4__Impl593); 
             after(grammarAccess.getModelAccess().getColonKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__4__Impl"


    // $ANTLR start "rule__Model__Group__5"
    // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:334:1: rule__Model__Group__5 : rule__Model__Group__5__Impl ;
    public final void rule__Model__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:338:1: ( rule__Model__Group__5__Impl )
            // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:339:2: rule__Model__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Model__Group__5__Impl_in_rule__Model__Group__5624);
            rule__Model__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__5"


    // $ANTLR start "rule__Model__Group__5__Impl"
    // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:345:1: rule__Model__Group__5__Impl : ( ( rule__Model__MeetingsAssignment_5 )* ) ;
    public final void rule__Model__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:349:1: ( ( ( rule__Model__MeetingsAssignment_5 )* ) )
            // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:350:1: ( ( rule__Model__MeetingsAssignment_5 )* )
            {
            // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:350:1: ( ( rule__Model__MeetingsAssignment_5 )* )
            // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:351:1: ( rule__Model__MeetingsAssignment_5 )*
            {
             before(grammarAccess.getModelAccess().getMeetingsAssignment_5()); 
            // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:352:1: ( rule__Model__MeetingsAssignment_5 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==15) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:352:2: rule__Model__MeetingsAssignment_5
            	    {
            	    pushFollow(FOLLOW_rule__Model__MeetingsAssignment_5_in_rule__Model__Group__5__Impl651);
            	    rule__Model__MeetingsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getMeetingsAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__5__Impl"


    // $ANTLR start "rule__Person__Group__0"
    // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:374:1: rule__Person__Group__0 : rule__Person__Group__0__Impl rule__Person__Group__1 ;
    public final void rule__Person__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:378:1: ( rule__Person__Group__0__Impl rule__Person__Group__1 )
            // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:379:2: rule__Person__Group__0__Impl rule__Person__Group__1
            {
            pushFollow(FOLLOW_rule__Person__Group__0__Impl_in_rule__Person__Group__0694);
            rule__Person__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Person__Group__1_in_rule__Person__Group__0697);
            rule__Person__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__0"


    // $ANTLR start "rule__Person__Group__0__Impl"
    // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:386:1: rule__Person__Group__0__Impl : ( ( rule__Person__NameAssignment_0 ) ) ;
    public final void rule__Person__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:390:1: ( ( ( rule__Person__NameAssignment_0 ) ) )
            // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:391:1: ( ( rule__Person__NameAssignment_0 ) )
            {
            // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:391:1: ( ( rule__Person__NameAssignment_0 ) )
            // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:392:1: ( rule__Person__NameAssignment_0 )
            {
             before(grammarAccess.getPersonAccess().getNameAssignment_0()); 
            // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:393:1: ( rule__Person__NameAssignment_0 )
            // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:393:2: rule__Person__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Person__NameAssignment_0_in_rule__Person__Group__0__Impl724);
            rule__Person__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getPersonAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__0__Impl"


    // $ANTLR start "rule__Person__Group__1"
    // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:403:1: rule__Person__Group__1 : rule__Person__Group__1__Impl rule__Person__Group__2 ;
    public final void rule__Person__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:407:1: ( rule__Person__Group__1__Impl rule__Person__Group__2 )
            // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:408:2: rule__Person__Group__1__Impl rule__Person__Group__2
            {
            pushFollow(FOLLOW_rule__Person__Group__1__Impl_in_rule__Person__Group__1754);
            rule__Person__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Person__Group__2_in_rule__Person__Group__1757);
            rule__Person__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__1"


    // $ANTLR start "rule__Person__Group__1__Impl"
    // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:415:1: rule__Person__Group__1__Impl : ( '{' ) ;
    public final void rule__Person__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:419:1: ( ( '{' ) )
            // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:420:1: ( '{' )
            {
            // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:420:1: ( '{' )
            // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:421:1: '{'
            {
             before(grammarAccess.getPersonAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,15,FOLLOW_15_in_rule__Person__Group__1__Impl785); 
             after(grammarAccess.getPersonAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__1__Impl"


    // $ANTLR start "rule__Person__Group__2"
    // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:434:1: rule__Person__Group__2 : rule__Person__Group__2__Impl rule__Person__Group__3 ;
    public final void rule__Person__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:438:1: ( rule__Person__Group__2__Impl rule__Person__Group__3 )
            // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:439:2: rule__Person__Group__2__Impl rule__Person__Group__3
            {
            pushFollow(FOLLOW_rule__Person__Group__2__Impl_in_rule__Person__Group__2816);
            rule__Person__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Person__Group__3_in_rule__Person__Group__2819);
            rule__Person__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__2"


    // $ANTLR start "rule__Person__Group__2__Impl"
    // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:446:1: rule__Person__Group__2__Impl : ( ( rule__Person__FirstNameAssignment_2 ) ) ;
    public final void rule__Person__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:450:1: ( ( ( rule__Person__FirstNameAssignment_2 ) ) )
            // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:451:1: ( ( rule__Person__FirstNameAssignment_2 ) )
            {
            // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:451:1: ( ( rule__Person__FirstNameAssignment_2 ) )
            // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:452:1: ( rule__Person__FirstNameAssignment_2 )
            {
             before(grammarAccess.getPersonAccess().getFirstNameAssignment_2()); 
            // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:453:1: ( rule__Person__FirstNameAssignment_2 )
            // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:453:2: rule__Person__FirstNameAssignment_2
            {
            pushFollow(FOLLOW_rule__Person__FirstNameAssignment_2_in_rule__Person__Group__2__Impl846);
            rule__Person__FirstNameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPersonAccess().getFirstNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__2__Impl"


    // $ANTLR start "rule__Person__Group__3"
    // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:463:1: rule__Person__Group__3 : rule__Person__Group__3__Impl rule__Person__Group__4 ;
    public final void rule__Person__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:467:1: ( rule__Person__Group__3__Impl rule__Person__Group__4 )
            // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:468:2: rule__Person__Group__3__Impl rule__Person__Group__4
            {
            pushFollow(FOLLOW_rule__Person__Group__3__Impl_in_rule__Person__Group__3876);
            rule__Person__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Person__Group__4_in_rule__Person__Group__3879);
            rule__Person__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__3"


    // $ANTLR start "rule__Person__Group__3__Impl"
    // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:475:1: rule__Person__Group__3__Impl : ( ( rule__Person__LastNameAssignment_3 ) ) ;
    public final void rule__Person__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:479:1: ( ( ( rule__Person__LastNameAssignment_3 ) ) )
            // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:480:1: ( ( rule__Person__LastNameAssignment_3 ) )
            {
            // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:480:1: ( ( rule__Person__LastNameAssignment_3 ) )
            // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:481:1: ( rule__Person__LastNameAssignment_3 )
            {
             before(grammarAccess.getPersonAccess().getLastNameAssignment_3()); 
            // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:482:1: ( rule__Person__LastNameAssignment_3 )
            // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:482:2: rule__Person__LastNameAssignment_3
            {
            pushFollow(FOLLOW_rule__Person__LastNameAssignment_3_in_rule__Person__Group__3__Impl906);
            rule__Person__LastNameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getPersonAccess().getLastNameAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__3__Impl"


    // $ANTLR start "rule__Person__Group__4"
    // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:492:1: rule__Person__Group__4 : rule__Person__Group__4__Impl rule__Person__Group__5 ;
    public final void rule__Person__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:496:1: ( rule__Person__Group__4__Impl rule__Person__Group__5 )
            // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:497:2: rule__Person__Group__4__Impl rule__Person__Group__5
            {
            pushFollow(FOLLOW_rule__Person__Group__4__Impl_in_rule__Person__Group__4936);
            rule__Person__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Person__Group__5_in_rule__Person__Group__4939);
            rule__Person__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__4"


    // $ANTLR start "rule__Person__Group__4__Impl"
    // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:504:1: rule__Person__Group__4__Impl : ( ( rule__Person__BirthDateAssignment_4 ) ) ;
    public final void rule__Person__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:508:1: ( ( ( rule__Person__BirthDateAssignment_4 ) ) )
            // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:509:1: ( ( rule__Person__BirthDateAssignment_4 ) )
            {
            // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:509:1: ( ( rule__Person__BirthDateAssignment_4 ) )
            // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:510:1: ( rule__Person__BirthDateAssignment_4 )
            {
             before(grammarAccess.getPersonAccess().getBirthDateAssignment_4()); 
            // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:511:1: ( rule__Person__BirthDateAssignment_4 )
            // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:511:2: rule__Person__BirthDateAssignment_4
            {
            pushFollow(FOLLOW_rule__Person__BirthDateAssignment_4_in_rule__Person__Group__4__Impl966);
            rule__Person__BirthDateAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getPersonAccess().getBirthDateAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__4__Impl"


    // $ANTLR start "rule__Person__Group__5"
    // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:521:1: rule__Person__Group__5 : rule__Person__Group__5__Impl rule__Person__Group__6 ;
    public final void rule__Person__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:525:1: ( rule__Person__Group__5__Impl rule__Person__Group__6 )
            // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:526:2: rule__Person__Group__5__Impl rule__Person__Group__6
            {
            pushFollow(FOLLOW_rule__Person__Group__5__Impl_in_rule__Person__Group__5996);
            rule__Person__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Person__Group__6_in_rule__Person__Group__5999);
            rule__Person__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__5"


    // $ANTLR start "rule__Person__Group__5__Impl"
    // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:533:1: rule__Person__Group__5__Impl : ( ( rule__Person__AddressAssignment_5 ) ) ;
    public final void rule__Person__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:537:1: ( ( ( rule__Person__AddressAssignment_5 ) ) )
            // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:538:1: ( ( rule__Person__AddressAssignment_5 ) )
            {
            // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:538:1: ( ( rule__Person__AddressAssignment_5 ) )
            // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:539:1: ( rule__Person__AddressAssignment_5 )
            {
             before(grammarAccess.getPersonAccess().getAddressAssignment_5()); 
            // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:540:1: ( rule__Person__AddressAssignment_5 )
            // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:540:2: rule__Person__AddressAssignment_5
            {
            pushFollow(FOLLOW_rule__Person__AddressAssignment_5_in_rule__Person__Group__5__Impl1026);
            rule__Person__AddressAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getPersonAccess().getAddressAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__5__Impl"


    // $ANTLR start "rule__Person__Group__6"
    // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:550:1: rule__Person__Group__6 : rule__Person__Group__6__Impl ;
    public final void rule__Person__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:554:1: ( rule__Person__Group__6__Impl )
            // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:555:2: rule__Person__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__Person__Group__6__Impl_in_rule__Person__Group__61056);
            rule__Person__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__6"


    // $ANTLR start "rule__Person__Group__6__Impl"
    // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:561:1: rule__Person__Group__6__Impl : ( '}' ) ;
    public final void rule__Person__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:565:1: ( ( '}' ) )
            // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:566:1: ( '}' )
            {
            // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:566:1: ( '}' )
            // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:567:1: '}'
            {
             before(grammarAccess.getPersonAccess().getRightCurlyBracketKeyword_6()); 
            match(input,16,FOLLOW_16_in_rule__Person__Group__6__Impl1084); 
             after(grammarAccess.getPersonAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__6__Impl"


    // $ANTLR start "rule__Meeting__Group__0"
    // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:594:1: rule__Meeting__Group__0 : rule__Meeting__Group__0__Impl rule__Meeting__Group__1 ;
    public final void rule__Meeting__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:598:1: ( rule__Meeting__Group__0__Impl rule__Meeting__Group__1 )
            // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:599:2: rule__Meeting__Group__0__Impl rule__Meeting__Group__1
            {
            pushFollow(FOLLOW_rule__Meeting__Group__0__Impl_in_rule__Meeting__Group__01129);
            rule__Meeting__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Meeting__Group__1_in_rule__Meeting__Group__01132);
            rule__Meeting__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Meeting__Group__0"


    // $ANTLR start "rule__Meeting__Group__0__Impl"
    // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:606:1: rule__Meeting__Group__0__Impl : ( '{' ) ;
    public final void rule__Meeting__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:610:1: ( ( '{' ) )
            // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:611:1: ( '{' )
            {
            // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:611:1: ( '{' )
            // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:612:1: '{'
            {
             before(grammarAccess.getMeetingAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,15,FOLLOW_15_in_rule__Meeting__Group__0__Impl1160); 
             after(grammarAccess.getMeetingAccess().getLeftCurlyBracketKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Meeting__Group__0__Impl"


    // $ANTLR start "rule__Meeting__Group__1"
    // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:625:1: rule__Meeting__Group__1 : rule__Meeting__Group__1__Impl rule__Meeting__Group__2 ;
    public final void rule__Meeting__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:629:1: ( rule__Meeting__Group__1__Impl rule__Meeting__Group__2 )
            // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:630:2: rule__Meeting__Group__1__Impl rule__Meeting__Group__2
            {
            pushFollow(FOLLOW_rule__Meeting__Group__1__Impl_in_rule__Meeting__Group__11191);
            rule__Meeting__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Meeting__Group__2_in_rule__Meeting__Group__11194);
            rule__Meeting__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Meeting__Group__1"


    // $ANTLR start "rule__Meeting__Group__1__Impl"
    // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:637:1: rule__Meeting__Group__1__Impl : ( ( rule__Meeting__DateAssignment_1 ) ) ;
    public final void rule__Meeting__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:641:1: ( ( ( rule__Meeting__DateAssignment_1 ) ) )
            // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:642:1: ( ( rule__Meeting__DateAssignment_1 ) )
            {
            // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:642:1: ( ( rule__Meeting__DateAssignment_1 ) )
            // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:643:1: ( rule__Meeting__DateAssignment_1 )
            {
             before(grammarAccess.getMeetingAccess().getDateAssignment_1()); 
            // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:644:1: ( rule__Meeting__DateAssignment_1 )
            // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:644:2: rule__Meeting__DateAssignment_1
            {
            pushFollow(FOLLOW_rule__Meeting__DateAssignment_1_in_rule__Meeting__Group__1__Impl1221);
            rule__Meeting__DateAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMeetingAccess().getDateAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Meeting__Group__1__Impl"


    // $ANTLR start "rule__Meeting__Group__2"
    // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:654:1: rule__Meeting__Group__2 : rule__Meeting__Group__2__Impl rule__Meeting__Group__3 ;
    public final void rule__Meeting__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:658:1: ( rule__Meeting__Group__2__Impl rule__Meeting__Group__3 )
            // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:659:2: rule__Meeting__Group__2__Impl rule__Meeting__Group__3
            {
            pushFollow(FOLLOW_rule__Meeting__Group__2__Impl_in_rule__Meeting__Group__21251);
            rule__Meeting__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Meeting__Group__3_in_rule__Meeting__Group__21254);
            rule__Meeting__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Meeting__Group__2"


    // $ANTLR start "rule__Meeting__Group__2__Impl"
    // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:666:1: rule__Meeting__Group__2__Impl : ( 'presentations' ) ;
    public final void rule__Meeting__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:670:1: ( ( 'presentations' ) )
            // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:671:1: ( 'presentations' )
            {
            // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:671:1: ( 'presentations' )
            // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:672:1: 'presentations'
            {
             before(grammarAccess.getMeetingAccess().getPresentationsKeyword_2()); 
            match(input,17,FOLLOW_17_in_rule__Meeting__Group__2__Impl1282); 
             after(grammarAccess.getMeetingAccess().getPresentationsKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Meeting__Group__2__Impl"


    // $ANTLR start "rule__Meeting__Group__3"
    // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:685:1: rule__Meeting__Group__3 : rule__Meeting__Group__3__Impl rule__Meeting__Group__4 ;
    public final void rule__Meeting__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:689:1: ( rule__Meeting__Group__3__Impl rule__Meeting__Group__4 )
            // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:690:2: rule__Meeting__Group__3__Impl rule__Meeting__Group__4
            {
            pushFollow(FOLLOW_rule__Meeting__Group__3__Impl_in_rule__Meeting__Group__31313);
            rule__Meeting__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Meeting__Group__4_in_rule__Meeting__Group__31316);
            rule__Meeting__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Meeting__Group__3"


    // $ANTLR start "rule__Meeting__Group__3__Impl"
    // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:697:1: rule__Meeting__Group__3__Impl : ( ':' ) ;
    public final void rule__Meeting__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:701:1: ( ( ':' ) )
            // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:702:1: ( ':' )
            {
            // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:702:1: ( ':' )
            // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:703:1: ':'
            {
             before(grammarAccess.getMeetingAccess().getColonKeyword_3()); 
            match(input,13,FOLLOW_13_in_rule__Meeting__Group__3__Impl1344); 
             after(grammarAccess.getMeetingAccess().getColonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Meeting__Group__3__Impl"


    // $ANTLR start "rule__Meeting__Group__4"
    // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:716:1: rule__Meeting__Group__4 : rule__Meeting__Group__4__Impl rule__Meeting__Group__5 ;
    public final void rule__Meeting__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:720:1: ( rule__Meeting__Group__4__Impl rule__Meeting__Group__5 )
            // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:721:2: rule__Meeting__Group__4__Impl rule__Meeting__Group__5
            {
            pushFollow(FOLLOW_rule__Meeting__Group__4__Impl_in_rule__Meeting__Group__41375);
            rule__Meeting__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Meeting__Group__5_in_rule__Meeting__Group__41378);
            rule__Meeting__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Meeting__Group__4"


    // $ANTLR start "rule__Meeting__Group__4__Impl"
    // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:728:1: rule__Meeting__Group__4__Impl : ( ( rule__Meeting__PresentationsAssignment_4 )* ) ;
    public final void rule__Meeting__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:732:1: ( ( ( rule__Meeting__PresentationsAssignment_4 )* ) )
            // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:733:1: ( ( rule__Meeting__PresentationsAssignment_4 )* )
            {
            // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:733:1: ( ( rule__Meeting__PresentationsAssignment_4 )* )
            // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:734:1: ( rule__Meeting__PresentationsAssignment_4 )*
            {
             before(grammarAccess.getMeetingAccess().getPresentationsAssignment_4()); 
            // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:735:1: ( rule__Meeting__PresentationsAssignment_4 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==15) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:735:2: rule__Meeting__PresentationsAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__Meeting__PresentationsAssignment_4_in_rule__Meeting__Group__4__Impl1405);
            	    rule__Meeting__PresentationsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getMeetingAccess().getPresentationsAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Meeting__Group__4__Impl"


    // $ANTLR start "rule__Meeting__Group__5"
    // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:745:1: rule__Meeting__Group__5 : rule__Meeting__Group__5__Impl rule__Meeting__Group__6 ;
    public final void rule__Meeting__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:749:1: ( rule__Meeting__Group__5__Impl rule__Meeting__Group__6 )
            // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:750:2: rule__Meeting__Group__5__Impl rule__Meeting__Group__6
            {
            pushFollow(FOLLOW_rule__Meeting__Group__5__Impl_in_rule__Meeting__Group__51436);
            rule__Meeting__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Meeting__Group__6_in_rule__Meeting__Group__51439);
            rule__Meeting__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Meeting__Group__5"


    // $ANTLR start "rule__Meeting__Group__5__Impl"
    // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:757:1: rule__Meeting__Group__5__Impl : ( 'participants' ) ;
    public final void rule__Meeting__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:761:1: ( ( 'participants' ) )
            // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:762:1: ( 'participants' )
            {
            // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:762:1: ( 'participants' )
            // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:763:1: 'participants'
            {
             before(grammarAccess.getMeetingAccess().getParticipantsKeyword_5()); 
            match(input,18,FOLLOW_18_in_rule__Meeting__Group__5__Impl1467); 
             after(grammarAccess.getMeetingAccess().getParticipantsKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Meeting__Group__5__Impl"


    // $ANTLR start "rule__Meeting__Group__6"
    // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:776:1: rule__Meeting__Group__6 : rule__Meeting__Group__6__Impl rule__Meeting__Group__7 ;
    public final void rule__Meeting__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:780:1: ( rule__Meeting__Group__6__Impl rule__Meeting__Group__7 )
            // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:781:2: rule__Meeting__Group__6__Impl rule__Meeting__Group__7
            {
            pushFollow(FOLLOW_rule__Meeting__Group__6__Impl_in_rule__Meeting__Group__61498);
            rule__Meeting__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Meeting__Group__7_in_rule__Meeting__Group__61501);
            rule__Meeting__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Meeting__Group__6"


    // $ANTLR start "rule__Meeting__Group__6__Impl"
    // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:788:1: rule__Meeting__Group__6__Impl : ( ':' ) ;
    public final void rule__Meeting__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:792:1: ( ( ':' ) )
            // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:793:1: ( ':' )
            {
            // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:793:1: ( ':' )
            // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:794:1: ':'
            {
             before(grammarAccess.getMeetingAccess().getColonKeyword_6()); 
            match(input,13,FOLLOW_13_in_rule__Meeting__Group__6__Impl1529); 
             after(grammarAccess.getMeetingAccess().getColonKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Meeting__Group__6__Impl"


    // $ANTLR start "rule__Meeting__Group__7"
    // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:807:1: rule__Meeting__Group__7 : rule__Meeting__Group__7__Impl rule__Meeting__Group__8 ;
    public final void rule__Meeting__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:811:1: ( rule__Meeting__Group__7__Impl rule__Meeting__Group__8 )
            // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:812:2: rule__Meeting__Group__7__Impl rule__Meeting__Group__8
            {
            pushFollow(FOLLOW_rule__Meeting__Group__7__Impl_in_rule__Meeting__Group__71560);
            rule__Meeting__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Meeting__Group__8_in_rule__Meeting__Group__71563);
            rule__Meeting__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Meeting__Group__7"


    // $ANTLR start "rule__Meeting__Group__7__Impl"
    // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:819:1: rule__Meeting__Group__7__Impl : ( ( rule__Meeting__ParticipantsAssignment_7 )* ) ;
    public final void rule__Meeting__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:823:1: ( ( ( rule__Meeting__ParticipantsAssignment_7 )* ) )
            // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:824:1: ( ( rule__Meeting__ParticipantsAssignment_7 )* )
            {
            // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:824:1: ( ( rule__Meeting__ParticipantsAssignment_7 )* )
            // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:825:1: ( rule__Meeting__ParticipantsAssignment_7 )*
            {
             before(grammarAccess.getMeetingAccess().getParticipantsAssignment_7()); 
            // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:826:1: ( rule__Meeting__ParticipantsAssignment_7 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_ID) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:826:2: rule__Meeting__ParticipantsAssignment_7
            	    {
            	    pushFollow(FOLLOW_rule__Meeting__ParticipantsAssignment_7_in_rule__Meeting__Group__7__Impl1590);
            	    rule__Meeting__ParticipantsAssignment_7();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getMeetingAccess().getParticipantsAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Meeting__Group__7__Impl"


    // $ANTLR start "rule__Meeting__Group__8"
    // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:836:1: rule__Meeting__Group__8 : rule__Meeting__Group__8__Impl ;
    public final void rule__Meeting__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:840:1: ( rule__Meeting__Group__8__Impl )
            // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:841:2: rule__Meeting__Group__8__Impl
            {
            pushFollow(FOLLOW_rule__Meeting__Group__8__Impl_in_rule__Meeting__Group__81621);
            rule__Meeting__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Meeting__Group__8"


    // $ANTLR start "rule__Meeting__Group__8__Impl"
    // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:847:1: rule__Meeting__Group__8__Impl : ( '}' ) ;
    public final void rule__Meeting__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:851:1: ( ( '}' ) )
            // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:852:1: ( '}' )
            {
            // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:852:1: ( '}' )
            // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:853:1: '}'
            {
             before(grammarAccess.getMeetingAccess().getRightCurlyBracketKeyword_8()); 
            match(input,16,FOLLOW_16_in_rule__Meeting__Group__8__Impl1649); 
             after(grammarAccess.getMeetingAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Meeting__Group__8__Impl"


    // $ANTLR start "rule__Presentation__Group__0"
    // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:884:1: rule__Presentation__Group__0 : rule__Presentation__Group__0__Impl rule__Presentation__Group__1 ;
    public final void rule__Presentation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:888:1: ( rule__Presentation__Group__0__Impl rule__Presentation__Group__1 )
            // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:889:2: rule__Presentation__Group__0__Impl rule__Presentation__Group__1
            {
            pushFollow(FOLLOW_rule__Presentation__Group__0__Impl_in_rule__Presentation__Group__01698);
            rule__Presentation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Presentation__Group__1_in_rule__Presentation__Group__01701);
            rule__Presentation__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Presentation__Group__0"


    // $ANTLR start "rule__Presentation__Group__0__Impl"
    // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:896:1: rule__Presentation__Group__0__Impl : ( '{' ) ;
    public final void rule__Presentation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:900:1: ( ( '{' ) )
            // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:901:1: ( '{' )
            {
            // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:901:1: ( '{' )
            // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:902:1: '{'
            {
             before(grammarAccess.getPresentationAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,15,FOLLOW_15_in_rule__Presentation__Group__0__Impl1729); 
             after(grammarAccess.getPresentationAccess().getLeftCurlyBracketKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Presentation__Group__0__Impl"


    // $ANTLR start "rule__Presentation__Group__1"
    // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:915:1: rule__Presentation__Group__1 : rule__Presentation__Group__1__Impl rule__Presentation__Group__2 ;
    public final void rule__Presentation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:919:1: ( rule__Presentation__Group__1__Impl rule__Presentation__Group__2 )
            // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:920:2: rule__Presentation__Group__1__Impl rule__Presentation__Group__2
            {
            pushFollow(FOLLOW_rule__Presentation__Group__1__Impl_in_rule__Presentation__Group__11760);
            rule__Presentation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Presentation__Group__2_in_rule__Presentation__Group__11763);
            rule__Presentation__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Presentation__Group__1"


    // $ANTLR start "rule__Presentation__Group__1__Impl"
    // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:927:1: rule__Presentation__Group__1__Impl : ( ( rule__Presentation__TitleAssignment_1 ) ) ;
    public final void rule__Presentation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:931:1: ( ( ( rule__Presentation__TitleAssignment_1 ) ) )
            // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:932:1: ( ( rule__Presentation__TitleAssignment_1 ) )
            {
            // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:932:1: ( ( rule__Presentation__TitleAssignment_1 ) )
            // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:933:1: ( rule__Presentation__TitleAssignment_1 )
            {
             before(grammarAccess.getPresentationAccess().getTitleAssignment_1()); 
            // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:934:1: ( rule__Presentation__TitleAssignment_1 )
            // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:934:2: rule__Presentation__TitleAssignment_1
            {
            pushFollow(FOLLOW_rule__Presentation__TitleAssignment_1_in_rule__Presentation__Group__1__Impl1790);
            rule__Presentation__TitleAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPresentationAccess().getTitleAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Presentation__Group__1__Impl"


    // $ANTLR start "rule__Presentation__Group__2"
    // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:944:1: rule__Presentation__Group__2 : rule__Presentation__Group__2__Impl rule__Presentation__Group__3 ;
    public final void rule__Presentation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:948:1: ( rule__Presentation__Group__2__Impl rule__Presentation__Group__3 )
            // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:949:2: rule__Presentation__Group__2__Impl rule__Presentation__Group__3
            {
            pushFollow(FOLLOW_rule__Presentation__Group__2__Impl_in_rule__Presentation__Group__21820);
            rule__Presentation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Presentation__Group__3_in_rule__Presentation__Group__21823);
            rule__Presentation__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Presentation__Group__2"


    // $ANTLR start "rule__Presentation__Group__2__Impl"
    // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:956:1: rule__Presentation__Group__2__Impl : ( ( rule__Presentation__PresentersAssignment_2 )* ) ;
    public final void rule__Presentation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:960:1: ( ( ( rule__Presentation__PresentersAssignment_2 )* ) )
            // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:961:1: ( ( rule__Presentation__PresentersAssignment_2 )* )
            {
            // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:961:1: ( ( rule__Presentation__PresentersAssignment_2 )* )
            // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:962:1: ( rule__Presentation__PresentersAssignment_2 )*
            {
             before(grammarAccess.getPresentationAccess().getPresentersAssignment_2()); 
            // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:963:1: ( rule__Presentation__PresentersAssignment_2 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_ID) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:963:2: rule__Presentation__PresentersAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__Presentation__PresentersAssignment_2_in_rule__Presentation__Group__2__Impl1850);
            	    rule__Presentation__PresentersAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getPresentationAccess().getPresentersAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Presentation__Group__2__Impl"


    // $ANTLR start "rule__Presentation__Group__3"
    // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:973:1: rule__Presentation__Group__3 : rule__Presentation__Group__3__Impl ;
    public final void rule__Presentation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:977:1: ( rule__Presentation__Group__3__Impl )
            // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:978:2: rule__Presentation__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Presentation__Group__3__Impl_in_rule__Presentation__Group__31881);
            rule__Presentation__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Presentation__Group__3"


    // $ANTLR start "rule__Presentation__Group__3__Impl"
    // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:984:1: rule__Presentation__Group__3__Impl : ( '}' ) ;
    public final void rule__Presentation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:988:1: ( ( '}' ) )
            // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:989:1: ( '}' )
            {
            // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:989:1: ( '}' )
            // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:990:1: '}'
            {
             before(grammarAccess.getPresentationAccess().getRightCurlyBracketKeyword_3()); 
            match(input,16,FOLLOW_16_in_rule__Presentation__Group__3__Impl1909); 
             after(grammarAccess.getPresentationAccess().getRightCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Presentation__Group__3__Impl"


    // $ANTLR start "rule__Model__PersonsAssignment_2"
    // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:1012:1: rule__Model__PersonsAssignment_2 : ( rulePerson ) ;
    public final void rule__Model__PersonsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:1016:1: ( ( rulePerson ) )
            // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:1017:1: ( rulePerson )
            {
            // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:1017:1: ( rulePerson )
            // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:1018:1: rulePerson
            {
             before(grammarAccess.getModelAccess().getPersonsPersonParserRuleCall_2_0()); 
            pushFollow(FOLLOW_rulePerson_in_rule__Model__PersonsAssignment_21953);
            rulePerson();

            state._fsp--;

             after(grammarAccess.getModelAccess().getPersonsPersonParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__PersonsAssignment_2"


    // $ANTLR start "rule__Model__MeetingsAssignment_5"
    // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:1027:1: rule__Model__MeetingsAssignment_5 : ( ruleMeeting ) ;
    public final void rule__Model__MeetingsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:1031:1: ( ( ruleMeeting ) )
            // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:1032:1: ( ruleMeeting )
            {
            // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:1032:1: ( ruleMeeting )
            // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:1033:1: ruleMeeting
            {
             before(grammarAccess.getModelAccess().getMeetingsMeetingParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleMeeting_in_rule__Model__MeetingsAssignment_51984);
            ruleMeeting();

            state._fsp--;

             after(grammarAccess.getModelAccess().getMeetingsMeetingParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__MeetingsAssignment_5"


    // $ANTLR start "rule__Person__NameAssignment_0"
    // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:1042:1: rule__Person__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Person__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:1046:1: ( ( RULE_ID ) )
            // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:1047:1: ( RULE_ID )
            {
            // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:1047:1: ( RULE_ID )
            // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:1048:1: RULE_ID
            {
             before(grammarAccess.getPersonAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Person__NameAssignment_02015); 
             after(grammarAccess.getPersonAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__NameAssignment_0"


    // $ANTLR start "rule__Person__FirstNameAssignment_2"
    // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:1057:1: rule__Person__FirstNameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Person__FirstNameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:1061:1: ( ( RULE_ID ) )
            // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:1062:1: ( RULE_ID )
            {
            // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:1062:1: ( RULE_ID )
            // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:1063:1: RULE_ID
            {
             before(grammarAccess.getPersonAccess().getFirstNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Person__FirstNameAssignment_22046); 
             after(grammarAccess.getPersonAccess().getFirstNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__FirstNameAssignment_2"


    // $ANTLR start "rule__Person__LastNameAssignment_3"
    // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:1072:1: rule__Person__LastNameAssignment_3 : ( RULE_ID ) ;
    public final void rule__Person__LastNameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:1076:1: ( ( RULE_ID ) )
            // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:1077:1: ( RULE_ID )
            {
            // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:1077:1: ( RULE_ID )
            // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:1078:1: RULE_ID
            {
             before(grammarAccess.getPersonAccess().getLastNameIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Person__LastNameAssignment_32077); 
             after(grammarAccess.getPersonAccess().getLastNameIDTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__LastNameAssignment_3"


    // $ANTLR start "rule__Person__BirthDateAssignment_4"
    // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:1087:1: rule__Person__BirthDateAssignment_4 : ( RULE_DATE ) ;
    public final void rule__Person__BirthDateAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:1091:1: ( ( RULE_DATE ) )
            // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:1092:1: ( RULE_DATE )
            {
            // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:1092:1: ( RULE_DATE )
            // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:1093:1: RULE_DATE
            {
             before(grammarAccess.getPersonAccess().getBirthDateDATETerminalRuleCall_4_0()); 
            match(input,RULE_DATE,FOLLOW_RULE_DATE_in_rule__Person__BirthDateAssignment_42108); 
             after(grammarAccess.getPersonAccess().getBirthDateDATETerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__BirthDateAssignment_4"


    // $ANTLR start "rule__Person__AddressAssignment_5"
    // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:1102:1: rule__Person__AddressAssignment_5 : ( RULE_STRING ) ;
    public final void rule__Person__AddressAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:1106:1: ( ( RULE_STRING ) )
            // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:1107:1: ( RULE_STRING )
            {
            // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:1107:1: ( RULE_STRING )
            // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:1108:1: RULE_STRING
            {
             before(grammarAccess.getPersonAccess().getAddressSTRINGTerminalRuleCall_5_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Person__AddressAssignment_52139); 
             after(grammarAccess.getPersonAccess().getAddressSTRINGTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__AddressAssignment_5"


    // $ANTLR start "rule__Meeting__DateAssignment_1"
    // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:1118:1: rule__Meeting__DateAssignment_1 : ( RULE_DATE ) ;
    public final void rule__Meeting__DateAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:1122:1: ( ( RULE_DATE ) )
            // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:1123:1: ( RULE_DATE )
            {
            // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:1123:1: ( RULE_DATE )
            // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:1124:1: RULE_DATE
            {
             before(grammarAccess.getMeetingAccess().getDateDATETerminalRuleCall_1_0()); 
            match(input,RULE_DATE,FOLLOW_RULE_DATE_in_rule__Meeting__DateAssignment_12171); 
             after(grammarAccess.getMeetingAccess().getDateDATETerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Meeting__DateAssignment_1"


    // $ANTLR start "rule__Meeting__PresentationsAssignment_4"
    // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:1133:1: rule__Meeting__PresentationsAssignment_4 : ( rulePresentation ) ;
    public final void rule__Meeting__PresentationsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:1137:1: ( ( rulePresentation ) )
            // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:1138:1: ( rulePresentation )
            {
            // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:1138:1: ( rulePresentation )
            // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:1139:1: rulePresentation
            {
             before(grammarAccess.getMeetingAccess().getPresentationsPresentationParserRuleCall_4_0()); 
            pushFollow(FOLLOW_rulePresentation_in_rule__Meeting__PresentationsAssignment_42202);
            rulePresentation();

            state._fsp--;

             after(grammarAccess.getMeetingAccess().getPresentationsPresentationParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Meeting__PresentationsAssignment_4"


    // $ANTLR start "rule__Meeting__ParticipantsAssignment_7"
    // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:1148:1: rule__Meeting__ParticipantsAssignment_7 : ( ( RULE_ID ) ) ;
    public final void rule__Meeting__ParticipantsAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:1152:1: ( ( ( RULE_ID ) ) )
            // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:1153:1: ( ( RULE_ID ) )
            {
            // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:1153:1: ( ( RULE_ID ) )
            // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:1154:1: ( RULE_ID )
            {
             before(grammarAccess.getMeetingAccess().getParticipantsPersonCrossReference_7_0()); 
            // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:1155:1: ( RULE_ID )
            // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:1156:1: RULE_ID
            {
             before(grammarAccess.getMeetingAccess().getParticipantsPersonIDTerminalRuleCall_7_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Meeting__ParticipantsAssignment_72237); 
             after(grammarAccess.getMeetingAccess().getParticipantsPersonIDTerminalRuleCall_7_0_1()); 

            }

             after(grammarAccess.getMeetingAccess().getParticipantsPersonCrossReference_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Meeting__ParticipantsAssignment_7"


    // $ANTLR start "rule__Presentation__TitleAssignment_1"
    // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:1167:1: rule__Presentation__TitleAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Presentation__TitleAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:1171:1: ( ( RULE_STRING ) )
            // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:1172:1: ( RULE_STRING )
            {
            // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:1172:1: ( RULE_STRING )
            // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:1173:1: RULE_STRING
            {
             before(grammarAccess.getPresentationAccess().getTitleSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Presentation__TitleAssignment_12272); 
             after(grammarAccess.getPresentationAccess().getTitleSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Presentation__TitleAssignment_1"


    // $ANTLR start "rule__Presentation__PresentersAssignment_2"
    // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:1182:1: rule__Presentation__PresentersAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Presentation__PresentersAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:1186:1: ( ( ( RULE_ID ) ) )
            // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:1187:1: ( ( RULE_ID ) )
            {
            // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:1187:1: ( ( RULE_ID ) )
            // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:1188:1: ( RULE_ID )
            {
             before(grammarAccess.getPresentationAccess().getPresentersPersonCrossReference_2_0()); 
            // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:1189:1: ( RULE_ID )
            // ../ro.meetup.cpp.dsl.ui/src-gen/ro/meetup/cpp/dsl/ui/contentassist/antlr/internal/InternalDbDsl.g:1190:1: RULE_ID
            {
             before(grammarAccess.getPresentationAccess().getPresentersPersonIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Presentation__PresentersAssignment_22307); 
             after(grammarAccess.getPresentationAccess().getPresentersPersonIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getPresentationAccess().getPresentersPersonCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Presentation__PresentersAssignment_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__0_in_ruleModel94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePerson_in_entryRulePerson123 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePerson130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Person__Group__0_in_rulePerson156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMeeting_in_entryRuleMeeting187 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMeeting194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Meeting__Group__0_in_ruleMeeting220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePresentation_in_entryRulePresentation247 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePresentation254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Presentation__Group__0_in_rulePresentation280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__0315 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Model__Group__1_in_rule__Model__Group__0318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Model__Group__0__Impl346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__1377 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_rule__Model__Group__2_in_rule__Model__Group__1380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Model__Group__1__Impl408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__2__Impl_in_rule__Model__Group__2439 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_rule__Model__Group__3_in_rule__Model__Group__2442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__PersonsAssignment_2_in_rule__Model__Group__2__Impl469 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Model__Group__3__Impl_in_rule__Model__Group__3500 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Model__Group__4_in_rule__Model__Group__3503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Model__Group__3__Impl531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__4__Impl_in_rule__Model__Group__4562 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Model__Group__5_in_rule__Model__Group__4565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Model__Group__4__Impl593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__5__Impl_in_rule__Model__Group__5624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__MeetingsAssignment_5_in_rule__Model__Group__5__Impl651 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_rule__Person__Group__0__Impl_in_rule__Person__Group__0694 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Person__Group__1_in_rule__Person__Group__0697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Person__NameAssignment_0_in_rule__Person__Group__0__Impl724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Person__Group__1__Impl_in_rule__Person__Group__1754 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Person__Group__2_in_rule__Person__Group__1757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Person__Group__1__Impl785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Person__Group__2__Impl_in_rule__Person__Group__2816 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Person__Group__3_in_rule__Person__Group__2819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Person__FirstNameAssignment_2_in_rule__Person__Group__2__Impl846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Person__Group__3__Impl_in_rule__Person__Group__3876 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Person__Group__4_in_rule__Person__Group__3879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Person__LastNameAssignment_3_in_rule__Person__Group__3__Impl906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Person__Group__4__Impl_in_rule__Person__Group__4936 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Person__Group__5_in_rule__Person__Group__4939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Person__BirthDateAssignment_4_in_rule__Person__Group__4__Impl966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Person__Group__5__Impl_in_rule__Person__Group__5996 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__Person__Group__6_in_rule__Person__Group__5999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Person__AddressAssignment_5_in_rule__Person__Group__5__Impl1026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Person__Group__6__Impl_in_rule__Person__Group__61056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Person__Group__6__Impl1084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Meeting__Group__0__Impl_in_rule__Meeting__Group__01129 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Meeting__Group__1_in_rule__Meeting__Group__01132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Meeting__Group__0__Impl1160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Meeting__Group__1__Impl_in_rule__Meeting__Group__11191 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Meeting__Group__2_in_rule__Meeting__Group__11194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Meeting__DateAssignment_1_in_rule__Meeting__Group__1__Impl1221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Meeting__Group__2__Impl_in_rule__Meeting__Group__21251 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Meeting__Group__3_in_rule__Meeting__Group__21254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Meeting__Group__2__Impl1282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Meeting__Group__3__Impl_in_rule__Meeting__Group__31313 = new BitSet(new long[]{0x0000000000048000L});
    public static final BitSet FOLLOW_rule__Meeting__Group__4_in_rule__Meeting__Group__31316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Meeting__Group__3__Impl1344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Meeting__Group__4__Impl_in_rule__Meeting__Group__41375 = new BitSet(new long[]{0x0000000000048000L});
    public static final BitSet FOLLOW_rule__Meeting__Group__5_in_rule__Meeting__Group__41378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Meeting__PresentationsAssignment_4_in_rule__Meeting__Group__4__Impl1405 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_rule__Meeting__Group__5__Impl_in_rule__Meeting__Group__51436 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Meeting__Group__6_in_rule__Meeting__Group__51439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Meeting__Group__5__Impl1467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Meeting__Group__6__Impl_in_rule__Meeting__Group__61498 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_rule__Meeting__Group__7_in_rule__Meeting__Group__61501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Meeting__Group__6__Impl1529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Meeting__Group__7__Impl_in_rule__Meeting__Group__71560 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_rule__Meeting__Group__8_in_rule__Meeting__Group__71563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Meeting__ParticipantsAssignment_7_in_rule__Meeting__Group__7__Impl1590 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Meeting__Group__8__Impl_in_rule__Meeting__Group__81621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Meeting__Group__8__Impl1649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Presentation__Group__0__Impl_in_rule__Presentation__Group__01698 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Presentation__Group__1_in_rule__Presentation__Group__01701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Presentation__Group__0__Impl1729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Presentation__Group__1__Impl_in_rule__Presentation__Group__11760 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_rule__Presentation__Group__2_in_rule__Presentation__Group__11763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Presentation__TitleAssignment_1_in_rule__Presentation__Group__1__Impl1790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Presentation__Group__2__Impl_in_rule__Presentation__Group__21820 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_rule__Presentation__Group__3_in_rule__Presentation__Group__21823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Presentation__PresentersAssignment_2_in_rule__Presentation__Group__2__Impl1850 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Presentation__Group__3__Impl_in_rule__Presentation__Group__31881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Presentation__Group__3__Impl1909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePerson_in_rule__Model__PersonsAssignment_21953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMeeting_in_rule__Model__MeetingsAssignment_51984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Person__NameAssignment_02015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Person__FirstNameAssignment_22046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Person__LastNameAssignment_32077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DATE_in_rule__Person__BirthDateAssignment_42108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Person__AddressAssignment_52139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DATE_in_rule__Meeting__DateAssignment_12171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePresentation_in_rule__Meeting__PresentationsAssignment_42202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Meeting__ParticipantsAssignment_72237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Presentation__TitleAssignment_12272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Presentation__PresentersAssignment_22307 = new BitSet(new long[]{0x0000000000000002L});

}