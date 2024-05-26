package com.groupseven.projectglovi.services.concretes;

import com.groupseven.projectglovi.entities.Country;
import com.groupseven.projectglovi.repositories.CountryRepository;
import com.groupseven.projectglovi.services.abstracts.CountryService;
import com.groupseven.projectglovi.services.dtos.requests.CountryAddRequest;
import com.groupseven.projectglovi.services.mapper.CountryMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CountryServiceImpl implements CountryService {
    private final CountryRepository countryRepository;


    @Override
    public void add(CountryAddRequest request) {
        Country country = CountryMapper.INSTANCE.countryFromAddRequest(request);
        countryRepository.save(country);
    }
}
