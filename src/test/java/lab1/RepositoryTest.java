package lab1;

import exceptions.PatientException;
import lab1.controller.DoctorController;
import model.Consultation;
import model.Patient;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class RepositoryTest {

    @Test
    public void tc1()
    {
        String patients = "FilePatients.txt";
        String consultations = "FileConsultations.txt";
        repository.Repository repo = new repository.Repository(patients, consultations);
        DoctorController ctrl = new DoctorController(repo);

        int l = repo.getPatientList().size();


        try {
            model.Patient p = new Patient("name","1111111111111","ap");
            ctrl.addPatient(p);
        } catch (PatientException e) {
            e.printStackTrace();
        }
        assertEquals( l + 1 , repo.getPatientList().size());
    }

    @Test
    public void tc2()
    {
        String patients = "FilePatients.txt";
        String consultations = "FileConsultations.txt";
        repository.Repository repo = new repository.Repository(patients, consultations);
        DoctorController ctrl = new DoctorController(repo);

        int l = repo.getPatientList().size();


        try {
            model.Patient p = new Patient("n","1111111111111","a");
            ctrl.addPatient(p);
        } catch (PatientException e) {
            e.printStackTrace();
        }
        assertEquals( l + 1 , repo.getPatientList().size());
    }

    @Test
    public void tc3()
    {
        String patients = "FilePatients.txt";
        String consultations = "FileConsultations.txt";
        repository.Repository repo = new repository.Repository(patients, consultations);
        DoctorController ctrl = new DoctorController(repo);

        int l = repo.getPatientList().size();


        try {
            model.Patient p = new Patient("","1111111111111","ap");
            ctrl.addPatient(p);
        } catch (PatientException e) {
            e.printStackTrace();
        }
        assertEquals( l , repo.getPatientList().size());
    }

    @Test
    public void tc4()
    {
        String patients = "FilePatients.txt";
        String consultations = "FileConsultations.txt";
        repository.Repository repo = new repository.Repository(patients, consultations);
        DoctorController ctrl = new DoctorController(repo);

        int l = repo.getPatientList().size();


        try {
            model.Patient p = new Patient("name","1111111111111","");
            ctrl.addPatient(p);
        } catch (PatientException e) {
            e.printStackTrace();
        }
        assertEquals( l  , repo.getPatientList().size());
    }

    @Test
    public void tc5()
    {
        String patients = "FilePatients.txt";
        String consultations = "FileConsultations.txt";
        repository.Repository repo = new repository.Repository(patients, consultations);
        DoctorController ctrl = new DoctorController(repo);

        int l = repo.getPatientList().size();


        try {
            model.Patient p = new Patient("name","111111111111","ap");
            ctrl.addPatient(p);
        } catch (PatientException e) {
            e.printStackTrace();
        }
        assertEquals( l , repo.getPatientList().size());
    }

    @Test
    public void tc6()
    {
        String patients = "FilePatients.txt";
        String consultations = "FileConsultations.txt";
        repository.Repository repo = new repository.Repository(patients, consultations);
        DoctorController ctrl = new DoctorController(repo);

        int l = repo.getPatientList().size();


        try {
            model.Patient p = new Patient("name","11111111111111","ap");
            ctrl.addPatient(p);
        } catch (PatientException e) {
            e.printStackTrace();
        }
        assertEquals( l  , repo.getPatientList().size());
    }

    @Test
    public void tc7()
    {
        String patients = "FilePatients.txt";
        String consultations = "FileConsultations.txt";
        repository.Repository repo = new repository.Repository(patients, consultations);
        DoctorController ctrl = new DoctorController(repo);

        int l = repo.getPatientList().size();

        model.Patient p = new Patient("naooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooome","1111111111111","ap");
        try {
            ctrl.addPatient(p);
        } catch (PatientException e) {
            e.printStackTrace();
        }
        assertEquals( l + 1 , repo.getPatientList().size());
    }

    @Test
    public void tc8()
    {
        String patients = "FilePatients.txt";
        String consultations = "FileConsultations.txt";
        repository.Repository repo = new repository.Repository(patients, consultations);
        DoctorController ctrl = new DoctorController(repo);

        int l = repo.getPatientList().size();

        try {
            model.Patient p = new Patient("name","1111111111111","appppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppp");

            ctrl.addPatient(p);
        } catch (PatientException e) {
            e.printStackTrace();
        }
        assertEquals( l + 1 , repo.getPatientList().size());
    }

    @Test
    public void tc9()
    {
        String patients = "FilePatients.txt";
        String consultations = "FileConsultations.txt";
        repository.Repository repo = new repository.Repository(patients, consultations);
        DoctorController ctrl = new DoctorController(repo);

        int l = repo.getPatientList().size();


        try {
            model.Patient p = new Patient("","","");
            ctrl.addPatient(p);
        } catch (PatientException e) {
            e.printStackTrace();
        }
        assertEquals( l , repo.getPatientList().size());
    }

    @Test
    public void tc10()
    {
        String patients = "FilePatients.txt";
        String consultations = "FileConsultations.txt";
        repository.Repository repo = new repository.Repository(patients, consultations);
        DoctorController ctrl = new DoctorController(repo);

        int l = repo.getPatientList().size();


        try {
            model.Patient p = new Patient("name","1111111111111","ap");
            ctrl.addPatient(p);
        } catch (PatientException e) {
            e.printStackTrace();
        }
        assertEquals( l + 1 , repo.getPatientList().size());
    }


   /* @Test
    public void test() {
        String patients = "FilePatients.txt";
        String consultations = "FileConsultations.txt";
        repository.Repository repo = new repository.Repository(patients, consultations);

        int l = repo.getConsultationList().size();
        List<String> a  = new ArrayList<String>();
        a.add("sup1");
        model.Consultation c = new Consultation("1","1111111111111","a",a,"02/02/1999");
        try {
            repo.addConsultationToFile(c);
        } catch (IOException e) {
            e.printStackTrace();
        }
        assertEquals( l + 1 , repo.getConsultationList());
    }

    @Test
    public void test2()  {
        String patients = "FilePatients.txt";
        String consultations = "FileConsultations.txt";
        repository.Repository repo = new repository.Repository(patients, consultations);

        int l = repo.getConsultationList().size();
        List<String> a  = new ArrayList<String>();
        a.add("sup1");
        model.Consultation c = new Consultation("1","1111111111111","a",a,"02/02/1999");
        try {
            repo.addConsultationToFile(c);
        } catch (IOException e) {
            e.printStackTrace();
        }
        assertEquals( l + 1 , repo.getConsultationList());
    }*/
}
