/**
 */
package gendev.hw1.util;

import gendev.hw1.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see gendev.hw1.Hw1Package
 * @generated
 */
public class Hw1Switch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Hw1Package modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Hw1Switch() {
		if (modelPackage == null) {
			modelPackage = Hw1Package.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case Hw1Package.PATIENT: {
			Patient patient = (Patient) theEObject;
			T result = casePatient(patient);
			if (result == null)
				result = casePerson(patient);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Hw1Package.PERSON: {
			Person person = (Person) theEObject;
			T result = casePerson(person);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Hw1Package.HOSPITAL_EMPLOYEE: {
			HospitalEmployee hospitalEmployee = (HospitalEmployee) theEObject;
			T result = caseHospitalEmployee(hospitalEmployee);
			if (result == null)
				result = casePerson(hospitalEmployee);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Hw1Package.APPOINTMENT: {
			Appointment appointment = (Appointment) theEObject;
			T result = caseAppointment(appointment);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Hw1Package.DOCTOR: {
			Doctor doctor = (Doctor) theEObject;
			T result = caseDoctor(doctor);
			if (result == null)
				result = caseHospitalEmployee(doctor);
			if (result == null)
				result = casePerson(doctor);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Hw1Package.RECEPTIONIST: {
			Receptionist receptionist = (Receptionist) theEObject;
			T result = caseReceptionist(receptionist);
			if (result == null)
				result = caseHospitalEmployee(receptionist);
			if (result == null)
				result = casePerson(receptionist);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Hw1Package.NURSE: {
			Nurse nurse = (Nurse) theEObject;
			T result = caseNurse(nurse);
			if (result == null)
				result = caseHospitalEmployee(nurse);
			if (result == null)
				result = casePerson(nurse);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Hw1Package.BILLING: {
			Billing billing = (Billing) theEObject;
			T result = caseBilling(billing);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Hw1Package.IMEDICAL_SERVICE: {
			IMedicalService iMedicalService = (IMedicalService) theEObject;
			T result = caseIMedicalService(iMedicalService);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Hw1Package.MEDICAL_SERVICE: {
			MedicalService medicalService = (MedicalService) theEObject;
			T result = caseMedicalService(medicalService);
			if (result == null)
				result = caseIMedicalService(medicalService);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Hw1Package.OPERATION: {
			Operation operation = (Operation) theEObject;
			T result = caseOperation(operation);
			if (result == null)
				result = caseMedicalService(operation);
			if (result == null)
				result = caseIMedicalService(operation);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Hw1Package.LAB_TEST: {
			LabTest labTest = (LabTest) theEObject;
			T result = caseLabTest(labTest);
			if (result == null)
				result = caseMedicalService(labTest);
			if (result == null)
				result = caseIMedicalService(labTest);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Patient</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Patient</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePatient(Patient object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Person</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Person</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePerson(Person object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hospital Employee</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hospital Employee</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHospitalEmployee(HospitalEmployee object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Appointment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Appointment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAppointment(Appointment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Doctor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Doctor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDoctor(Doctor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Receptionist</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Receptionist</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReceptionist(Receptionist object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Nurse</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Nurse</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNurse(Nurse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Billing</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Billing</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBilling(Billing object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IMedical Service</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IMedical Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIMedicalService(IMedicalService object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Medical Service</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Medical Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMedicalService(MedicalService object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperation(Operation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lab Test</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lab Test</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLabTest(LabTest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //Hw1Switch
