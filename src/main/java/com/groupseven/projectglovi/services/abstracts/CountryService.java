package com.groupseven.projectglovi.services.abstracts;

import com.groupseven.projectglovi.services.dtos.requests.CountryAddRequest;

public interface CountryService {
    void add(CountryAddRequest request);
}
