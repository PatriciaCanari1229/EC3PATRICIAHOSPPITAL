package com.admin.ec3PatriciaCanaricita.service;

import com.admin.ec3PatriciaCanaricita.model.Cliente;
import com.admin.ec3PatriciaCanaricita.model.Hospital;

import java.util.List;

public interface IHospitalService {

    Hospital guardar(Hospital hospital);
    void actualizar(Hospital hospital);
    void eliminar(int id_hospital);
    List<Hospital> listar();
    Hospital obtenerPorId(int id_hospital);
}
