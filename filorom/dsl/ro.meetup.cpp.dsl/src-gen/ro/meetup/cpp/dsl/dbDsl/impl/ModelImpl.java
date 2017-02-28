/**
 */
package ro.meetup.cpp.dsl.dbDsl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import ro.meetup.cpp.dsl.dbDsl.DbDslPackage;
import ro.meetup.cpp.dsl.dbDsl.Meeting;
import ro.meetup.cpp.dsl.dbDsl.Model;
import ro.meetup.cpp.dsl.dbDsl.Person;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ro.meetup.cpp.dsl.dbDsl.impl.ModelImpl#getPersons <em>Persons</em>}</li>
 *   <li>{@link ro.meetup.cpp.dsl.dbDsl.impl.ModelImpl#getMeetings <em>Meetings</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModelImpl extends MinimalEObjectImpl.Container implements Model
{
  /**
   * The cached value of the '{@link #getPersons() <em>Persons</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPersons()
   * @generated
   * @ordered
   */
  protected EList<Person> persons;

  /**
   * The cached value of the '{@link #getMeetings() <em>Meetings</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMeetings()
   * @generated
   * @ordered
   */
  protected EList<Meeting> meetings;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ModelImpl()
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
    return DbDslPackage.Literals.MODEL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Person> getPersons()
  {
    if (persons == null)
    {
      persons = new EObjectContainmentEList<Person>(Person.class, this, DbDslPackage.MODEL__PERSONS);
    }
    return persons;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Meeting> getMeetings()
  {
    if (meetings == null)
    {
      meetings = new EObjectContainmentEList<Meeting>(Meeting.class, this, DbDslPackage.MODEL__MEETINGS);
    }
    return meetings;
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
      case DbDslPackage.MODEL__PERSONS:
        return ((InternalEList<?>)getPersons()).basicRemove(otherEnd, msgs);
      case DbDslPackage.MODEL__MEETINGS:
        return ((InternalEList<?>)getMeetings()).basicRemove(otherEnd, msgs);
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
      case DbDslPackage.MODEL__PERSONS:
        return getPersons();
      case DbDslPackage.MODEL__MEETINGS:
        return getMeetings();
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
      case DbDslPackage.MODEL__PERSONS:
        getPersons().clear();
        getPersons().addAll((Collection<? extends Person>)newValue);
        return;
      case DbDslPackage.MODEL__MEETINGS:
        getMeetings().clear();
        getMeetings().addAll((Collection<? extends Meeting>)newValue);
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
      case DbDslPackage.MODEL__PERSONS:
        getPersons().clear();
        return;
      case DbDslPackage.MODEL__MEETINGS:
        getMeetings().clear();
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
      case DbDslPackage.MODEL__PERSONS:
        return persons != null && !persons.isEmpty();
      case DbDslPackage.MODEL__MEETINGS:
        return meetings != null && !meetings.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ModelImpl
