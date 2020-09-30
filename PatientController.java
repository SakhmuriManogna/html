package com.myhospital.demo.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.myhospital.demo.dao.PatientDao;
import com.myhospital.demo.model.Patient;

@RestController
public class PatientController {

@Autowired
PatientDao patientDao;

@GetMapping("patient/{patientId}")
public Patient getPatient(@PathVariable int patientId)
{
return patientDao.getPatient(patientId);

}

@GetMapping("patients")
public ArrayList<Patient> getPatients()
{
return patientDao.getAllPatients();

}

@PostMapping("patient")
public String savePatient(@RequestBody Patient patient)
{
return patientDao.savePatient(patient);
}

@PutMapping("patient")
public String updatePatient(@RequestBody Patient patient)
{
return patientDao.updatePatient(patient);
}
@DeleteMapping("patient")
public String deletePatient(@RequestBody int patientId)
{

System.out.println(patientId);
return patientDao.deletePatient(patientId);

}
}
