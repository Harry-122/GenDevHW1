/**
 */
package gendev.hw1.impl;

import gendev.hw1.HospitalEmployee;
import gendev.hw1.Hw1Package;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hospital Employee</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gendev.hw1.impl.HospitalEmployeeImpl#getEmployeeId <em>Employee Id</em>}</li>
 *   <li>{@link gendev.hw1.impl.HospitalEmployeeImpl#getSalary <em>Salary</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class HospitalEmployeeImpl extends PersonImpl implements HospitalEmployee {
	/**
	 * The default value of the '{@link #getEmployeeId() <em>Employee Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmployeeId()
	 * @generated
	 * @ordered
	 */
	protected static final int EMPLOYEE_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getEmployeeId() <em>Employee Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmployeeId()
	 * @generated
	 * @ordered
	 */
	protected int employeeId = EMPLOYEE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getSalary() <em>Salary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSalary()
	 * @generated
	 * @ordered
	 */
	protected static final float SALARY_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getSalary() <em>Salary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSalary()
	 * @generated
	 * @ordered
	 */
	protected float salary = SALARY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HospitalEmployeeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Hw1Package.Literals.HOSPITAL_EMPLOYEE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getEmployeeId() {
		return employeeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEmployeeId(int newEmployeeId) {
		int oldEmployeeId = employeeId;
		employeeId = newEmployeeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hw1Package.HOSPITAL_EMPLOYEE__EMPLOYEE_ID,
					oldEmployeeId, employeeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getSalary() {
		return salary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSalary(float newSalary) {
		float oldSalary = salary;
		salary = newSalary;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hw1Package.HOSPITAL_EMPLOYEE__SALARY, oldSalary,
					salary));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEmployeeType() {
		throw new UnsupportedOperationException(); // FIXME Unimplemented http://www.example.org/hw1!HospitalEmployee!getEmployeeType()
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Hw1Package.HOSPITAL_EMPLOYEE__EMPLOYEE_ID:
			return getEmployeeId();
		case Hw1Package.HOSPITAL_EMPLOYEE__SALARY:
			return getSalary();
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
		case Hw1Package.HOSPITAL_EMPLOYEE__EMPLOYEE_ID:
			setEmployeeId((Integer) newValue);
			return;
		case Hw1Package.HOSPITAL_EMPLOYEE__SALARY:
			setSalary((Float) newValue);
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
		case Hw1Package.HOSPITAL_EMPLOYEE__EMPLOYEE_ID:
			setEmployeeId(EMPLOYEE_ID_EDEFAULT);
			return;
		case Hw1Package.HOSPITAL_EMPLOYEE__SALARY:
			setSalary(SALARY_EDEFAULT);
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
		case Hw1Package.HOSPITAL_EMPLOYEE__EMPLOYEE_ID:
			return employeeId != EMPLOYEE_ID_EDEFAULT;
		case Hw1Package.HOSPITAL_EMPLOYEE__SALARY:
			return salary != SALARY_EDEFAULT;
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
		case Hw1Package.HOSPITAL_EMPLOYEE___GET_EMPLOYEE_TYPE:
			return getEmployeeType();
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
		result.append(" (employeeId: ");
		result.append(employeeId);
		result.append(", salary: ");
		result.append(salary);
		result.append(')');
		return result.toString();
	}

} //HospitalEmployeeImpl
