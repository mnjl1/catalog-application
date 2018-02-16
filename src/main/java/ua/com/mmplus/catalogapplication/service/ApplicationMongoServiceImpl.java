package ua.com.mmplus.catalogapplication.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.com.mmplus.catalogapplication.domain.model.Application;
import ua.com.mmplus.catalogapplication.repository.ApplicationMongoRepository;

import java.util.List;

@Service
public class ApplicationMongoServiceImpl implements ApplicationMongoService {

    @Autowired
    ApplicationMongoRepository applicationMongoRepository;

    @Override
    public Application save(Application application) {
        return applicationMongoRepository.save(application);
    }

    @Override
    public Application findById(long id) {
        return applicationMongoRepository.findOne(id) ;
    }

    @Override
    public List<Application> findAll() {
        List<Application> applicationList = (List<Application>) applicationMongoRepository.findAll();
        return applicationList;
    }

    @Override
    public void delete(Long id) {
        applicationMongoRepository.delete(id);
    }


}
