/**
 */
package gendev.hw1.impl;

import gendev.hw1.Billing;
import gendev.hw1.Hw1Package;
import gendev.hw1.Receptionist;

import java.lang.reflect.InvocationTargetException;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Billing</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gendev.hw1.impl.BillingImpl#getBillId <em>Bill Id</em>}</li>
 *   <li>{@link gendev.hw1.impl.BillingImpl#getDate <em>Date</em>}</li>
 *   <li>{@link gendev.hw1.impl.BillingImpl#getAmount <em>Amount</em>}</li>
 *   <li>{@link gendev.hw1.impl.BillingImpl#getIssuedBy <em>Issued By</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BillingImpl extends MinimalEObjectImpl.Container implements Billing {
	/**
	 * The default value of the '{@link #getBillId() <em>Bill Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBillId()
	 * @generated
	 * @ordered
	 */
	protected static final int BILL_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getBillId() <em>Bill Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBillId()
	 * @generated
	 * @ordered
	 */
	protected int billId = BILL_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected Date date = DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAmount() <em>Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmount()
	 * @generated
	 * @ordered
	 */
	protected static final float AMOUNT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getAmount() <em>Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmount()
	 * @generated
	 * @ordered
	 */
	protected float amount = AMOUNT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getIssuedBy() <em>Issued By</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIssuedBy()
	 * @generated
	 * @ordered
	 */
	protected Receptionist issuedBy;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BillingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Hw1Package.Literals.BILLING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getBillId() {
		return billId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBillId(int newBillId) {
		int oldBillId = billId;
		billId = newBillId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hw1Package.BILLING__BILL_ID, oldBillId, billId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getDate() {
		return date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDate(Date newDate) {
		Date oldDate = date;
		date = newDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hw1Package.BILLING__DATE, oldDate, date));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getAmount() {
		return amount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAmount(float newAmount) {
		float oldAmount = amount;
		amount = newAmount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hw1Package.BILLING__AMOUNT, oldAmount, amount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Receptionist getIssuedBy() {
		return issuedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIssuedBy(Receptionist newIssuedBy, NotificationChain msgs) {
		Receptionist oldIssuedBy = issuedBy;
		issuedBy = newIssuedBy;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Hw1Package.BILLING__ISSUED_BY, oldIssuedBy, newIssuedBy);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIssuedBy(Receptionist newIssuedBy) {
		if (newIssuedBy != issuedBy) {
			NotificationChain msgs = null;
			if (issuedBy != null)
				msgs = ((InternalEObject) issuedBy).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - Hw1Package.BILLING__ISSUED_BY, null, msgs);
			if (newIssuedBy != null)
				msgs = ((InternalEObject) newIssuedBy).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - Hw1Package.BILLING__ISSUED_BY, null, msgs);
			msgs = basicSetIssuedBy(newIssuedBy, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hw1Package.BILLING__ISSUED_BY, newIssuedBy,
					newIssuedBy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void generateBill() {
		throw new UnsupportedOperationException(); // FIXME Unimplemented http://www.example.org/hw1!Billing!generateBill()
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Hw1Package.BILLING__ISSUED_BY:
			return basicSetIssuedBy(null, msgs);
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
		case Hw1Package.BILLING__BILL_ID:
			return getBillId();
		case Hw1Package.BILLING__DATE:
			return getDate();
		case Hw1Package.BILLING__AMOUNT:
			return getAmount();
		case Hw1Package.BILLING__ISSUED_BY:
			return getIssuedBy();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case Hw1Package.BILLING__BILL_ID:
			setBillId((Integer) newValue);
			return;
		case Hw1Package.BILLING__DATE:
			setDate((Date) newValue);
			return;
		case Hw1Package.BILLING__AMOUNT:
			setAmount((Float) newValue);
			return;
		case Hw1Package.BILLING__ISSUED_BY:
			setIssuedBy((Receptionist) newValue);
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
		case Hw1Package.BILLING__BILL_ID:
			setBillId(BILL_ID_EDEFAULT);
			return;
		case Hw1Package.BILLING__DATE:
			setDate(DATE_EDEFAULT);
			return;
		case Hw1Package.BILLING__AMOUNT:
			setAmount(AMOUNT_EDEFAULT);
			return;
		case Hw1Package.BILLING__ISSUED_BY:
			setIssuedBy((Receptionist) null);
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
		case Hw1Package.BILLING__BILL_ID:
			return billId != BILL_ID_EDEFAULT;
		case Hw1Package.BILLING__DATE:
			return DATE_EDEFAULT == null ? date != null : !DATE_EDEFAULT.equals(date);
		case Hw1Package.BILLING__AMOUNT:
			return amount != AMOUNT_EDEFAULT;
		case Hw1Package.BILLING__ISSUED_BY:
			return issuedBy != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case Hw1Package.BILLING___GENERATE_BILL:
			generateBill();
			return null;
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
		result.append(" (billId: ");
		result.append(billId);
		result.append(", date: ");
		result.append(date);
		result.append(", amount: ");
		result.append(amount);
		result.append(')');
		return result.toString();
	}

} //BillingImpl
