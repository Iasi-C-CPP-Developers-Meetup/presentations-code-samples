/**
 */
package ro.meetup.cpp.dsl.dbDsl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see ro.meetup.cpp.dsl.dbDsl.DbDslFactory
 * @model kind="package"
 * @generated
 */
public interface DbDslPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "dbDsl";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.meetup.ro/cpp/dsl/DbDsl";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "dbDsl";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  DbDslPackage eINSTANCE = ro.meetup.cpp.dsl.dbDsl.impl.DbDslPackageImpl.init();

  /**
   * The meta object id for the '{@link ro.meetup.cpp.dsl.dbDsl.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ro.meetup.cpp.dsl.dbDsl.impl.ModelImpl
   * @see ro.meetup.cpp.dsl.dbDsl.impl.DbDslPackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The feature id for the '<em><b>Persons</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__PERSONS = 0;

  /**
   * The feature id for the '<em><b>Meetings</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__MEETINGS = 1;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link ro.meetup.cpp.dsl.dbDsl.impl.PersonImpl <em>Person</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ro.meetup.cpp.dsl.dbDsl.impl.PersonImpl
   * @see ro.meetup.cpp.dsl.dbDsl.impl.DbDslPackageImpl#getPerson()
   * @generated
   */
  int PERSON = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PERSON__NAME = 0;

  /**
   * The feature id for the '<em><b>First Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PERSON__FIRST_NAME = 1;

  /**
   * The feature id for the '<em><b>Last Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PERSON__LAST_NAME = 2;

  /**
   * The feature id for the '<em><b>Birth Date</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PERSON__BIRTH_DATE = 3;

  /**
   * The feature id for the '<em><b>Address</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PERSON__ADDRESS = 4;

  /**
   * The number of structural features of the '<em>Person</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PERSON_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link ro.meetup.cpp.dsl.dbDsl.impl.ParticipantImpl <em>Participant</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ro.meetup.cpp.dsl.dbDsl.impl.ParticipantImpl
   * @see ro.meetup.cpp.dsl.dbDsl.impl.DbDslPackageImpl#getParticipant()
   * @generated
   */
  int PARTICIPANT = 2;

  /**
   * The feature id for the '<em><b>Person</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARTICIPANT__PERSON = 0;

  /**
   * The number of structural features of the '<em>Participant</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARTICIPANT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link ro.meetup.cpp.dsl.dbDsl.impl.MeetingImpl <em>Meeting</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ro.meetup.cpp.dsl.dbDsl.impl.MeetingImpl
   * @see ro.meetup.cpp.dsl.dbDsl.impl.DbDslPackageImpl#getMeeting()
   * @generated
   */
  int MEETING = 3;

  /**
   * The feature id for the '<em><b>Date</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEETING__DATE = 0;

  /**
   * The feature id for the '<em><b>Presentations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEETING__PRESENTATIONS = 1;

  /**
   * The feature id for the '<em><b>Participants</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEETING__PARTICIPANTS = 2;

  /**
   * The number of structural features of the '<em>Meeting</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEETING_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link ro.meetup.cpp.dsl.dbDsl.impl.PresentationImpl <em>Presentation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ro.meetup.cpp.dsl.dbDsl.impl.PresentationImpl
   * @see ro.meetup.cpp.dsl.dbDsl.impl.DbDslPackageImpl#getPresentation()
   * @generated
   */
  int PRESENTATION = 4;

  /**
   * The feature id for the '<em><b>Title</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRESENTATION__TITLE = 0;

  /**
   * The feature id for the '<em><b>Presenters</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRESENTATION__PRESENTERS = 1;

  /**
   * The number of structural features of the '<em>Presentation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRESENTATION_FEATURE_COUNT = 2;


  /**
   * Returns the meta object for class '{@link ro.meetup.cpp.dsl.dbDsl.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see ro.meetup.cpp.dsl.dbDsl.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the containment reference list '{@link ro.meetup.cpp.dsl.dbDsl.Model#getPersons <em>Persons</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Persons</em>'.
   * @see ro.meetup.cpp.dsl.dbDsl.Model#getPersons()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Persons();

  /**
   * Returns the meta object for the containment reference list '{@link ro.meetup.cpp.dsl.dbDsl.Model#getMeetings <em>Meetings</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Meetings</em>'.
   * @see ro.meetup.cpp.dsl.dbDsl.Model#getMeetings()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Meetings();

  /**
   * Returns the meta object for class '{@link ro.meetup.cpp.dsl.dbDsl.Person <em>Person</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Person</em>'.
   * @see ro.meetup.cpp.dsl.dbDsl.Person
   * @generated
   */
  EClass getPerson();

  /**
   * Returns the meta object for the attribute '{@link ro.meetup.cpp.dsl.dbDsl.Person#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see ro.meetup.cpp.dsl.dbDsl.Person#getName()
   * @see #getPerson()
   * @generated
   */
  EAttribute getPerson_Name();

  /**
   * Returns the meta object for the attribute '{@link ro.meetup.cpp.dsl.dbDsl.Person#getFirstName <em>First Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>First Name</em>'.
   * @see ro.meetup.cpp.dsl.dbDsl.Person#getFirstName()
   * @see #getPerson()
   * @generated
   */
  EAttribute getPerson_FirstName();

  /**
   * Returns the meta object for the attribute '{@link ro.meetup.cpp.dsl.dbDsl.Person#getLastName <em>Last Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Last Name</em>'.
   * @see ro.meetup.cpp.dsl.dbDsl.Person#getLastName()
   * @see #getPerson()
   * @generated
   */
  EAttribute getPerson_LastName();

  /**
   * Returns the meta object for the attribute '{@link ro.meetup.cpp.dsl.dbDsl.Person#getBirthDate <em>Birth Date</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Birth Date</em>'.
   * @see ro.meetup.cpp.dsl.dbDsl.Person#getBirthDate()
   * @see #getPerson()
   * @generated
   */
  EAttribute getPerson_BirthDate();

  /**
   * Returns the meta object for the attribute '{@link ro.meetup.cpp.dsl.dbDsl.Person#getAddress <em>Address</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Address</em>'.
   * @see ro.meetup.cpp.dsl.dbDsl.Person#getAddress()
   * @see #getPerson()
   * @generated
   */
  EAttribute getPerson_Address();

  /**
   * Returns the meta object for class '{@link ro.meetup.cpp.dsl.dbDsl.Participant <em>Participant</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Participant</em>'.
   * @see ro.meetup.cpp.dsl.dbDsl.Participant
   * @generated
   */
  EClass getParticipant();

  /**
   * Returns the meta object for the reference '{@link ro.meetup.cpp.dsl.dbDsl.Participant#getPerson <em>Person</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Person</em>'.
   * @see ro.meetup.cpp.dsl.dbDsl.Participant#getPerson()
   * @see #getParticipant()
   * @generated
   */
  EReference getParticipant_Person();

  /**
   * Returns the meta object for class '{@link ro.meetup.cpp.dsl.dbDsl.Meeting <em>Meeting</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Meeting</em>'.
   * @see ro.meetup.cpp.dsl.dbDsl.Meeting
   * @generated
   */
  EClass getMeeting();

  /**
   * Returns the meta object for the attribute '{@link ro.meetup.cpp.dsl.dbDsl.Meeting#getDate <em>Date</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Date</em>'.
   * @see ro.meetup.cpp.dsl.dbDsl.Meeting#getDate()
   * @see #getMeeting()
   * @generated
   */
  EAttribute getMeeting_Date();

  /**
   * Returns the meta object for the containment reference list '{@link ro.meetup.cpp.dsl.dbDsl.Meeting#getPresentations <em>Presentations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Presentations</em>'.
   * @see ro.meetup.cpp.dsl.dbDsl.Meeting#getPresentations()
   * @see #getMeeting()
   * @generated
   */
  EReference getMeeting_Presentations();

  /**
   * Returns the meta object for the reference list '{@link ro.meetup.cpp.dsl.dbDsl.Meeting#getParticipants <em>Participants</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Participants</em>'.
   * @see ro.meetup.cpp.dsl.dbDsl.Meeting#getParticipants()
   * @see #getMeeting()
   * @generated
   */
  EReference getMeeting_Participants();

  /**
   * Returns the meta object for class '{@link ro.meetup.cpp.dsl.dbDsl.Presentation <em>Presentation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Presentation</em>'.
   * @see ro.meetup.cpp.dsl.dbDsl.Presentation
   * @generated
   */
  EClass getPresentation();

  /**
   * Returns the meta object for the attribute '{@link ro.meetup.cpp.dsl.dbDsl.Presentation#getTitle <em>Title</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Title</em>'.
   * @see ro.meetup.cpp.dsl.dbDsl.Presentation#getTitle()
   * @see #getPresentation()
   * @generated
   */
  EAttribute getPresentation_Title();

  /**
   * Returns the meta object for the reference list '{@link ro.meetup.cpp.dsl.dbDsl.Presentation#getPresenters <em>Presenters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Presenters</em>'.
   * @see ro.meetup.cpp.dsl.dbDsl.Presentation#getPresenters()
   * @see #getPresentation()
   * @generated
   */
  EReference getPresentation_Presenters();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  DbDslFactory getDbDslFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link ro.meetup.cpp.dsl.dbDsl.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ro.meetup.cpp.dsl.dbDsl.impl.ModelImpl
     * @see ro.meetup.cpp.dsl.dbDsl.impl.DbDslPackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>Persons</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__PERSONS = eINSTANCE.getModel_Persons();

    /**
     * The meta object literal for the '<em><b>Meetings</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__MEETINGS = eINSTANCE.getModel_Meetings();

    /**
     * The meta object literal for the '{@link ro.meetup.cpp.dsl.dbDsl.impl.PersonImpl <em>Person</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ro.meetup.cpp.dsl.dbDsl.impl.PersonImpl
     * @see ro.meetup.cpp.dsl.dbDsl.impl.DbDslPackageImpl#getPerson()
     * @generated
     */
    EClass PERSON = eINSTANCE.getPerson();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PERSON__NAME = eINSTANCE.getPerson_Name();

    /**
     * The meta object literal for the '<em><b>First Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PERSON__FIRST_NAME = eINSTANCE.getPerson_FirstName();

    /**
     * The meta object literal for the '<em><b>Last Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PERSON__LAST_NAME = eINSTANCE.getPerson_LastName();

    /**
     * The meta object literal for the '<em><b>Birth Date</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PERSON__BIRTH_DATE = eINSTANCE.getPerson_BirthDate();

    /**
     * The meta object literal for the '<em><b>Address</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PERSON__ADDRESS = eINSTANCE.getPerson_Address();

    /**
     * The meta object literal for the '{@link ro.meetup.cpp.dsl.dbDsl.impl.ParticipantImpl <em>Participant</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ro.meetup.cpp.dsl.dbDsl.impl.ParticipantImpl
     * @see ro.meetup.cpp.dsl.dbDsl.impl.DbDslPackageImpl#getParticipant()
     * @generated
     */
    EClass PARTICIPANT = eINSTANCE.getParticipant();

    /**
     * The meta object literal for the '<em><b>Person</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARTICIPANT__PERSON = eINSTANCE.getParticipant_Person();

    /**
     * The meta object literal for the '{@link ro.meetup.cpp.dsl.dbDsl.impl.MeetingImpl <em>Meeting</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ro.meetup.cpp.dsl.dbDsl.impl.MeetingImpl
     * @see ro.meetup.cpp.dsl.dbDsl.impl.DbDslPackageImpl#getMeeting()
     * @generated
     */
    EClass MEETING = eINSTANCE.getMeeting();

    /**
     * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MEETING__DATE = eINSTANCE.getMeeting_Date();

    /**
     * The meta object literal for the '<em><b>Presentations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MEETING__PRESENTATIONS = eINSTANCE.getMeeting_Presentations();

    /**
     * The meta object literal for the '<em><b>Participants</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MEETING__PARTICIPANTS = eINSTANCE.getMeeting_Participants();

    /**
     * The meta object literal for the '{@link ro.meetup.cpp.dsl.dbDsl.impl.PresentationImpl <em>Presentation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ro.meetup.cpp.dsl.dbDsl.impl.PresentationImpl
     * @see ro.meetup.cpp.dsl.dbDsl.impl.DbDslPackageImpl#getPresentation()
     * @generated
     */
    EClass PRESENTATION = eINSTANCE.getPresentation();

    /**
     * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PRESENTATION__TITLE = eINSTANCE.getPresentation_Title();

    /**
     * The meta object literal for the '<em><b>Presenters</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PRESENTATION__PRESENTERS = eINSTANCE.getPresentation_Presenters();

  }

} //DbDslPackage
