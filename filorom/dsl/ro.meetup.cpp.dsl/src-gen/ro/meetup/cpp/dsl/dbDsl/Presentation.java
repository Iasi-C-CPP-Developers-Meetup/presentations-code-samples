/**
 */
package ro.meetup.cpp.dsl.dbDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Presentation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ro.meetup.cpp.dsl.dbDsl.Presentation#getTitle <em>Title</em>}</li>
 *   <li>{@link ro.meetup.cpp.dsl.dbDsl.Presentation#getPresenters <em>Presenters</em>}</li>
 * </ul>
 * </p>
 *
 * @see ro.meetup.cpp.dsl.dbDsl.DbDslPackage#getPresentation()
 * @model
 * @generated
 */
public interface Presentation extends EObject
{
  /**
   * Returns the value of the '<em><b>Title</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Title</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Title</em>' attribute.
   * @see #setTitle(String)
   * @see ro.meetup.cpp.dsl.dbDsl.DbDslPackage#getPresentation_Title()
   * @model
   * @generated
   */
  String getTitle();

  /**
   * Sets the value of the '{@link ro.meetup.cpp.dsl.dbDsl.Presentation#getTitle <em>Title</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Title</em>' attribute.
   * @see #getTitle()
   * @generated
   */
  void setTitle(String value);

  /**
   * Returns the value of the '<em><b>Presenters</b></em>' reference list.
   * The list contents are of type {@link ro.meetup.cpp.dsl.dbDsl.Person}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Presenters</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Presenters</em>' reference list.
   * @see ro.meetup.cpp.dsl.dbDsl.DbDslPackage#getPresentation_Presenters()
   * @model
   * @generated
   */
  EList<Person> getPresenters();

} // Presentation
