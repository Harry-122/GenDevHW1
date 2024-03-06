/**
 */
package gendev.hw1.impl;

import gendev.hw1.Doctor;
import gendev.hw1.Hw1Package;
import gendev.hw1.Nurse;
import gendev.hw1.Operation;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gendev.hw1.impl.OperationImpl#getOperationId <em>Operation Id</em>}</li>
 *   <li>{@link gendev.hw1.impl.OperationImpl#getPerformedBy <em>Performed By</em>}</li>
 *   <li>{@link gendev.hw1.impl.OperationImpl#getAssistedBy <em>Assisted By</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OperationImpl extends MedicalServiceImpl implements Operation {
	/**
	 * The default value of the '{@link #getOperationId() <em>Operation Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperationId()
	 * @generated
	 * @ordered
	 */
	protected static final int OPERATION_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getOperationId() <em>Operation Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperationId()
	 * @generated
	 * @ordered
	 */
	protected int operationId = OPERATION_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAssistedBy() <em>Assisted By</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssistedBy()
	 * @generated
	 * @ordered
	 */
	protected EList<Nurse> assistedBy;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Hw1Package.Literals.OPERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getOperationId() {
		return operationId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperationId(int newOperationId) {
		int oldOperationId = operationId;
		operationId = newOperationId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hw1Package.OPERATION__OPERATION_ID, oldOperationId,
					operationId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Doctor getPerformedBy() {
		if (eContainerFeatureID() != Hw1Package.OPERATION__PERFORMED_BY)
			return null;
		return (Doctor) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPerformedBy(Doctor newPerformedBy, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newPerformedBy, Hw1Package.OPERATION__PERFORMED_BY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPerformedBy(Doctor newPerformedBy) {
		if (newPerformedBy != eInternalContainer()
				|| (eContainerFeatureID() != Hw1Package.OPERATION__PERFORMED_BY && newPerformedBy != null)) {
			if (EcoreUtil.isAncestor(this, newPerformedBy))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newPerformedBy != null)
				msgs = ((InternalEObject) newPerformedBy).eInverseAdd(this, Hw1Package.DOCTOR__PERFORMS, Doctor.class,
						msgs);
			msgs = basicSetPerformedBy(newPerformedBy, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hw1Package.OPERATION__PERFORMED_BY, newPerformedBy,
					newPerformedBy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Nurse> getAssistedBy() {
		if (assistedBy == null) {
			assistedBy = new EObjectContainmentEList<Nurse>(Nurse.class, this, Hw1Package.OPERATION__ASSISTED_BY);
		}
		return assistedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Hw1Package.OPERATION__PERFORMED_BY:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetPerformedBy((Doctor) otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Hw1Package.OPERATION__PERFORMED_BY:
			return basicSetPerformedBy(null, msgs);
		case Hw1Package.OPERATION__ASSISTED_BY:
			return ((InternalEList<?>) getAssistedBy()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
		case Hw1Package.OPERATION__PERFORMED_BY:
			return eInternalContainer().eInverseRemove(this, Hw1Package.DOCTOR__PERFORMS, Doctor.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Hw1Package.OPERATION__OPERATION_ID:
			return getOperationId();
		case Hw1Package.OPERATION__PERFORMED_BY:
			return getPerformedBy();
		case Hw1Package.OPERATION__ASSISTED_BY:
			return getAssistedBy();
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
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case Hw1Package.OPERATION__OPERATION_ID:
			setOperationId((Integer) newValue);
			return;
		case Hw1Package.OPERATION__PERFORMED_BY:
			setPerformedBy((Doctor) newValue);
			return;
		case Hw1Package.OPERATION__ASSISTED_BY:
			getAssistedBy().clear();
			getAssistedBy().addAll((Collection<? extends Nurse>) newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
		case Hw1Package.OPERATION__OPERATION_ID:
			setOperationId(OPERATION_ID_EDEFAULT);
			return;
		case Hw1Package.OPERATION__PERFORMED_BY:
			setPerformedBy((Doctor) null);
			return;
		case Hw1Package.OPERATION__ASSISTED_BY:
			getAssistedBy().clear();
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case Hw1Package.OPERATION__OPERATION_ID:
			return operationId != OPERATION_ID_EDEFAULT;
		case Hw1Package.OPERATION__PERFORMED_BY:
			return getPerformedBy() != null;
		case Hw1Package.OPERATION__ASSISTED_BY:
			return assistedBy != null && !assistedBy.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (operationId: ");
		result.append(operationId);
		result.append(')');
		return result.toString();
	}

} //OperationImpl
