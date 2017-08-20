package com.manage.kernel.jpa.news.repository;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import com.manage.kernel.jpa.news.entity.Menu;
import org.springframework.data.repository.query.Param;

import java.io.Serializable;
import java.util.List;

public interface MenuRepo extends CrudRepository<Menu, Serializable>, JpaSpecificationExecutor<Menu> {

    @Query("select distinct m from Role o inner join o.menus m where o.id in (:roleIds) order by m.level asc, m.sequence asc")
    List<Menu> queryMenuListByRoleIds(@Param("roleIds") List<Long> roleIds);

    @Query("from Menu order by level, sequence")
    List<Menu> queryListAll();

    @Query("from Menu where parentId = :parentId")
    List<Menu> queryListByParentId(@Param("parentId") Long parentId);

    @Query("from Menu where url = :url")
    List<Menu> queryListByUrl(@Param("url") String url);

    @Query("from Menu where level = :level")
    List<Menu> queryListByLevel(@Param("level") Integer level);

    @Query("from Menu where id in (:ids)")
    List<Menu> queryListByIds(@Param("ids") List<Long> ids);

}