/**
 */
package gendev.hw1;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Doctor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gendev.hw1.Doctor#getSpecialization <em>Specialization</em>}</li>
 *   <li>{@link gendev.hw1.Doctor#getPerforms <em>Performs</em>}</li>
 * </ul>
 *
 * @see gendev.hw1.Hw1Package#getDoctor()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='inv2_DoctorMustBeAssistedByNurse'"
 * @generated
 */
public interface Doctor extends HospitalEmployee {
	/**
	 * Returns the value of the '<em><b>Specialization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specialization</em>' attribute.
	 * @see #setSpecialization(String)
	 * @see gendev.hw1.Hw1Package#getDoctor_Specialization()
	 * @model
	 * @generated
	 */
	String getSpecialization();

	/**
	 * Sets the value of the '{@link gendev.hw1.Doctor#getSpecialization <em>Specialization</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specialization</em>' attribute.
	 * @see #getSpecialization()
	 * @generated
	 */
	void setSpecialization(String value);

	/**
	 * Returns the value of the '<em><b>Performs</b></em>' containment reference list.
	 * The list contents are of type {@link gendev.hw1.Operation}.
	 * It is bidirectional and its opposite is '{@link gendev.hw1.Operation#getPerformedBy <em>Performed By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Performs</em>' containment reference list.
	 * @see gendev.hw1.Hw1Package#getDoctor_Performs()
	 * @see gendev.hw1.Operation#getPerformedBy
	 * @model opposite="performedBy" containment="true"
	 * @generated
	 */
	EList<Operation> getPerforms();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 * @generated
	 */
	boolean performOperation(Nurse nurse);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void prescribeMedicine(Patient patient);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n\t\t\tself.performs-&gt;forAll(op | op.performedBy = self and op.assistedBy-&gt;size() &gt; 0 and op.assistedBy-&gt;size() &lt; 4)'"
	 * @generated
	 */
	boolean inv2_DoctorMustBeAssistedByNurse(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Doctor
