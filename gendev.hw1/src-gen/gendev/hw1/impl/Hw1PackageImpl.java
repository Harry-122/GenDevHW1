/**
 */
package gendev.hw1.impl;

import gendev.hw1.Appointment;
import gendev.hw1.Billing;
import gendev.hw1.Doctor;
import gendev.hw1.HospitalEmployee;
import gendev.hw1.Hw1Factory;
import gendev.hw1.Hw1Package;
import gendev.hw1.IMedicalService;
import gendev.hw1.LabTest;
import gendev.hw1.MedicalService;
import gendev.hw1.Nurse;
import gendev.hw1.Operation;
import gendev.hw1.Patient;
import gendev.hw1.Person;
import gendev.hw1.Receptionist;

import gendev.hw1.util.Hw1Validator;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Hw1PackageImpl extends EPackageImpl implements Hw1Package {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass patientEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass personEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hospitalEmployeeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass appointmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass doctorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass receptionistEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nurseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass billingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iMedicalServiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass medicalServiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass labTestEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see gendev.hw1.Hw1Package#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Hw1PackageImpl() {
		super(eNS_URI, Hw1Factory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link Hw1Package#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Hw1Package init() {
		if (isInited)
			return (Hw1Package) EPackage.Registry.INSTANCE.getEPackage(Hw1Package.eNS_URI);

		// Obtain or create and register package
		Object registeredHw1Package = EPackage.Registry.INSTANCE.get(eNS_URI);
		Hw1PackageImpl theHw1Package = registeredHw1Package instanceof Hw1PackageImpl
				? (Hw1PackageImpl) registeredHw1Package
				: new Hw1PackageImpl();

		isInited = true;

		// Create package meta-data objects
		theHw1Package.createPackageContents();

		// Initialize created meta-data
		theHw1Package.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put(theHw1Package, new EValidator.Descriptor() {
			public EValidator getEValidator() {
				return Hw1Validator.INSTANCE;
			}
		});

		// Mark meta-data to indicate it can't be changed
		theHw1Package.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Hw1Package.eNS_URI, theHw1Package);
		return theHw1Package;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPatient() {
		return patientEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPatient_MedicalHistory() {
		return (EAttribute) patientEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPatient_ScheduledFor() {
		return (EReference) patientEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPatient_IssuedFor() {
		return (EReference) patientEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPatient_Booked() {
		return (EReference) patientEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPatient_GoingThrough() {
		return (EReference) patientEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPatient_PatientId() {
		return (EAttribute) patientEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPatient__ViewMedicalHistory() {
		return patientEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPatient__BookAppointment() {
		return patientEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPatient__RequestLabTest() {
		return patientEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPatient__PayBill__float() {
		return patientEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPatient__Inv1_AllBillsMustHaveReceptionist__DiagnosticChain_Map() {
		return patientEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPerson() {
		return personEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPerson_PersonId() {
		return (EAttribute) personEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPerson_Name() {
		return (EAttribute) personEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPerson_Age() {
		return (EAttribute) personEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHospitalEmployee() {
		return hospitalEmployeeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHospitalEmployee_EmployeeId() {
		return (EAttribute) hospitalEmployeeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHospitalEmployee_Salary() {
		return (EAttribute) hospitalEmployeeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getHospitalEmployee__GetEmployeeType() {
		return hospitalEmployeeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAppointment() {
		return appointmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAppointment_AppointmentId() {
		return (EAttribute) appointmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAppointment_Date() {
		return (EAttribute) appointmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAppointment_StartTime() {
		return (EAttribute) appointmentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAppointment_EndTime() {
		return (EAttribute) appointmentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDoctor() {
		return doctorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDoctor_Specialization() {
		return (EAttribute) doctorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDoctor_Performs() {
		return (EReference) doctorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDoctor__PerformOperation__Nurse() {
		return doctorEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDoctor__PrescribeMedicine__Patient() {
		return doctorEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDoctor__Inv2_DoctorMustBeAssistedByNurse__DiagnosticChain_Map() {
		return doctorEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReceptionist() {
		return receptionistEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReceptionist_Issues() {
		return (EReference) receptionistEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReceptionist__InitiateBill__MedicalService() {
		return receptionistEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReceptionist__AllotBedToPatient__Patient() {
		return receptionistEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNurse() {
		return nurseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNurse_AssistsIn() {
		return (EReference) nurseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNurse_Conducts() {
		return (EReference) nurseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNurse__PerformLabTest__LabTest() {
		return nurseEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNurse__AssistDoctor__Operation() {
		return nurseEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNurse__Inv3_LabTestAssociation__DiagnosticChain_Map() {
		return nurseEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBilling() {
		return billingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBilling_BillId() {
		return (EAttribute) billingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBilling_Date() {
		return (EAttribute) billingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBilling_Amount() {
		return (EAttribute) billingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBilling_IssuedBy() {
		return (EReference) billingEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBilling__GenerateBill() {
		return billingEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIMedicalService() {
		return iMedicalServiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIMedicalService__CalculateBill() {
		return iMedicalServiceEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMedicalService() {
		return medicalServiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMedicalService_Date() {
		return (EAttribute) medicalServiceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperation() {
		return operationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperation_OperationId() {
		return (EAttribute) operationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperation_PerformedBy() {
		return (EReference) operationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperation_AssistedBy() {
		return (EReference) operationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLabTest() {
		return labTestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLabTest_TestId() {
		return (EAttribute) labTestEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLabTest_ConductedBy() {
		return (EReference) labTestEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLabTest__ConductLabTest__Nurse() {
		return labTestEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Hw1Factory getHw1Factory() {
		return (Hw1Factory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		patientEClass = createEClass(PATIENT);
		createEAttribute(patientEClass, PATIENT__MEDICAL_HISTORY);
		createEReference(patientEClass, PATIENT__SCHEDULED_FOR);
		createEReference(patientEClass, PATIENT__ISSUED_FOR);
		createEAttribute(patientEClass, PATIENT__PATIENT_ID);
		createEReference(patientEClass, PATIENT__BOOKED);
		createEReference(patientEClass, PATIENT__GOING_THROUGH);
		createEOperation(patientEClass, PATIENT___VIEW_MEDICAL_HISTORY);
		createEOperation(patientEClass, PATIENT___BOOK_APPOINTMENT);
		createEOperation(patientEClass, PATIENT___REQUEST_LAB_TEST);
		createEOperation(patientEClass, PATIENT___PAY_BILL__FLOAT);
		createEOperation(patientEClass, PATIENT___INV1_ALL_BILLS_MUST_HAVE_RECEPTIONIST__DIAGNOSTICCHAIN_MAP);

		personEClass = createEClass(PERSON);
		createEAttribute(personEClass, PERSON__NAME);
		createEAttribute(personEClass, PERSON__AGE);
		createEAttribute(personEClass, PERSON__PERSON_ID);

		hospitalEmployeeEClass = createEClass(HOSPITAL_EMPLOYEE);
		createEAttribute(hospitalEmployeeEClass, HOSPITAL_EMPLOYEE__EMPLOYEE_ID);
		createEAttribute(hospitalEmployeeEClass, HOSPITAL_EMPLOYEE__SALARY);
		createEOperation(hospitalEmployeeEClass, HOSPITAL_EMPLOYEE___GET_EMPLOYEE_TYPE);

		appointmentEClass = createEClass(APPOINTMENT);
		createEAttribute(appointmentEClass, APPOINTMENT__APPOINTMENT_ID);
		createEAttribute(appointmentEClass, APPOINTMENT__DATE);
		createEAttribute(appointmentEClass, APPOINTMENT__START_TIME);
		createEAttribute(appointmentEClass, APPOINTMENT__END_TIME);

		doctorEClass = createEClass(DOCTOR);
		createEAttribute(doctorEClass, DOCTOR__SPECIALIZATION);
		createEReference(doctorEClass, DOCTOR__PERFORMS);
		createEOperation(doctorEClass, DOCTOR___PERFORM_OPERATION__NURSE);
		createEOperation(doctorEClass, DOCTOR___PRESCRIBE_MEDICINE__PATIENT);
		createEOperation(doctorEClass, DOCTOR___INV2_DOCTOR_MUST_BE_ASSISTED_BY_NURSE__DIAGNOSTICCHAIN_MAP);

		receptionistEClass = createEClass(RECEPTIONIST);
		createEReference(receptionistEClass, RECEPTIONIST__ISSUES);
		createEOperation(receptionistEClass, RECEPTIONIST___INITIATE_BILL__MEDICALSERVICE);
		createEOperation(receptionistEClass, RECEPTIONIST___ALLOT_BED_TO_PATIENT__PATIENT);

		nurseEClass = createEClass(NURSE);
		createEReference(nurseEClass, NURSE__CONDUCTS);
		createEReference(nurseEClass, NURSE__ASSISTS_IN);
		createEOperation(nurseEClass, NURSE___PERFORM_LAB_TEST__LABTEST);
		createEOperation(nurseEClass, NURSE___ASSIST_DOCTOR__OPERATION);
		createEOperation(nurseEClass, NURSE___INV3_LAB_TEST_ASSOCIATION__DIAGNOSTICCHAIN_MAP);

		billingEClass = createEClass(BILLING);
		createEAttribute(billingEClass, BILLING__BILL_ID);
		createEAttribute(billingEClass, BILLING__DATE);
		createEAttribute(billingEClass, BILLING__AMOUNT);
		createEReference(billingEClass, BILLING__ISSUED_BY);
		createEOperation(billingEClass, BILLING___GENERATE_BILL);

		iMedicalServiceEClass = createEClass(IMEDICAL_SERVICE);
		createEOperation(iMedicalServiceEClass, IMEDICAL_SERVICE___CALCULATE_BILL);

		medicalServiceEClass = createEClass(MEDICAL_SERVICE);
		createEAttribute(medicalServiceEClass, MEDICAL_SERVICE__DATE);

		operationEClass = createEClass(OPERATION);
		createEAttribute(operationEClass, OPERATION__OPERATION_ID);
		createEReference(operationEClass, OPERATION__PERFORMED_BY);
		createEReference(operationEClass, OPERATION__ASSISTED_BY);

		labTestEClass = createEClass(LAB_TEST);
		createEAttribute(labTestEClass, LAB_TEST__TEST_ID);
		createEReference(labTestEClass, LAB_TEST__CONDUCTED_BY);
		createEOperation(labTestEClass, LAB_TEST___CONDUCT_LAB_TEST__NURSE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		patientEClass.getESuperTypes().add(this.getPerson());
		hospitalEmployeeEClass.getESuperTypes().add(this.getPerson());
		doctorEClass.getESuperTypes().add(this.getHospitalEmployee());
		receptionistEClass.getESuperTypes().add(this.getHospitalEmployee());
		nurseEClass.getESuperTypes().add(this.getHospitalEmployee());
		medicalServiceEClass.getESuperTypes().add(this.getIMedicalService());
		operationEClass.getESuperTypes().add(this.getMedicalService());
		labTestEClass.getESuperTypes().add(this.getMedicalService());

		// Initialize classes, features, and operations; add parameters
		initEClass(patientEClass, Patient.class, "Patient", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPatient_MedicalHistory(), ecorePackage.getEString(), "medicalHistory", null, 0, 1,
				Patient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getPatient_ScheduledFor(), this.getAppointment(), null, "scheduledFor", null, 0, -1,
				Patient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPatient_IssuedFor(), this.getBilling(), null, "issuedFor", null, 0, -1, Patient.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPatient_PatientId(), ecorePackage.getEInt(), "patientId", null, 1, 1, Patient.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPatient_Booked(), this.getLabTest(), null, "booked", null, 0, -1, Patient.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPatient_GoingThrough(), this.getOperation(), null, "goingThrough", null, 0, -1, Patient.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getPatient__ViewMedicalHistory(), ecorePackage.getEString(), "viewMedicalHistory", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		initEOperation(getPatient__BookAppointment(), null, "bookAppointment", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getPatient__RequestLabTest(), null, "requestLabTest", 0, 1, IS_UNIQUE, IS_ORDERED);

		EOperation op = initEOperation(getPatient__PayBill__float(), null, "payBill", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEFloat(), "amount", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getPatient__Inv1_AllBillsMustHaveReceptionist__DiagnosticChain_Map(),
				ecorePackage.getEBoolean(), "inv1_AllBillsMustHaveReceptionist", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(ecorePackage.getEMap());
		EGenericType g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(personEClass, Person.class, "Person", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPerson_Name(), ecorePackage.getEString(), "name", null, 0, 1, Person.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPerson_Age(), ecorePackage.getEInt(), "age", null, 1, 1, Person.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPerson_PersonId(), ecorePackage.getEInt(), "personId", null, 1, 1, Person.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hospitalEmployeeEClass, HospitalEmployee.class, "HospitalEmployee", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHospitalEmployee_EmployeeId(), ecorePackage.getEInt(), "employeeId", null, 1, 1,
				HospitalEmployee.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getHospitalEmployee_Salary(), ecorePackage.getEFloat(), "salary", null, 1, 1,
				HospitalEmployee.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEOperation(getHospitalEmployee__GetEmployeeType(), ecorePackage.getEString(), "getEmployeeType", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		initEClass(appointmentEClass, Appointment.class, "Appointment", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAppointment_AppointmentId(), ecorePackage.getEInt(), "appointmentId", null, 1, 1,
				Appointment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getAppointment_Date(), ecorePackage.getEDate(), "date", null, 0, 1, Appointment.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAppointment_StartTime(), ecorePackage.getELong(), "startTime", null, 1, 1, Appointment.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAppointment_EndTime(), ecorePackage.getELong(), "endTime", null, 1, 1, Appointment.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(doctorEClass, Doctor.class, "Doctor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDoctor_Specialization(), ecorePackage.getEString(), "specialization", null, 0, 1,
				Doctor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getDoctor_Performs(), this.getOperation(), this.getOperation_PerformedBy(), "performs", null, 0,
				-1, Doctor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getDoctor__PerformOperation__Nurse(), ecorePackage.getEBoolean(), "performOperation", 1, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getNurse(), "nurse", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDoctor__PrescribeMedicine__Patient(), null, "prescribeMedicine", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, this.getPatient(), "patient", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDoctor__Inv2_DoctorMustBeAssistedByNurse__DiagnosticChain_Map(),
				ecorePackage.getEBoolean(), "inv2_DoctorMustBeAssistedByNurse", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(receptionistEClass, Receptionist.class, "Receptionist", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReceptionist_Issues(), this.getBilling(), null, "issues", null, 0, -1, Receptionist.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getReceptionist__InitiateBill__MedicalService(), this.getBilling(), "initiateBill", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getMedicalService(), "service", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getReceptionist__AllotBedToPatient__Patient(), ecorePackage.getEBoolean(),
				"allotBedToPatient", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getPatient(), "patient", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(nurseEClass, Nurse.class, "Nurse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNurse_Conducts(), this.getLabTest(), this.getLabTest_ConductedBy(), "conducts", null, 0, -1,
				Nurse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNurse_AssistsIn(), this.getOperation(), null, "assistsIn", null, 0, -1, Nurse.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getNurse__PerformLabTest__LabTest(), ecorePackage.getEBoolean(), "performLabTest", 1, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getLabTest(), "test", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getNurse__AssistDoctor__Operation(), ecorePackage.getEBoolean(), "assistDoctor", 1, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getOperation(), "operation", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getNurse__Inv3_LabTestAssociation__DiagnosticChain_Map(), ecorePackage.getEBoolean(),
				"inv3_LabTestAssociation", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(billingEClass, Billing.class, "Billing", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBilling_BillId(), ecorePackage.getEInt(), "billId", null, 1, 1, Billing.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBilling_Date(), ecorePackage.getEDate(), "date", null, 0, 1, Billing.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBilling_Amount(), ecorePackage.getEFloat(), "amount", null, 1, 1, Billing.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBilling_IssuedBy(), this.getReceptionist(), null, "issuedBy", null, 1, 1, Billing.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getBilling__GenerateBill(), null, "generateBill", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(iMedicalServiceEClass, IMedicalService.class, "IMedicalService", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getIMedicalService__CalculateBill(), ecorePackage.getEFloat(), "calculateBill", 1, 1, IS_UNIQUE,
				IS_ORDERED);

		initEClass(medicalServiceEClass, MedicalService.class, "MedicalService", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMedicalService_Date(), ecorePackage.getEDate(), "date", null, 0, 1, MedicalService.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(operationEClass, Operation.class, "Operation", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOperation_OperationId(), ecorePackage.getEInt(), "operationId", null, 1, 1, Operation.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperation_PerformedBy(), this.getDoctor(), this.getDoctor_Performs(), "performedBy", null, 1,
				1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperation_AssistedBy(), this.getNurse(), null, "assistedBy", null, 1, 3, Operation.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(labTestEClass, LabTest.class, "LabTest", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLabTest_TestId(), ecorePackage.getEInt(), "testId", null, 1, 1, LabTest.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLabTest_ConductedBy(), this.getNurse(), this.getNurse_Conducts(), "conductedBy", null, 1, 1,
				LabTest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getLabTest__ConductLabTest__Nurse(), ecorePackage.getEBoolean(), "conductLabTest", 1, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getNurse(), "nurse", 0, 1, IS_UNIQUE, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot
		createPivotAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";
		addAnnotation(this, source, new String[] {});
		addAnnotation(patientEClass, source, new String[] { "constraints", "inv1_AllBillsMustHaveReceptionist" });
		addAnnotation(doctorEClass, source, new String[] { "constraints", "inv2_DoctorMustBeAssistedByNurse" });
		addAnnotation(nurseEClass, source, new String[] { "constraints", "inv3_LabTestAssociation" });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createPivotAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot";
		addAnnotation(getPatient__Inv1_AllBillsMustHaveReceptionist__DiagnosticChain_Map(), source, new String[] {
				"body",
				"\n\t\t\tself.issuedFor->forAll(bill | bill.issuedBy.oclIsTypeOf(Receptionist) and bill.issuedBy->size() = 1)" });
		addAnnotation(getDoctor__Inv2_DoctorMustBeAssistedByNurse__DiagnosticChain_Map(), source, new String[] { "body",
				"\n\t\t\tself.performs->forAll(op | op.performedBy = self and op.assistedBy->size() > 0 and op.assistedBy->size() < 4)" });
		addAnnotation(getNurse__Inv3_LabTestAssociation__DiagnosticChain_Map(), source, new String[] { "body",
				"\n\t\t\tif self.conducts->notEmpty() then\n\t\t\t\tself.conducts->exists(test | test.conductedBy = self and test.testId > 0)\n\t\t\telse true\n\t\t\tendif" });
	}

} //Hw1PackageImpl
