package com.kecil.controllers;


import com.kecil.entities.Siswa;
import com.kecil.services.SiswaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping(value = "/api/siswa/", produces = "application/json")
public class SiswaController {

    @Autowired
    SiswaService siswaService;

    @GetMapping(params = {"page", "size"})
    public Page<Siswa> routeGetData(
            @RequestParam("page") int page,
            @RequestParam("size") int size) {
        return siswaService.getAllData(page, size);
    }

    @PostMapping
    public Siswa saveData(@RequestBody @Valid Siswa siswa) {
        return siswaService.saveData(siswa);
    }


}
