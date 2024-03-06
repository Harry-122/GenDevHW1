/*******************************************************************************
 *************************************************************************
 * This code is 100% auto-generated
 * from:
 *   /gendev.hw1/model/hw1.ecore
 * using:
 *   /gendev.hw1/model/hw1.genmodel
 *   org.eclipse.ocl.examples.codegen.oclinecore.OCLinEcoreTables
 *
 * Do not edit it.
 *******************************************************************************/
package gendev.hw1;

// import gendev.hw1.Hw1Package;
// import gendev.hw1.Hw1Tables;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.ocl.pivot.ParameterTypes;
import org.eclipse.ocl.pivot.TemplateParameters;
import org.eclipse.ocl.pivot.ids.ClassId;
import org.eclipse.ocl.pivot.ids.CollectionTypeId;
import org.eclipse.ocl.pivot.ids.DataTypeId;
import org.eclipse.ocl.pivot.ids.IdManager;
import org.eclipse.ocl.pivot.ids.NsURIPackageId;
import org.eclipse.ocl.pivot.ids.RootPackageId;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorPackage;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorType;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreLibraryOppositeProperty;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorFragment;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorOperation;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorPropertyWithImplementation;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorStandardLibrary;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorType;
import org.eclipse.ocl.pivot.oclstdlib.OCLstdlibTables;
import org.eclipse.ocl.pivot.utilities.AbstractTables;
import org.eclipse.ocl.pivot.utilities.TypeUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;

/**
 * Hw1Tables provides the dispatch tables for the hw1 for use by the OCL dispatcher.
 *
 * In order to ensure correct static initialization, a top level class element must be accessed
 * before any nested class element. Therefore an access to PACKAGE.getClass() is recommended.
 */
public class Hw1Tables extends AbstractTables
{
	static {
		Init.initStart();
	}

	/**
	 *	The package descriptor for the package.
	 */
	public static final EcoreExecutorPackage PACKAGE = new EcoreExecutorPackage(Hw1Package.eINSTANCE);

	/**
	 *	The library of all packages and types.
	 */
	public static final ExecutorStandardLibrary LIBRARY = OCLstdlibTables.LIBRARY;

	/**
	 *	Constants used by auto-generated code.
	 */
	public static final /*@NonInvalid*/ RootPackageId PACKid_$metamodel$ = IdManager.getRootPackageId("$metamodel$");
	public static final /*@NonInvalid*/ NsURIPackageId PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore = IdManager.getNsURIPackageId("http://www.eclipse.org/emf/2002/Ecore", null, EcorePackage.eINSTANCE);
	public static final /*@NonInvalid*/ NsURIPackageId PACKid_http_c_s_s_www_example_org_s_hw1 = IdManager.getNsURIPackageId("http://www.example.org/hw1", null, Hw1Package.eINSTANCE);
	public static final /*@NonInvalid*/ ClassId CLSSid_Appointment = Hw1Tables.PACKid_http_c_s_s_www_example_org_s_hw1.getClassId("Appointment", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Billing = Hw1Tables.PACKid_http_c_s_s_www_example_org_s_hw1.getClassId("Billing", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Class = Hw1Tables.PACKid_$metamodel$.getClassId("Class", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Doctor = Hw1Tables.PACKid_http_c_s_s_www_example_org_s_hw1.getClassId("Doctor", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_LabTest = Hw1Tables.PACKid_http_c_s_s_www_example_org_s_hw1.getClassId("LabTest", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Nurse = Hw1Tables.PACKid_http_c_s_s_www_example_org_s_hw1.getClassId("Nurse", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Operation = Hw1Tables.PACKid_http_c_s_s_www_example_org_s_hw1.getClassId("Operation", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Patient = Hw1Tables.PACKid_http_c_s_s_www_example_org_s_hw1.getClassId("Patient", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Receptionist = Hw1Tables.PACKid_http_c_s_s_www_example_org_s_hw1.getClassId("Receptionist", 0);
	public static final /*@NonInvalid*/ DataTypeId DATAid_EDate = Hw1Tables.PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore.getDataTypeId("EDate", 0);
	public static final /*@NonInvalid*/ DataTypeId DATAid_EFloat = Hw1Tables.PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore.getDataTypeId("EFloat", 0);
	public static final /*@NonInvalid*/ DataTypeId DATAid_EInt = Hw1Tables.PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore.getDataTypeId("EInt", 0);
	public static final /*@NonInvalid*/ DataTypeId DATAid_ELong = Hw1Tables.PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore.getDataTypeId("ELong", 0);
	public static final /*@NonInvalid*/ IntegerValue INT_0 = ValueUtil.integerValueOf("0");
	public static final /*@NonInvalid*/ IntegerValue INT_1 = ValueUtil.integerValueOf("1");
	public static final /*@NonInvalid*/ IntegerValue INT_4 = ValueUtil.integerValueOf("4");
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_Nurse = TypeId.BAG.getSpecializedId(Hw1Tables.CLSSid_Nurse, false, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_Patient = TypeId.BAG.getSpecializedId(Hw1Tables.CLSSid_Patient, false, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_Receptionist = TypeId.BAG.getSpecializedId(Hw1Tables.CLSSid_Receptionist, false, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Appointment = TypeId.ORDERED_SET.getSpecializedId(Hw1Tables.CLSSid_Appointment, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Billing = TypeId.ORDERED_SET.getSpecializedId(Hw1Tables.CLSSid_Billing, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_LabTest = TypeId.ORDERED_SET.getSpecializedId(Hw1Tables.CLSSid_LabTest, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Nurse = TypeId.ORDERED_SET.getSpecializedId(Hw1Tables.CLSSid_Nurse, true, ValueUtil.ONE_VALUE, ValueUtil.integerValueOf(3));
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Operation = TypeId.ORDERED_SET.getSpecializedId(Hw1Tables.CLSSid_Operation, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId SET_CLSSid_Receptionist = TypeId.SET.getSpecializedId(Hw1Tables.CLSSid_Receptionist, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);

	/**
	 *	The type parameters for templated types and operations.
	 */
	public static class TypeParameters {
		static {
			Init.initStart();
			Hw1Tables.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Hw1Tables::TypeParameters and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The type descriptors for each type.
	 */
	public static class Types {
		static {
			Init.initStart();
			TypeParameters.init();
		}

		public static final EcoreExecutorType _Appointment = new EcoreExecutorType(Hw1Package.Literals.APPOINTMENT, PACKAGE, 0);
		public static final EcoreExecutorType _Billing = new EcoreExecutorType(Hw1Package.Literals.BILLING, PACKAGE, 0);
		public static final EcoreExecutorType _Doctor = new EcoreExecutorType(Hw1Package.Literals.DOCTOR, PACKAGE, 0);
		public static final EcoreExecutorType _HospitalEmployee = new EcoreExecutorType(Hw1Package.Literals.HOSPITAL_EMPLOYEE, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final EcoreExecutorType _IMedicalService = new EcoreExecutorType(Hw1Package.Literals.IMEDICAL_SERVICE, PACKAGE, 0);
		public static final EcoreExecutorType _LabTest = new EcoreExecutorType(Hw1Package.Literals.LAB_TEST, PACKAGE, 0);
		public static final EcoreExecutorType _MedicalService = new EcoreExecutorType(Hw1Package.Literals.MEDICAL_SERVICE, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final EcoreExecutorType _Nurse = new EcoreExecutorType(Hw1Package.Literals.NURSE, PACKAGE, 0);
		public static final EcoreExecutorType _Operation = new EcoreExecutorType(Hw1Package.Literals.OPERATION, PACKAGE, 0);
		public static final EcoreExecutorType _Patient = new EcoreExecutorType(Hw1Package.Literals.PATIENT, PACKAGE, 0);
		public static final EcoreExecutorType _Person = new EcoreExecutorType(Hw1Package.Literals.PERSON, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final EcoreExecutorType _Receptionist = new EcoreExecutorType(Hw1Package.Literals.RECEPTIONIST, PACKAGE, 0);

		private static final EcoreExecutorType /*@NonNull*/ [] types = {
			_Appointment,
			_Billing,
			_Doctor,
			_HospitalEmployee,
			_IMedicalService,
			_LabTest,
			_MedicalService,
			_Nurse,
			_Operation,
			_Patient,
			_Person,
			_Receptionist
		};

		/*
		 *	Install the type descriptors in the package descriptor.
		 */
		static {
			PACKAGE.init(LIBRARY, types);
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Hw1Tables::Types and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The fragment descriptors for the local elements of each type and its supertypes.
	 */
	public static class Fragments {
		static {
			Init.initStart();
			Types.init();
		}

		private static final ExecutorFragment _Appointment__Appointment = new ExecutorFragment(Types._Appointment, Hw1Tables.Types._Appointment);
		private static final ExecutorFragment _Appointment__OclAny = new ExecutorFragment(Types._Appointment, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Appointment__OclElement = new ExecutorFragment(Types._Appointment, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Billing__Billing = new ExecutorFragment(Types._Billing, Hw1Tables.Types._Billing);
		private static final ExecutorFragment _Billing__OclAny = new ExecutorFragment(Types._Billing, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Billing__OclElement = new ExecutorFragment(Types._Billing, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Doctor__Doctor = new ExecutorFragment(Types._Doctor, Hw1Tables.Types._Doctor);
		private static final ExecutorFragment _Doctor__HospitalEmployee = new ExecutorFragment(Types._Doctor, Hw1Tables.Types._HospitalEmployee);
		private static final ExecutorFragment _Doctor__OclAny = new ExecutorFragment(Types._Doctor, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Doctor__OclElement = new ExecutorFragment(Types._Doctor, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Doctor__Person = new ExecutorFragment(Types._Doctor, Hw1Tables.Types._Person);

		private static final ExecutorFragment _HospitalEmployee__HospitalEmployee = new ExecutorFragment(Types._HospitalEmployee, Hw1Tables.Types._HospitalEmployee);
		private static final ExecutorFragment _HospitalEmployee__OclAny = new ExecutorFragment(Types._HospitalEmployee, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _HospitalEmployee__OclElement = new ExecutorFragment(Types._HospitalEmployee, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _HospitalEmployee__Person = new ExecutorFragment(Types._HospitalEmployee, Hw1Tables.Types._Person);

		private static final ExecutorFragment _IMedicalService__IMedicalService = new ExecutorFragment(Types._IMedicalService, Hw1Tables.Types._IMedicalService);
		private static final ExecutorFragment _IMedicalService__OclAny = new ExecutorFragment(Types._IMedicalService, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _IMedicalService__OclElement = new ExecutorFragment(Types._IMedicalService, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _LabTest__IMedicalService = new ExecutorFragment(Types._LabTest, Hw1Tables.Types._IMedicalService);
		private static final ExecutorFragment _LabTest__LabTest = new ExecutorFragment(Types._LabTest, Hw1Tables.Types._LabTest);
		private static final ExecutorFragment _LabTest__MedicalService = new ExecutorFragment(Types._LabTest, Hw1Tables.Types._MedicalService);
		private static final ExecutorFragment _LabTest__OclAny = new ExecutorFragment(Types._LabTest, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _LabTest__OclElement = new ExecutorFragment(Types._LabTest, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _MedicalService__IMedicalService = new ExecutorFragment(Types._MedicalService, Hw1Tables.Types._IMedicalService);
		private static final ExecutorFragment _MedicalService__MedicalService = new ExecutorFragment(Types._MedicalService, Hw1Tables.Types._MedicalService);
		private static final ExecutorFragment _MedicalService__OclAny = new ExecutorFragment(Types._MedicalService, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _MedicalService__OclElement = new ExecutorFragment(Types._MedicalService, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Nurse__HospitalEmployee = new ExecutorFragment(Types._Nurse, Hw1Tables.Types._HospitalEmployee);
		private static final ExecutorFragment _Nurse__Nurse = new ExecutorFragment(Types._Nurse, Hw1Tables.Types._Nurse);
		private static final ExecutorFragment _Nurse__OclAny = new ExecutorFragment(Types._Nurse, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Nurse__OclElement = new ExecutorFragment(Types._Nurse, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Nurse__Person = new ExecutorFragment(Types._Nurse, Hw1Tables.Types._Person);

		private static final ExecutorFragment _Operation__IMedicalService = new ExecutorFragment(Types._Operation, Hw1Tables.Types._IMedicalService);
		private static final ExecutorFragment _Operation__MedicalService = new ExecutorFragment(Types._Operation, Hw1Tables.Types._MedicalService);
		private static final ExecutorFragment _Operation__OclAny = new ExecutorFragment(Types._Operation, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Operation__OclElement = new ExecutorFragment(Types._Operation, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Operation__Operation = new ExecutorFragment(Types._Operation, Hw1Tables.Types._Operation);

		private static final ExecutorFragment _Patient__OclAny = new ExecutorFragment(Types._Patient, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Patient__OclElement = new ExecutorFragment(Types._Patient, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Patient__Patient = new ExecutorFragment(Types._Patient, Hw1Tables.Types._Patient);
		private static final ExecutorFragment _Patient__Person = new ExecutorFragment(Types._Patient, Hw1Tables.Types._Person);

		private static final ExecutorFragment _Person__OclAny = new ExecutorFragment(Types._Person, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Person__OclElement = new ExecutorFragment(Types._Person, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Person__Person = new ExecutorFragment(Types._Person, Hw1Tables.Types._Person);

		private static final ExecutorFragment _Receptionist__HospitalEmployee = new ExecutorFragment(Types._Receptionist, Hw1Tables.Types._HospitalEmployee);
		private static final ExecutorFragment _Receptionist__OclAny = new ExecutorFragment(Types._Receptionist, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Receptionist__OclElement = new ExecutorFragment(Types._Receptionist, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Receptionist__Person = new ExecutorFragment(Types._Receptionist, Hw1Tables.Types._Person);
		private static final ExecutorFragment _Receptionist__Receptionist = new ExecutorFragment(Types._Receptionist, Hw1Tables.Types._Receptionist);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Hw1Tables::Fragments and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The parameter lists shared by operations.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Parameters {
		static {
			Init.initStart();
			Fragments.init();
		}

		public static final ParameterTypes _EFloat = TypeUtil.createParameterTypes(OCLstdlibTables.Types._Real);
		public static final ParameterTypes _LabTest = TypeUtil.createParameterTypes(Hw1Tables.Types._LabTest);
		public static final ParameterTypes _MedicalService = TypeUtil.createParameterTypes(Hw1Tables.Types._MedicalService);
		public static final ParameterTypes _Nurse = TypeUtil.createParameterTypes(Hw1Tables.Types._Nurse);
		public static final ParameterTypes _Operation = TypeUtil.createParameterTypes(Hw1Tables.Types._Operation);
		public static final ParameterTypes _Patient = TypeUtil.createParameterTypes(Hw1Tables.Types._Patient);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Hw1Tables::Parameters and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The operation descriptors for each operation of each type.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Operations {
		static {
			Init.initStart();
			Parameters.init();
		}

		public static final ExecutorOperation _Billing__generateBill = new ExecutorOperation("generateBill", TypeUtil.EMPTY_PARAMETER_TYPES, Types._Billing,
			0, TemplateParameters.EMPTY_LIST, null);

		public static final ExecutorOperation _Doctor__performOperation = new ExecutorOperation("performOperation", Parameters._Nurse, Types._Doctor,
			0, TemplateParameters.EMPTY_LIST, null);
		public static final ExecutorOperation _Doctor__prescribeMedicine = new ExecutorOperation("prescribeMedicine", Parameters._Patient, Types._Doctor,
			1, TemplateParameters.EMPTY_LIST, null);

		public static final ExecutorOperation _HospitalEmployee__getEmployeeType = new ExecutorOperation("getEmployeeType", TypeUtil.EMPTY_PARAMETER_TYPES, Types._HospitalEmployee,
			0, TemplateParameters.EMPTY_LIST, null);

		public static final ExecutorOperation _IMedicalService__calculateBill = new ExecutorOperation("calculateBill", TypeUtil.EMPTY_PARAMETER_TYPES, Types._IMedicalService,
			0, TemplateParameters.EMPTY_LIST, null);

		public static final ExecutorOperation _LabTest__conductLabTest = new ExecutorOperation("conductLabTest", Parameters._Nurse, Types._LabTest,
			0, TemplateParameters.EMPTY_LIST, null);

		public static final ExecutorOperation _Nurse__assistDoctor = new ExecutorOperation("assistDoctor", Parameters._Operation, Types._Nurse,
			0, TemplateParameters.EMPTY_LIST, null);
		public static final ExecutorOperation _Nurse__performLabTest = new ExecutorOperation("performLabTest", Parameters._LabTest, Types._Nurse,
			1, TemplateParameters.EMPTY_LIST, null);

		public static final ExecutorOperation _Patient__bookAppointment = new ExecutorOperation("bookAppointment", TypeUtil.EMPTY_PARAMETER_TYPES, Types._Patient,
			0, TemplateParameters.EMPTY_LIST, null);
		public static final ExecutorOperation _Patient__payBill = new ExecutorOperation("payBill", Parameters._EFloat, Types._Patient,
			1, TemplateParameters.EMPTY_LIST, null);
		public static final ExecutorOperation _Patient__requestLabTest = new ExecutorOperation("requestLabTest", TypeUtil.EMPTY_PARAMETER_TYPES, Types._Patient,
			2, TemplateParameters.EMPTY_LIST, null);
		public static final ExecutorOperation _Patient__viewMedicalHistory = new ExecutorOperation("viewMedicalHistory", TypeUtil.EMPTY_PARAMETER_TYPES, Types._Patient,
			3, TemplateParameters.EMPTY_LIST, null);

		public static final ExecutorOperation _Receptionist__allotBedToPatient = new ExecutorOperation("allotBedToPatient", Parameters._Patient, Types._Receptionist,
			0, TemplateParameters.EMPTY_LIST, null);
		public static final ExecutorOperation _Receptionist__initiateBill = new ExecutorOperation("initiateBill", Parameters._MedicalService, Types._Receptionist,
			1, TemplateParameters.EMPTY_LIST, null);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Hw1Tables::Operations and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The property descriptors for each property of each type.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Properties {
		static {
			Init.initStart();
			Operations.init();
		}

		public static final ExecutorProperty _Appointment__appointmentId = new EcoreExecutorProperty(Hw1Package.Literals.APPOINTMENT__APPOINTMENT_ID, Types._Appointment, 0);
		public static final ExecutorProperty _Appointment__date = new EcoreExecutorProperty(Hw1Package.Literals.APPOINTMENT__DATE, Types._Appointment, 1);
		public static final ExecutorProperty _Appointment__endTime = new EcoreExecutorProperty(Hw1Package.Literals.APPOINTMENT__END_TIME, Types._Appointment, 2);
		public static final ExecutorProperty _Appointment__startTime = new EcoreExecutorProperty(Hw1Package.Literals.APPOINTMENT__START_TIME, Types._Appointment, 3);
		public static final ExecutorProperty _Appointment__Patient__scheduledFor = new ExecutorPropertyWithImplementation("Patient", Types._Appointment, 4, new EcoreLibraryOppositeProperty(Hw1Package.Literals.PATIENT__SCHEDULED_FOR));

		public static final ExecutorProperty _Billing__amount = new EcoreExecutorProperty(Hw1Package.Literals.BILLING__AMOUNT, Types._Billing, 0);
		public static final ExecutorProperty _Billing__billId = new EcoreExecutorProperty(Hw1Package.Literals.BILLING__BILL_ID, Types._Billing, 1);
		public static final ExecutorProperty _Billing__date = new EcoreExecutorProperty(Hw1Package.Literals.BILLING__DATE, Types._Billing, 2);
		public static final ExecutorProperty _Billing__issuedBy = new EcoreExecutorProperty(Hw1Package.Literals.BILLING__ISSUED_BY, Types._Billing, 3);
		public static final ExecutorProperty _Billing__Patient__issuedFor = new ExecutorPropertyWithImplementation("Patient", Types._Billing, 4, new EcoreLibraryOppositeProperty(Hw1Package.Literals.PATIENT__ISSUED_FOR));
		public static final ExecutorProperty _Billing__Receptionist__issues = new ExecutorPropertyWithImplementation("Receptionist", Types._Billing, 5, new EcoreLibraryOppositeProperty(Hw1Package.Literals.RECEPTIONIST__ISSUES));

		public static final ExecutorProperty _Doctor__performs = new EcoreExecutorProperty(Hw1Package.Literals.DOCTOR__PERFORMS, Types._Doctor, 0);
		public static final ExecutorProperty _Doctor__specialization = new EcoreExecutorProperty(Hw1Package.Literals.DOCTOR__SPECIALIZATION, Types._Doctor, 1);

		public static final ExecutorProperty _HospitalEmployee__employeeId = new EcoreExecutorProperty(Hw1Package.Literals.HOSPITAL_EMPLOYEE__EMPLOYEE_ID, Types._HospitalEmployee, 0);
		public static final ExecutorProperty _HospitalEmployee__salary = new EcoreExecutorProperty(Hw1Package.Literals.HOSPITAL_EMPLOYEE__SALARY, Types._HospitalEmployee, 1);

		public static final ExecutorProperty _LabTest__conductedBy = new EcoreExecutorProperty(Hw1Package.Literals.LAB_TEST__CONDUCTED_BY, Types._LabTest, 0);
		public static final ExecutorProperty _LabTest__testId = new EcoreExecutorProperty(Hw1Package.Literals.LAB_TEST__TEST_ID, Types._LabTest, 1);
		public static final ExecutorProperty _LabTest__Patient__booked = new ExecutorPropertyWithImplementation("Patient", Types._LabTest, 2, new EcoreLibraryOppositeProperty(Hw1Package.Literals.PATIENT__BOOKED));

		public static final ExecutorProperty _MedicalService__date = new EcoreExecutorProperty(Hw1Package.Literals.MEDICAL_SERVICE__DATE, Types._MedicalService, 0);

		public static final ExecutorProperty _Nurse__assistsIn = new EcoreExecutorProperty(Hw1Package.Literals.NURSE__ASSISTS_IN, Types._Nurse, 0);
		public static final ExecutorProperty _Nurse__conducts = new EcoreExecutorProperty(Hw1Package.Literals.NURSE__CONDUCTS, Types._Nurse, 1);
		public static final ExecutorProperty _Nurse__Operation__assistedBy = new ExecutorPropertyWithImplementation("Operation", Types._Nurse, 2, new EcoreLibraryOppositeProperty(Hw1Package.Literals.OPERATION__ASSISTED_BY));

		public static final ExecutorProperty _Operation__assistedBy = new EcoreExecutorProperty(Hw1Package.Literals.OPERATION__ASSISTED_BY, Types._Operation, 0);
		public static final ExecutorProperty _Operation__operationId = new EcoreExecutorProperty(Hw1Package.Literals.OPERATION__OPERATION_ID, Types._Operation, 1);
		public static final ExecutorProperty _Operation__performedBy = new EcoreExecutorProperty(Hw1Package.Literals.OPERATION__PERFORMED_BY, Types._Operation, 2);
		public static final ExecutorProperty _Operation__Nurse__assistsIn = new ExecutorPropertyWithImplementation("Nurse", Types._Operation, 3, new EcoreLibraryOppositeProperty(Hw1Package.Literals.NURSE__ASSISTS_IN));
		public static final ExecutorProperty _Operation__Patient__goingThrough = new ExecutorPropertyWithImplementation("Patient", Types._Operation, 4, new EcoreLibraryOppositeProperty(Hw1Package.Literals.PATIENT__GOING_THROUGH));

		public static final ExecutorProperty _Patient__booked = new EcoreExecutorProperty(Hw1Package.Literals.PATIENT__BOOKED, Types._Patient, 0);
		public static final ExecutorProperty _Patient__goingThrough = new EcoreExecutorProperty(Hw1Package.Literals.PATIENT__GOING_THROUGH, Types._Patient, 1);
		public static final ExecutorProperty _Patient__issuedFor = new EcoreExecutorProperty(Hw1Package.Literals.PATIENT__ISSUED_FOR, Types._Patient, 2);
		public static final ExecutorProperty _Patient__medicalHistory = new EcoreExecutorProperty(Hw1Package.Literals.PATIENT__MEDICAL_HISTORY, Types._Patient, 3);
		public static final ExecutorProperty _Patient__patientId = new EcoreExecutorProperty(Hw1Package.Literals.PATIENT__PATIENT_ID, Types._Patient, 4);
		public static final ExecutorProperty _Patient__scheduledFor = new EcoreExecutorProperty(Hw1Package.Literals.PATIENT__SCHEDULED_FOR, Types._Patient, 5);

		public static final ExecutorProperty _Person__age = new EcoreExecutorProperty(Hw1Package.Literals.PERSON__AGE, Types._Person, 0);
		public static final ExecutorProperty _Person__name = new EcoreExecutorProperty(Hw1Package.Literals.PERSON__NAME, Types._Person, 1);
		public static final ExecutorProperty _Person__personId = new EcoreExecutorProperty(Hw1Package.Literals.PERSON__PERSON_ID, Types._Person, 2);

		public static final ExecutorProperty _Receptionist__issues = new EcoreExecutorProperty(Hw1Package.Literals.RECEPTIONIST__ISSUES, Types._Receptionist, 0);
		public static final ExecutorProperty _Receptionist__Billing__issuedBy = new ExecutorPropertyWithImplementation("Billing", Types._Receptionist, 1, new EcoreLibraryOppositeProperty(Hw1Package.Literals.BILLING__ISSUED_BY));
		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Hw1Tables::Properties and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The fragments for all base types in depth order: OclAny first, OclSelf last.
	 */
	public static class TypeFragments {
		static {
			Init.initStart();
			Properties.init();
		}

		private static final ExecutorFragment /*@NonNull*/ [] _Appointment =
			{
				Fragments._Appointment__OclAny /* 0 */,
				Fragments._Appointment__OclElement /* 1 */,
				Fragments._Appointment__Appointment /* 2 */
			};
		private static final int /*@NonNull*/ [] __Appointment = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Billing =
			{
				Fragments._Billing__OclAny /* 0 */,
				Fragments._Billing__OclElement /* 1 */,
				Fragments._Billing__Billing /* 2 */
			};
		private static final int /*@NonNull*/ [] __Billing = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Doctor =
			{
				Fragments._Doctor__OclAny /* 0 */,
				Fragments._Doctor__OclElement /* 1 */,
				Fragments._Doctor__Person /* 2 */,
				Fragments._Doctor__HospitalEmployee /* 3 */,
				Fragments._Doctor__Doctor /* 4 */
			};
		private static final int /*@NonNull*/ [] __Doctor = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _HospitalEmployee =
			{
				Fragments._HospitalEmployee__OclAny /* 0 */,
				Fragments._HospitalEmployee__OclElement /* 1 */,
				Fragments._HospitalEmployee__Person /* 2 */,
				Fragments._HospitalEmployee__HospitalEmployee /* 3 */
			};
		private static final int /*@NonNull*/ [] __HospitalEmployee = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _IMedicalService =
			{
				Fragments._IMedicalService__OclAny /* 0 */,
				Fragments._IMedicalService__OclElement /* 1 */,
				Fragments._IMedicalService__IMedicalService /* 2 */
			};
		private static final int /*@NonNull*/ [] __IMedicalService = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _LabTest =
			{
				Fragments._LabTest__OclAny /* 0 */,
				Fragments._LabTest__OclElement /* 1 */,
				Fragments._LabTest__IMedicalService /* 2 */,
				Fragments._LabTest__MedicalService /* 3 */,
				Fragments._LabTest__LabTest /* 4 */
			};
		private static final int /*@NonNull*/ [] __LabTest = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _MedicalService =
			{
				Fragments._MedicalService__OclAny /* 0 */,
				Fragments._MedicalService__OclElement /* 1 */,
				Fragments._MedicalService__IMedicalService /* 2 */,
				Fragments._MedicalService__MedicalService /* 3 */
			};
		private static final int /*@NonNull*/ [] __MedicalService = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Nurse =
			{
				Fragments._Nurse__OclAny /* 0 */,
				Fragments._Nurse__OclElement /* 1 */,
				Fragments._Nurse__Person /* 2 */,
				Fragments._Nurse__HospitalEmployee /* 3 */,
				Fragments._Nurse__Nurse /* 4 */
			};
		private static final int /*@NonNull*/ [] __Nurse = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Operation =
			{
				Fragments._Operation__OclAny /* 0 */,
				Fragments._Operation__OclElement /* 1 */,
				Fragments._Operation__IMedicalService /* 2 */,
				Fragments._Operation__MedicalService /* 3 */,
				Fragments._Operation__Operation /* 4 */
			};
		private static final int /*@NonNull*/ [] __Operation = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Patient =
			{
				Fragments._Patient__OclAny /* 0 */,
				Fragments._Patient__OclElement /* 1 */,
				Fragments._Patient__Person /* 2 */,
				Fragments._Patient__Patient /* 3 */
			};
		private static final int /*@NonNull*/ [] __Patient = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Person =
			{
				Fragments._Person__OclAny /* 0 */,
				Fragments._Person__OclElement /* 1 */,
				Fragments._Person__Person /* 2 */
			};
		private static final int /*@NonNull*/ [] __Person = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Receptionist =
			{
				Fragments._Receptionist__OclAny /* 0 */,
				Fragments._Receptionist__OclElement /* 1 */,
				Fragments._Receptionist__Person /* 2 */,
				Fragments._Receptionist__HospitalEmployee /* 3 */,
				Fragments._Receptionist__Receptionist /* 4 */
			};
		private static final int /*@NonNull*/ [] __Receptionist = { 1,1,1,1,1 };

		/**
		 *	Install the fragment descriptors in the class descriptors.
		 */
		static {
			Types._Appointment.initFragments(_Appointment, __Appointment);
			Types._Billing.initFragments(_Billing, __Billing);
			Types._Doctor.initFragments(_Doctor, __Doctor);
			Types._HospitalEmployee.initFragments(_HospitalEmployee, __HospitalEmployee);
			Types._IMedicalService.initFragments(_IMedicalService, __IMedicalService);
			Types._LabTest.initFragments(_LabTest, __LabTest);
			Types._MedicalService.initFragments(_MedicalService, __MedicalService);
			Types._Nurse.initFragments(_Nurse, __Nurse);
			Types._Operation.initFragments(_Operation, __Operation);
			Types._Patient.initFragments(_Patient, __Patient);
			Types._Person.initFragments(_Person, __Person);
			Types._Receptionist.initFragments(_Receptionist, __Receptionist);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Hw1Tables::TypeFragments and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of local operations or local operation overrides for each fragment of each type.
	 */
	public static class FragmentOperations {
		static {
			Init.initStart();
			TypeFragments.init();
		}

		private static final ExecutorOperation /*@NonNull*/ [] _Appointment__Appointment = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Appointment__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Appointment__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Billing__Billing = {
			Hw1Tables.Operations._Billing__generateBill /* generateBill() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Billing__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Billing__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Doctor__Doctor = {
			Hw1Tables.Operations._Doctor__performOperation /* performOperation(Nurse[?]) */,
			Hw1Tables.Operations._Doctor__prescribeMedicine /* prescribeMedicine(Patient[?]) */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Doctor__HospitalEmployee = {
			Hw1Tables.Operations._HospitalEmployee__getEmployeeType /* getEmployeeType() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Doctor__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Doctor__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Doctor__Person = {};

		private static final ExecutorOperation /*@NonNull*/ [] _HospitalEmployee__HospitalEmployee = {
			Hw1Tables.Operations._HospitalEmployee__getEmployeeType /* getEmployeeType() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _HospitalEmployee__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _HospitalEmployee__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _HospitalEmployee__Person = {};

		private static final ExecutorOperation /*@NonNull*/ [] _IMedicalService__IMedicalService = {
			Hw1Tables.Operations._IMedicalService__calculateBill /* calculateBill() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _IMedicalService__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _IMedicalService__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _LabTest__LabTest = {
			Hw1Tables.Operations._LabTest__conductLabTest /* conductLabTest(Nurse[?]) */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _LabTest__IMedicalService = {
			Hw1Tables.Operations._IMedicalService__calculateBill /* calculateBill() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _LabTest__MedicalService = {};
		private static final ExecutorOperation /*@NonNull*/ [] _LabTest__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _LabTest__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _MedicalService__MedicalService = {};
		private static final ExecutorOperation /*@NonNull*/ [] _MedicalService__IMedicalService = {
			Hw1Tables.Operations._IMedicalService__calculateBill /* calculateBill() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _MedicalService__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _MedicalService__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Nurse__Nurse = {
			Hw1Tables.Operations._Nurse__assistDoctor /* assistDoctor(Operation[?]) */,
			Hw1Tables.Operations._Nurse__performLabTest /* performLabTest(LabTest[?]) */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Nurse__HospitalEmployee = {
			Hw1Tables.Operations._HospitalEmployee__getEmployeeType /* getEmployeeType() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Nurse__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Nurse__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Nurse__Person = {};

		private static final ExecutorOperation /*@NonNull*/ [] _Operation__Operation = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Operation__IMedicalService = {
			Hw1Tables.Operations._IMedicalService__calculateBill /* calculateBill() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Operation__MedicalService = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Operation__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Operation__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Patient__Patient = {
			Hw1Tables.Operations._Patient__bookAppointment /* bookAppointment() */,
			Hw1Tables.Operations._Patient__payBill /* payBill(EFloat[1]) */,
			Hw1Tables.Operations._Patient__requestLabTest /* requestLabTest() */,
			Hw1Tables.Operations._Patient__viewMedicalHistory /* viewMedicalHistory() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Patient__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Patient__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Patient__Person = {};

		private static final ExecutorOperation /*@NonNull*/ [] _Person__Person = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Person__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Person__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Receptionist__Receptionist = {
			Hw1Tables.Operations._Receptionist__allotBedToPatient /* allotBedToPatient(Patient[?]) */,
			Hw1Tables.Operations._Receptionist__initiateBill /* initiateBill(MedicalService[?]) */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Receptionist__HospitalEmployee = {
			Hw1Tables.Operations._HospitalEmployee__getEmployeeType /* getEmployeeType() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Receptionist__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Receptionist__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Receptionist__Person = {};

		/*
		 *	Install the operation descriptors in the fragment descriptors.
		 */
		static {
			Fragments._Appointment__Appointment.initOperations(_Appointment__Appointment);
			Fragments._Appointment__OclAny.initOperations(_Appointment__OclAny);
			Fragments._Appointment__OclElement.initOperations(_Appointment__OclElement);

			Fragments._Billing__Billing.initOperations(_Billing__Billing);
			Fragments._Billing__OclAny.initOperations(_Billing__OclAny);
			Fragments._Billing__OclElement.initOperations(_Billing__OclElement);

			Fragments._Doctor__Doctor.initOperations(_Doctor__Doctor);
			Fragments._Doctor__HospitalEmployee.initOperations(_Doctor__HospitalEmployee);
			Fragments._Doctor__OclAny.initOperations(_Doctor__OclAny);
			Fragments._Doctor__OclElement.initOperations(_Doctor__OclElement);
			Fragments._Doctor__Person.initOperations(_Doctor__Person);

			Fragments._HospitalEmployee__HospitalEmployee.initOperations(_HospitalEmployee__HospitalEmployee);
			Fragments._HospitalEmployee__OclAny.initOperations(_HospitalEmployee__OclAny);
			Fragments._HospitalEmployee__OclElement.initOperations(_HospitalEmployee__OclElement);
			Fragments._HospitalEmployee__Person.initOperations(_HospitalEmployee__Person);

			Fragments._IMedicalService__IMedicalService.initOperations(_IMedicalService__IMedicalService);
			Fragments._IMedicalService__OclAny.initOperations(_IMedicalService__OclAny);
			Fragments._IMedicalService__OclElement.initOperations(_IMedicalService__OclElement);

			Fragments._LabTest__IMedicalService.initOperations(_LabTest__IMedicalService);
			Fragments._LabTest__LabTest.initOperations(_LabTest__LabTest);
			Fragments._LabTest__MedicalService.initOperations(_LabTest__MedicalService);
			Fragments._LabTest__OclAny.initOperations(_LabTest__OclAny);
			Fragments._LabTest__OclElement.initOperations(_LabTest__OclElement);

			Fragments._MedicalService__IMedicalService.initOperations(_MedicalService__IMedicalService);
			Fragments._MedicalService__MedicalService.initOperations(_MedicalService__MedicalService);
			Fragments._MedicalService__OclAny.initOperations(_MedicalService__OclAny);
			Fragments._MedicalService__OclElement.initOperations(_MedicalService__OclElement);

			Fragments._Nurse__HospitalEmployee.initOperations(_Nurse__HospitalEmployee);
			Fragments._Nurse__Nurse.initOperations(_Nurse__Nurse);
			Fragments._Nurse__OclAny.initOperations(_Nurse__OclAny);
			Fragments._Nurse__OclElement.initOperations(_Nurse__OclElement);
			Fragments._Nurse__Person.initOperations(_Nurse__Person);

			Fragments._Operation__IMedicalService.initOperations(_Operation__IMedicalService);
			Fragments._Operation__MedicalService.initOperations(_Operation__MedicalService);
			Fragments._Operation__OclAny.initOperations(_Operation__OclAny);
			Fragments._Operation__OclElement.initOperations(_Operation__OclElement);
			Fragments._Operation__Operation.initOperations(_Operation__Operation);

			Fragments._Patient__OclAny.initOperations(_Patient__OclAny);
			Fragments._Patient__OclElement.initOperations(_Patient__OclElement);
			Fragments._Patient__Patient.initOperations(_Patient__Patient);
			Fragments._Patient__Person.initOperations(_Patient__Person);

			Fragments._Person__OclAny.initOperations(_Person__OclAny);
			Fragments._Person__OclElement.initOperations(_Person__OclElement);
			Fragments._Person__Person.initOperations(_Person__Person);

			Fragments._Receptionist__HospitalEmployee.initOperations(_Receptionist__HospitalEmployee);
			Fragments._Receptionist__OclAny.initOperations(_Receptionist__OclAny);
			Fragments._Receptionist__OclElement.initOperations(_Receptionist__OclElement);
			Fragments._Receptionist__Person.initOperations(_Receptionist__Person);
			Fragments._Receptionist__Receptionist.initOperations(_Receptionist__Receptionist);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Hw1Tables::FragmentOperations and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of local properties for the local fragment of each type.
	 */
	public static class FragmentProperties {
		static {
			Init.initStart();
			FragmentOperations.init();
		}

		private static final ExecutorProperty /*@NonNull*/ [] _Appointment = {
			Hw1Tables.Properties._Appointment__appointmentId,
			Hw1Tables.Properties._Appointment__date,
			Hw1Tables.Properties._Appointment__endTime,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			Hw1Tables.Properties._Appointment__startTime
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Billing = {
			Hw1Tables.Properties._Billing__amount,
			Hw1Tables.Properties._Billing__billId,
			Hw1Tables.Properties._Billing__date,
			Hw1Tables.Properties._Billing__issuedBy,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Doctor = {
			Hw1Tables.Properties._Person__age,
			Hw1Tables.Properties._HospitalEmployee__employeeId,
			Hw1Tables.Properties._Person__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			Hw1Tables.Properties._Doctor__performs,
			Hw1Tables.Properties._Person__personId,
			Hw1Tables.Properties._HospitalEmployee__salary,
			Hw1Tables.Properties._Doctor__specialization
		};

		private static final ExecutorProperty /*@NonNull*/ [] _HospitalEmployee = {
			Hw1Tables.Properties._Person__age,
			Hw1Tables.Properties._HospitalEmployee__employeeId,
			Hw1Tables.Properties._Person__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			Hw1Tables.Properties._Person__personId,
			Hw1Tables.Properties._HospitalEmployee__salary
		};

		private static final ExecutorProperty /*@NonNull*/ [] _IMedicalService = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _LabTest = {
			Hw1Tables.Properties._LabTest__conductedBy,
			Hw1Tables.Properties._MedicalService__date,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			Hw1Tables.Properties._LabTest__testId
		};

		private static final ExecutorProperty /*@NonNull*/ [] _MedicalService = {
			Hw1Tables.Properties._MedicalService__date,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Nurse = {
			Hw1Tables.Properties._Person__age,
			Hw1Tables.Properties._Nurse__assistsIn,
			Hw1Tables.Properties._Nurse__conducts,
			Hw1Tables.Properties._HospitalEmployee__employeeId,
			Hw1Tables.Properties._Person__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			Hw1Tables.Properties._Person__personId,
			Hw1Tables.Properties._HospitalEmployee__salary
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Operation = {
			Hw1Tables.Properties._Operation__assistedBy,
			Hw1Tables.Properties._MedicalService__date,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			Hw1Tables.Properties._Operation__operationId,
			Hw1Tables.Properties._Operation__performedBy
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Patient = {
			Hw1Tables.Properties._Person__age,
			Hw1Tables.Properties._Patient__booked,
			Hw1Tables.Properties._Patient__goingThrough,
			Hw1Tables.Properties._Patient__issuedFor,
			Hw1Tables.Properties._Patient__medicalHistory,
			Hw1Tables.Properties._Person__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			Hw1Tables.Properties._Patient__patientId,
			Hw1Tables.Properties._Person__personId,
			Hw1Tables.Properties._Patient__scheduledFor
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Person = {
			Hw1Tables.Properties._Person__age,
			Hw1Tables.Properties._Person__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			Hw1Tables.Properties._Person__personId
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Receptionist = {
			Hw1Tables.Properties._Person__age,
			Hw1Tables.Properties._HospitalEmployee__employeeId,
			Hw1Tables.Properties._Receptionist__issues,
			Hw1Tables.Properties._Person__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			Hw1Tables.Properties._Person__personId,
			Hw1Tables.Properties._HospitalEmployee__salary
		};

		/**
		 *	Install the property descriptors in the fragment descriptors.
		 */
		static {
			Fragments._Appointment__Appointment.initProperties(_Appointment);
			Fragments._Billing__Billing.initProperties(_Billing);
			Fragments._Doctor__Doctor.initProperties(_Doctor);
			Fragments._HospitalEmployee__HospitalEmployee.initProperties(_HospitalEmployee);
			Fragments._IMedicalService__IMedicalService.initProperties(_IMedicalService);
			Fragments._LabTest__LabTest.initProperties(_LabTest);
			Fragments._MedicalService__MedicalService.initProperties(_MedicalService);
			Fragments._Nurse__Nurse.initProperties(_Nurse);
			Fragments._Operation__Operation.initProperties(_Operation);
			Fragments._Patient__Patient.initProperties(_Patient);
			Fragments._Person__Person.initProperties(_Person);
			Fragments._Receptionist__Receptionist.initProperties(_Receptionist);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Hw1Tables::FragmentProperties and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of enumeration literals for each enumeration.
	 */
	public static class EnumerationLiterals {
		static {
			Init.initStart();
			FragmentProperties.init();
		}

		/**
		 *	Install the enumeration literals in the enumerations.
		 */
		static {

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Hw1Tables::EnumerationLiterals and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 * The multiple packages above avoid problems with the Java 65536 byte limit but introduce a difficulty in ensuring that
	 * static construction occurs in the disciplined order of the packages when construction may start in any of the packages.
	 * The problem is resolved by ensuring that the static construction of each package first initializes its immediate predecessor.
	 * On completion of predecessor initialization, the residual packages are initialized by starting an initialization in the last package.
	 * This class maintains a count so that the various predecessors can distinguish whether they are the starting point and so
	 * ensure that residual construction occurs just once after all predecessors.
	 */
	private static class Init {
		/**
		 * Counter of nested static constructions. On return to zero residual construction starts. -ve once residual construction started.
		 */
		private static int initCount = 0;

		/**
		 * Invoked at the start of a static construction to defer residual construction until primary constructions complete.
		 */
		private static void initStart() {
			if (initCount >= 0) {
				initCount++;
			}
		}

		/**
		 * Invoked at the end of a static construction to activate residual construction once primary constructions complete.
		 */
		private static void initEnd() {
			if (initCount > 0) {
				if (--initCount == 0) {
					initCount = -1;
					EnumerationLiterals.init();
				}
			}
		}
	}

	static {
		Init.initEnd();
	}

	/*
	 * Force initialization of outer fields. Inner fields are lazily initialized.
	 */
	public static void init() {
		new Hw1Tables();
	}

	private Hw1Tables() {
		super(Hw1Package.eNS_URI);
	}
}
