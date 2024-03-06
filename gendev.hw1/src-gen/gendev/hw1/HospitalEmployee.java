/**
 */
package gendev.hw1;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hospital Employee</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gendev.hw1.HospitalEmployee#getEmployeeId <em>Employee Id</em>}</li>
 *   <li>{@link gendev.hw1.HospitalEmployee#getSalary <em>Salary</em>}</li>
 * </ul>
 *
 * @see gendev.hw1.Hw1Package#getHospitalEmployee()
 * @model abstract="true"
 * @generated
 */
public interface HospitalEmployee extends Person {
	/**
	 * Returns the value of the '<em><b>Employee Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Employee Id</em>' attribute.
	 * @see #setEmployeeId(int)
	 * @see gendev.hw1.Hw1Package#getHospitalEmployee_EmployeeId()
	 * @model id="true" required="true"
	 * @generated
	 */
	int getEmployeeId();

	/**
	 * Sets the value of the '{@link gendev.hw1.HospitalEmployee#getEmployeeId <em>Employee Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Employee Id</em>' attribute.
	 * @see #getEmployeeId()
	 * @generated
	 */
	void setEmployeeId(int value);

	/**
	 * Returns the value of the '<em><b>Salary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Salary</em>' attribute.
	 * @see #setSalary(float)
	 * @see gendev.hw1.Hw1Package#getHospitalEmployee_Salary()
	 * @model required="true"
	 * @generated
	 */
	float getSalary();

	/**
	 * Sets the value of the '{@link gendev.hw1.HospitalEmployee#getSalary <em>Salary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Salary</em>' attribute.
	 * @see #getSalary()
	 * @generated
	 */
	void setSalary(float value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getEmployeeType();

} // HospitalEmployee
