/**
 */
package gendev.hw1;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Patient</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gendev.hw1.Patient#getMedicalHistory <em>Medical History</em>}</li>
 *   <li>{@link gendev.hw1.Patient#getScheduledFor <em>Scheduled For</em>}</li>
 *   <li>{@link gendev.hw1.Patient#getIssuedFor <em>Issued For</em>}</li>
 *   <li>{@link gendev.hw1.Patient#getPatientId <em>Patient Id</em>}</li>
 *   <li>{@link gendev.hw1.Patient#getBooked <em>Booked</em>}</li>
 *   <li>{@link gendev.hw1.Patient#getGoingThrough <em>Going Through</em>}</li>
 * </ul>
 *
 * @see gendev.hw1.Hw1Package#getPatient()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='inv1_AllBillsMustHaveReceptionist'"
 * @generated
 */
public interface Patient extends Person {
	/**
	 * Returns the value of the '<em><b>Medical History</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Medical History</em>' attribute.
	 * @see #setMedicalHistory(String)
	 * @see gendev.hw1.Hw1Package#getPatient_MedicalHistory()
	 * @model
	 * @generated
	 */
	String getMedicalHistory();

	/**
	 * Sets the value of the '{@link gendev.hw1.Patient#getMedicalHistory <em>Medical History</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Medical History</em>' attribute.
	 * @see #getMedicalHistory()
	 * @generated
	 */
	void setMedicalHistory(String value);

	/**
	 * Returns the value of the '<em><b>Scheduled For</b></em>' containment reference list.
	 * The list contents are of type {@link gendev.hw1.Appointment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scheduled For</em>' containment reference list.
	 * @see gendev.hw1.Hw1Package#getPatient_ScheduledFor()
	 * @model containment="true"
	 * @generated
	 */
	EList<Appointment> getScheduledFor();

	/**
	 * Returns the value of the '<em><b>Issued For</b></em>' containment reference list.
	 * The list contents are of type {@link gendev.hw1.Billing}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Issued For</em>' containment reference list.
	 * @see gendev.hw1.Hw1Package#getPatient_IssuedFor()
	 * @model containment="true"
	 * @generated
	 */
	EList<Billing> getIssuedFor();

	/**
	 * Returns the value of the '<em><b>Booked</b></em>' reference list.
	 * The list contents are of type {@link gendev.hw1.LabTest}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Booked</em>' reference list.
	 * @see gendev.hw1.Hw1Package#getPatient_Booked()
	 * @model
	 * @generated
	 */
	EList<LabTest> getBooked();

	/**
	 * Returns the value of the '<em><b>Going Through</b></em>' reference list.
	 * The list contents are of type {@link gendev.hw1.Operation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Going Through</em>' reference list.
	 * @see gendev.hw1.Hw1Package#getPatient_GoingThrough()
	 * @model
	 * @generated
	 */
	EList<Operation> getGoingThrough();

	/**
	 * Returns the value of the '<em><b>Patient Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Patient Id</em>' attribute.
	 * @see #setPatientId(int)
	 * @see gendev.hw1.Hw1Package#getPatient_PatientId()
	 * @model id="true" required="true"
	 * @generated
	 */
	int getPatientId();

	/**
	 * Sets the value of the '{@link gendev.hw1.Patient#getPatientId <em>Patient Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Patient Id</em>' attribute.
	 * @see #getPatientId()
	 * @generated
	 */
	void setPatientId(int value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String viewMedicalHistory();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void bookAppointment();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void requestLabTest();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model amountRequired="true"
	 * @generated
	 */
	void payBill(float amount);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n\t\t\tself.issuedFor-&gt;forAll(bill | bill.issuedBy.oclIsTypeOf(Receptionist) and bill.issuedBy-&gt;size() = 1)'"
	 * @generated
	 */
	boolean inv1_AllBillsMustHaveReceptionist(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Patient
