package com.groupseven.projectglovi.controllers;

import com.groupseven.projectglovi.services.abstracts.GloveService;
import com.groupseven.projectglovi.services.dtos.requests.GetGloveDataRequest;
import com.groupseven.projectglovi.services.dtos.requests.GloveUpdateData;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/glove")
@Validated
@RequiredArgsConstructor
public class GloveController {
    private final GloveService gloveService;

    @PostMapping("/update")
    public void updateGloveData(@RequestParam String data){
       System.out.println(data);
       gloveService.updateGloveData(data);
    }

    @PostMapping("/updateme")
    public void updateGloveData(@RequestBody GloveUpdateData data){
        System.out.println(data.getData());
        gloveService.updateGloveData(data.getData());
    }

    @GetMapping("/update")
    public void updateGloveDatas(@RequestParam String data){
        System.out.println(data);
        gloveService.updateGloveData(data);
    }


    @PostMapping("/getData")
    public String updateGloveData(@RequestBody GetGloveDataRequest req){
        return gloveService.getData(req);
    }


}
