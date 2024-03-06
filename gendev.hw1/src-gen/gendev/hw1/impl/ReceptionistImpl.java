/**
 */
package gendev.hw1.impl;

import gendev.hw1.Billing;
import gendev.hw1.Hw1Package;
import gendev.hw1.MedicalService;
import gendev.hw1.Patient;
import gendev.hw1.Receptionist;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Receptionist</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gendev.hw1.impl.ReceptionistImpl#getIssues <em>Issues</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReceptionistImpl extends HospitalEmployeeImpl implements Receptionist {
	/**
	 * The cached value of the '{@link #getIssues() <em>Issues</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIssues()
	 * @generated
	 * @ordered
	 */
	protected EList<Billing> issues;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReceptionistImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Hw1Package.Literals.RECEPTIONIST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Billing> getIssues() {
		if (issues == null) {
			issues = new EObjectResolvingEList<Billing>(Billing.class, this, Hw1Package.RECEPTIONIST__ISSUES);
		}
		return issues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Billing initiateBill(final MedicalService service) {
		throw new UnsupportedOperationException(); // FIXME Unimplemented http://www.example.org/hw1!Receptionist!initiateBill(http://www.example.org/hw1!MedicalService)
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean allotBedToPatient(final Patient patient) {
		throw new UnsupportedOperationException(); // FIXME Unimplemented http://www.example.org/hw1!Receptionist!allotBedToPatient(http://www.example.org/hw1!Patient)
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Hw1Package.RECEPTIONIST__ISSUES:
			return getIssues();
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
		case Hw1Package.RECEPTIONIST__ISSUES:
			getIssues().clear();
			getIssues().addAll((Collection<? extends Billing>) newValue);
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
		case Hw1Package.RECEPTIONIST__ISSUES:
			getIssues().clear();
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
		case Hw1Package.RECEPTIONIST__ISSUES:
			return issues != null && !issues.isEmpty();
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
		case Hw1Package.RECEPTIONIST___INITIATE_BILL__MEDICALSERVICE:
			return initiateBill((MedicalService) arguments.get(0));
		case Hw1Package.RECEPTIONIST___ALLOT_BED_TO_PATIENT__PATIENT:
			return allotBedToPatient((Patient) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //ReceptionistImpl
