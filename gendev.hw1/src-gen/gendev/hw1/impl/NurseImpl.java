/**
 */
package gendev.hw1.impl;

import gendev.hw1.Hw1Package;
import gendev.hw1.Hw1Tables;
import gendev.hw1.LabTest;
import gendev.hw1.Nurse;
import gendev.hw1.Operation;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.ocl.pivot.evaluation.Executor;
import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.library.collection.CollectionNotEmptyOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableGreaterThanOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;
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
 * An implementation of the model object '<em><b>Nurse</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gendev.hw1.impl.NurseImpl#getConducts <em>Conducts</em>}</li>
 *   <li>{@link gendev.hw1.impl.NurseImpl#getAssistsIn <em>Assists In</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NurseImpl extends HospitalEmployeeImpl implements Nurse {
	/**
	 * The cached value of the '{@link #getConducts() <em>Conducts</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConducts()
	 * @generated
	 * @ordered
	 */
	protected EList<LabTest> conducts;

	/**
	 * The cached value of the '{@link #getAssistsIn() <em>Assists In</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssistsIn()
	 * @generated
	 * @ordered
	 */
	protected EList<Operation> assistsIn;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NurseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Hw1Package.Literals.NURSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Operation> getAssistsIn() {
		if (assistsIn == null) {
			assistsIn = new EObjectResolvingEList<Operation>(Operation.class, this, Hw1Package.NURSE__ASSISTS_IN);
		}
		return assistsIn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LabTest> getConducts() {
		if (conducts == null) {
			conducts = new EObjectContainmentWithInverseEList<LabTest>(LabTest.class, this, Hw1Package.NURSE__CONDUCTS,
					Hw1Package.LAB_TEST__CONDUCTED_BY);
		}
		return conducts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean performLabTest(final LabTest test) {
		throw new UnsupportedOperationException(); // FIXME Unimplemented http://www.example.org/hw1!Nurse!performLabTest(http://www.example.org/hw1!LabTest)
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean assistDoctor(final Operation operation) {
		throw new UnsupportedOperationException(); // FIXME Unimplemented http://www.example.org/hw1!Nurse!assistDoctor(http://www.example.org/hw1!Operation)
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean inv3_LabTestAssociation(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Nurse::inv3_LabTestAssociation";
		try {
			/**
			 *
			 * inv inv3_LabTestAssociation:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[?] = if self.conducts->notEmpty()
			 *         then
			 *           self.conducts->exists(test | test.conductedBy = self and test.testId > 0)
			 *         else true
			 *         endif
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					Hw1Package.Literals.NURSE___INV3_LAB_TEST_ASSOCIATION__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, Hw1Tables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean IF_le;
			if (le) {
				IF_le = true;
			} else {
				/*@Caught*/ Object CAUGHT_result;
				try {
					final /*@NonInvalid*/ List<LabTest> conducts_0 = this.getConducts();
					final /*@NonInvalid*/ OrderedSetValue BOXED_conducts_0 = idResolver
							.createOrderedSetOfAll(Hw1Tables.ORD_CLSSid_LabTest, conducts_0);
					final /*@NonInvalid*/ boolean notEmpty = CollectionNotEmptyOperation.INSTANCE
							.evaluate(BOXED_conducts_0).booleanValue();
					/*@Thrown*/ Boolean result;
					if (notEmpty) {
						/*@Thrown*/ Object accumulator = ValueUtil.FALSE_VALUE;
						Iterator<Object> ITERATOR_test = BOXED_conducts_0.iterator();
						/*@Thrown*/ Boolean exists;
						while (true) {
							if (!ITERATOR_test.hasNext()) {
								if (accumulator == null) {
									exists = null;
								} else if (accumulator == ValueUtil.FALSE_VALUE) {
									exists = ValueUtil.FALSE_VALUE;
								} else {
									throw (InvalidValueException) accumulator;
								}
								break;
							}
							/*@NonInvalid*/ LabTest test = (LabTest) ITERATOR_test.next();
							/**
							 * test.conductedBy = self and test.testId > 0
							 */
							final /*@NonInvalid*/ Nurse conductedBy = test.getConductedBy();
							final /*@NonInvalid*/ boolean eq = conductedBy.equals(this);
							final /*@NonInvalid*/ Boolean and;
							if (!eq) {
								and = ValueUtil.FALSE_VALUE;
							} else {
								final /*@NonInvalid*/ int testId = test.getTestId();
								final /*@NonInvalid*/ IntegerValue BOXED_testId = ValueUtil.integerValueOf(testId);
								final /*@NonInvalid*/ boolean gt = OclComparableGreaterThanOperation.INSTANCE
										.evaluate(executor, BOXED_testId, Hw1Tables.INT_0).booleanValue();
								if (!gt) {
									and = ValueUtil.FALSE_VALUE;
								} else {
									and = ValueUtil.TRUE_VALUE;
								}
							}
							//
							if (and == ValueUtil.TRUE_VALUE) { // Normal successful body evaluation result
								exists = ValueUtil.TRUE_VALUE;
								break; // Stop immediately
							} else if (and == ValueUtil.FALSE_VALUE) { // Normal unsuccessful body evaluation result
								; // Carry on
							} else if (and == null) { // Abnormal null body evaluation result
								if (accumulator == ValueUtil.FALSE_VALUE) {
									accumulator = null; // Cache a null failure
								}
							} else { // Impossible badly typed result
								accumulator = new InvalidValueException(PivotMessages.NonBooleanBody, "exists");
							}
						}
						result = exists;
					} else {
						result = ValueUtil.TRUE_VALUE;
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
		case Hw1Package.NURSE__CONDUCTS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getConducts()).basicAdd(otherEnd, msgs);
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
		case Hw1Package.NURSE__CONDUCTS:
			return ((InternalEList<?>) getConducts()).basicRemove(otherEnd, msgs);
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
		case Hw1Package.NURSE__CONDUCTS:
			return getConducts();
		case Hw1Package.NURSE__ASSISTS_IN:
			return getAssistsIn();
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
		case Hw1Package.NURSE__CONDUCTS:
			getConducts().clear();
			getConducts().addAll((Collection<? extends LabTest>) newValue);
			return;
		case Hw1Package.NURSE__ASSISTS_IN:
			getAssistsIn().clear();
			getAssistsIn().addAll((Collection<? extends Operation>) newValue);
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
		case Hw1Package.NURSE__CONDUCTS:
			getConducts().clear();
			return;
		case Hw1Package.NURSE__ASSISTS_IN:
			getAssistsIn().clear();
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
		case Hw1Package.NURSE__CONDUCTS:
			return conducts != null && !conducts.isEmpty();
		case Hw1Package.NURSE__ASSISTS_IN:
			return assistsIn != null && !assistsIn.isEmpty();
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
		case Hw1Package.NURSE___PERFORM_LAB_TEST__LABTEST:
			return performLabTest((LabTest) arguments.get(0));
		case Hw1Package.NURSE___ASSIST_DOCTOR__OPERATION:
			return assistDoctor((Operation) arguments.get(0));
		case Hw1Package.NURSE___INV3_LAB_TEST_ASSOCIATION__DIAGNOSTICCHAIN_MAP:
			return inv3_LabTestAssociation((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //NurseImpl
