# GenDevHW1 – EMF Model Plugin for Hospital Management

This Eclipse plugin defines a healthcare domain model using the **Eclipse Modeling Framework (EMF)**. It provides a structured model of hospital entities and services, including patients, doctors, appointments, and billing. The plugin registers a generated EMF package and is intended for use in model-driven engineering or tooling projects.

---

## 🏥 Domain Model Overview

This model captures key components of a hospital system, including:

### 👤 People
- `Person` – Base abstraction for people in the system
- `HospitalEmployee` – Abstract class for staff
  - `Doctor`
  - `Nurse`
  - `Receptionist`
- `Patient`

### 🧾 Services
- `IMedicalService` – Interface for services
  - `Appointment`
  - `LabTest`
  - `Billing`
  - `Operation`

Each class includes EMF-generated attributes and references to support persistence, navigation, and tooling.

---

## 📁 Project Structure

```
gendev.hw1/
├── src/                    # EMF-generated Java source code
├── bin/                    # Compiled .class files
├── model/
│   ├── hw1.ecore           # Ecore metamodel
│   └── hw1.genmodel        # EMF generator model
├── META-INF/
│   └── MANIFEST.MF         # OSGi plugin metadata
├── plugin.xml              # Registers EMF generated package
├── plugin.properties       # Plugin localization/config (unused here)
├── build.properties        # Build configuration for PDE
├── .classpath, .project    # Eclipse project settings
```

---

## 🧠 EMF Configuration

The plugin registers the generated EMF package using this extension:

```xml
<extension point="org.eclipse.emf.ecore.generated_package">
  <package
    uri="http://www.example.org/hw1"
    class="gendev.hw1.Hw1Package"
    genModel="model/hw1.genmodel"/>
</extension>
```

This allows the plugin to be used in other EMF-based tooling and runtime environments.

---

## 🚀 How to Build & Run

### 🧱 Requirements
- Eclipse IDE with EMF SDK (e.g., "Eclipse Modeling Tools")
- Java 8 or higher

### 📦 Steps
1. **Import the project:**
   - Open Eclipse → `File > Import > General > Existing Projects into Workspace`
   - Select the `gendev.hw1` folder

2. **Run as an Eclipse plugin:**
   - Right-click the project → `Run As > Eclipse Application`
   - A new Eclipse instance will start with the plugin loaded

3. **Explore and use the model:**
   - You can write Java code to create and manipulate model instances using the `Hw1Factory` and `Hw1Package` classes.

---

## ✅ Example Usage in Code

```java
Hw1Factory factory = Hw1Factory.eINSTANCE;
Doctor doctor = factory.createDoctor();
doctor.setName("Dr. Smith");

Patient patient = factory.createPatient();
Appointment appt = factory.createAppointment();
appt.setDoctor(doctor);
appt.setPatient(patient);
```

---

## 🙋 Authors

- **Name:** Bhavya Bhatt, Pritesh Patel  
- **University:** University of Leicester  
- **Module:** Generative Development (HW1)

---

## 📝 License

This project is part of a university coursework submission and intended for educational use only.
