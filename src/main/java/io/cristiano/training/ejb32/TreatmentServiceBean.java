package io.cristiano.training.ejb32;

import javax.annotation.PostConstruct;
import javax.ejb.Asynchronous;
import javax.ejb.PostActivate;
import javax.ejb.Remove;
import javax.ejb.Stateful;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

@Stateful
public class TreatmentServiceBean {

    private Patient patient;
    private List<Exam> exams;

    @PostConstruct
    @PostActivate
    public void setUp() {
        patient = new Patient();
    }

    public String generateTreatmentCode() {
        return UUID.randomUUID().toString();
    }

    @Asynchronous
    public void saveExams(List<Exam> exams) {

    }

    public List<Exam> getExams(){
        return Collections.emptyList();
    }

    public void initTreatment() {
    }

    @Remove
    public void finishTreatment() {
        patient = null;
        exams = null;
    }
}
