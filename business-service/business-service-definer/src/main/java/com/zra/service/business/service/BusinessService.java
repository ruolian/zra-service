package com.zra.service.business.service;

import com.zra.service.business.BusinessConstants;
import com.zra.service.business.dto.BusinessDto;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Created by xiaona on 2016/11/3.
 */
public interface BusinessService {
  @RequestMapping(value = BusinessConstants.BUSINESSES_ID_PATH, method = RequestMethod.GET)
  BusinessDto findById(@PathVariable("id") Integer id);

  @RequestMapping(value = BusinessConstants.BUSINESSES_PATH, method = RequestMethod.GET)
  List<BusinessDto> findBy(BusinessDto entity);
}
