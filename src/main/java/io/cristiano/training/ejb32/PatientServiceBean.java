package io.cristiano.training.ejb32;

import javax.ejb.Stateless;
import java.util.Collections;
import java.util.List;

@Stateless
public class PatientServiceBean {

    public void register(final Patient patient){

    }

    public List<Patient> search(SearchCriteria searchCriteria) {
        return Collections.emptyList();
    }
}
