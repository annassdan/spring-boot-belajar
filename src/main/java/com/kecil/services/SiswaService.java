package com.kecil.services;


import com.kecil.entities.Siswa;
import com.kecil.repositories.SiswaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SiswaService  {

    @Autowired
    SiswaRepo siswaRepo;


    public Page<Siswa> getAllData(int page, int size) {
        Pageable pageable = PageRequest.of(page, size);
        return siswaRepo.findAll(pageable);
    }

    public Siswa saveData(Siswa siswa) {
        return siswaRepo.save(siswa);
    }



}
