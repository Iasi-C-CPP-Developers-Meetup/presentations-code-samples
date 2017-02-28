/**
 */
package ro.meetup.cpp.dsl.dbDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Meeting</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ro.meetup.cpp.dsl.dbDsl.Meeting#getDate <em>Date</em>}</li>
 *   <li>{@link ro.meetup.cpp.dsl.dbDsl.Meeting#getPresentations <em>Presentations</em>}</li>
 *   <li>{@link ro.meetup.cpp.dsl.dbDsl.Meeting#getParticipants <em>Participants</em>}</li>
 * </ul>
 * </p>
 *
 * @see ro.meetup.cpp.dsl.dbDsl.DbDslPackage#getMeeting()
 * @model
 * @generated
 */
public interface Meeting extends EObject
{
  /**
   * Returns the value of the '<em><b>Date</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Date</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Date</em>' attribute.
   * @see #setDate(String)
   * @see ro.meetup.cpp.dsl.dbDsl.DbDslPackage#getMeeting_Date()
   * @model
   * @generated
   */
  String getDate();

  /**
   * Sets the value of the '{@link ro.meetup.cpp.dsl.dbDsl.Meeting#getDate <em>Date</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Date</em>' attribute.
   * @see #getDate()
   * @generated
   */
  void setDate(String value);

  /**
   * Returns the value of the '<em><b>Presentations</b></em>' containment reference list.
   * The list contents are of type {@link ro.meetup.cpp.dsl.dbDsl.Presentation}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Presentations</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Presentations</em>' containment reference list.
   * @see ro.meetup.cpp.dsl.dbDsl.DbDslPackage#getMeeting_Presentations()
   * @model containment="true"
   * @generated
   */
  EList<Presentation> getPresentations();

  /**
   * Returns the value of the '<em><b>Participants</b></em>' reference list.
   * The list contents are of type {@link ro.meetup.cpp.dsl.dbDsl.Person}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Participants</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Participants</em>' reference list.
   * @see ro.meetup.cpp.dsl.dbDsl.DbDslPackage#getMeeting_Participants()
   * @model
   * @generated
   */
  EList<Person> getParticipants();

} // Meeting
