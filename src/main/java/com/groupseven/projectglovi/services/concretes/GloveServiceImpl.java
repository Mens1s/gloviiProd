package com.groupseven.projectglovi.services.concretes;

import com.groupseven.projectglovi.entities.Glove;
import com.groupseven.projectglovi.repositories.GloveRepository;
import com.groupseven.projectglovi.services.abstracts.GloveService;
import com.groupseven.projectglovi.services.dtos.requests.GetGloveDataRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class GloveServiceImpl implements GloveService {

    private final GloveRepository gloveRepository;
    @Override
    public void updateGloveData(String data) {
        List<String> dt = new ArrayList<>();

        for(String d : data.split(":")){
            dt.add(d);
        }

        Optional<Glove> glove = gloveRepository.findGloveByName(dt.get(0));
        if(glove.isEmpty()){
            throw new RuntimeException("Glove not found");
        }

        Glove defGlove = glove.get();

        if(dt.size() == 2){
            defGlove.setX(dt.get(1));
        }else if(dt.size() == 3){
            defGlove.setX(dt.get(1));
            defGlove.setY(dt.get(2));
        }else if(dt.size() == 4){

            defGlove.setX(dt.get(1));
            defGlove.setY(dt.get(2));
            defGlove.setZ(dt.get(3));
        }else if(dt.size() == 5){

            defGlove.setX(dt.get(1));
            defGlove.setY(dt.get(2));
            defGlove.setZ(dt.get(3));
            defGlove.setButtonFirst(dt.get(4));
        }else if(dt.size() >= 6) {

            defGlove.setX(dt.get(1));
            defGlove.setY(dt.get(2));
            defGlove.setZ(dt.get(3));
            defGlove.setButtonFirst(dt.get(4));
            defGlove.setButtonSecond(dt.get(5));
        }
        gloveRepository.save(defGlove);
    }

    @Override
    public String getData(GetGloveDataRequest request) {
        Optional<Glove> glove = gloveRepository.findGloveByName(request.getName());
        if(glove.isPresent()){
            Glove defGlove = glove.get();
            return defGlove.getX()+ "," + defGlove.getY() + "," + defGlove.getZ() + "," + defGlove.getButtonFirst() + "," + defGlove.getButtonSecond();
        }
        return "1,1,1,1,1";
    }
}
