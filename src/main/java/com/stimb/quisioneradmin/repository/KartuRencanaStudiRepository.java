package com.stimb.quisioneradmin.repository;

import com.stimb.quisioneradmin.entity.stimb2.KartuRencanaStudi;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Yusfia Hafid A on 12/26/2015.
 */
@Repository
public interface KartuRencanaStudiRepository extends PagingAndSortingRepository<KartuRencanaStudi,Long> {
    @Query("SELECT p FROM KartuRencanaStudi p, MasterMahasiswa m WHERE m = p.masterMahasiswa AND m.id = :mhsid")
    public Page<KartuRencanaStudi> findByMhsId(@Param("mhsid") Long mhsid, Pageable pageable);
    @Query("SELECT p FROM KartuRencanaStudi p, MasterMahasiswa m, ReffTahunAjaran r WHERE m = p.masterMahasiswa AND m.id = :mhsid AND p.keterangan = 'Sudah Disetujui' AND p.reffTahunAjaran = r AND r.namaTahunAjaran LIKE %:thjar% AND r.periode LIKE %:sem% ORDER BY r.namaTahunAjaran DESC, r.periode ")
    public List<KartuRencanaStudi> findByMhsId(@Param("mhsid") Long mhsid, @Param("thjar") String thjar, @Param("sem") String sem);
    @Query("SELECT p FROM KartuRencanaStudi p, MasterMahasiswa m, ReffTahunAjaran r WHERE m = p.masterMahasiswa AND m.id = :mhsid AND p.keterangan = 'Sudah Disetujui' AND p.reffTahunAjaran = r AND r.aktivasi = :active AND p.isiquisioner=FALSE")
    public List<KartuRencanaStudi> findByMhsIdandThAjar(@Param("mhsid") Long mhsid, @Param("active") boolean active);
    //@Query("SELECT p FROM KartuRencanaStudi p WHERE p.id=:krsid AND p.isiquisioner=:active ")
    //public KartuRencanaStudi findOneBasedOnQuestionaire(@Param("krsid") Long krsid, @Param("active") boolean active);
    @Query("SELECT p FROM KartuRencanaStudi p, ReffTahunAjaran r, KelasPerkuliahan k, MasterMatakuliah m WHERE p.keterangan = 'Sudah Disetujui' AND p.kelasPerkuliahan = k AND k.masterMatakuliah = m AND m.namaMatakuliah LIKE %:kuliah% AND p.reffTahunAjaran = r AND r.aktivasi = TRUE AND p.isiquisioner=TRUE ORDER BY m.namaMatakuliah ASC, p.id ASC")
    public List<KartuRencanaStudi> findByNamaKuliah(@Param("kuliah") String kuliah);
    @Query("SELECT p FROM KartuRencanaStudi p, ReffTahunAjaran r, KelasPerkuliahan k, MasterMatakuliah m WHERE p.keterangan = 'Sudah Disetujui' AND p.kelasPerkuliahan = k AND k.masterMatakuliah = m AND m.namaMatakuliah LIKE %:kuliah% AND p.reffTahunAjaran = r AND r.aktivasi = TRUE AND p.isiquisioner=TRUE GROUP BY k.id ORDER BY m.namaMatakuliah ASC, p.id ASC")
    public List<KartuRencanaStudi> findByNamaKuliahGroup(@Param("kuliah") String kuliah);
}