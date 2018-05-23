package Spittr.impl;

import Spittr.Spitter;
import Spittr.data.SpitterRepository;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class SpitterRepositoryImpl implements SpitterRepository {

    private ArrayList<Spitter> spitters = new ArrayList<Spitter>();

    public Spitter save(Spitter spitter) {
        spitters.add(spitter);
        return spitter;
    }

    public Spitter findByUsername(String username) {
        for (Spitter spitter: spitters){
             if (spitter.getUsername().equals(username)) {
                 return spitter;
             }
        }
        return null;
    }
}
