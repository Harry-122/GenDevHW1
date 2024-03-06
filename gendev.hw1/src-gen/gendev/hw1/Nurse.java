/**
 */
package gendev.hw1;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Nurse</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gendev.hw1.Nurse#getConducts <em>Conducts</em>}</li>
 *   <li>{@link gendev.hw1.Nurse#getAssistsIn <em>Assists In</em>}</li>
 * </ul>
 *
 * @see gendev.hw1.Hw1Package#getNurse()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='inv3_LabTestAssociation'"
 * @generated
 */
public interface Nurse extends HospitalEmployee {
	/**
	 * Returns the value of the '<em><b>Assists In</b></em>' reference list.
	 * The list contents are of type {@link gendev.hw1.Operation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assists In</em>' reference list.
	 * @see gendev.hw1.Hw1Package#getNurse_AssistsIn()
	 * @model
	 * @generated
	 */
	EList<Operation> getAssistsIn();

	/**
	 * Returns the value of the '<em><b>Conducts</b></em>' containment reference list.
	 * The list contents are of type {@link gendev.hw1.LabTest}.
	 * It is bidirectional and its opposite is '{@link gendev.hw1.LabTest#getConductedBy <em>Conducted By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conducts</em>' containment reference list.
	 * @see gendev.hw1.Hw1Package#getNurse_Conducts()
	 * @see gendev.hw1.LabTest#getConductedBy
	 * @model opposite="conductedBy" containment="true"
	 * @generated
	 */
	EList<LabTest> getConducts();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 * @generated
	 */
	boolean performLabTest(LabTest test);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 * @generated
	 */
	boolean assistDoctor(Operation operation);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n\t\t\tif self.conducts-&gt;notEmpty() then\n\t\t\t\tself.conducts-&gt;exists(test | test.conductedBy = self and test.testId &gt; 0)\n\t\t\telse true\n\t\t\tendif'"
	 * @generated
	 */
	boolean inv3_LabTestAssociation(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Nurse
