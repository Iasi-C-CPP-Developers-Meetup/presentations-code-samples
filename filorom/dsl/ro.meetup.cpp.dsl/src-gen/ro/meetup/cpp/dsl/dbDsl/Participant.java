/**
 */
package ro.meetup.cpp.dsl.dbDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Participant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ro.meetup.cpp.dsl.dbDsl.Participant#getPerson <em>Person</em>}</li>
 * </ul>
 * </p>
 *
 * @see ro.meetup.cpp.dsl.dbDsl.DbDslPackage#getParticipant()
 * @model
 * @generated
 */
public interface Participant extends EObject
{
  /**
   * Returns the value of the '<em><b>Person</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Person</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Person</em>' reference.
   * @see #setPerson(Person)
   * @see ro.meetup.cpp.dsl.dbDsl.DbDslPackage#getParticipant_Person()
   * @model
   * @generated
   */
  Person getPerson();

  /**
   * Sets the value of the '{@link ro.meetup.cpp.dsl.dbDsl.Participant#getPerson <em>Person</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Person</em>' reference.
   * @see #getPerson()
   * @generated
   */
  void setPerson(Person value);

} // Participant
