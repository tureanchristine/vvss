package lab1;

import model.Consultation;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class RepositoryTest {

    @Test
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
    }
}
