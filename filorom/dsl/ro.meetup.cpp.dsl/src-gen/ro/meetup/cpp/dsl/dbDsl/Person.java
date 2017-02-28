/**
 */
package ro.meetup.cpp.dsl.dbDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Person</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ro.meetup.cpp.dsl.dbDsl.Person#getName <em>Name</em>}</li>
 *   <li>{@link ro.meetup.cpp.dsl.dbDsl.Person#getFirstName <em>First Name</em>}</li>
 *   <li>{@link ro.meetup.cpp.dsl.dbDsl.Person#getLastName <em>Last Name</em>}</li>
 *   <li>{@link ro.meetup.cpp.dsl.dbDsl.Person#getBirthDate <em>Birth Date</em>}</li>
 *   <li>{@link ro.meetup.cpp.dsl.dbDsl.Person#getAddress <em>Address</em>}</li>
 * </ul>
 * </p>
 *
 * @see ro.meetup.cpp.dsl.dbDsl.DbDslPackage#getPerson()
 * @model
 * @generated
 */
public interface Person extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see ro.meetup.cpp.dsl.dbDsl.DbDslPackage#getPerson_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link ro.meetup.cpp.dsl.dbDsl.Person#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>First Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>First Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>First Name</em>' attribute.
   * @see #setFirstName(String)
   * @see ro.meetup.cpp.dsl.dbDsl.DbDslPackage#getPerson_FirstName()
   * @model
   * @generated
   */
  String getFirstName();

  /**
   * Sets the value of the '{@link ro.meetup.cpp.dsl.dbDsl.Person#getFirstName <em>First Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>First Name</em>' attribute.
   * @see #getFirstName()
   * @generated
   */
  void setFirstName(String value);

  /**
   * Returns the value of the '<em><b>Last Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Last Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Last Name</em>' attribute.
   * @see #setLastName(String)
   * @see ro.meetup.cpp.dsl.dbDsl.DbDslPackage#getPerson_LastName()
   * @model
   * @generated
   */
  String getLastName();

  /**
   * Sets the value of the '{@link ro.meetup.cpp.dsl.dbDsl.Person#getLastName <em>Last Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Last Name</em>' attribute.
   * @see #getLastName()
   * @generated
   */
  void setLastName(String value);

  /**
   * Returns the value of the '<em><b>Birth Date</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Birth Date</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Birth Date</em>' attribute.
   * @see #setBirthDate(String)
   * @see ro.meetup.cpp.dsl.dbDsl.DbDslPackage#getPerson_BirthDate()
   * @model
   * @generated
   */
  String getBirthDate();

  /**
   * Sets the value of the '{@link ro.meetup.cpp.dsl.dbDsl.Person#getBirthDate <em>Birth Date</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Birth Date</em>' attribute.
   * @see #getBirthDate()
   * @generated
   */
  void setBirthDate(String value);

  /**
   * Returns the value of the '<em><b>Address</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Address</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Address</em>' attribute.
   * @see #setAddress(String)
   * @see ro.meetup.cpp.dsl.dbDsl.DbDslPackage#getPerson_Address()
   * @model
   * @generated
   */
  String getAddress();

  /**
   * Sets the value of the '{@link ro.meetup.cpp.dsl.dbDsl.Person#getAddress <em>Address</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Address</em>' attribute.
   * @see #getAddress()
   * @generated
   */
  void setAddress(String value);

} // Person
