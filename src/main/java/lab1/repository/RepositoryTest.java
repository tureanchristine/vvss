package lab1.repository;

import model.Consultation;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class RepositoryTest {

    @Test
    public void test() throws IOException {
        String patients = "FilePatients.txt";
        String consultations = "FileConsultations.txt";
        repository.Repository repo = new repository.Repository(patients, consultations);

        int l = repo.getConsultationList().size();
        List<String> a  = new ArrayList<String>();
        a.add("sup1");
        model.Consultation c = new Consultation("1","1111111111111","a",a,"02/02/1999");
        repo.addConsultationToFile(c);
        assertEquals( l + 1 , repo.getConsultationList());
    }

    @Test
    public void test2() throws IOException {
        String patients = "FilePatients.txt";
        String consultations = "FileConsultations.txt";
        repository.Repository repo = new repository.Repository(patients, consultations);

        int l = repo.getConsultationList().size();
        List<String> a  = new ArrayList<String>();
        a.add("sup1");
        model.Consultation c = new Consultation("1","1111111111111","a",a,"02/02/1999");
        repo.addConsultationToFile(c);
        assertEquals( l + 1 , repo.getConsultationList());
    }
}
