package com.zra.service.business.controller;

import com.zra.service.business.dao.BusinessMapper;
import com.zra.service.business.dto.BusinessDto;
import com.zra.service.business.entity.Business;
import com.zra.service.business.manager.BusinessManager;
import com.zra.service.business.service.BusinessService;
import com.zra.service.business.util.BeanSolver;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

/**
 * Created by xiaona on 2016/11/3.
 */
@Slf4j
@RestController
public class BusinessController implements BusinessService {

  @Autowired
  BusinessManager businessManager;

  @Override
  public BusinessDto findById(@PathVariable("id") Integer id) {
    Business business = businessManager.findById(id);
    BusinessDto dto = new BusinessDto();
    if (business != null) {
      try {
        BeanSolver.copyProperties(dto, business);
      } catch (Exception e) {
        log.error(e.getMessage(), e);
      }
    }
    return dto;
  }

  @Override
  public List<BusinessDto> findBy(BusinessDto entity) {
    return null;
  }
}
