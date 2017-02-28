/**
 */
package ro.meetup.cpp.dsl.dbDsl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import ro.meetup.cpp.dsl.dbDsl.DbDslPackage;
import ro.meetup.cpp.dsl.dbDsl.Person;
import ro.meetup.cpp.dsl.dbDsl.Presentation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Presentation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ro.meetup.cpp.dsl.dbDsl.impl.PresentationImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link ro.meetup.cpp.dsl.dbDsl.impl.PresentationImpl#getPresenters <em>Presenters</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PresentationImpl extends MinimalEObjectImpl.Container implements Presentation
{
  /**
   * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTitle()
   * @generated
   * @ordered
   */
  protected static final String TITLE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTitle()
   * @generated
   * @ordered
   */
  protected String title = TITLE_EDEFAULT;

  /**
   * The cached value of the '{@link #getPresenters() <em>Presenters</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPresenters()
   * @generated
   * @ordered
   */
  protected EList<Person> presenters;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PresentationImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return DbDslPackage.Literals.PRESENTATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getTitle()
  {
    return title;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTitle(String newTitle)
  {
    String oldTitle = title;
    title = newTitle;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DbDslPackage.PRESENTATION__TITLE, oldTitle, title));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Person> getPresenters()
  {
    if (presenters == null)
    {
      presenters = new EObjectResolvingEList<Person>(Person.class, this, DbDslPackage.PRESENTATION__PRESENTERS);
    }
    return presenters;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case DbDslPackage.PRESENTATION__TITLE:
        return getTitle();
      case DbDslPackage.PRESENTATION__PRESENTERS:
        return getPresenters();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case DbDslPackage.PRESENTATION__TITLE:
        setTitle((String)newValue);
        return;
      case DbDslPackage.PRESENTATION__PRESENTERS:
        getPresenters().clear();
        getPresenters().addAll((Collection<? extends Person>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case DbDslPackage.PRESENTATION__TITLE:
        setTitle(TITLE_EDEFAULT);
        return;
      case DbDslPackage.PRESENTATION__PRESENTERS:
        getPresenters().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case DbDslPackage.PRESENTATION__TITLE:
        return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
      case DbDslPackage.PRESENTATION__PRESENTERS:
        return presenters != null && !presenters.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (title: ");
    result.append(title);
    result.append(')');
    return result.toString();
  }

} //PresentationImpl
