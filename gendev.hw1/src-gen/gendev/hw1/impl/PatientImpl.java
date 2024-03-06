/**
 */
package gendev.hw1.impl;

import gendev.hw1.Appointment;
import gendev.hw1.Billing;
import gendev.hw1.Hw1Package;
import gendev.hw1.Hw1Tables;
import gendev.hw1.LabTest;
import gendev.hw1.Operation;
import gendev.hw1.Patient;

import gendev.hw1.Receptionist;
import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.ocl.pivot.evaluation.Executor;
import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.library.collection.CollectionSizeOperation;
import org.eclipse.ocl.pivot.library.oclany.OclAnyOclAsSetOperation;
import org.eclipse.ocl.pivot.library.oclany.OclAnyOclIsTypeOfOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;
import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;
import org.eclipse.ocl.pivot.messages.PivotMessages;
import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.InvalidValueException;
import org.eclipse.ocl.pivot.values.OrderedSetValue;
import org.eclipse.ocl.pivot.values.SetValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Patient</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gendev.hw1.impl.PatientImpl#getMedicalHistory <em>Medical History</em>}</li>
 *   <li>{@link gendev.hw1.impl.PatientImpl#getScheduledFor <em>Scheduled For</em>}</li>
 *   <li>{@link gendev.hw1.impl.PatientImpl#getIssuedFor <em>Issued For</em>}</li>
 *   <li>{@link gendev.hw1.impl.PatientImpl#getPatientId <em>Patient Id</em>}</li>
 *   <li>{@link gendev.hw1.impl.PatientImpl#getBooked <em>Booked</em>}</li>
 *   <li>{@link gendev.hw1.impl.PatientImpl#getGoingThrough <em>Going Through</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PatientImpl extends PersonImpl implements Patient {
	/**
	 * The default value of the '{@link #getMedicalHistory() <em>Medical History</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedicalHistory()
	 * @generated
	 * @ordered
	 */
	protected static final String MEDICAL_HISTORY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMedicalHistory() <em>Medical History</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedicalHistory()
	 * @generated
	 * @ordered
	 */
	protected String medicalHistory = MEDICAL_HISTORY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getScheduledFor() <em>Scheduled For</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScheduledFor()
	 * @generated
	 * @ordered
	 */
	protected EList<Appointment> scheduledFor;

	/**
	 * The cached value of the '{@link #getIssuedFor() <em>Issued For</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIssuedFor()
	 * @generated
	 * @ordered
	 */
	protected EList<Billing> issuedFor;

	/**
	 * The default value of the '{@link #getPatientId() <em>Patient Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatientId()
	 * @generated
	 * @ordered
	 */
	protected static final int PATIENT_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPatientId() <em>Patient Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatientId()
	 * @generated
	 * @ordered
	 */
	protected int patientId = PATIENT_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBooked() <em>Booked</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBooked()
	 * @generated
	 * @ordered
	 */
	protected EList<LabTest> booked;

	/**
	 * The cached value of the '{@link #getGoingThrough() <em>Going Through</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGoingThrough()
	 * @generated
	 * @ordered
	 */
	protected EList<Operation> goingThrough;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PatientImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Hw1Package.Literals.PATIENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMedicalHistory() {
		return medicalHistory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMedicalHistory(String newMedicalHistory) {
		String oldMedicalHistory = medicalHistory;
		medicalHistory = newMedicalHistory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hw1Package.PATIENT__MEDICAL_HISTORY,
					oldMedicalHistory, medicalHistory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Appointment> getScheduledFor() {
		if (scheduledFor == null) {
			scheduledFor = new EObjectContainmentEList<Appointment>(Appointment.class, this,
					Hw1Package.PATIENT__SCHEDULED_FOR);
		}
		return scheduledFor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Billing> getIssuedFor() {
		if (issuedFor == null) {
			issuedFor = new EObjectContainmentEList<Billing>(Billing.class, this, Hw1Package.PATIENT__ISSUED_FOR);
		}
		return issuedFor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LabTest> getBooked() {
		if (booked == null) {
			booked = new EObjectResolvingEList<LabTest>(LabTest.class, this, Hw1Package.PATIENT__BOOKED);
		}
		return booked;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Operation> getGoingThrough() {
		if (goingThrough == null) {
			goingThrough = new EObjectResolvingEList<Operation>(Operation.class, this,
					Hw1Package.PATIENT__GOING_THROUGH);
		}
		return goingThrough;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPatientId() {
		return patientId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPatientId(int newPatientId) {
		int oldPatientId = patientId;
		patientId = newPatientId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hw1Package.PATIENT__PATIENT_ID, oldPatientId,
					patientId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String viewMedicalHistory() {
		throw new UnsupportedOperationException(); // FIXME Unimplemented http://www.example.org/hw1!Patient!viewMedicalHistory()
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void bookAppointment() {
		throw new UnsupportedOperationException(); // FIXME Unimplemented http://www.example.org/hw1!Patient!bookAppointment()
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void requestLabTest() {
		throw new UnsupportedOperationException(); // FIXME Unimplemented http://www.example.org/hw1!Patient!requestLabTest()
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void payBill(final float amount) {
		throw new UnsupportedOperationException(); // FIXME Unimplemented http://www.example.org/hw1!Patient!payBill(http://www.eclipse.org/emf/2002/Ecore!EFloat)
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean inv1_AllBillsMustHaveReceptionist(final DiagnosticChain diagnostics,
			final Map<Object, Object> context) {
		final String constraintName = "Patient::inv1_AllBillsMustHaveReceptionist";
		try {
			/**
			 *
			 * inv inv1_AllBillsMustHaveReceptionist:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[?] = self.issuedFor->forAll(bill |
			 *           bill.issuedBy.oclIsTypeOf(Receptionist) and
			 *           bill.issuedBy->size() = 1)
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					Hw1Package.Literals.PATIENT___INV1_ALL_BILLS_MUST_HAVE_RECEPTIONIST__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, Hw1Tables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean IF_le;
			if (le) {
				IF_le = true;
			} else {
				/*@Caught*/ Object CAUGHT_result;
				try {
					final /*@NonInvalid*/ List<Billing> issuedFor = this.getIssuedFor();
					final /*@NonInvalid*/ OrderedSetValue BOXED_issuedFor = idResolver
							.createOrderedSetOfAll(Hw1Tables.ORD_CLSSid_Billing, issuedFor);
					/*@Thrown*/ Object accumulator = ValueUtil.TRUE_VALUE;
					Iterator<Object> ITERATOR_bill = BOXED_issuedFor.iterator();
					/*@Thrown*/ Boolean result;
					while (true) {
						if (!ITERATOR_bill.hasNext()) {
							if (accumulator == null) {
								result = null;
							} else if (accumulator == ValueUtil.TRUE_VALUE) {
								result = ValueUtil.TRUE_VALUE;
							} else {
								throw (InvalidValueException) accumulator;
							}
							break;
						}
						/*@NonInvalid*/ Billing bill = (Billing) ITERATOR_bill.next();
						/**
						 * bill.issuedBy.oclIsTypeOf(Receptionist) and bill.issuedBy->size() = 1
						 */
						final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_hw1_c_c_Receptionist = idResolver
								.getClass(Hw1Tables.CLSSid_Receptionist, null);
						final /*@NonInvalid*/ Receptionist issuedBy = bill.getIssuedBy();
						final /*@NonInvalid*/ boolean oclIsTypeOf = OclAnyOclIsTypeOfOperation.INSTANCE
								.evaluate(executor, issuedBy, TYP_hw1_c_c_Receptionist).booleanValue();
						final /*@NonInvalid*/ Boolean and;
						if (!oclIsTypeOf) {
							and = ValueUtil.FALSE_VALUE;
						} else {
							final /*@NonInvalid*/ SetValue oclAsSet = OclAnyOclAsSetOperation.INSTANCE
									.evaluate(executor, Hw1Tables.SET_CLSSid_Receptionist, issuedBy);
							final /*@NonInvalid*/ IntegerValue size = CollectionSizeOperation.INSTANCE
									.evaluate(oclAsSet);
							final /*@NonInvalid*/ boolean eq = size.equals(Hw1Tables.INT_1);
							if (!eq) {
								and = ValueUtil.FALSE_VALUE;
							} else {
								and = ValueUtil.TRUE_VALUE;
							}
						}
						//
						if (and == ValueUtil.FALSE_VALUE) { // Normal unsuccessful body evaluation result
							result = ValueUtil.FALSE_VALUE;
							break; // Stop immediately
						} else if (and == ValueUtil.TRUE_VALUE) { // Normal successful body evaluation result
							; // Carry on
						} else if (and == null) { // Abnormal null body evaluation result
							if (accumulator == ValueUtil.TRUE_VALUE) {
								accumulator = null; // Cache a null failure
							}
						} else { // Impossible badly typed result
							accumulator = new InvalidValueException(PivotMessages.NonBooleanBody, "forAll");
						}
					}
					CAUGHT_result = result;
				} catch (Exception e) {
					CAUGHT_result = ValueUtil.createInvalidValue(e);
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE
						.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object) null, diagnostics, context,
								(Object) null, severity_0, CAUGHT_result, Hw1Tables.INT_0)
						.booleanValue();
				IF_le = logDiagnostic;
			}
			return IF_le;
		} catch (Throwable e) {
			return ValueUtil.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Hw1Package.PATIENT__SCHEDULED_FOR:
			return ((InternalEList<?>) getScheduledFor()).basicRemove(otherEnd, msgs);
		case Hw1Package.PATIENT__ISSUED_FOR:
			return ((InternalEList<?>) getIssuedFor()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Hw1Package.PATIENT__MEDICAL_HISTORY:
			return getMedicalHistory();
		case Hw1Package.PATIENT__SCHEDULED_FOR:
			return getScheduledFor();
		case Hw1Package.PATIENT__ISSUED_FOR:
			return getIssuedFor();
		case Hw1Package.PATIENT__PATIENT_ID:
			return getPatientId();
		case Hw1Package.PATIENT__BOOKED:
			return getBooked();
		case Hw1Package.PATIENT__GOING_THROUGH:
			return getGoingThrough();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case Hw1Package.PATIENT__MEDICAL_HISTORY:
			setMedicalHistory((String) newValue);
			return;
		case Hw1Package.PATIENT__SCHEDULED_FOR:
			getScheduledFor().clear();
			getScheduledFor().addAll((Collection<? extends Appointment>) newValue);
			return;
		case Hw1Package.PATIENT__ISSUED_FOR:
			getIssuedFor().clear();
			getIssuedFor().addAll((Collection<? extends Billing>) newValue);
			return;
		case Hw1Package.PATIENT__PATIENT_ID:
			setPatientId((Integer) newValue);
			return;
		case Hw1Package.PATIENT__BOOKED:
			getBooked().clear();
			getBooked().addAll((Collection<? extends LabTest>) newValue);
			return;
		case Hw1Package.PATIENT__GOING_THROUGH:
			getGoingThrough().clear();
			getGoingThrough().addAll((Collection<? extends Operation>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case Hw1Package.PATIENT__MEDICAL_HISTORY:
			setMedicalHistory(MEDICAL_HISTORY_EDEFAULT);
			return;
		case Hw1Package.PATIENT__SCHEDULED_FOR:
			getScheduledFor().clear();
			return;
		case Hw1Package.PATIENT__ISSUED_FOR:
			getIssuedFor().clear();
			return;
		case Hw1Package.PATIENT__PATIENT_ID:
			setPatientId(PATIENT_ID_EDEFAULT);
			return;
		case Hw1Package.PATIENT__BOOKED:
			getBooked().clear();
			return;
		case Hw1Package.PATIENT__GOING_THROUGH:
			getGoingThrough().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case Hw1Package.PATIENT__MEDICAL_HISTORY:
			return MEDICAL_HISTORY_EDEFAULT == null ? medicalHistory != null
					: !MEDICAL_HISTORY_EDEFAULT.equals(medicalHistory);
		case Hw1Package.PATIENT__SCHEDULED_FOR:
			return scheduledFor != null && !scheduledFor.isEmpty();
		case Hw1Package.PATIENT__ISSUED_FOR:
			return issuedFor != null && !issuedFor.isEmpty();
		case Hw1Package.PATIENT__PATIENT_ID:
			return patientId != PATIENT_ID_EDEFAULT;
		case Hw1Package.PATIENT__BOOKED:
			return booked != null && !booked.isEmpty();
		case Hw1Package.PATIENT__GOING_THROUGH:
			return goingThrough != null && !goingThrough.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case Hw1Package.PATIENT___VIEW_MEDICAL_HISTORY:
			return viewMedicalHistory();
		case Hw1Package.PATIENT___BOOK_APPOINTMENT:
			bookAppointment();
			return null;
		case Hw1Package.PATIENT___REQUEST_LAB_TEST:
			requestLabTest();
			return null;
		case Hw1Package.PATIENT___PAY_BILL__FLOAT:
			payBill((Float) arguments.get(0));
			return null;
		case Hw1Package.PATIENT___INV1_ALL_BILLS_MUST_HAVE_RECEPTIONIST__DIAGNOSTICCHAIN_MAP:
			return inv1_AllBillsMustHaveReceptionist((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (medicalHistory: ");
		result.append(medicalHistory);
		result.append(", patientId: ");
		result.append(patientId);
		result.append(')');
		return result.toString();
	}

} //PatientImpl
