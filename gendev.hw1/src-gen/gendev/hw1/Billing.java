/**
 */
package gendev.hw1;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Billing</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gendev.hw1.Billing#getBillId <em>Bill Id</em>}</li>
 *   <li>{@link gendev.hw1.Billing#getDate <em>Date</em>}</li>
 *   <li>{@link gendev.hw1.Billing#getAmount <em>Amount</em>}</li>
 *   <li>{@link gendev.hw1.Billing#getIssuedBy <em>Issued By</em>}</li>
 * </ul>
 *
 * @see gendev.hw1.Hw1Package#getBilling()
 * @model
 * @generated
 */
public interface Billing extends EObject {
	/**
	 * Returns the value of the '<em><b>Bill Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bill Id</em>' attribute.
	 * @see #setBillId(int)
	 * @see gendev.hw1.Hw1Package#getBilling_BillId()
	 * @model id="true" required="true"
	 * @generated
	 */
	int getBillId();

	/**
	 * Sets the value of the '{@link gendev.hw1.Billing#getBillId <em>Bill Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bill Id</em>' attribute.
	 * @see #getBillId()
	 * @generated
	 */
	void setBillId(int value);

	/**
	 * Returns the value of the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date</em>' attribute.
	 * @see #setDate(Date)
	 * @see gendev.hw1.Hw1Package#getBilling_Date()
	 * @model
	 * @generated
	 */
	Date getDate();

	/**
	 * Sets the value of the '{@link gendev.hw1.Billing#getDate <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' attribute.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(Date value);

	/**
	 * Returns the value of the '<em><b>Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Amount</em>' attribute.
	 * @see #setAmount(float)
	 * @see gendev.hw1.Hw1Package#getBilling_Amount()
	 * @model required="true"
	 * @generated
	 */
	float getAmount();

	/**
	 * Sets the value of the '{@link gendev.hw1.Billing#getAmount <em>Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Amount</em>' attribute.
	 * @see #getAmount()
	 * @generated
	 */
	void setAmount(float value);

	/**
	 * Returns the value of the '<em><b>Issued By</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Issued By</em>' containment reference.
	 * @see #setIssuedBy(Receptionist)
	 * @see gendev.hw1.Hw1Package#getBilling_IssuedBy()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Receptionist getIssuedBy();

	/**
	 * Sets the value of the '{@link gendev.hw1.Billing#getIssuedBy <em>Issued By</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Issued By</em>' containment reference.
	 * @see #getIssuedBy()
	 * @generated
	 */
	void setIssuedBy(Receptionist value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void generateBill();

} // Billing
