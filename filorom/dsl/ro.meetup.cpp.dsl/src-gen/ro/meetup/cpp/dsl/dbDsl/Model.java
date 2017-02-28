/**
 */
package ro.meetup.cpp.dsl.dbDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ro.meetup.cpp.dsl.dbDsl.Model#getPersons <em>Persons</em>}</li>
 *   <li>{@link ro.meetup.cpp.dsl.dbDsl.Model#getMeetings <em>Meetings</em>}</li>
 * </ul>
 * </p>
 *
 * @see ro.meetup.cpp.dsl.dbDsl.DbDslPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject
{
  /**
   * Returns the value of the '<em><b>Persons</b></em>' containment reference list.
   * The list contents are of type {@link ro.meetup.cpp.dsl.dbDsl.Person}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Persons</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Persons</em>' containment reference list.
   * @see ro.meetup.cpp.dsl.dbDsl.DbDslPackage#getModel_Persons()
   * @model containment="true"
   * @generated
   */
  EList<Person> getPersons();

  /**
   * Returns the value of the '<em><b>Meetings</b></em>' containment reference list.
   * The list contents are of type {@link ro.meetup.cpp.dsl.dbDsl.Meeting}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Meetings</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Meetings</em>' containment reference list.
   * @see ro.meetup.cpp.dsl.dbDsl.DbDslPackage#getModel_Meetings()
   * @model containment="true"
   * @generated
   */
  EList<Meeting> getMeetings();

} // Model
