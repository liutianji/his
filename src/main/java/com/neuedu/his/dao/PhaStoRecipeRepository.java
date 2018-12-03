package com.neuedu.his.dao;

import com.neuedu.his.jpa.pojo.PhaStoRecipeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 单表操作使用JPA
 */
public interface PhaStoRecipeRepository extends JpaRepository<PhaStoRecipeEntity,Long>{
}
