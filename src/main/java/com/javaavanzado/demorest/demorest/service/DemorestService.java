package com.javaavanzado.demorest.demorest.service;

import com.javaavanzado.demorest.demorest.models.Demorest;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DemorestService {
    private final List<Demorest> demorestobj1= new ArrayList<>();

    public List<Demorest> getAll(){
        return demorestobj1;
    }
    public void add(Demorest demorest){
        demorestobj1.add(demorest);
    }

    public Demorest get(String nombre) {
        for (Demorest demorest : demorestobj1) {
            if (demorest.getNombre().equalsIgnoreCase(nombre)) {
                return demorest;
            }
        }

        return null;
    }
}
