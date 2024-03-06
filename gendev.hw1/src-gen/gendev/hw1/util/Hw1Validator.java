/**
 */
package gendev.hw1.util;

import gendev.hw1.*;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see gendev.hw1.Hw1Package
 * @generated
 */
public class Hw1Validator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final Hw1Validator INSTANCE = new Hw1Validator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "gendev.hw1";

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Inv1 All Bills Must Have Receptionist' of 'Patient'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PATIENT__INV1_ALL_BILLS_MUST_HAVE_RECEPTIONIST = 1;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Inv2 Doctor Must Be Assisted By Nurse' of 'Doctor'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int DOCTOR__INV2_DOCTOR_MUST_BE_ASSISTED_BY_NURSE = 2;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Inv3 Lab Test Association' of 'Nurse'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int NURSE__INV3_LAB_TEST_ASSOCIATION = 3;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 3;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Hw1Validator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
		return Hw1Package.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		switch (classifierID) {
		case Hw1Package.PATIENT:
			return validatePatient((Patient) value, diagnostics, context);
		case Hw1Package.PERSON:
			return validatePerson((Person) value, diagnostics, context);
		case Hw1Package.HOSPITAL_EMPLOYEE:
			return validateHospitalEmployee((HospitalEmployee) value, diagnostics, context);
		case Hw1Package.APPOINTMENT:
			return validateAppointment((Appointment) value, diagnostics, context);
		case Hw1Package.DOCTOR:
			return validateDoctor((Doctor) value, diagnostics, context);
		case Hw1Package.RECEPTIONIST:
			return validateReceptionist((Receptionist) value, diagnostics, context);
		case Hw1Package.NURSE:
			return validateNurse((Nurse) value, diagnostics, context);
		case Hw1Package.BILLING:
			return validateBilling((Billing) value, diagnostics, context);
		case Hw1Package.IMEDICAL_SERVICE:
			return validateIMedicalService((IMedicalService) value, diagnostics, context);
		case Hw1Package.MEDICAL_SERVICE:
			return validateMedicalService((MedicalService) value, diagnostics, context);
		case Hw1Package.OPERATION:
			return validateOperation((Operation) value, diagnostics, context);
		case Hw1Package.LAB_TEST:
			return validateLabTest((LabTest) value, diagnostics, context);
		default:
			return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatient(Patient patient, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(patient, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(patient, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(patient, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(patient, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(patient, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(patient, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(patient, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(patient, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(patient, diagnostics, context);
		if (result || diagnostics != null)
			result &= validatePatient_inv1_AllBillsMustHaveReceptionist(patient, diagnostics, context);
		return result;
	}

	/**
	 * Validates the inv1_AllBillsMustHaveReceptionist constraint of '<em>Patient</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatient_inv1_AllBillsMustHaveReceptionist(Patient patient, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return patient.inv1_AllBillsMustHaveReceptionist(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePerson(Person person, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(person, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHospitalEmployee(HospitalEmployee hospitalEmployee, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(hospitalEmployee, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAppointment(Appointment appointment, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(appointment, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDoctor(Doctor doctor, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(doctor, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(doctor, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(doctor, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(doctor, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(doctor, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(doctor, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(doctor, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(doctor, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(doctor, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateDoctor_inv2_DoctorMustBeAssistedByNurse(doctor, diagnostics, context);
		return result;
	}

	/**
	 * Validates the inv2_DoctorMustBeAssistedByNurse constraint of '<em>Doctor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDoctor_inv2_DoctorMustBeAssistedByNurse(Doctor doctor, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return doctor.inv2_DoctorMustBeAssistedByNurse(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReceptionist(Receptionist receptionist, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(receptionist, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNurse(Nurse nurse, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(nurse, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(nurse, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(nurse, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(nurse, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(nurse, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(nurse, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(nurse, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(nurse, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(nurse, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateNurse_inv3_LabTestAssociation(nurse, diagnostics, context);
		return result;
	}

	/**
	 * Validates the inv3_LabTestAssociation constraint of '<em>Nurse</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNurse_inv3_LabTestAssociation(Nurse nurse, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return nurse.inv3_LabTestAssociation(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBilling(Billing billing, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(billing, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIMedicalService(IMedicalService iMedicalService, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(iMedicalService, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicalService(MedicalService medicalService, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(medicalService, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperation(Operation operation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(operation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLabTest(LabTest labTest, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(labTest, diagnostics, context);
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //Hw1Validator
