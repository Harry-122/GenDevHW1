/**
 */
package gendev.hw1;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see gendev.hw1.Hw1Factory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore"
 * @generated
 */
public interface Hw1Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "hw1";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/hw1";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "hw1";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Hw1Package eINSTANCE = gendev.hw1.impl.Hw1PackageImpl.init();

	/**
	 * The meta object id for the '{@link gendev.hw1.impl.PersonImpl <em>Person</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gendev.hw1.impl.PersonImpl
	 * @see gendev.hw1.impl.Hw1PackageImpl#getPerson()
	 * @generated
	 */
	int PERSON = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__NAME = 0;

	/**
	 * The feature id for the '<em><b>Age</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__AGE = 1;

	/**
	 * The feature id for the '<em><b>Person Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__PERSON_ID = 2;

	/**
	 * The number of structural features of the '<em>Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gendev.hw1.impl.PatientImpl <em>Patient</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gendev.hw1.impl.PatientImpl
	 * @see gendev.hw1.impl.Hw1PackageImpl#getPatient()
	 * @generated
	 */
	int PATIENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT__NAME = PERSON__NAME;

	/**
	 * The feature id for the '<em><b>Age</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT__AGE = PERSON__AGE;

	/**
	 * The feature id for the '<em><b>Person Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT__PERSON_ID = PERSON__PERSON_ID;

	/**
	 * The feature id for the '<em><b>Medical History</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT__MEDICAL_HISTORY = PERSON_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Scheduled For</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT__SCHEDULED_FOR = PERSON_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Issued For</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT__ISSUED_FOR = PERSON_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Patient Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT__PATIENT_ID = PERSON_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Booked</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT__BOOKED = PERSON_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Going Through</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT__GOING_THROUGH = PERSON_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Patient</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_FEATURE_COUNT = PERSON_FEATURE_COUNT + 6;

	/**
	 * The operation id for the '<em>View Medical History</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT___VIEW_MEDICAL_HISTORY = PERSON_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Book Appointment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT___BOOK_APPOINTMENT = PERSON_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Request Lab Test</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT___REQUEST_LAB_TEST = PERSON_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Pay Bill</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT___PAY_BILL__FLOAT = PERSON_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Inv1 All Bills Must Have Receptionist</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT___INV1_ALL_BILLS_MUST_HAVE_RECEPTIONIST__DIAGNOSTICCHAIN_MAP = PERSON_OPERATION_COUNT + 4;

	/**
	 * The number of operations of the '<em>Patient</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_OPERATION_COUNT = PERSON_OPERATION_COUNT + 5;

	/**
	 * The meta object id for the '{@link gendev.hw1.impl.HospitalEmployeeImpl <em>Hospital Employee</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gendev.hw1.impl.HospitalEmployeeImpl
	 * @see gendev.hw1.impl.Hw1PackageImpl#getHospitalEmployee()
	 * @generated
	 */
	int HOSPITAL_EMPLOYEE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSPITAL_EMPLOYEE__NAME = PERSON__NAME;

	/**
	 * The feature id for the '<em><b>Age</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSPITAL_EMPLOYEE__AGE = PERSON__AGE;

	/**
	 * The feature id for the '<em><b>Person Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSPITAL_EMPLOYEE__PERSON_ID = PERSON__PERSON_ID;

	/**
	 * The feature id for the '<em><b>Employee Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSPITAL_EMPLOYEE__EMPLOYEE_ID = PERSON_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Salary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSPITAL_EMPLOYEE__SALARY = PERSON_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Hospital Employee</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSPITAL_EMPLOYEE_FEATURE_COUNT = PERSON_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Employee Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSPITAL_EMPLOYEE___GET_EMPLOYEE_TYPE = PERSON_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Hospital Employee</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSPITAL_EMPLOYEE_OPERATION_COUNT = PERSON_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link gendev.hw1.impl.AppointmentImpl <em>Appointment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gendev.hw1.impl.AppointmentImpl
	 * @see gendev.hw1.impl.Hw1PackageImpl#getAppointment()
	 * @generated
	 */
	int APPOINTMENT = 3;

	/**
	 * The feature id for the '<em><b>Appointment Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPOINTMENT__APPOINTMENT_ID = 0;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPOINTMENT__DATE = 1;

	/**
	 * The feature id for the '<em><b>Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPOINTMENT__START_TIME = 2;

	/**
	 * The feature id for the '<em><b>End Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPOINTMENT__END_TIME = 3;

	/**
	 * The number of structural features of the '<em>Appointment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPOINTMENT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Appointment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPOINTMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gendev.hw1.impl.DoctorImpl <em>Doctor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gendev.hw1.impl.DoctorImpl
	 * @see gendev.hw1.impl.Hw1PackageImpl#getDoctor()
	 * @generated
	 */
	int DOCTOR = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCTOR__NAME = HOSPITAL_EMPLOYEE__NAME;

	/**
	 * The feature id for the '<em><b>Age</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCTOR__AGE = HOSPITAL_EMPLOYEE__AGE;

	/**
	 * The feature id for the '<em><b>Person Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCTOR__PERSON_ID = HOSPITAL_EMPLOYEE__PERSON_ID;

	/**
	 * The feature id for the '<em><b>Employee Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCTOR__EMPLOYEE_ID = HOSPITAL_EMPLOYEE__EMPLOYEE_ID;

	/**
	 * The feature id for the '<em><b>Salary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCTOR__SALARY = HOSPITAL_EMPLOYEE__SALARY;

	/**
	 * The feature id for the '<em><b>Specialization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCTOR__SPECIALIZATION = HOSPITAL_EMPLOYEE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Performs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCTOR__PERFORMS = HOSPITAL_EMPLOYEE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Doctor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCTOR_FEATURE_COUNT = HOSPITAL_EMPLOYEE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Employee Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCTOR___GET_EMPLOYEE_TYPE = HOSPITAL_EMPLOYEE___GET_EMPLOYEE_TYPE;

	/**
	 * The operation id for the '<em>Perform Operation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCTOR___PERFORM_OPERATION__NURSE = HOSPITAL_EMPLOYEE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Prescribe Medicine</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCTOR___PRESCRIBE_MEDICINE__PATIENT = HOSPITAL_EMPLOYEE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Inv2 Doctor Must Be Assisted By Nurse</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCTOR___INV2_DOCTOR_MUST_BE_ASSISTED_BY_NURSE__DIAGNOSTICCHAIN_MAP = HOSPITAL_EMPLOYEE_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>Doctor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCTOR_OPERATION_COUNT = HOSPITAL_EMPLOYEE_OPERATION_COUNT + 3;

	/**
	 * The meta object id for the '{@link gendev.hw1.impl.ReceptionistImpl <em>Receptionist</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gendev.hw1.impl.ReceptionistImpl
	 * @see gendev.hw1.impl.Hw1PackageImpl#getReceptionist()
	 * @generated
	 */
	int RECEPTIONIST = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEPTIONIST__NAME = HOSPITAL_EMPLOYEE__NAME;

	/**
	 * The feature id for the '<em><b>Age</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEPTIONIST__AGE = HOSPITAL_EMPLOYEE__AGE;

	/**
	 * The feature id for the '<em><b>Person Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEPTIONIST__PERSON_ID = HOSPITAL_EMPLOYEE__PERSON_ID;

	/**
	 * The feature id for the '<em><b>Employee Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEPTIONIST__EMPLOYEE_ID = HOSPITAL_EMPLOYEE__EMPLOYEE_ID;

	/**
	 * The feature id for the '<em><b>Salary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEPTIONIST__SALARY = HOSPITAL_EMPLOYEE__SALARY;

	/**
	 * The feature id for the '<em><b>Issues</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEPTIONIST__ISSUES = HOSPITAL_EMPLOYEE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Receptionist</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEPTIONIST_FEATURE_COUNT = HOSPITAL_EMPLOYEE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Employee Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEPTIONIST___GET_EMPLOYEE_TYPE = HOSPITAL_EMPLOYEE___GET_EMPLOYEE_TYPE;

	/**
	 * The operation id for the '<em>Initiate Bill</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEPTIONIST___INITIATE_BILL__MEDICALSERVICE = HOSPITAL_EMPLOYEE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Allot Bed To Patient</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEPTIONIST___ALLOT_BED_TO_PATIENT__PATIENT = HOSPITAL_EMPLOYEE_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Receptionist</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEPTIONIST_OPERATION_COUNT = HOSPITAL_EMPLOYEE_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link gendev.hw1.impl.NurseImpl <em>Nurse</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gendev.hw1.impl.NurseImpl
	 * @see gendev.hw1.impl.Hw1PackageImpl#getNurse()
	 * @generated
	 */
	int NURSE = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NURSE__NAME = HOSPITAL_EMPLOYEE__NAME;

	/**
	 * The feature id for the '<em><b>Age</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NURSE__AGE = HOSPITAL_EMPLOYEE__AGE;

	/**
	 * The feature id for the '<em><b>Person Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NURSE__PERSON_ID = HOSPITAL_EMPLOYEE__PERSON_ID;

	/**
	 * The feature id for the '<em><b>Employee Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NURSE__EMPLOYEE_ID = HOSPITAL_EMPLOYEE__EMPLOYEE_ID;

	/**
	 * The feature id for the '<em><b>Salary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NURSE__SALARY = HOSPITAL_EMPLOYEE__SALARY;

	/**
	 * The feature id for the '<em><b>Conducts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NURSE__CONDUCTS = HOSPITAL_EMPLOYEE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Assists In</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NURSE__ASSISTS_IN = HOSPITAL_EMPLOYEE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Nurse</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NURSE_FEATURE_COUNT = HOSPITAL_EMPLOYEE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Employee Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NURSE___GET_EMPLOYEE_TYPE = HOSPITAL_EMPLOYEE___GET_EMPLOYEE_TYPE;

	/**
	 * The operation id for the '<em>Perform Lab Test</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NURSE___PERFORM_LAB_TEST__LABTEST = HOSPITAL_EMPLOYEE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Assist Doctor</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NURSE___ASSIST_DOCTOR__OPERATION = HOSPITAL_EMPLOYEE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Inv3 Lab Test Association</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NURSE___INV3_LAB_TEST_ASSOCIATION__DIAGNOSTICCHAIN_MAP = HOSPITAL_EMPLOYEE_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>Nurse</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NURSE_OPERATION_COUNT = HOSPITAL_EMPLOYEE_OPERATION_COUNT + 3;

	/**
	 * The meta object id for the '{@link gendev.hw1.impl.BillingImpl <em>Billing</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gendev.hw1.impl.BillingImpl
	 * @see gendev.hw1.impl.Hw1PackageImpl#getBilling()
	 * @generated
	 */
	int BILLING = 7;

	/**
	 * The feature id for the '<em><b>Bill Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILLING__BILL_ID = 0;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILLING__DATE = 1;

	/**
	 * The feature id for the '<em><b>Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILLING__AMOUNT = 2;

	/**
	 * The feature id for the '<em><b>Issued By</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILLING__ISSUED_BY = 3;

	/**
	 * The number of structural features of the '<em>Billing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILLING_FEATURE_COUNT = 4;

	/**
	 * The operation id for the '<em>Generate Bill</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILLING___GENERATE_BILL = 0;

	/**
	 * The number of operations of the '<em>Billing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILLING_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link gendev.hw1.impl.IMedicalServiceImpl <em>IMedical Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gendev.hw1.impl.IMedicalServiceImpl
	 * @see gendev.hw1.impl.Hw1PackageImpl#getIMedicalService()
	 * @generated
	 */
	int IMEDICAL_SERVICE = 8;

	/**
	 * The number of structural features of the '<em>IMedical Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMEDICAL_SERVICE_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Calculate Bill</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMEDICAL_SERVICE___CALCULATE_BILL = 0;

	/**
	 * The number of operations of the '<em>IMedical Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMEDICAL_SERVICE_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link gendev.hw1.impl.MedicalServiceImpl <em>Medical Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gendev.hw1.impl.MedicalServiceImpl
	 * @see gendev.hw1.impl.Hw1PackageImpl#getMedicalService()
	 * @generated
	 */
	int MEDICAL_SERVICE = 9;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICAL_SERVICE__DATE = IMEDICAL_SERVICE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Medical Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICAL_SERVICE_FEATURE_COUNT = IMEDICAL_SERVICE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Calculate Bill</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICAL_SERVICE___CALCULATE_BILL = IMEDICAL_SERVICE___CALCULATE_BILL;

	/**
	 * The number of operations of the '<em>Medical Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICAL_SERVICE_OPERATION_COUNT = IMEDICAL_SERVICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gendev.hw1.impl.OperationImpl <em>Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gendev.hw1.impl.OperationImpl
	 * @see gendev.hw1.impl.Hw1PackageImpl#getOperation()
	 * @generated
	 */
	int OPERATION = 10;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__DATE = MEDICAL_SERVICE__DATE;

	/**
	 * The feature id for the '<em><b>Operation Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__OPERATION_ID = MEDICAL_SERVICE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Performed By</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__PERFORMED_BY = MEDICAL_SERVICE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Assisted By</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__ASSISTED_BY = MEDICAL_SERVICE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_FEATURE_COUNT = MEDICAL_SERVICE_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Calculate Bill</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION___CALCULATE_BILL = MEDICAL_SERVICE___CALCULATE_BILL;

	/**
	 * The number of operations of the '<em>Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_OPERATION_COUNT = MEDICAL_SERVICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gendev.hw1.impl.LabTestImpl <em>Lab Test</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gendev.hw1.impl.LabTestImpl
	 * @see gendev.hw1.impl.Hw1PackageImpl#getLabTest()
	 * @generated
	 */
	int LAB_TEST = 11;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAB_TEST__DATE = MEDICAL_SERVICE__DATE;

	/**
	 * The feature id for the '<em><b>Test Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAB_TEST__TEST_ID = MEDICAL_SERVICE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Conducted By</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAB_TEST__CONDUCTED_BY = MEDICAL_SERVICE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Lab Test</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAB_TEST_FEATURE_COUNT = MEDICAL_SERVICE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Calculate Bill</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAB_TEST___CALCULATE_BILL = MEDICAL_SERVICE___CALCULATE_BILL;

	/**
	 * The operation id for the '<em>Conduct Lab Test</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAB_TEST___CONDUCT_LAB_TEST__NURSE = MEDICAL_SERVICE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Lab Test</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAB_TEST_OPERATION_COUNT = MEDICAL_SERVICE_OPERATION_COUNT + 1;

	/**
	 * Returns the meta object for class '{@link gendev.hw1.Patient <em>Patient</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Patient</em>'.
	 * @see gendev.hw1.Patient
	 * @generated
	 */
	EClass getPatient();

	/**
	 * Returns the meta object for the attribute '{@link gendev.hw1.Patient#getMedicalHistory <em>Medical History</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Medical History</em>'.
	 * @see gendev.hw1.Patient#getMedicalHistory()
	 * @see #getPatient()
	 * @generated
	 */
	EAttribute getPatient_MedicalHistory();

	/**
	 * Returns the meta object for the containment reference list '{@link gendev.hw1.Patient#getScheduledFor <em>Scheduled For</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Scheduled For</em>'.
	 * @see gendev.hw1.Patient#getScheduledFor()
	 * @see #getPatient()
	 * @generated
	 */
	EReference getPatient_ScheduledFor();

	/**
	 * Returns the meta object for the containment reference list '{@link gendev.hw1.Patient#getIssuedFor <em>Issued For</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Issued For</em>'.
	 * @see gendev.hw1.Patient#getIssuedFor()
	 * @see #getPatient()
	 * @generated
	 */
	EReference getPatient_IssuedFor();

	/**
	 * Returns the meta object for the reference list '{@link gendev.hw1.Patient#getBooked <em>Booked</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Booked</em>'.
	 * @see gendev.hw1.Patient#getBooked()
	 * @see #getPatient()
	 * @generated
	 */
	EReference getPatient_Booked();

	/**
	 * Returns the meta object for the reference list '{@link gendev.hw1.Patient#getGoingThrough <em>Going Through</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Going Through</em>'.
	 * @see gendev.hw1.Patient#getGoingThrough()
	 * @see #getPatient()
	 * @generated
	 */
	EReference getPatient_GoingThrough();

	/**
	 * Returns the meta object for the attribute '{@link gendev.hw1.Patient#getPatientId <em>Patient Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Patient Id</em>'.
	 * @see gendev.hw1.Patient#getPatientId()
	 * @see #getPatient()
	 * @generated
	 */
	EAttribute getPatient_PatientId();

	/**
	 * Returns the meta object for the '{@link gendev.hw1.Patient#viewMedicalHistory() <em>View Medical History</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>View Medical History</em>' operation.
	 * @see gendev.hw1.Patient#viewMedicalHistory()
	 * @generated
	 */
	EOperation getPatient__ViewMedicalHistory();

	/**
	 * Returns the meta object for the '{@link gendev.hw1.Patient#bookAppointment() <em>Book Appointment</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Book Appointment</em>' operation.
	 * @see gendev.hw1.Patient#bookAppointment()
	 * @generated
	 */
	EOperation getPatient__BookAppointment();

	/**
	 * Returns the meta object for the '{@link gendev.hw1.Patient#requestLabTest() <em>Request Lab Test</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Request Lab Test</em>' operation.
	 * @see gendev.hw1.Patient#requestLabTest()
	 * @generated
	 */
	EOperation getPatient__RequestLabTest();

	/**
	 * Returns the meta object for the '{@link gendev.hw1.Patient#payBill(float) <em>Pay Bill</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Pay Bill</em>' operation.
	 * @see gendev.hw1.Patient#payBill(float)
	 * @generated
	 */
	EOperation getPatient__PayBill__float();

	/**
	 * Returns the meta object for the '{@link gendev.hw1.Patient#inv1_AllBillsMustHaveReceptionist(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Inv1 All Bills Must Have Receptionist</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Inv1 All Bills Must Have Receptionist</em>' operation.
	 * @see gendev.hw1.Patient#inv1_AllBillsMustHaveReceptionist(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getPatient__Inv1_AllBillsMustHaveReceptionist__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link gendev.hw1.Person <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Person</em>'.
	 * @see gendev.hw1.Person
	 * @generated
	 */
	EClass getPerson();

	/**
	 * Returns the meta object for the attribute '{@link gendev.hw1.Person#getPersonId <em>Person Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Person Id</em>'.
	 * @see gendev.hw1.Person#getPersonId()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_PersonId();

	/**
	 * Returns the meta object for the attribute '{@link gendev.hw1.Person#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see gendev.hw1.Person#getName()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_Name();

	/**
	 * Returns the meta object for the attribute '{@link gendev.hw1.Person#getAge <em>Age</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Age</em>'.
	 * @see gendev.hw1.Person#getAge()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_Age();

	/**
	 * Returns the meta object for class '{@link gendev.hw1.HospitalEmployee <em>Hospital Employee</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hospital Employee</em>'.
	 * @see gendev.hw1.HospitalEmployee
	 * @generated
	 */
	EClass getHospitalEmployee();

	/**
	 * Returns the meta object for the attribute '{@link gendev.hw1.HospitalEmployee#getEmployeeId <em>Employee Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Employee Id</em>'.
	 * @see gendev.hw1.HospitalEmployee#getEmployeeId()
	 * @see #getHospitalEmployee()
	 * @generated
	 */
	EAttribute getHospitalEmployee_EmployeeId();

	/**
	 * Returns the meta object for the attribute '{@link gendev.hw1.HospitalEmployee#getSalary <em>Salary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Salary</em>'.
	 * @see gendev.hw1.HospitalEmployee#getSalary()
	 * @see #getHospitalEmployee()
	 * @generated
	 */
	EAttribute getHospitalEmployee_Salary();

	/**
	 * Returns the meta object for the '{@link gendev.hw1.HospitalEmployee#getEmployeeType() <em>Get Employee Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Employee Type</em>' operation.
	 * @see gendev.hw1.HospitalEmployee#getEmployeeType()
	 * @generated
	 */
	EOperation getHospitalEmployee__GetEmployeeType();

	/**
	 * Returns the meta object for class '{@link gendev.hw1.Appointment <em>Appointment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Appointment</em>'.
	 * @see gendev.hw1.Appointment
	 * @generated
	 */
	EClass getAppointment();

	/**
	 * Returns the meta object for the attribute '{@link gendev.hw1.Appointment#getAppointmentId <em>Appointment Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Appointment Id</em>'.
	 * @see gendev.hw1.Appointment#getAppointmentId()
	 * @see #getAppointment()
	 * @generated
	 */
	EAttribute getAppointment_AppointmentId();

	/**
	 * Returns the meta object for the attribute '{@link gendev.hw1.Appointment#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date</em>'.
	 * @see gendev.hw1.Appointment#getDate()
	 * @see #getAppointment()
	 * @generated
	 */
	EAttribute getAppointment_Date();

	/**
	 * Returns the meta object for the attribute '{@link gendev.hw1.Appointment#getStartTime <em>Start Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Time</em>'.
	 * @see gendev.hw1.Appointment#getStartTime()
	 * @see #getAppointment()
	 * @generated
	 */
	EAttribute getAppointment_StartTime();

	/**
	 * Returns the meta object for the attribute '{@link gendev.hw1.Appointment#getEndTime <em>End Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Time</em>'.
	 * @see gendev.hw1.Appointment#getEndTime()
	 * @see #getAppointment()
	 * @generated
	 */
	EAttribute getAppointment_EndTime();

	/**
	 * Returns the meta object for class '{@link gendev.hw1.Doctor <em>Doctor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Doctor</em>'.
	 * @see gendev.hw1.Doctor
	 * @generated
	 */
	EClass getDoctor();

	/**
	 * Returns the meta object for the attribute '{@link gendev.hw1.Doctor#getSpecialization <em>Specialization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Specialization</em>'.
	 * @see gendev.hw1.Doctor#getSpecialization()
	 * @see #getDoctor()
	 * @generated
	 */
	EAttribute getDoctor_Specialization();

	/**
	 * Returns the meta object for the containment reference list '{@link gendev.hw1.Doctor#getPerforms <em>Performs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Performs</em>'.
	 * @see gendev.hw1.Doctor#getPerforms()
	 * @see #getDoctor()
	 * @generated
	 */
	EReference getDoctor_Performs();

	/**
	 * Returns the meta object for the '{@link gendev.hw1.Doctor#performOperation(gendev.hw1.Nurse) <em>Perform Operation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform Operation</em>' operation.
	 * @see gendev.hw1.Doctor#performOperation(gendev.hw1.Nurse)
	 * @generated
	 */
	EOperation getDoctor__PerformOperation__Nurse();

	/**
	 * Returns the meta object for the '{@link gendev.hw1.Doctor#prescribeMedicine(gendev.hw1.Patient) <em>Prescribe Medicine</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Prescribe Medicine</em>' operation.
	 * @see gendev.hw1.Doctor#prescribeMedicine(gendev.hw1.Patient)
	 * @generated
	 */
	EOperation getDoctor__PrescribeMedicine__Patient();

	/**
	 * Returns the meta object for the '{@link gendev.hw1.Doctor#inv2_DoctorMustBeAssistedByNurse(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Inv2 Doctor Must Be Assisted By Nurse</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Inv2 Doctor Must Be Assisted By Nurse</em>' operation.
	 * @see gendev.hw1.Doctor#inv2_DoctorMustBeAssistedByNurse(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getDoctor__Inv2_DoctorMustBeAssistedByNurse__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link gendev.hw1.Receptionist <em>Receptionist</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Receptionist</em>'.
	 * @see gendev.hw1.Receptionist
	 * @generated
	 */
	EClass getReceptionist();

	/**
	 * Returns the meta object for the reference list '{@link gendev.hw1.Receptionist#getIssues <em>Issues</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Issues</em>'.
	 * @see gendev.hw1.Receptionist#getIssues()
	 * @see #getReceptionist()
	 * @generated
	 */
	EReference getReceptionist_Issues();

	/**
	 * Returns the meta object for the '{@link gendev.hw1.Receptionist#initiateBill(gendev.hw1.MedicalService) <em>Initiate Bill</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Initiate Bill</em>' operation.
	 * @see gendev.hw1.Receptionist#initiateBill(gendev.hw1.MedicalService)
	 * @generated
	 */
	EOperation getReceptionist__InitiateBill__MedicalService();

	/**
	 * Returns the meta object for the '{@link gendev.hw1.Receptionist#allotBedToPatient(gendev.hw1.Patient) <em>Allot Bed To Patient</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Allot Bed To Patient</em>' operation.
	 * @see gendev.hw1.Receptionist#allotBedToPatient(gendev.hw1.Patient)
	 * @generated
	 */
	EOperation getReceptionist__AllotBedToPatient__Patient();

	/**
	 * Returns the meta object for class '{@link gendev.hw1.Nurse <em>Nurse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Nurse</em>'.
	 * @see gendev.hw1.Nurse
	 * @generated
	 */
	EClass getNurse();

	/**
	 * Returns the meta object for the reference list '{@link gendev.hw1.Nurse#getAssistsIn <em>Assists In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Assists In</em>'.
	 * @see gendev.hw1.Nurse#getAssistsIn()
	 * @see #getNurse()
	 * @generated
	 */
	EReference getNurse_AssistsIn();

	/**
	 * Returns the meta object for the containment reference list '{@link gendev.hw1.Nurse#getConducts <em>Conducts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Conducts</em>'.
	 * @see gendev.hw1.Nurse#getConducts()
	 * @see #getNurse()
	 * @generated
	 */
	EReference getNurse_Conducts();

	/**
	 * Returns the meta object for the '{@link gendev.hw1.Nurse#performLabTest(gendev.hw1.LabTest) <em>Perform Lab Test</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform Lab Test</em>' operation.
	 * @see gendev.hw1.Nurse#performLabTest(gendev.hw1.LabTest)
	 * @generated
	 */
	EOperation getNurse__PerformLabTest__LabTest();

	/**
	 * Returns the meta object for the '{@link gendev.hw1.Nurse#assistDoctor(gendev.hw1.Operation) <em>Assist Doctor</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Assist Doctor</em>' operation.
	 * @see gendev.hw1.Nurse#assistDoctor(gendev.hw1.Operation)
	 * @generated
	 */
	EOperation getNurse__AssistDoctor__Operation();

	/**
	 * Returns the meta object for the '{@link gendev.hw1.Nurse#inv3_LabTestAssociation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Inv3 Lab Test Association</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Inv3 Lab Test Association</em>' operation.
	 * @see gendev.hw1.Nurse#inv3_LabTestAssociation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getNurse__Inv3_LabTestAssociation__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link gendev.hw1.Billing <em>Billing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Billing</em>'.
	 * @see gendev.hw1.Billing
	 * @generated
	 */
	EClass getBilling();

	/**
	 * Returns the meta object for the attribute '{@link gendev.hw1.Billing#getBillId <em>Bill Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bill Id</em>'.
	 * @see gendev.hw1.Billing#getBillId()
	 * @see #getBilling()
	 * @generated
	 */
	EAttribute getBilling_BillId();

	/**
	 * Returns the meta object for the attribute '{@link gendev.hw1.Billing#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date</em>'.
	 * @see gendev.hw1.Billing#getDate()
	 * @see #getBilling()
	 * @generated
	 */
	EAttribute getBilling_Date();

	/**
	 * Returns the meta object for the attribute '{@link gendev.hw1.Billing#getAmount <em>Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Amount</em>'.
	 * @see gendev.hw1.Billing#getAmount()
	 * @see #getBilling()
	 * @generated
	 */
	EAttribute getBilling_Amount();

	/**
	 * Returns the meta object for the containment reference '{@link gendev.hw1.Billing#getIssuedBy <em>Issued By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Issued By</em>'.
	 * @see gendev.hw1.Billing#getIssuedBy()
	 * @see #getBilling()
	 * @generated
	 */
	EReference getBilling_IssuedBy();

	/**
	 * Returns the meta object for the '{@link gendev.hw1.Billing#generateBill() <em>Generate Bill</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Bill</em>' operation.
	 * @see gendev.hw1.Billing#generateBill()
	 * @generated
	 */
	EOperation getBilling__GenerateBill();

	/**
	 * Returns the meta object for class '{@link gendev.hw1.IMedicalService <em>IMedical Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IMedical Service</em>'.
	 * @see gendev.hw1.IMedicalService
	 * @generated
	 */
	EClass getIMedicalService();

	/**
	 * Returns the meta object for the '{@link gendev.hw1.IMedicalService#calculateBill() <em>Calculate Bill</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Calculate Bill</em>' operation.
	 * @see gendev.hw1.IMedicalService#calculateBill()
	 * @generated
	 */
	EOperation getIMedicalService__CalculateBill();

	/**
	 * Returns the meta object for class '{@link gendev.hw1.MedicalService <em>Medical Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Medical Service</em>'.
	 * @see gendev.hw1.MedicalService
	 * @generated
	 */
	EClass getMedicalService();

	/**
	 * Returns the meta object for the attribute '{@link gendev.hw1.MedicalService#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date</em>'.
	 * @see gendev.hw1.MedicalService#getDate()
	 * @see #getMedicalService()
	 * @generated
	 */
	EAttribute getMedicalService_Date();

	/**
	 * Returns the meta object for class '{@link gendev.hw1.Operation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation</em>'.
	 * @see gendev.hw1.Operation
	 * @generated
	 */
	EClass getOperation();

	/**
	 * Returns the meta object for the attribute '{@link gendev.hw1.Operation#getOperationId <em>Operation Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation Id</em>'.
	 * @see gendev.hw1.Operation#getOperationId()
	 * @see #getOperation()
	 * @generated
	 */
	EAttribute getOperation_OperationId();

	/**
	 * Returns the meta object for the container reference '{@link gendev.hw1.Operation#getPerformedBy <em>Performed By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Performed By</em>'.
	 * @see gendev.hw1.Operation#getPerformedBy()
	 * @see #getOperation()
	 * @generated
	 */
	EReference getOperation_PerformedBy();

	/**
	 * Returns the meta object for the containment reference list '{@link gendev.hw1.Operation#getAssistedBy <em>Assisted By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Assisted By</em>'.
	 * @see gendev.hw1.Operation#getAssistedBy()
	 * @see #getOperation()
	 * @generated
	 */
	EReference getOperation_AssistedBy();

	/**
	 * Returns the meta object for class '{@link gendev.hw1.LabTest <em>Lab Test</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lab Test</em>'.
	 * @see gendev.hw1.LabTest
	 * @generated
	 */
	EClass getLabTest();

	/**
	 * Returns the meta object for the attribute '{@link gendev.hw1.LabTest#getTestId <em>Test Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Id</em>'.
	 * @see gendev.hw1.LabTest#getTestId()
	 * @see #getLabTest()
	 * @generated
	 */
	EAttribute getLabTest_TestId();

	/**
	 * Returns the meta object for the container reference '{@link gendev.hw1.LabTest#getConductedBy <em>Conducted By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Conducted By</em>'.
	 * @see gendev.hw1.LabTest#getConductedBy()
	 * @see #getLabTest()
	 * @generated
	 */
	EReference getLabTest_ConductedBy();

	/**
	 * Returns the meta object for the '{@link gendev.hw1.LabTest#conductLabTest(gendev.hw1.Nurse) <em>Conduct Lab Test</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Conduct Lab Test</em>' operation.
	 * @see gendev.hw1.LabTest#conductLabTest(gendev.hw1.Nurse)
	 * @generated
	 */
	EOperation getLabTest__ConductLabTest__Nurse();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Hw1Factory getHw1Factory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link gendev.hw1.impl.PatientImpl <em>Patient</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gendev.hw1.impl.PatientImpl
		 * @see gendev.hw1.impl.Hw1PackageImpl#getPatient()
		 * @generated
		 */
		EClass PATIENT = eINSTANCE.getPatient();

		/**
		 * The meta object literal for the '<em><b>Medical History</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATIENT__MEDICAL_HISTORY = eINSTANCE.getPatient_MedicalHistory();

		/**
		 * The meta object literal for the '<em><b>Scheduled For</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATIENT__SCHEDULED_FOR = eINSTANCE.getPatient_ScheduledFor();

		/**
		 * The meta object literal for the '<em><b>Issued For</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATIENT__ISSUED_FOR = eINSTANCE.getPatient_IssuedFor();

		/**
		 * The meta object literal for the '<em><b>Booked</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATIENT__BOOKED = eINSTANCE.getPatient_Booked();

		/**
		 * The meta object literal for the '<em><b>Going Through</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATIENT__GOING_THROUGH = eINSTANCE.getPatient_GoingThrough();

		/**
		 * The meta object literal for the '<em><b>Patient Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATIENT__PATIENT_ID = eINSTANCE.getPatient_PatientId();

		/**
		 * The meta object literal for the '<em><b>View Medical History</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PATIENT___VIEW_MEDICAL_HISTORY = eINSTANCE.getPatient__ViewMedicalHistory();

		/**
		 * The meta object literal for the '<em><b>Book Appointment</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PATIENT___BOOK_APPOINTMENT = eINSTANCE.getPatient__BookAppointment();

		/**
		 * The meta object literal for the '<em><b>Request Lab Test</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PATIENT___REQUEST_LAB_TEST = eINSTANCE.getPatient__RequestLabTest();

		/**
		 * The meta object literal for the '<em><b>Pay Bill</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PATIENT___PAY_BILL__FLOAT = eINSTANCE.getPatient__PayBill__float();

		/**
		 * The meta object literal for the '<em><b>Inv1 All Bills Must Have Receptionist</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PATIENT___INV1_ALL_BILLS_MUST_HAVE_RECEPTIONIST__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getPatient__Inv1_AllBillsMustHaveReceptionist__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link gendev.hw1.impl.PersonImpl <em>Person</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gendev.hw1.impl.PersonImpl
		 * @see gendev.hw1.impl.Hw1PackageImpl#getPerson()
		 * @generated
		 */
		EClass PERSON = eINSTANCE.getPerson();

		/**
		 * The meta object literal for the '<em><b>Person Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__PERSON_ID = eINSTANCE.getPerson_PersonId();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__NAME = eINSTANCE.getPerson_Name();

		/**
		 * The meta object literal for the '<em><b>Age</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__AGE = eINSTANCE.getPerson_Age();

		/**
		 * The meta object literal for the '{@link gendev.hw1.impl.HospitalEmployeeImpl <em>Hospital Employee</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gendev.hw1.impl.HospitalEmployeeImpl
		 * @see gendev.hw1.impl.Hw1PackageImpl#getHospitalEmployee()
		 * @generated
		 */
		EClass HOSPITAL_EMPLOYEE = eINSTANCE.getHospitalEmployee();

		/**
		 * The meta object literal for the '<em><b>Employee Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOSPITAL_EMPLOYEE__EMPLOYEE_ID = eINSTANCE.getHospitalEmployee_EmployeeId();

		/**
		 * The meta object literal for the '<em><b>Salary</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOSPITAL_EMPLOYEE__SALARY = eINSTANCE.getHospitalEmployee_Salary();

		/**
		 * The meta object literal for the '<em><b>Get Employee Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HOSPITAL_EMPLOYEE___GET_EMPLOYEE_TYPE = eINSTANCE.getHospitalEmployee__GetEmployeeType();

		/**
		 * The meta object literal for the '{@link gendev.hw1.impl.AppointmentImpl <em>Appointment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gendev.hw1.impl.AppointmentImpl
		 * @see gendev.hw1.impl.Hw1PackageImpl#getAppointment()
		 * @generated
		 */
		EClass APPOINTMENT = eINSTANCE.getAppointment();

		/**
		 * The meta object literal for the '<em><b>Appointment Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPOINTMENT__APPOINTMENT_ID = eINSTANCE.getAppointment_AppointmentId();

		/**
		 * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPOINTMENT__DATE = eINSTANCE.getAppointment_Date();

		/**
		 * The meta object literal for the '<em><b>Start Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPOINTMENT__START_TIME = eINSTANCE.getAppointment_StartTime();

		/**
		 * The meta object literal for the '<em><b>End Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPOINTMENT__END_TIME = eINSTANCE.getAppointment_EndTime();

		/**
		 * The meta object literal for the '{@link gendev.hw1.impl.DoctorImpl <em>Doctor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gendev.hw1.impl.DoctorImpl
		 * @see gendev.hw1.impl.Hw1PackageImpl#getDoctor()
		 * @generated
		 */
		EClass DOCTOR = eINSTANCE.getDoctor();

		/**
		 * The meta object literal for the '<em><b>Specialization</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCTOR__SPECIALIZATION = eINSTANCE.getDoctor_Specialization();

		/**
		 * The meta object literal for the '<em><b>Performs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCTOR__PERFORMS = eINSTANCE.getDoctor_Performs();

		/**
		 * The meta object literal for the '<em><b>Perform Operation</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DOCTOR___PERFORM_OPERATION__NURSE = eINSTANCE.getDoctor__PerformOperation__Nurse();

		/**
		 * The meta object literal for the '<em><b>Prescribe Medicine</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DOCTOR___PRESCRIBE_MEDICINE__PATIENT = eINSTANCE.getDoctor__PrescribeMedicine__Patient();

		/**
		 * The meta object literal for the '<em><b>Inv2 Doctor Must Be Assisted By Nurse</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DOCTOR___INV2_DOCTOR_MUST_BE_ASSISTED_BY_NURSE__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getDoctor__Inv2_DoctorMustBeAssistedByNurse__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link gendev.hw1.impl.ReceptionistImpl <em>Receptionist</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gendev.hw1.impl.ReceptionistImpl
		 * @see gendev.hw1.impl.Hw1PackageImpl#getReceptionist()
		 * @generated
		 */
		EClass RECEPTIONIST = eINSTANCE.getReceptionist();

		/**
		 * The meta object literal for the '<em><b>Issues</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECEPTIONIST__ISSUES = eINSTANCE.getReceptionist_Issues();

		/**
		 * The meta object literal for the '<em><b>Initiate Bill</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RECEPTIONIST___INITIATE_BILL__MEDICALSERVICE = eINSTANCE
				.getReceptionist__InitiateBill__MedicalService();

		/**
		 * The meta object literal for the '<em><b>Allot Bed To Patient</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RECEPTIONIST___ALLOT_BED_TO_PATIENT__PATIENT = eINSTANCE
				.getReceptionist__AllotBedToPatient__Patient();

		/**
		 * The meta object literal for the '{@link gendev.hw1.impl.NurseImpl <em>Nurse</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gendev.hw1.impl.NurseImpl
		 * @see gendev.hw1.impl.Hw1PackageImpl#getNurse()
		 * @generated
		 */
		EClass NURSE = eINSTANCE.getNurse();

		/**
		 * The meta object literal for the '<em><b>Assists In</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NURSE__ASSISTS_IN = eINSTANCE.getNurse_AssistsIn();

		/**
		 * The meta object literal for the '<em><b>Conducts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NURSE__CONDUCTS = eINSTANCE.getNurse_Conducts();

		/**
		 * The meta object literal for the '<em><b>Perform Lab Test</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NURSE___PERFORM_LAB_TEST__LABTEST = eINSTANCE.getNurse__PerformLabTest__LabTest();

		/**
		 * The meta object literal for the '<em><b>Assist Doctor</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NURSE___ASSIST_DOCTOR__OPERATION = eINSTANCE.getNurse__AssistDoctor__Operation();

		/**
		 * The meta object literal for the '<em><b>Inv3 Lab Test Association</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NURSE___INV3_LAB_TEST_ASSOCIATION__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getNurse__Inv3_LabTestAssociation__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link gendev.hw1.impl.BillingImpl <em>Billing</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gendev.hw1.impl.BillingImpl
		 * @see gendev.hw1.impl.Hw1PackageImpl#getBilling()
		 * @generated
		 */
		EClass BILLING = eINSTANCE.getBilling();

		/**
		 * The meta object literal for the '<em><b>Bill Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BILLING__BILL_ID = eINSTANCE.getBilling_BillId();

		/**
		 * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BILLING__DATE = eINSTANCE.getBilling_Date();

		/**
		 * The meta object literal for the '<em><b>Amount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BILLING__AMOUNT = eINSTANCE.getBilling_Amount();

		/**
		 * The meta object literal for the '<em><b>Issued By</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BILLING__ISSUED_BY = eINSTANCE.getBilling_IssuedBy();

		/**
		 * The meta object literal for the '<em><b>Generate Bill</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BILLING___GENERATE_BILL = eINSTANCE.getBilling__GenerateBill();

		/**
		 * The meta object literal for the '{@link gendev.hw1.impl.IMedicalServiceImpl <em>IMedical Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gendev.hw1.impl.IMedicalServiceImpl
		 * @see gendev.hw1.impl.Hw1PackageImpl#getIMedicalService()
		 * @generated
		 */
		EClass IMEDICAL_SERVICE = eINSTANCE.getIMedicalService();

		/**
		 * The meta object literal for the '<em><b>Calculate Bill</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IMEDICAL_SERVICE___CALCULATE_BILL = eINSTANCE.getIMedicalService__CalculateBill();

		/**
		 * The meta object literal for the '{@link gendev.hw1.impl.MedicalServiceImpl <em>Medical Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gendev.hw1.impl.MedicalServiceImpl
		 * @see gendev.hw1.impl.Hw1PackageImpl#getMedicalService()
		 * @generated
		 */
		EClass MEDICAL_SERVICE = eINSTANCE.getMedicalService();

		/**
		 * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEDICAL_SERVICE__DATE = eINSTANCE.getMedicalService_Date();

		/**
		 * The meta object literal for the '{@link gendev.hw1.impl.OperationImpl <em>Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gendev.hw1.impl.OperationImpl
		 * @see gendev.hw1.impl.Hw1PackageImpl#getOperation()
		 * @generated
		 */
		EClass OPERATION = eINSTANCE.getOperation();

		/**
		 * The meta object literal for the '<em><b>Operation Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION__OPERATION_ID = eINSTANCE.getOperation_OperationId();

		/**
		 * The meta object literal for the '<em><b>Performed By</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION__PERFORMED_BY = eINSTANCE.getOperation_PerformedBy();

		/**
		 * The meta object literal for the '<em><b>Assisted By</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION__ASSISTED_BY = eINSTANCE.getOperation_AssistedBy();

		/**
		 * The meta object literal for the '{@link gendev.hw1.impl.LabTestImpl <em>Lab Test</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gendev.hw1.impl.LabTestImpl
		 * @see gendev.hw1.impl.Hw1PackageImpl#getLabTest()
		 * @generated
		 */
		EClass LAB_TEST = eINSTANCE.getLabTest();

		/**
		 * The meta object literal for the '<em><b>Test Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAB_TEST__TEST_ID = eINSTANCE.getLabTest_TestId();

		/**
		 * The meta object literal for the '<em><b>Conducted By</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LAB_TEST__CONDUCTED_BY = eINSTANCE.getLabTest_ConductedBy();

		/**
		 * The meta object literal for the '<em><b>Conduct Lab Test</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LAB_TEST___CONDUCT_LAB_TEST__NURSE = eINSTANCE.getLabTest__ConductLabTest__Nurse();

	}

} //Hw1Package
