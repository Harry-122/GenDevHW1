/**
 */
package gendev.hw1;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Lab Test</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gendev.hw1.LabTest#getTestId <em>Test Id</em>}</li>
 *   <li>{@link gendev.hw1.LabTest#getConductedBy <em>Conducted By</em>}</li>
 * </ul>
 *
 * @see gendev.hw1.Hw1Package#getLabTest()
 * @model
 * @generated
 */
public interface LabTest extends MedicalService {
	/**
	 * Returns the value of the '<em><b>Test Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Id</em>' attribute.
	 * @see #setTestId(int)
	 * @see gendev.hw1.Hw1Package#getLabTest_TestId()
	 * @model required="true"
	 * @generated
	 */
	int getTestId();

	/**
	 * Sets the value of the '{@link gendev.hw1.LabTest#getTestId <em>Test Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Test Id</em>' attribute.
	 * @see #getTestId()
	 * @generated
	 */
	void setTestId(int value);

	/**
	 * Returns the value of the '<em><b>Conducted By</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link gendev.hw1.Nurse#getConducts <em>Conducts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conducted By</em>' container reference.
	 * @see #setConductedBy(Nurse)
	 * @see gendev.hw1.Hw1Package#getLabTest_ConductedBy()
	 * @see gendev.hw1.Nurse#getConducts
	 * @model opposite="conducts" required="true" transient="false"
	 * @generated
	 */
	Nurse getConductedBy();

	/**
	 * Sets the value of the '{@link gendev.hw1.LabTest#getConductedBy <em>Conducted By</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conducted By</em>' container reference.
	 * @see #getConductedBy()
	 * @generated
	 */
	void setConductedBy(Nurse value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 * @generated
	 */
	boolean conductLabTest(Nurse nurse);

} // LabTest
