package lab1;

import exceptions.ConsultationException;
import lab1.controller.DoctorController;
import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class WBTest {
    @Test
    public void tc1()  {
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
            } catch (ConsultationException e) {
                e.printStackTrace();
            }

        assertEquals( l + 1 , repo.getConsultationList().size());
    }

    @Test
    public void tc2()  {
        String patients = "FilePatients.txt";
        String consultations = "FileConsultations.txt";
        repository.Repository repo = new repository.Repository(patients, consultations);

        int l = repo.getConsultationList().size();
        DoctorController ctrl = new DoctorController(repo);
        List<String> a  = new ArrayList<String>();
        a.add("sup1");
        model.Consultation c = new model.Consultation("1","1111111111111","a",a,"02/02/1999");
        try {
            ctrl.addConsultation("1","111111111111","a",a,"02/02/1999");
        } catch (ConsultationException e) {
            e.printStackTrace();
        }

        assertEquals( l    , repo.getConsultationList().size());
    }

    @Test
    public void tc3()  {
        String patients = "FilePatients.txt";
        String consultations = "FileConsultations.txt";
        repository.Repository repo = new repository.Repository(patients, consultations);

        int l = repo.getConsultationList().size();
        DoctorController ctrl = new DoctorController(repo);
        List<String> a  = new ArrayList<String>();
        model.Consultation c = new model.Consultation("1","1111111111111","a",a,"02/02/1999");
        try {
            ctrl.addConsultation("1","111111111111","a",a,"02/02/1999");
        } catch (ConsultationException e) {
            e.printStackTrace();
        }

        assertEquals( l    , repo.getConsultationList().size());
    }
}
