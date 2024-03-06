package gendev.hw1;

import java.io.IOException;
import java.util.Collections;
import java.util.Date;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

public class Task4 {
	public static String instance = "task4-Instances/instance.xmi";

	public static void main(String[] args) {
		System.out.println("Creating and saving instance to file " + instance);

		Hw1Package.eINSTANCE.eClass();
		Hw1Factory factory = Hw1Factory.eINSTANCE;
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("xmi", new XMIResourceFactoryImpl());
		ResourceSet resSet = new ResourceSetImpl();
		Resource resource = resSet.createResource(URI.createURI(instance));

		Doctor doctor = factory.createDoctor();
		Operation operation = factory.createOperation();
		Nurse nurse1 = factory.createNurse();
		Nurse nurse2 = factory.createNurse();

		doctor.setAge(50);
		doctor.setEmployeeId(21212);
		doctor.setName("Bhavya");
		doctor.setPersonId(5454);
		doctor.setSalary(587455);
		doctor.setSpecialization("Eye");

		nurse1.setAge(22);
		nurse1.setEmployeeId(5454);
		nurse1.setName("Marta");
		nurse1.setPersonId(45454);
		nurse1.setSalary(452454);

		nurse2.setAge(26);
		nurse2.setEmployeeId(545564);
		nurse2.setName("Emma");
		nurse2.setPersonId(459844);
		nurse2.setSalary(452454);

		operation.setDate(new Date());
		operation.setOperationId(4545);

		operation.getAssistedBy().add(nurse1);
		operation.getAssistedBy().add(nurse2);
		operation.setPerformedBy(doctor);
		doctor.getPerforms().add(operation);
		nurse1.getAssistsIn().add(operation);
		nurse2.getAssistsIn().add(operation);
		resource.getContents().add(doctor);
		
		
		doctor = factory.createDoctor();
		operation = factory.createOperation();
		operation.setDate(new Date());
		operation.setOperationId(4545);
		nurse1 = factory.createNurse();
		nurse2 = factory.createNurse();
		
		nurse1.setAge(22);
		nurse1.setEmployeeId(5454);
		nurse1.setName("Marta");
		nurse1.setPersonId(45454);
		nurse1.setSalary(452454);

		nurse2.setAge(26);
		nurse2.setEmployeeId(545564);
		nurse2.setName("Emma");
		nurse2.setPersonId(459844);
		nurse2.setSalary(452454);

		operation.getAssistedBy().add(nurse1);
		operation.getAssistedBy().add(nurse2);

		doctor.setAge(50);
		doctor.setEmployeeId(21212);
		doctor.setName("Bhavya");
		doctor.setPersonId(5454);
		doctor.setSalary(587455);
		doctor.setSpecialization("Eye");
		
		nurse1 = factory.createNurse();
		nurse2 = factory.createNurse();

		nurse1.setAge(22);
		nurse1.setEmployeeId(5454);
		nurse1.setName("Martha");
		nurse1.setPersonId(45454);
		nurse1.setSalary(452454);

		nurse2.setAge(26);
		nurse2.setEmployeeId(545564);
		nurse2.setName("Emmah");
		nurse2.setPersonId(459844);
		nurse2.setSalary(452454);
		operation.getAssistedBy().add(nurse1);
		operation.getAssistedBy().add(nurse2);

		operation.setPerformedBy(doctor);
		doctor.getPerforms().add(operation);
		nurse1.getAssistsIn().add(operation);
		nurse2.getAssistsIn().add(operation);
		resource.getContents().add(doctor);
		
		
		Patient patient = factory.createPatient();
		Receptionist receptionist = factory.createReceptionist();
		Billing bill = factory.createBilling();

		receptionist.setAge(78);
		receptionist.setSalary(44005);
		receptionist.setEmployeeId(4444);
		patient.setAge(38);
		patient.setMedicalHistory(null);
		patient.setName("Harry");
		patient.setPatientId(654);
		bill.setAmount(544);
		bill.setIssuedBy(receptionist);
		bill.setBillId(4454);
		bill.setDate(new Date());
		patient.getIssuedFor().add(bill);
		
		
		resource.getContents().add(patient);
		
		patient = factory.createPatient();
		bill = factory.createBilling();

		patient.setAge(38);
		patient.setMedicalHistory(null);
		patient.setName("Harry");
		patient.setPatientId(654);
		bill.setAmount(544);
		bill.setBillId(4454);
		bill.setDate(new Date());
		patient.getIssuedFor().add(bill);
		
		
		resource.getContents().add(patient);
		
		patient = factory.createPatient();
		Appointment apt = factory.createAppointment();
		apt.setAppointmentId(7755);
		apt.setDate(new Date());
		apt.setStartTime(551515151515151L);
		apt.setStartTime(551515151555151L);
		patient.getScheduledFor().add(apt);
		
		resource.getContents().add(patient);

		try {
			resource.save(Collections.EMPTY_MAP);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
