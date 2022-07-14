package com.ddimitko.iamdumb.services;

import com.ddimitko.iamdumb.objects.Contributor;
import com.ddimitko.iamdumb.repositories.ContributorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContributorService {

    @Autowired
    ContributorRepository contributorRepo;

    public List<Contributor> findAll(){

        return contributorRepo.findAll();
    }

}
