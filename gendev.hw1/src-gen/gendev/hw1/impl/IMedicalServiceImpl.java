/**
 */
package gendev.hw1.impl;

import gendev.hw1.Hw1Package;
import gendev.hw1.IMedicalService;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>IMedical Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class IMedicalServiceImpl extends MinimalEObjectImpl.Container implements IMedicalService {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IMedicalServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Hw1Package.Literals.IMEDICAL_SERVICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float calculateBill() {
		throw new UnsupportedOperationException(); // FIXME Unimplemented http://www.example.org/hw1!IMedicalService!calculateBill()
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case Hw1Package.IMEDICAL_SERVICE___CALCULATE_BILL:
			return calculateBill();
		}
		return super.eInvoke(operationID, arguments);
	}

} //IMedicalServiceImpl
