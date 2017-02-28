package ro.meetup.cpp.dsl.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import ro.meetup.cpp.dsl.dbDsl.DbDslPackage;
import ro.meetup.cpp.dsl.dbDsl.Meeting;
import ro.meetup.cpp.dsl.dbDsl.Model;
import ro.meetup.cpp.dsl.dbDsl.Participant;
import ro.meetup.cpp.dsl.dbDsl.Person;
import ro.meetup.cpp.dsl.dbDsl.Presentation;
import ro.meetup.cpp.dsl.services.DbDslGrammarAccess;

@SuppressWarnings("all")
public class DbDslSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private DbDslGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == DbDslPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case DbDslPackage.MEETING:
				if(context == grammarAccess.getMeetingRule()) {
					sequence_Meeting(context, (Meeting) semanticObject); 
					return; 
				}
				else break;
			case DbDslPackage.MODEL:
				if(context == grammarAccess.getModelRule()) {
					sequence_Model(context, (Model) semanticObject); 
					return; 
				}
				else break;
			case DbDslPackage.PARTICIPANT:
				if(context == grammarAccess.getParticipantRule()) {
					sequence_Participant(context, (Participant) semanticObject); 
					return; 
				}
				else break;
			case DbDslPackage.PERSON:
				if(context == grammarAccess.getPersonRule()) {
					sequence_Person(context, (Person) semanticObject); 
					return; 
				}
				else break;
			case DbDslPackage.PRESENTATION:
				if(context == grammarAccess.getPresentationRule()) {
					sequence_Presentation(context, (Presentation) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (date=DATE presentations+=Presentation* participants+=[Person|ID]*)
	 */
	protected void sequence_Meeting(EObject context, Meeting semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (persons+=Person* meetings+=Meeting*)
	 */
	protected void sequence_Model(EObject context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     person=[Person|ID]
	 */
	protected void sequence_Participant(EObject context, Participant semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DbDslPackage.Literals.PARTICIPANT__PERSON) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DbDslPackage.Literals.PARTICIPANT__PERSON));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getParticipantAccess().getPersonPersonIDTerminalRuleCall_0_1(), semanticObject.getPerson());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID firstName=ID lastName=ID birthDate=DATE address=STRING)
	 */
	protected void sequence_Person(EObject context, Person semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DbDslPackage.Literals.PERSON__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DbDslPackage.Literals.PERSON__NAME));
			if(transientValues.isValueTransient(semanticObject, DbDslPackage.Literals.PERSON__FIRST_NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DbDslPackage.Literals.PERSON__FIRST_NAME));
			if(transientValues.isValueTransient(semanticObject, DbDslPackage.Literals.PERSON__LAST_NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DbDslPackage.Literals.PERSON__LAST_NAME));
			if(transientValues.isValueTransient(semanticObject, DbDslPackage.Literals.PERSON__BIRTH_DATE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DbDslPackage.Literals.PERSON__BIRTH_DATE));
			if(transientValues.isValueTransient(semanticObject, DbDslPackage.Literals.PERSON__ADDRESS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DbDslPackage.Literals.PERSON__ADDRESS));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPersonAccess().getNameIDTerminalRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getPersonAccess().getFirstNameIDTerminalRuleCall_2_0(), semanticObject.getFirstName());
		feeder.accept(grammarAccess.getPersonAccess().getLastNameIDTerminalRuleCall_3_0(), semanticObject.getLastName());
		feeder.accept(grammarAccess.getPersonAccess().getBirthDateDATETerminalRuleCall_4_0(), semanticObject.getBirthDate());
		feeder.accept(grammarAccess.getPersonAccess().getAddressSTRINGTerminalRuleCall_5_0(), semanticObject.getAddress());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (title=STRING presenters+=[Person|ID]*)
	 */
	protected void sequence_Presentation(EObject context, Presentation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
