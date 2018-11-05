package com.kecil.entities;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

@Entity
@Table(name = "siswa")
public class Siswa {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false, unique = true)
    private Long idSiswa;

    @Column(name = "nama_siswa", length = 100)
    private String namaSiswa;

    @Column(name = "umur_siswa")
    private int umurSiswa;

    @Column(name = "alamat_siswa", columnDefinition = "TEXT")
    private String alamatSiswa;



}
