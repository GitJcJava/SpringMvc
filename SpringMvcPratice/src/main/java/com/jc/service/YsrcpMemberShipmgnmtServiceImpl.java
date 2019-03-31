package com.jc.service;

import org.springframework.beans.BeanUtils;

import com.jc.bo.YsrcpMebershipBo;
import com.jc.dao.YsrcpMembershipDao;
import com.jc.dto.YsrcpMembershipDto;

public class YsrcpMemberShipmgnmtServiceImpl implements YsrcpmembershipMgmntService {

	private YsrcpMembershipDao ycpDao;

	public YsrcpMemberShipmgnmtServiceImpl(YsrcpMembershipDao ycpDao) {
		this.ycpDao = ycpDao;
	}

	@Override
	public String InsertMembers(YsrcpMembershipDto ycpDto) {
		int count = 0;
		YsrcpMebershipBo ycpbo = null;
		// use service class
		ycpbo = new YsrcpMebershipBo();
		// convert dto to bo
		BeanUtils.copyProperties(ycpDto, ycpbo);
		count = ycpDao.insertMembers(ycpbo);
		if (count == 0) {
			return "registration is failed";
		} else
			return "registration is sucess";
	}

}
