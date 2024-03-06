/**
 */
package gendev.hw1;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Appointment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gendev.hw1.Appointment#getAppointmentId <em>Appointment Id</em>}</li>
 *   <li>{@link gendev.hw1.Appointment#getDate <em>Date</em>}</li>
 *   <li>{@link gendev.hw1.Appointment#getStartTime <em>Start Time</em>}</li>
 *   <li>{@link gendev.hw1.Appointment#getEndTime <em>End Time</em>}</li>
 * </ul>
 *
 * @see gendev.hw1.Hw1Package#getAppointment()
 * @model
 * @generated
 */
public interface Appointment extends EObject {
	/**
	 * Returns the value of the '<em><b>Appointment Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Appointment Id</em>' attribute.
	 * @see #setAppointmentId(int)
	 * @see gendev.hw1.Hw1Package#getAppointment_AppointmentId()
	 * @model id="true" required="true"
	 * @generated
	 */
	int getAppointmentId();

	/**
	 * Sets the value of the '{@link gendev.hw1.Appointment#getAppointmentId <em>Appointment Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Appointment Id</em>' attribute.
	 * @see #getAppointmentId()
	 * @generated
	 */
	void setAppointmentId(int value);

	/**
	 * Returns the value of the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date</em>' attribute.
	 * @see #setDate(Date)
	 * @see gendev.hw1.Hw1Package#getAppointment_Date()
	 * @model
	 * @generated
	 */
	Date getDate();

	/**
	 * Sets the value of the '{@link gendev.hw1.Appointment#getDate <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' attribute.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(Date value);

	/**
	 * Returns the value of the '<em><b>Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Time</em>' attribute.
	 * @see #setStartTime(long)
	 * @see gendev.hw1.Hw1Package#getAppointment_StartTime()
	 * @model required="true"
	 * @generated
	 */
	long getStartTime();

	/**
	 * Sets the value of the '{@link gendev.hw1.Appointment#getStartTime <em>Start Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Time</em>' attribute.
	 * @see #getStartTime()
	 * @generated
	 */
	void setStartTime(long value);

	/**
	 * Returns the value of the '<em><b>End Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Time</em>' attribute.
	 * @see #setEndTime(long)
	 * @see gendev.hw1.Hw1Package#getAppointment_EndTime()
	 * @model required="true"
	 * @generated
	 */
	long getEndTime();

	/**
	 * Sets the value of the '{@link gendev.hw1.Appointment#getEndTime <em>End Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Time</em>' attribute.
	 * @see #getEndTime()
	 * @generated
	 */
	void setEndTime(long value);

} // Appointment
