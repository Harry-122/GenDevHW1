/**
 */
package gendev.hw1.impl;

import gendev.hw1.Hw1Package;
import gendev.hw1.LabTest;
import gendev.hw1.Nurse;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Lab Test</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gendev.hw1.impl.LabTestImpl#getTestId <em>Test Id</em>}</li>
 *   <li>{@link gendev.hw1.impl.LabTestImpl#getConductedBy <em>Conducted By</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LabTestImpl extends MedicalServiceImpl implements LabTest {
	/**
	 * The default value of the '{@link #getTestId() <em>Test Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestId()
	 * @generated
	 * @ordered
	 */
	protected static final int TEST_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTestId() <em>Test Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestId()
	 * @generated
	 * @ordered
	 */
	protected int testId = TEST_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LabTestImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Hw1Package.Literals.LAB_TEST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTestId() {
		return testId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTestId(int newTestId) {
		int oldTestId = testId;
		testId = newTestId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hw1Package.LAB_TEST__TEST_ID, oldTestId, testId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Nurse getConductedBy() {
		if (eContainerFeatureID() != Hw1Package.LAB_TEST__CONDUCTED_BY)
			return null;
		return (Nurse) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConductedBy(Nurse newConductedBy, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newConductedBy, Hw1Package.LAB_TEST__CONDUCTED_BY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConductedBy(Nurse newConductedBy) {
		if (newConductedBy != eInternalContainer()
				|| (eContainerFeatureID() != Hw1Package.LAB_TEST__CONDUCTED_BY && newConductedBy != null)) {
			if (EcoreUtil.isAncestor(this, newConductedBy))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newConductedBy != null)
				msgs = ((InternalEObject) newConductedBy).eInverseAdd(this, Hw1Package.NURSE__CONDUCTS, Nurse.class,
						msgs);
			msgs = basicSetConductedBy(newConductedBy, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hw1Package.LAB_TEST__CONDUCTED_BY, newConductedBy,
					newConductedBy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean conductLabTest(final Nurse nurse) {
		throw new UnsupportedOperationException(); // FIXME Unimplemented http://www.example.org/hw1!LabTest!conductLabTest(http://www.example.org/hw1!Nurse)
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Hw1Package.LAB_TEST__CONDUCTED_BY:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetConductedBy((Nurse) otherEnd, msgs);
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
		case Hw1Package.LAB_TEST__CONDUCTED_BY:
			return basicSetConductedBy(null, msgs);
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
		case Hw1Package.LAB_TEST__CONDUCTED_BY:
			return eInternalContainer().eInverseRemove(this, Hw1Package.NURSE__CONDUCTS, Nurse.class, msgs);
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
		case Hw1Package.LAB_TEST__TEST_ID:
			return getTestId();
		case Hw1Package.LAB_TEST__CONDUCTED_BY:
			return getConductedBy();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case Hw1Package.LAB_TEST__TEST_ID:
			setTestId((Integer) newValue);
			return;
		case Hw1Package.LAB_TEST__CONDUCTED_BY:
			setConductedBy((Nurse) newValue);
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
		case Hw1Package.LAB_TEST__TEST_ID:
			setTestId(TEST_ID_EDEFAULT);
			return;
		case Hw1Package.LAB_TEST__CONDUCTED_BY:
			setConductedBy((Nurse) null);
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
		case Hw1Package.LAB_TEST__TEST_ID:
			return testId != TEST_ID_EDEFAULT;
		case Hw1Package.LAB_TEST__CONDUCTED_BY:
			return getConductedBy() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case Hw1Package.LAB_TEST___CONDUCT_LAB_TEST__NURSE:
			return conductLabTest((Nurse) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (testId: ");
		result.append(testId);
		result.append(')');
		return result.toString();
	}

} //LabTestImpl
