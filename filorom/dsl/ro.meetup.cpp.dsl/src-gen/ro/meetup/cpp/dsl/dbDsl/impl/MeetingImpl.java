/**
 */
package ro.meetup.cpp.dsl.dbDsl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import ro.meetup.cpp.dsl.dbDsl.DbDslPackage;
import ro.meetup.cpp.dsl.dbDsl.Meeting;
import ro.meetup.cpp.dsl.dbDsl.Person;
import ro.meetup.cpp.dsl.dbDsl.Presentation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Meeting</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ro.meetup.cpp.dsl.dbDsl.impl.MeetingImpl#getDate <em>Date</em>}</li>
 *   <li>{@link ro.meetup.cpp.dsl.dbDsl.impl.MeetingImpl#getPresentations <em>Presentations</em>}</li>
 *   <li>{@link ro.meetup.cpp.dsl.dbDsl.impl.MeetingImpl#getParticipants <em>Participants</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MeetingImpl extends MinimalEObjectImpl.Container implements Meeting
{
  /**
   * The default value of the '{@link #getDate() <em>Date</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDate()
   * @generated
   * @ordered
   */
  protected static final String DATE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDate() <em>Date</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDate()
   * @generated
   * @ordered
   */
  protected String date = DATE_EDEFAULT;

  /**
   * The cached value of the '{@link #getPresentations() <em>Presentations</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPresentations()
   * @generated
   * @ordered
   */
  protected EList<Presentation> presentations;

  /**
   * The cached value of the '{@link #getParticipants() <em>Participants</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParticipants()
   * @generated
   * @ordered
   */
  protected EList<Person> participants;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MeetingImpl()
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
    return DbDslPackage.Literals.MEETING;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDate()
  {
    return date;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDate(String newDate)
  {
    String oldDate = date;
    date = newDate;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DbDslPackage.MEETING__DATE, oldDate, date));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Presentation> getPresentations()
  {
    if (presentations == null)
    {
      presentations = new EObjectContainmentEList<Presentation>(Presentation.class, this, DbDslPackage.MEETING__PRESENTATIONS);
    }
    return presentations;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Person> getParticipants()
  {
    if (participants == null)
    {
      participants = new EObjectResolvingEList<Person>(Person.class, this, DbDslPackage.MEETING__PARTICIPANTS);
    }
    return participants;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case DbDslPackage.MEETING__PRESENTATIONS:
        return ((InternalEList<?>)getPresentations()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case DbDslPackage.MEETING__DATE:
        return getDate();
      case DbDslPackage.MEETING__PRESENTATIONS:
        return getPresentations();
      case DbDslPackage.MEETING__PARTICIPANTS:
        return getParticipants();
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
      case DbDslPackage.MEETING__DATE:
        setDate((String)newValue);
        return;
      case DbDslPackage.MEETING__PRESENTATIONS:
        getPresentations().clear();
        getPresentations().addAll((Collection<? extends Presentation>)newValue);
        return;
      case DbDslPackage.MEETING__PARTICIPANTS:
        getParticipants().clear();
        getParticipants().addAll((Collection<? extends Person>)newValue);
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
      case DbDslPackage.MEETING__DATE:
        setDate(DATE_EDEFAULT);
        return;
      case DbDslPackage.MEETING__PRESENTATIONS:
        getPresentations().clear();
        return;
      case DbDslPackage.MEETING__PARTICIPANTS:
        getParticipants().clear();
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
      case DbDslPackage.MEETING__DATE:
        return DATE_EDEFAULT == null ? date != null : !DATE_EDEFAULT.equals(date);
      case DbDslPackage.MEETING__PRESENTATIONS:
        return presentations != null && !presentations.isEmpty();
      case DbDslPackage.MEETING__PARTICIPANTS:
        return participants != null && !participants.isEmpty();
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
    result.append(" (date: ");
    result.append(date);
    result.append(')');
    return result.toString();
  }

} //MeetingImpl
