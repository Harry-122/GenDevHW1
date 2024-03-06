/**
 */
package gendev.hw1.impl;

import gendev.hw1.Doctor;
import gendev.hw1.Hw1Package;
import gendev.hw1.Hw1Tables;
import gendev.hw1.Nurse;
import gendev.hw1.Operation;

import gendev.hw1.Patient;
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

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.ocl.pivot.evaluation.Executor;
import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.library.collection.CollectionSizeOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableGreaterThanOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanOperation;
import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;
import org.eclipse.ocl.pivot.messages.PivotMessages;
import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.InvalidValueException;
import org.eclipse.ocl.pivot.values.OrderedSetValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Doctor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gendev.hw1.impl.DoctorImpl#getSpecialization <em>Specialization</em>}</li>
 *   <li>{@link gendev.hw1.impl.DoctorImpl#getPerforms <em>Performs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DoctorImpl extends HospitalEmployeeImpl implements Doctor {
	/**
	 * The default value of the '{@link #getSpecialization() <em>Specialization</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecialization()
	 * @generated
	 * @ordered
	 */
	protected static final String SPECIALIZATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSpecialization() <em>Specialization</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecialization()
	 * @generated
	 * @ordered
	 */
	protected String specialization = SPECIALIZATION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPerforms() <em>Performs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerforms()
	 * @generated
	 * @ordered
	 */
	protected EList<Operation> performs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DoctorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Hw1Package.Literals.DOCTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSpecialization() {
		return specialization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpecialization(String newSpecialization) {
		String oldSpecialization = specialization;
		specialization = newSpecialization;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hw1Package.DOCTOR__SPECIALIZATION, oldSpecialization,
					specialization));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Operation> getPerforms() {
		if (performs == null) {
			performs = new EObjectContainmentWithInverseEList<Operation>(Operation.class, this,
					Hw1Package.DOCTOR__PERFORMS, Hw1Package.OPERATION__PERFORMED_BY);
		}
		return performs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean performOperation(final Nurse nurse) {
		throw new UnsupportedOperationException(); // FIXME Unimplemented http://www.example.org/hw1!Doctor!performOperation(http://www.example.org/hw1!Nurse)
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void prescribeMedicine(final Patient patient) {
		throw new UnsupportedOperationException(); // FIXME Unimplemented http://www.example.org/hw1!Doctor!prescribeMedicine(http://www.example.org/hw1!Patient)
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean inv2_DoctorMustBeAssistedByNurse(final DiagnosticChain diagnostics,
			final Map<Object, Object> context) {
		final String constraintName = "Doctor::inv2_DoctorMustBeAssistedByNurse";
		try {
			/**
			 *
			 * inv inv2_DoctorMustBeAssistedByNurse:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[?] = self.performs->forAll(op | op.performedBy = self and
			 *           op.assistedBy->size() > 0 and
			 *           op.assistedBy->size() < 4)
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					Hw1Package.Literals.DOCTOR___INV2_DOCTOR_MUST_BE_ASSISTED_BY_NURSE__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, Hw1Tables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean IF_le;
			if (le) {
				IF_le = true;
			} else {
				/*@Caught*/ Object CAUGHT_result;
				try {
					final /*@NonInvalid*/ List<Operation> performs = this.getPerforms();
					final /*@NonInvalid*/ OrderedSetValue BOXED_performs = idResolver
							.createOrderedSetOfAll(Hw1Tables.ORD_CLSSid_Operation, performs);
					/*@Thrown*/ Object accumulator = ValueUtil.TRUE_VALUE;
					Iterator<Object> ITERATOR_op = BOXED_performs.iterator();
					/*@Thrown*/ Boolean result;
					while (true) {
						if (!ITERATOR_op.hasNext()) {
							if (accumulator == null) {
								result = null;
							} else if (accumulator == ValueUtil.TRUE_VALUE) {
								result = ValueUtil.TRUE_VALUE;
							} else {
								throw (InvalidValueException) accumulator;
							}
							break;
						}
						/*@NonInvalid*/ Operation op = (Operation) ITERATOR_op.next();
						/**
						 * op.performedBy = self and op.assistedBy->size() > 0 and op.assistedBy->size() < 4
						 */
						/*@Caught*/ Object CAUGHT_and_0;
						try {
							final /*@NonInvalid*/ List<Nurse> assistedBy_0 = op.getAssistedBy();
							final /*@NonInvalid*/ OrderedSetValue BOXED_assistedBy_0 = idResolver
									.createOrderedSetOfAll(Hw1Tables.ORD_CLSSid_Nurse, assistedBy_0);
							final /*@NonInvalid*/ IntegerValue size_0 = CollectionSizeOperation.INSTANCE
									.evaluate(BOXED_assistedBy_0);
							final /*@NonInvalid*/ Doctor performedBy = op.getPerformedBy();
							final /*@NonInvalid*/ boolean eq = performedBy.equals(this);
							final /*@NonInvalid*/ Boolean and;
							if (!eq) {
								and = ValueUtil.FALSE_VALUE;
							} else {
								final /*@NonInvalid*/ boolean gt = OclComparableGreaterThanOperation.INSTANCE
										.evaluate(executor, size_0, Hw1Tables.INT_0).booleanValue();
								if (!gt) {
									and = ValueUtil.FALSE_VALUE;
								} else {
									and = ValueUtil.TRUE_VALUE;
								}
							}
							final /*@Thrown*/ Boolean and_0;
							if (and == ValueUtil.FALSE_VALUE) {
								and_0 = ValueUtil.FALSE_VALUE;
							} else {
								final /*@NonInvalid*/ boolean lt = OclComparableLessThanOperation.INSTANCE
										.evaluate(executor, size_0, Hw1Tables.INT_4).booleanValue();
								if (!lt) {
									and_0 = ValueUtil.FALSE_VALUE;
								} else {
									if (and == null) {
										and_0 = null;
									} else {
										and_0 = ValueUtil.TRUE_VALUE;
									}
								}
							}
							CAUGHT_and_0 = and_0;
						} catch (Exception e) {
							CAUGHT_and_0 = ValueUtil.createInvalidValue(e);
						}
						//
						if (CAUGHT_and_0 == ValueUtil.FALSE_VALUE) { // Normal unsuccessful body evaluation result
							result = ValueUtil.FALSE_VALUE;
							break; // Stop immediately
						} else if (CAUGHT_and_0 == ValueUtil.TRUE_VALUE) { // Normal successful body evaluation result
							; // Carry on
						} else if (CAUGHT_and_0 == null) { // Abnormal null body evaluation result
							if (accumulator == ValueUtil.TRUE_VALUE) {
								accumulator = null; // Cache a null failure
							}
						} else if (CAUGHT_and_0 instanceof InvalidValueException) { // Abnormal exception evaluation result
							accumulator = CAUGHT_and_0; // Cache an exception failure
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
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Hw1Package.DOCTOR__PERFORMS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getPerforms()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Hw1Package.DOCTOR__PERFORMS:
			return ((InternalEList<?>) getPerforms()).basicRemove(otherEnd, msgs);
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
		case Hw1Package.DOCTOR__SPECIALIZATION:
			return getSpecialization();
		case Hw1Package.DOCTOR__PERFORMS:
			return getPerforms();
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
		case Hw1Package.DOCTOR__SPECIALIZATION:
			setSpecialization((String) newValue);
			return;
		case Hw1Package.DOCTOR__PERFORMS:
			getPerforms().clear();
			getPerforms().addAll((Collection<? extends Operation>) newValue);
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
		case Hw1Package.DOCTOR__SPECIALIZATION:
			setSpecialization(SPECIALIZATION_EDEFAULT);
			return;
		case Hw1Package.DOCTOR__PERFORMS:
			getPerforms().clear();
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
		case Hw1Package.DOCTOR__SPECIALIZATION:
			return SPECIALIZATION_EDEFAULT == null ? specialization != null
					: !SPECIALIZATION_EDEFAULT.equals(specialization);
		case Hw1Package.DOCTOR__PERFORMS:
			return performs != null && !performs.isEmpty();
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
		case Hw1Package.DOCTOR___PERFORM_OPERATION__NURSE:
			return performOperation((Nurse) arguments.get(0));
		case Hw1Package.DOCTOR___PRESCRIBE_MEDICINE__PATIENT:
			prescribeMedicine((Patient) arguments.get(0));
			return null;
		case Hw1Package.DOCTOR___INV2_DOCTOR_MUST_BE_ASSISTED_BY_NURSE__DIAGNOSTICCHAIN_MAP:
			return inv2_DoctorMustBeAssistedByNurse((DiagnosticChain) arguments.get(0),
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
		result.append(" (specialization: ");
		result.append(specialization);
		result.append(')');
		return result.toString();
	}

} //DoctorImpl
