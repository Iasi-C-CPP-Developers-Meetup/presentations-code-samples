/**
 */
package ro.meetup.cpp.dsl.dbDsl.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import ro.meetup.cpp.dsl.dbDsl.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DbDslFactoryImpl extends EFactoryImpl implements DbDslFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static DbDslFactory init()
  {
    try
    {
      DbDslFactory theDbDslFactory = (DbDslFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.meetup.ro/cpp/dsl/DbDsl"); 
      if (theDbDslFactory != null)
      {
        return theDbDslFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new DbDslFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DbDslFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case DbDslPackage.MODEL: return createModel();
      case DbDslPackage.PERSON: return createPerson();
      case DbDslPackage.PARTICIPANT: return createParticipant();
      case DbDslPackage.MEETING: return createMeeting();
      case DbDslPackage.PRESENTATION: return createPresentation();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Person createPerson()
  {
    PersonImpl person = new PersonImpl();
    return person;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Participant createParticipant()
  {
    ParticipantImpl participant = new ParticipantImpl();
    return participant;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Meeting createMeeting()
  {
    MeetingImpl meeting = new MeetingImpl();
    return meeting;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Presentation createPresentation()
  {
    PresentationImpl presentation = new PresentationImpl();
    return presentation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DbDslPackage getDbDslPackage()
  {
    return (DbDslPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static DbDslPackage getPackage()
  {
    return DbDslPackage.eINSTANCE;
  }

} //DbDslFactoryImpl
