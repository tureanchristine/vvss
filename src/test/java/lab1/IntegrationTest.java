package lab1;

import lab1.controller.DoctorController;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class IntegrationTest {
    @org.junit.jupiter.api.Test
    public void a()
    {
        String patients = "FilePatients.txt";
        String consultations = "FileConsultations.txt";
        repository.Repository repo = new repository.Repository(patients, consultations);
        DoctorController ctrl = new DoctorController(repo);

        int l = repo.getPatientList().size();


        try {
            model.Patient p = new model.Patient("name","1111111111111","ap");
            ctrl.addPatient(p);
        } catch (exceptions.PatientException e) {
            e.printStackTrace();
        }
        Assertions.assertEquals( l + 1 , repo.getPatientList().size());
    }

    @Test
    public void b()  {
        String patients = "FilePatients.txt";
        String consultations = "FileConsultations.txt";
        repository.Repository repo = new repository.Repository(patients, consultations);

        int l = repo.getConsultationList().size();
        DoctorController ctrl = new DoctorController(repo);
        List<String> a  = new ArrayList<String>();
        a.add("sup1");
        model.Consultation c = new model.Consultation("1","1111111111111","a",a,"02/02/1999");
        try {
            ctrl.addConsultation("1","1111111111111","a",a,"02/02/1999");
        } catch (exceptions.ConsultationException e) {
            e.printStackTrace();
        }

        assertEquals( l + 1 , repo.getConsultationList().size());
    }

    @org.junit.jupiter.api.Test
    public void c()
    {
        String patients = "FilePatients.txt";
        String consultations = "FileConsultations.txt";
        repository.Repository repo = new repository.Repository(patients, consultations);
        DoctorController ctrl = new DoctorController(repo);

        List<model.Patient> p = new ArrayList<model.Patient>();
        try {

            p = ctrl.getPatientsWithDisease("a");
        } catch (exceptions.PatientException e) {
            e.printStackTrace();
        }
        Assertions.assertEquals(p.size()  , 1);
    }

    @Test
    public void ab()
    {
        a();
        b();
    }

    @Test
    public void abc()
    {
        a();
        b();
        c();
    }
}
