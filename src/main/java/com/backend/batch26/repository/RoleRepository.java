package com.backend.batch26.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.backend.batch26.model.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Integer>{ //JpaRepository<nama class, tipedata primary key dari class tersebut>
    @Query(value="SELECT * FROM tb_m_role WHERE name = ?1", nativeQuery = true)
    public Role findByName(String name);
}
//JpaRepository sudah menyediakan method CRUD jadi tidak perlu dibikin lagi