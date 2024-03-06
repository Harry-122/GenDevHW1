/**
 */
package gendev.hw1;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Receptionist</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gendev.hw1.Receptionist#getIssues <em>Issues</em>}</li>
 * </ul>
 *
 * @see gendev.hw1.Hw1Package#getReceptionist()
 * @model
 * @generated
 */
public interface Receptionist extends HospitalEmployee {
	/**
	 * Returns the value of the '<em><b>Issues</b></em>' reference list.
	 * The list contents are of type {@link gendev.hw1.Billing}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Issues</em>' reference list.
	 * @see gendev.hw1.Hw1Package#getReceptionist_Issues()
	 * @model
	 * @generated
	 */
	EList<Billing> getIssues();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Billing initiateBill(MedicalService service);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean allotBedToPatient(Patient patient);

} // Receptionist
