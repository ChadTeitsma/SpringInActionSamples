package Spittr.impl;

import Spittr.Spittle;
import Spittr.data.SpittleRepository;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.ArrayList;
import java.util.List;

@Component
public class SpittleRepositoryImpl implements SpittleRepository {

    private ArrayList<Spittle> spittles;

    public List<Spittle> findSpittles(long max, int count) {
        spittles = new ArrayList<Spittle>();
        for (int i=0; i<count;i++){
            spittles.add(new Spittle("Spittle" + i,new Date()));
        }
        return spittles;
    }

    public Spittle findOne(long id) {
        for (Spittle spittle : spittles){
            if (spittle.getId() == id){
                return spittle;
            }
        }
        return null;
    }
}
