package ua.com.mmplus.catalogapplication.service;

import ua.com.mmplus.catalogapplication.domain.model.Application;
import java.util.List;

public interface ApplicationMongoService   {
    Application save(Application application);
    Application findById(long id);
    List<Application> findAll();
    void delete(Long id);
}
