package com.crud.mappings.doa;

import com.crud.mappings.entity.Instructor;

public interface AppDao {

    void save(Instructor instructor);

    Instructor  findInstructorById(int id);

    void  deleteInstructorById(int id);
}
