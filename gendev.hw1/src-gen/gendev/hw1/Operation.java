/**
 */
package gendev.hw1;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gendev.hw1.Operation#getOperationId <em>Operation Id</em>}</li>
 *   <li>{@link gendev.hw1.Operation#getPerformedBy <em>Performed By</em>}</li>
 *   <li>{@link gendev.hw1.Operation#getAssistedBy <em>Assisted By</em>}</li>
 * </ul>
 *
 * @see gendev.hw1.Hw1Package#getOperation()
 * @model
 * @generated
 */
public interface Operation extends MedicalService {
	/**
	 * Returns the value of the '<em><b>Operation Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation Id</em>' attribute.
	 * @see #setOperationId(int)
	 * @see gendev.hw1.Hw1Package#getOperation_OperationId()
	 * @model required="true"
	 * @generated
	 */
	int getOperationId();

	/**
	 * Sets the value of the '{@link gendev.hw1.Operation#getOperationId <em>Operation Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation Id</em>' attribute.
	 * @see #getOperationId()
	 * @generated
	 */
	void setOperationId(int value);

	/**
	 * Returns the value of the '<em><b>Performed By</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link gendev.hw1.Doctor#getPerforms <em>Performs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Performed By</em>' container reference.
	 * @see #setPerformedBy(Doctor)
	 * @see gendev.hw1.Hw1Package#getOperation_PerformedBy()
	 * @see gendev.hw1.Doctor#getPerforms
	 * @model opposite="performs" required="true" transient="false"
	 * @generated
	 */
	Doctor getPerformedBy();

	/**
	 * Sets the value of the '{@link gendev.hw1.Operation#getPerformedBy <em>Performed By</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Performed By</em>' container reference.
	 * @see #getPerformedBy()
	 * @generated
	 */
	void setPerformedBy(Doctor value);

	/**
	 * Returns the value of the '<em><b>Assisted By</b></em>' containment reference list.
	 * The list contents are of type {@link gendev.hw1.Nurse}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assisted By</em>' containment reference list.
	 * @see gendev.hw1.Hw1Package#getOperation_AssistedBy()
	 * @model containment="true" required="true" upper="3"
	 * @generated
	 */
	EList<Nurse> getAssistedBy();

} // Operation
