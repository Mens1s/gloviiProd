package com.groupseven.projectglovi.services.abstracts;

import com.groupseven.projectglovi.services.dtos.requests.GetGloveDataRequest;

public interface GloveService {
    void updateGloveData(String data);
    String getData(GetGloveDataRequest request );
}
