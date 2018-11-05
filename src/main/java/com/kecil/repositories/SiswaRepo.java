package com.kecil.repositories;

import com.kecil.entities.Siswa;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface SiswaRepo extends PagingAndSortingRepository<Siswa, Long> {
}
